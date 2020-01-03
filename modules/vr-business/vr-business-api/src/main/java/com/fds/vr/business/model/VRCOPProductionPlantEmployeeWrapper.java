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

package com.fds.vr.business.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRCOPProductionPlantEmployee}.
 * </p>
 *
 * @author LamTV
 * @see VRCOPProductionPlantEmployee
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantEmployeeWrapper
	implements VRCOPProductionPlantEmployee,
		ModelWrapper<VRCOPProductionPlantEmployee> {
	public VRCOPProductionPlantEmployeeWrapper(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee) {
		_vrcopProductionPlantEmployee = vrcopProductionPlantEmployee;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCOPProductionPlantEmployee.class;
	}

	@Override
	public String getModelClassName() {
		return VRCOPProductionPlantEmployee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("copReportRepositoryID", getCopReportRepositoryID());
		attributes.put("copReportNo", getCopReportNo());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("employeeName", getEmployeeName());
		attributes.put("employeeCertificateNo", getEmployeeCertificateNo());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long copReportRepositoryID = (Long)attributes.get(
				"copReportRepositoryID");

		if (copReportRepositoryID != null) {
			setCopReportRepositoryID(copReportRepositoryID);
		}

		String copReportNo = (String)attributes.get("copReportNo");

		if (copReportNo != null) {
			setCopReportNo(copReportNo);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String employeeName = (String)attributes.get("employeeName");

		if (employeeName != null) {
			setEmployeeName(employeeName);
		}

		String employeeCertificateNo = (String)attributes.get(
				"employeeCertificateNo");

		if (employeeCertificateNo != null) {
			setEmployeeCertificateNo(employeeCertificateNo);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public VRCOPProductionPlantEmployee toEscapedModel() {
		return new VRCOPProductionPlantEmployeeWrapper(_vrcopProductionPlantEmployee.toEscapedModel());
	}

	@Override
	public VRCOPProductionPlantEmployee toUnescapedModel() {
		return new VRCOPProductionPlantEmployeeWrapper(_vrcopProductionPlantEmployee.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrcopProductionPlantEmployee.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrcopProductionPlantEmployee.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrcopProductionPlantEmployee.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrcopProductionPlantEmployee.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCOPProductionPlantEmployee> toCacheModel() {
		return _vrcopProductionPlantEmployee.toCacheModel();
	}

	@Override
	public int compareTo(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee) {
		return _vrcopProductionPlantEmployee.compareTo(vrcopProductionPlantEmployee);
	}

	@Override
	public int hashCode() {
		return _vrcopProductionPlantEmployee.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrcopProductionPlantEmployee.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCOPProductionPlantEmployeeWrapper((VRCOPProductionPlantEmployee)_vrcopProductionPlantEmployee.clone());
	}

	/**
	* Returns the cop report no of this vrcop production plant employee.
	*
	* @return the cop report no of this vrcop production plant employee
	*/
	@Override
	public java.lang.String getCopReportNo() {
		return _vrcopProductionPlantEmployee.getCopReportNo();
	}

	/**
	* Returns the employee certificate no of this vrcop production plant employee.
	*
	* @return the employee certificate no of this vrcop production plant employee
	*/
	@Override
	public java.lang.String getEmployeeCertificateNo() {
		return _vrcopProductionPlantEmployee.getEmployeeCertificateNo();
	}

	/**
	* Returns the employee name of this vrcop production plant employee.
	*
	* @return the employee name of this vrcop production plant employee
	*/
	@Override
	public java.lang.String getEmployeeName() {
		return _vrcopProductionPlantEmployee.getEmployeeName();
	}

	@Override
	public java.lang.String toString() {
		return _vrcopProductionPlantEmployee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrcopProductionPlantEmployee.toXmlString();
	}

	/**
	* Returns the modify date of this vrcop production plant employee.
	*
	* @return the modify date of this vrcop production plant employee
	*/
	@Override
	public Date getModifyDate() {
		return _vrcopProductionPlantEmployee.getModifyDate();
	}

	/**
	* Returns the sync date of this vrcop production plant employee.
	*
	* @return the sync date of this vrcop production plant employee
	*/
	@Override
	public Date getSyncDate() {
		return _vrcopProductionPlantEmployee.getSyncDate();
	}

	/**
	* Returns the cop report repository ID of this vrcop production plant employee.
	*
	* @return the cop report repository ID of this vrcop production plant employee
	*/
	@Override
	public long getCopReportRepositoryID() {
		return _vrcopProductionPlantEmployee.getCopReportRepositoryID();
	}

	/**
	* Returns the ID of this vrcop production plant employee.
	*
	* @return the ID of this vrcop production plant employee
	*/
	@Override
	public long getId() {
		return _vrcopProductionPlantEmployee.getId();
	}

	/**
	* Returns the primary key of this vrcop production plant employee.
	*
	* @return the primary key of this vrcop production plant employee
	*/
	@Override
	public long getPrimaryKey() {
		return _vrcopProductionPlantEmployee.getPrimaryKey();
	}

	/**
	* Returns the sequence no of this vrcop production plant employee.
	*
	* @return the sequence no of this vrcop production plant employee
	*/
	@Override
	public long getSequenceNo() {
		return _vrcopProductionPlantEmployee.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrcopProductionPlantEmployee.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrcopProductionPlantEmployee.setCachedModel(cachedModel);
	}

	/**
	* Sets the cop report no of this vrcop production plant employee.
	*
	* @param copReportNo the cop report no of this vrcop production plant employee
	*/
	@Override
	public void setCopReportNo(java.lang.String copReportNo) {
		_vrcopProductionPlantEmployee.setCopReportNo(copReportNo);
	}

	/**
	* Sets the cop report repository ID of this vrcop production plant employee.
	*
	* @param copReportRepositoryID the cop report repository ID of this vrcop production plant employee
	*/
	@Override
	public void setCopReportRepositoryID(long copReportRepositoryID) {
		_vrcopProductionPlantEmployee.setCopReportRepositoryID(copReportRepositoryID);
	}

	/**
	* Sets the employee certificate no of this vrcop production plant employee.
	*
	* @param employeeCertificateNo the employee certificate no of this vrcop production plant employee
	*/
	@Override
	public void setEmployeeCertificateNo(java.lang.String employeeCertificateNo) {
		_vrcopProductionPlantEmployee.setEmployeeCertificateNo(employeeCertificateNo);
	}

	/**
	* Sets the employee name of this vrcop production plant employee.
	*
	* @param employeeName the employee name of this vrcop production plant employee
	*/
	@Override
	public void setEmployeeName(java.lang.String employeeName) {
		_vrcopProductionPlantEmployee.setEmployeeName(employeeName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrcopProductionPlantEmployee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrcopProductionPlantEmployee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrcopProductionPlantEmployee.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vrcop production plant employee.
	*
	* @param id the ID of this vrcop production plant employee
	*/
	@Override
	public void setId(long id) {
		_vrcopProductionPlantEmployee.setId(id);
	}

	/**
	* Sets the modify date of this vrcop production plant employee.
	*
	* @param modifyDate the modify date of this vrcop production plant employee
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrcopProductionPlantEmployee.setModifyDate(modifyDate);
	}

	@Override
	public void setNew(boolean n) {
		_vrcopProductionPlantEmployee.setNew(n);
	}

	/**
	* Sets the primary key of this vrcop production plant employee.
	*
	* @param primaryKey the primary key of this vrcop production plant employee
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrcopProductionPlantEmployee.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrcopProductionPlantEmployee.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sequence no of this vrcop production plant employee.
	*
	* @param sequenceNo the sequence no of this vrcop production plant employee
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrcopProductionPlantEmployee.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the sync date of this vrcop production plant employee.
	*
	* @param syncDate the sync date of this vrcop production plant employee
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrcopProductionPlantEmployee.setSyncDate(syncDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPProductionPlantEmployeeWrapper)) {
			return false;
		}

		VRCOPProductionPlantEmployeeWrapper vrcopProductionPlantEmployeeWrapper = (VRCOPProductionPlantEmployeeWrapper)obj;

		if (Objects.equals(_vrcopProductionPlantEmployee,
					vrcopProductionPlantEmployeeWrapper._vrcopProductionPlantEmployee)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCOPProductionPlantEmployee getWrappedModel() {
		return _vrcopProductionPlantEmployee;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrcopProductionPlantEmployee.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrcopProductionPlantEmployee.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrcopProductionPlantEmployee.resetOriginalValues();
	}

	private final VRCOPProductionPlantEmployee _vrcopProductionPlantEmployee;
}