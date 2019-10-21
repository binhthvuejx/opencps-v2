/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.fds.vr.business.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.model.VRCOPProductionPlantEmployee;
import com.fds.vr.business.service.base.VRCOPProductionPlantEmployeeLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vrcop production plant employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRCOPProductionPlantEmployeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRCOPProductionPlantEmployeeLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRCOPProductionPlantEmployeeLocalServiceUtil
 */
@ProviderType
public class VRCOPProductionPlantEmployeeLocalServiceImpl
	extends VRCOPProductionPlantEmployeeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRCOPProductionPlantEmployeeLocalServiceUtil} to access the vrcop production plant employee local service.
	 */
	
	public List<VRCOPProductionPlantEmployee> findBycopReportRepositoryID(long mtCore, long copReportRepositoryID) throws PortalException, SystemException {
		try {
			return vrcopProductionPlantEmployeePersistence.findBycopReportRepositoryID(mtCore, copReportRepositoryID);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPProductionPlantEmployee>();
		
	}


	public List<VRCOPProductionPlantEmployee> findBycopReportNo(long mtCore, String copReportNo) throws PortalException, SystemException {
		try {
			return vrcopProductionPlantEmployeePersistence.findBycopReportNo(mtCore, copReportNo);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRCOPProductionPlantEmployee>();
		
	}

	public VRCOPProductionPlantEmployee updateCOPProductionPlantEmployee(Map<String, String> mapValues, int mtCore) {
		
		Date now = new Date();

		long vrCOPProductionPlantEmployeeId = counterLocalService.increment(VRCOPProductionPlantEmployee.class.getName());

		VRCOPProductionPlantEmployee object = vrcopProductionPlantEmployeePersistence.create(vrCOPProductionPlantEmployeeId);

		/// Add audit fields
		object.setSyncDate(now);
		object.setModifyDate(now);

		// Add other fields
		object.setMtCore(mtCore);
		object.setCopReportRepositoryID(Long.valueOf(mapValues.get("copReportRepositoryId")));
		object.setCopReportNo(mapValues.get("copReportNo"));
		object.setSequenceNo(Long.valueOf(mapValues.get("sequenceNo")));
		object.setEmployeeName(mapValues.get("employeeName"));
		object.setEmployeeCertificateNo(mapValues.get("employeeCertificateNo"));
		object.setTrainningAt(mapValues.get("trainningAt"));

		return vrcopProductionPlantEmployeePersistence.update(object);
	}
	
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return  vrcopProductionPlantEmployeeFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrcopProductionPlantEmployeeFinder.countData(sql);
	}
	
	public JSONArray getByCOPReportNo(long mtCore,  String COPReportNo) throws SystemException, PortalException{
		
		JSONArray result = JSONFactoryUtil.createJSONArray();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		
		List<VRCOPProductionPlantEmployee> dataList = findBycopReportNo(mtCore,COPReportNo);
		
		for(VRCOPProductionPlantEmployee data:dataList) {
			
			jsonObject = JSONFactoryUtil.createJSONObject();
			
			jsonObject = ActionUtil.object2Json(data, VRCOPProductionPlantEmployee.class, "vr_copproductionplantemployee");
			
			if(Validator.isNotNull(jsonObject)) {
				result.put(jsonObject);
			}
		}
		
		
		return result;
	}

	private Log _log = LogFactoryUtil.getLog(VRCOPProductionPlantEmployeeLocalServiceImpl.class);
}