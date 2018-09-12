package org.opencps.api.controller.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.opencps.api.serviceprocess.model.ProcessActionResultsModel;
import org.opencps.background.executor.SiteCleanBackgroundTaskExecutor;
import org.opencps.communication.action.NotificationTemplateInterface;
import org.opencps.communication.action.impl.NotificationTemplateActions;
import org.opencps.communication.constants.NotificationTemplateTerm;
import org.opencps.communication.model.Notificationtemplate;
import org.opencps.communication.service.NotificationQueueLocalServiceUtil;
import org.opencps.communication.service.NotificationtemplateLocalServiceUtil;
import org.opencps.dossiermgt.action.DossierActions;
import org.opencps.dossiermgt.action.ServiceInfoActions;
import org.opencps.dossiermgt.action.ServiceProcessActions;
import org.opencps.dossiermgt.action.impl.DossierActionsImpl;
import org.opencps.dossiermgt.action.impl.ServiceInfoActionsImpl;
import org.opencps.dossiermgt.action.impl.ServiceProcessActionsImpl;
import org.opencps.dossiermgt.constants.DossierFileTerm;
import org.opencps.dossiermgt.constants.DossierLogTerm;
import org.opencps.dossiermgt.constants.DossierTerm;
import org.opencps.dossiermgt.constants.ProcessActionTerm;
import org.opencps.dossiermgt.constants.ServiceInfoTerm;
import org.opencps.dossiermgt.constants.ServiceProcessTerm;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.DossierLog;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.model.ServiceInfo;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLogLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceInfoLocalServiceUtil;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil;
import com.liferay.document.library.kernel.exception.NoSuchFileEntryException;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.SortFactoryUtil;
import com.liferay.portal.kernel.service.ResourceLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringUtil;

public class SystemUtils {
	public static void cleanNotificationTemplate(long groupId, long userId, ServiceContext serviceContext) throws PortalException {
		LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
		NotificationTemplateInterface actions = new NotificationTemplateActions();
		List<Notificationtemplate> lstTemplates = NotificationtemplateLocalServiceUtil.findByF_NotificationtemplateByGroup(groupId);
		params.put(Field.GROUP_ID, String.valueOf(groupId));
		Indexer<Notificationtemplate> indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(Notificationtemplate.class);
		
		Sort[] sorts = new Sort[] { };
		JSONObject jsonData;
			
		jsonData = actions.getNotificationTemplates(userId, serviceContext.getCompanyId(), groupId,
					params, sorts, QueryUtil.ALL_POS, QueryUtil.ALL_POS, serviceContext);
		long total = jsonData.getInt("total");
		if (total > 0) {
			@SuppressWarnings("unchecked")
			List<Document> lstDocs =  (List<Document>) jsonData.get("data");	
			for (Document document : lstDocs) {
				long notificationTemplateId = GetterUtil.getLong(document.get(NotificationTemplateTerm.NOTIFICATIONTEMPLATE_ID));
				long companyId = GetterUtil.getLong(document.get(Field.COMPANY_ID));
				String uid = document.get(Field.UID);
				Notificationtemplate oldTemplate = NotificationtemplateLocalServiceUtil.fetchNotificationtemplate(notificationTemplateId);
				if (oldTemplate == null) {
					try {
						indexer.delete(companyId, uid);
					} catch (SearchException e) {
					}
				}
			}			
		}
		for (Notificationtemplate temp : lstTemplates) {
			NotificationtemplateLocalServiceUtil.deleteNotificationtemplate(temp.getNotificationTemplateId());
		}
	}
	
	public static void cleanNotificationQueue(long groupId) {
		NotificationQueueLocalServiceUtil.deleteByGroup(groupId);
	}	
	
	public static void cleanDossier(long groupId, long userId, ServiceContext serviceContext) throws PortalException {
		DossierActions actions = new DossierActionsImpl();
		Indexer<Dossier> indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(Dossier.class);
		LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
		params.put(Field.GROUP_ID, String.valueOf(groupId));

		JSONObject jsonData = actions.getDossiers(userId, serviceContext.getCompanyId(), groupId, params, null,
					-1, -1, serviceContext);
		long total = jsonData.getInt("total");
		if (total > 0) {
			@SuppressWarnings("unchecked")
			List<Document> lstDocs =  (List<Document>) jsonData.get("data");	
			for (Document document : lstDocs) {
				long dossierId = GetterUtil.getLong(document.get(DossierTerm.DOSSIER_ID));
				long companyId = GetterUtil.getLong(document.get(Field.COMPANY_ID));
				String uid = document.get(Field.UID);
				Dossier oldDossier = DossierLocalServiceUtil.fetchDossier(dossierId);
				if (oldDossier == null) {
					try {
						indexer.delete(companyId, uid);
					} catch (SearchException e) {
					}
				}
			}			
		}
		
		List<Dossier> lstDossiers = DossierLocalServiceUtil.findDossierByGroup(groupId);
		for (Dossier dossier : lstDossiers) {
			DossierLocalServiceUtil.deleteDossier(dossier.getDossierId());
		}
	}
	
	public static void cleanDossierFile(long groupId, long userId, ServiceContext serviceContext) throws PortalException {
		Indexer<DossierFile> indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(DossierFile.class);
		LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();

		params.put(Field.GROUP_ID, String.valueOf(groupId));
		SearchContext searchContext = new SearchContext();
		searchContext.setCompanyId(serviceContext.getCompanyId());

		Sort[] sorts = new Sort[] { };
		
		Hits hits = DossierFileLocalServiceUtil.searchLucene(params, sorts, QueryUtil.ALL_POS, QueryUtil.ALL_POS, searchContext);
		long total = DossierFileLocalServiceUtil.countLucene(params, searchContext);
		
		if (total > 0) {
			List<Document> lstDocs =  (List<Document>) hits.toList();	
			for (Document document : lstDocs) {
				long dossierFileId = GetterUtil.getLong(document.get(DossierFileTerm.DOSSIER_FILE_ID));
				long companyId = GetterUtil.getLong(document.get(Field.COMPANY_ID));
				String uid = document.get(Field.UID);
				DossierFile oldDossierFile = DossierFileLocalServiceUtil.fetchDossierFile(dossierFileId);
				if (oldDossierFile == null) {
					try {
						indexer.delete(companyId, uid);
					} catch (SearchException e) {
					}
				}
			}			
		}
		
		List<DossierFile> lstFiles = DossierFileLocalServiceUtil.findByGroup(groupId);
		for (DossierFile df : lstFiles) {
			LOGGER.info("Clean dossier file: " + df.getReferenceUid());
			if (df.getFileEntryId() != 0) {
				try {
					DLAppLocalServiceUtil.deleteFileEntry(df.getFileEntryId());		
				}
				catch (PortalException e) {
					
				}
			}
			DossierFileLocalServiceUtil.permanentDeleteDossierFile(df.getDossierFileId());
		}
	}
	
	public static void cleanDossierLog(long groupId, long userId, ServiceContext serviceContext) throws PortalException {
		Indexer<DossierLog> indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(DossierLog.class);
		LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();

		params.put(Field.GROUP_ID, String.valueOf(groupId));
		SearchContext searchContext = new SearchContext();
		searchContext.setCompanyId(serviceContext.getCompanyId());

		Sort[] sorts = new Sort[] { };
		
		Hits hits = DossierLogLocalServiceUtil.searchLucene(params, sorts, QueryUtil.ALL_POS, QueryUtil.ALL_POS, searchContext);
		long total = DossierLogLocalServiceUtil.countLucene(params, searchContext);
		
		if (total > 0) {
			List<Document> lstDocs =  (List<Document>) hits.toList();	
			for (Document document : lstDocs) {
				long dossierLogId = GetterUtil.getLong(document.get(DossierLogTerm.DOSSIER_LOG_ID));
				long companyId = GetterUtil.getLong(document.get(Field.COMPANY_ID));
				String uid = document.get(Field.UID);
				DossierLog oldLog = DossierLogLocalServiceUtil.fetchDossierLog(dossierLogId);
				if (oldLog == null) {
					try {
						indexer.delete(companyId, uid);
					} catch (SearchException e) {
					}
				}
			}			
		}
		
		List<DossierLog> lstLogs = DossierLogLocalServiceUtil.findByGroup(groupId);
		for (DossierLog dl : lstLogs) {
			DossierLogLocalServiceUtil.deleteDossierLog(dl.getDossierLogId());
		}
	}
	
	public static void cleanServiceInfo(long groupId, long userId, ServiceContext serviceContext) throws PortalException {
		ServiceInfoActions actions = new ServiceInfoActionsImpl();
		Indexer<ServiceInfo> indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(ServiceInfo.class);
		
		LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();

		params.put(Field.GROUP_ID, String.valueOf(groupId));

		Sort[] sorts = new Sort[] { };

		JSONObject jsonData = actions.getServiceInfos(serviceContext.getUserId(), serviceContext.getCompanyId(),
			groupId, params, sorts, QueryUtil.ALL_POS, QueryUtil.ALL_POS, serviceContext);
		
		long total = jsonData.getInt("total");
		if (total > 0) {
			@SuppressWarnings("unchecked")
			List<Document> lstDocs =  (List<Document>) jsonData.get("data");	
			for (Document document : lstDocs) {
				long serviceInfoId = GetterUtil.getLong(document.get(ServiceInfoTerm.SERVICE_INFO_ID));
				long companyId = GetterUtil.getLong(document.get(Field.COMPANY_ID));
				String uid = document.get(Field.UID);
				ServiceInfo oldService = ServiceInfoLocalServiceUtil.fetchServiceInfo(serviceInfoId);
				if (oldService == null) {
					try {
						indexer.delete(companyId, uid);
					} catch (SearchException e) {
					}
				}
			}			
		}	
		
		List<ServiceInfo> infos = ServiceInfoLocalServiceUtil.getServiceInfosByGroupId(groupId);
		for (ServiceInfo si : infos) {
			ServiceInfoLocalServiceUtil.removeServiceInfo(si.getServiceInfoId());
		}
	}
	
	public static void reindexProcessAction(long groupId, long userId, ServiceContext serviceContext) {
		LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
		ServiceProcessActions actions = new ServiceProcessActionsImpl();
		Indexer<ProcessAction> indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(ProcessAction.class);
		
		params.put(Field.GROUP_ID, String.valueOf(groupId));

		Sort[] sorts = new Sort[] {};

		JSONObject jsonData;
		try {
			jsonData = actions.getProcessActions(userId, serviceContext.getCompanyId(), groupId,
					params, sorts, QueryUtil.ALL_POS, QueryUtil.ALL_POS, serviceContext);
			if (jsonData.getInt("total") > 0) {
				List<Document> lstDocs = (List<Document>) jsonData.get("data");
				for (Document doc : lstDocs) {
					long processActionId = GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK));
					long companyId = GetterUtil.getLong(doc.get(Field.COMPANY_ID));
					String uid = doc.get(Field.UID);
					indexer.delete(companyId, uid);
					ProcessAction pa = ProcessActionLocalServiceUtil.fetchProcessAction(processActionId);
					if (pa != null) {
						indexer.delete(pa);
						ResourceLocalServiceUtil.deleteResource(pa.getCompanyId(), ProcessAction.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, pa.getProcessActionId());
					}
				}
			}
		} catch (PortalException e) {
			e.printStackTrace();
		}

		List<ProcessAction> lstActions = ProcessActionLocalServiceUtil.findByGroup(groupId);
		for (ProcessAction pa : lstActions) {
			try {
				indexer.reindex(ProcessAction.class.getName(), pa.getProcessActionId());
			} catch (SearchException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void garbageCollector(long groupId, long userId, String excludeFolders, String excludeFiles, ServiceContext serviceContext) {
		String[] folderIds = StringUtil.split(excludeFolders);
		List<DLFileEntry> lstExcludes = new ArrayList<>();
		for (String folderId : folderIds) {
			List<DLFileEntry> lstFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId, GetterUtil.getLong(folderId));
			lstExcludes.addAll(lstFileEntries);
		}
		String[] fileEntryIds = StringUtil.split(excludeFiles);
		for (String fileEntryId : fileEntryIds) {
			DLFileEntry fileEntry = DLFileEntryLocalServiceUtil.fetchDLFileEntry(GetterUtil.getLong(fileEntryId));
			if (fileEntry != null) {
				lstExcludes.add(fileEntry);
			}
		}
				
		List<DLFileEntry> allFiles = DLFileEntryLocalServiceUtil.getGroupFileEntries(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		int count = 0;
		for (DLFileEntry fentry : allFiles) {
			boolean found = false;
			for (DLFileEntry temp : lstExcludes) {
				if (temp.getFileEntryId() == fentry.getFileEntryId()) {
					found = true;
					break;
				}
			}
			DossierFile df = DossierFileLocalServiceUtil.getByFileEntryId(fentry.getFileEntryId());
			if (df != null) {
				found = true;
			}
			if (!found) {
				LOGGER.info("Garbage collector delete file: " + fentry.getFileName());
				try {
					AssetEntry asset = AssetEntryLocalServiceUtil.getEntry(DLFileEntry.class.getName(), fentry.getPrimaryKey());
					if (asset != null)
						AssetEntryLocalServiceUtil.deleteAssetEntry(asset);					
				}
				catch (PortalException e) {
					
				}
				try {
					DLAppLocalServiceUtil.deleteFileEntry(fentry.getFileEntryId());		
				}
				catch (PortalException e) {
				}	
				try {
					ResourceLocalServiceUtil.deleteResource(fentry.getCompanyId(), DLFileEntry.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, fentry.getFileEntryId());
				}
				catch (Exception e) {
					
				}
				count++;
			}
		}
		LOGGER.info("Delete files: " + count);
	}
	
	public static final Log LOGGER = LogFactoryUtil
			.getLog(SystemUtils.class);	
}
