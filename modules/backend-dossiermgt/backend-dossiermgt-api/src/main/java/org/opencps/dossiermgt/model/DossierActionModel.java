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

package org.opencps.dossiermgt.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DossierAction service. Represents a row in the &quot;opencps_dossieraction&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.dossiermgt.model.impl.DossierActionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.dossiermgt.model.impl.DossierActionImpl}.
 * </p>
 *
 * @author huymq
 * @see DossierAction
 * @see org.opencps.dossiermgt.model.impl.DossierActionImpl
 * @see org.opencps.dossiermgt.model.impl.DossierActionModelImpl
 * @generated
 */
@ProviderType
public interface DossierActionModel extends BaseModel<DossierAction>,
	GroupedModel, ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dossier action model instance should use the {@link DossierAction} interface instead.
	 */

	/**
	 * Returns the primary key of this dossier action.
	 *
	 * @return the primary key of this dossier action
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dossier action.
	 *
	 * @param primaryKey the primary key of this dossier action
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this dossier action.
	 *
	 * @return the uuid of this dossier action
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this dossier action.
	 *
	 * @param uuid the uuid of this dossier action
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the dossier action ID of this dossier action.
	 *
	 * @return the dossier action ID of this dossier action
	 */
	public long getDossierActionId();

	/**
	 * Sets the dossier action ID of this dossier action.
	 *
	 * @param dossierActionId the dossier action ID of this dossier action
	 */
	public void setDossierActionId(long dossierActionId);

	/**
	 * Returns the company ID of this dossier action.
	 *
	 * @return the company ID of this dossier action
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this dossier action.
	 *
	 * @param companyId the company ID of this dossier action
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this dossier action.
	 *
	 * @return the group ID of this dossier action
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this dossier action.
	 *
	 * @param groupId the group ID of this dossier action
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this dossier action.
	 *
	 * @return the user ID of this dossier action
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this dossier action.
	 *
	 * @param userId the user ID of this dossier action
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this dossier action.
	 *
	 * @return the user uuid of this dossier action
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this dossier action.
	 *
	 * @param userUuid the user uuid of this dossier action
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this dossier action.
	 *
	 * @return the user name of this dossier action
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this dossier action.
	 *
	 * @param userName the user name of this dossier action
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this dossier action.
	 *
	 * @return the create date of this dossier action
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this dossier action.
	 *
	 * @param createDate the create date of this dossier action
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this dossier action.
	 *
	 * @return the modified date of this dossier action
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dossier action.
	 *
	 * @param modifiedDate the modified date of this dossier action
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the dossier ID of this dossier action.
	 *
	 * @return the dossier ID of this dossier action
	 */
	public long getDossierId();

	/**
	 * Sets the dossier ID of this dossier action.
	 *
	 * @param dossierId the dossier ID of this dossier action
	 */
	public void setDossierId(long dossierId);

	/**
	 * Returns the service process ID of this dossier action.
	 *
	 * @return the service process ID of this dossier action
	 */
	public long getServiceProcessId();

	/**
	 * Sets the service process ID of this dossier action.
	 *
	 * @param serviceProcessId the service process ID of this dossier action
	 */
	public void setServiceProcessId(long serviceProcessId);

	/**
	 * Returns the previous action ID of this dossier action.
	 *
	 * @return the previous action ID of this dossier action
	 */
	public long getPreviousActionId();

	/**
	 * Sets the previous action ID of this dossier action.
	 *
	 * @param previousActionId the previous action ID of this dossier action
	 */
	public void setPreviousActionId(long previousActionId);

	/**
	 * Returns the action code of this dossier action.
	 *
	 * @return the action code of this dossier action
	 */
	@AutoEscape
	public String getActionCode();

	/**
	 * Sets the action code of this dossier action.
	 *
	 * @param actionCode the action code of this dossier action
	 */
	public void setActionCode(String actionCode);

	/**
	 * Returns the action user of this dossier action.
	 *
	 * @return the action user of this dossier action
	 */
	@AutoEscape
	public String getActionUser();

	/**
	 * Sets the action user of this dossier action.
	 *
	 * @param actionUser the action user of this dossier action
	 */
	public void setActionUser(String actionUser);

	/**
	 * Returns the action name of this dossier action.
	 *
	 * @return the action name of this dossier action
	 */
	@AutoEscape
	public String getActionName();

	/**
	 * Sets the action name of this dossier action.
	 *
	 * @param actionName the action name of this dossier action
	 */
	public void setActionName(String actionName);

	/**
	 * Returns the action note of this dossier action.
	 *
	 * @return the action note of this dossier action
	 */
	@AutoEscape
	public String getActionNote();

	/**
	 * Sets the action note of this dossier action.
	 *
	 * @param actionNote the action note of this dossier action
	 */
	public void setActionNote(String actionNote);

	/**
	 * Returns the action overdue of this dossier action.
	 *
	 * @return the action overdue of this dossier action
	 */
	public int getActionOverdue();

	/**
	 * Sets the action overdue of this dossier action.
	 *
	 * @param actionOverdue the action overdue of this dossier action
	 */
	public void setActionOverdue(int actionOverdue);

	/**
	 * Returns the sync action code of this dossier action.
	 *
	 * @return the sync action code of this dossier action
	 */
	@AutoEscape
	public String getSyncActionCode();

	/**
	 * Sets the sync action code of this dossier action.
	 *
	 * @param syncActionCode the sync action code of this dossier action
	 */
	public void setSyncActionCode(String syncActionCode);

	/**
	 * Returns the pending of this dossier action.
	 *
	 * @return the pending of this dossier action
	 */
	public boolean getPending();

	/**
	 * Returns <code>true</code> if this dossier action is pending.
	 *
	 * @return <code>true</code> if this dossier action is pending; <code>false</code> otherwise
	 */
	public boolean isPending();

	/**
	 * Sets whether this dossier action is pending.
	 *
	 * @param pending the pending of this dossier action
	 */
	public void setPending(boolean pending);

	/**
	 * Returns the rollbackable of this dossier action.
	 *
	 * @return the rollbackable of this dossier action
	 */
	public boolean getRollbackable();

	/**
	 * Returns <code>true</code> if this dossier action is rollbackable.
	 *
	 * @return <code>true</code> if this dossier action is rollbackable; <code>false</code> otherwise
	 */
	public boolean isRollbackable();

	/**
	 * Sets whether this dossier action is rollbackable.
	 *
	 * @param rollbackable the rollbackable of this dossier action
	 */
	public void setRollbackable(boolean rollbackable);

	/**
	 * Returns the step code of this dossier action.
	 *
	 * @return the step code of this dossier action
	 */
	@AutoEscape
	public String getStepCode();

	/**
	 * Sets the step code of this dossier action.
	 *
	 * @param stepCode the step code of this dossier action
	 */
	public void setStepCode(String stepCode);

	/**
	 * Returns the step name of this dossier action.
	 *
	 * @return the step name of this dossier action
	 */
	@AutoEscape
	public String getStepName();

	/**
	 * Sets the step name of this dossier action.
	 *
	 * @param stepName the step name of this dossier action
	 */
	public void setStepName(String stepName);

	/**
	 * Returns the due date of this dossier action.
	 *
	 * @return the due date of this dossier action
	 */
	public Date getDueDate();

	/**
	 * Sets the due date of this dossier action.
	 *
	 * @param dueDate the due date of this dossier action
	 */
	public void setDueDate(Date dueDate);

	/**
	 * Returns the next action ID of this dossier action.
	 *
	 * @return the next action ID of this dossier action
	 */
	public long getNextActionId();

	/**
	 * Sets the next action ID of this dossier action.
	 *
	 * @param nextActionId the next action ID of this dossier action
	 */
	public void setNextActionId(long nextActionId);

	/**
	 * Returns the payload of this dossier action.
	 *
	 * @return the payload of this dossier action
	 */
	@AutoEscape
	public String getPayload();

	/**
	 * Sets the payload of this dossier action.
	 *
	 * @param payload the payload of this dossier action
	 */
	public void setPayload(String payload);

	/**
	 * Returns the step instruction of this dossier action.
	 *
	 * @return the step instruction of this dossier action
	 */
	@AutoEscape
	public String getStepInstruction();

	/**
	 * Sets the step instruction of this dossier action.
	 *
	 * @param stepInstruction the step instruction of this dossier action
	 */
	public void setStepInstruction(String stepInstruction);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(DossierAction dossierAction);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DossierAction> toCacheModel();

	@Override
	public DossierAction toEscapedModel();

	@Override
	public DossierAction toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}