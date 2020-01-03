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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VRCOPReportRepository service. Represents a row in the &quot;vr_copreportrepository&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRCOPReportRepositoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRCOPReportRepositoryImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRCOPReportRepository
 * @see com.fds.vr.business.model.impl.VRCOPReportRepositoryImpl
 * @see com.fds.vr.business.model.impl.VRCOPReportRepositoryModelImpl
 * @generated
 */
@ProviderType
public interface VRCOPReportRepositoryModel extends BaseModel<VRCOPReportRepository> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vrcop report repository model instance should use the {@link VRCOPReportRepository} interface instead.
	 */

	/**
	 * Returns the primary key of this vrcop report repository.
	 *
	 * @return the primary key of this vrcop report repository
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vrcop report repository.
	 *
	 * @param primaryKey the primary key of this vrcop report repository
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vrcop report repository.
	 *
	 * @return the ID of this vrcop report repository
	 */
	public long getId();

	/**
	 * Sets the ID of this vrcop report repository.
	 *
	 * @param id the ID of this vrcop report repository
	 */
	public void setId(long id);

	/**
	 * Returns the applicant profile ID of this vrcop report repository.
	 *
	 * @return the applicant profile ID of this vrcop report repository
	 */
	public long getApplicantProfileId();

	/**
	 * Sets the applicant profile ID of this vrcop report repository.
	 *
	 * @param applicantProfileId the applicant profile ID of this vrcop report repository
	 */
	public void setApplicantProfileId(long applicantProfileId);

	/**
	 * Returns the applicant name of this vrcop report repository.
	 *
	 * @return the applicant name of this vrcop report repository
	 */
	@AutoEscape
	public String getApplicantName();

	/**
	 * Sets the applicant name of this vrcop report repository.
	 *
	 * @param applicantName the applicant name of this vrcop report repository
	 */
	public void setApplicantName(String applicantName);

	/**
	 * Returns the applicant address of this vrcop report repository.
	 *
	 * @return the applicant address of this vrcop report repository
	 */
	@AutoEscape
	public String getApplicantAddress();

	/**
	 * Sets the applicant address of this vrcop report repository.
	 *
	 * @param applicantAddress the applicant address of this vrcop report repository
	 */
	public void setApplicantAddress(String applicantAddress);

	/**
	 * Returns the overseas manufacturer ID of this vrcop report repository.
	 *
	 * @return the overseas manufacturer ID of this vrcop report repository
	 */
	public long getOverseasManufacturerId();

	/**
	 * Sets the overseas manufacturer ID of this vrcop report repository.
	 *
	 * @param overseasManufacturerId the overseas manufacturer ID of this vrcop report repository
	 */
	public void setOverseasManufacturerId(long overseasManufacturerId);

	/**
	 * Returns the overseas manufacturer name of this vrcop report repository.
	 *
	 * @return the overseas manufacturer name of this vrcop report repository
	 */
	@AutoEscape
	public String getOverseasManufacturerName();

	/**
	 * Sets the overseas manufacturer name of this vrcop report repository.
	 *
	 * @param overseasManufacturerName the overseas manufacturer name of this vrcop report repository
	 */
	public void setOverseasManufacturerName(String overseasManufacturerName);

	/**
	 * Returns the overseas manufacturer address of this vrcop report repository.
	 *
	 * @return the overseas manufacturer address of this vrcop report repository
	 */
	@AutoEscape
	public String getOverseasManufacturerAddress();

	/**
	 * Sets the overseas manufacturer address of this vrcop report repository.
	 *
	 * @param overseasManufacturerAddress the overseas manufacturer address of this vrcop report repository
	 */
	public void setOverseasManufacturerAddress(
		String overseasManufacturerAddress);

	/**
	 * Returns the production plant ID of this vrcop report repository.
	 *
	 * @return the production plant ID of this vrcop report repository
	 */
	public long getProductionPlantId();

	/**
	 * Sets the production plant ID of this vrcop report repository.
	 *
	 * @param productionPlantId the production plant ID of this vrcop report repository
	 */
	public void setProductionPlantId(long productionPlantId);

	/**
	 * Returns the production plant code of this vrcop report repository.
	 *
	 * @return the production plant code of this vrcop report repository
	 */
	@AutoEscape
	public String getProductionPlantCode();

	/**
	 * Sets the production plant code of this vrcop report repository.
	 *
	 * @param productionPlantCode the production plant code of this vrcop report repository
	 */
	public void setProductionPlantCode(String productionPlantCode);

	/**
	 * Returns the production plant name of this vrcop report repository.
	 *
	 * @return the production plant name of this vrcop report repository
	 */
	@AutoEscape
	public String getProductionPlantName();

	/**
	 * Sets the production plant name of this vrcop report repository.
	 *
	 * @param productionPlantName the production plant name of this vrcop report repository
	 */
	public void setProductionPlantName(String productionPlantName);

	/**
	 * Returns the production plant address of this vrcop report repository.
	 *
	 * @return the production plant address of this vrcop report repository
	 */
	@AutoEscape
	public String getProductionPlantAddress();

	/**
	 * Sets the production plant address of this vrcop report repository.
	 *
	 * @param productionPlantAddress the production plant address of this vrcop report repository
	 */
	public void setProductionPlantAddress(String productionPlantAddress);

	/**
	 * Returns the cop report no of this vrcop report repository.
	 *
	 * @return the cop report no of this vrcop report repository
	 */
	@AutoEscape
	public String getCopReportNo();

	/**
	 * Sets the cop report no of this vrcop report repository.
	 *
	 * @param copReportNo the cop report no of this vrcop report repository
	 */
	public void setCopReportNo(String copReportNo);

	/**
	 * Returns the cop report status of this vrcop report repository.
	 *
	 * @return the cop report status of this vrcop report repository
	 */
	@AutoEscape
	public String getCopReportStatus();

	/**
	 * Sets the cop report status of this vrcop report repository.
	 *
	 * @param copReportStatus the cop report status of this vrcop report repository
	 */
	public void setCopReportStatus(String copReportStatus);

	/**
	 * Returns the cop report type of this vrcop report repository.
	 *
	 * @return the cop report type of this vrcop report repository
	 */
	@AutoEscape
	public String getCopReportType();

	/**
	 * Sets the cop report type of this vrcop report repository.
	 *
	 * @param copReportType the cop report type of this vrcop report repository
	 */
	public void setCopReportType(String copReportType);

	/**
	 * Returns the cop report metadata of this vrcop report repository.
	 *
	 * @return the cop report metadata of this vrcop report repository
	 */
	@AutoEscape
	public String getCopReportMetadata();

	/**
	 * Sets the cop report metadata of this vrcop report repository.
	 *
	 * @param copReportMetadata the cop report metadata of this vrcop report repository
	 */
	public void setCopReportMetadata(String copReportMetadata);

	/**
	 * Returns the cop report sign name of this vrcop report repository.
	 *
	 * @return the cop report sign name of this vrcop report repository
	 */
	@AutoEscape
	public String getCopReportSignName();

	/**
	 * Sets the cop report sign name of this vrcop report repository.
	 *
	 * @param copReportSignName the cop report sign name of this vrcop report repository
	 */
	public void setCopReportSignName(String copReportSignName);

	/**
	 * Returns the cop report sign title of this vrcop report repository.
	 *
	 * @return the cop report sign title of this vrcop report repository
	 */
	@AutoEscape
	public String getCopReportSignTitle();

	/**
	 * Sets the cop report sign title of this vrcop report repository.
	 *
	 * @param copReportSignTitle the cop report sign title of this vrcop report repository
	 */
	public void setCopReportSignTitle(String copReportSignTitle);

	/**
	 * Returns the cop report sign place of this vrcop report repository.
	 *
	 * @return the cop report sign place of this vrcop report repository
	 */
	@AutoEscape
	public String getCopReportSignPlace();

	/**
	 * Sets the cop report sign place of this vrcop report repository.
	 *
	 * @param copReportSignPlace the cop report sign place of this vrcop report repository
	 */
	public void setCopReportSignPlace(String copReportSignPlace);

	/**
	 * Returns the cop report date of this vrcop report repository.
	 *
	 * @return the cop report date of this vrcop report repository
	 */
	public Date getCopReportDate();

	/**
	 * Sets the cop report date of this vrcop report repository.
	 *
	 * @param copReportDate the cop report date of this vrcop report repository
	 */
	public void setCopReportDate(Date copReportDate);

	/**
	 * Returns the cop report approved date of this vrcop report repository.
	 *
	 * @return the cop report approved date of this vrcop report repository
	 */
	public Date getCopReportApprovedDate();

	/**
	 * Sets the cop report approved date of this vrcop report repository.
	 *
	 * @param copReportApprovedDate the cop report approved date of this vrcop report repository
	 */
	public void setCopReportApprovedDate(Date copReportApprovedDate);

	/**
	 * Returns the cop report expired date of this vrcop report repository.
	 *
	 * @return the cop report expired date of this vrcop report repository
	 */
	public Date getCopReportExpiredDate();

	/**
	 * Sets the cop report expired date of this vrcop report repository.
	 *
	 * @param copReportExpiredDate the cop report expired date of this vrcop report repository
	 */
	public void setCopReportExpiredDate(Date copReportExpiredDate);

	/**
	 * Returns the modify date of this vrcop report repository.
	 *
	 * @return the modify date of this vrcop report repository
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vrcop report repository.
	 *
	 * @param modifyDate the modify date of this vrcop report repository
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vrcop report repository.
	 *
	 * @return the sync date of this vrcop report repository
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vrcop report repository.
	 *
	 * @param syncDate the sync date of this vrcop report repository
	 */
	public void setSyncDate(Date syncDate);

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
	public int compareTo(VRCOPReportRepository vrcopReportRepository);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRCOPReportRepository> toCacheModel();

	@Override
	public VRCOPReportRepository toEscapedModel();

	@Override
	public VRCOPReportRepository toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}