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
 * The base model interface for the VRLimitConfigTechSpec service. Represents a row in the &quot;vr_cfg_limit_technicalspec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRLimitConfigTechSpecModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRLimitConfigTechSpecImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRLimitConfigTechSpec
 * @see com.fds.vr.business.model.impl.VRLimitConfigTechSpecImpl
 * @see com.fds.vr.business.model.impl.VRLimitConfigTechSpecModelImpl
 * @generated
 */
@ProviderType
public interface VRLimitConfigTechSpecModel extends BaseModel<VRLimitConfigTechSpec> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr limit config tech spec model instance should use the {@link VRLimitConfigTechSpec} interface instead.
	 */

	/**
	 * Returns the primary key of this vr limit config tech spec.
	 *
	 * @return the primary key of this vr limit config tech spec
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr limit config tech spec.
	 *
	 * @param primaryKey the primary key of this vr limit config tech spec
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr limit config tech spec.
	 *
	 * @return the ID of this vr limit config tech spec
	 */
	public long getId();

	/**
	 * Sets the ID of this vr limit config tech spec.
	 *
	 * @param id the ID of this vr limit config tech spec
	 */
	public void setId(long id);

	/**
	 * Returns the vehicle type of this vr limit config tech spec.
	 *
	 * @return the vehicle type of this vr limit config tech spec
	 */
	@AutoEscape
	public String getVehicleType();

	/**
	 * Sets the vehicle type of this vr limit config tech spec.
	 *
	 * @param vehicleType the vehicle type of this vr limit config tech spec
	 */
	public void setVehicleType(String vehicleType);

	/**
	 * Returns the vehicle type name of this vr limit config tech spec.
	 *
	 * @return the vehicle type name of this vr limit config tech spec
	 */
	@AutoEscape
	public String getVehicleTypeName();

	/**
	 * Sets the vehicle type name of this vr limit config tech spec.
	 *
	 * @param vehicleTypeName the vehicle type name of this vr limit config tech spec
	 */
	public void setVehicleTypeName(String vehicleTypeName);

	/**
	 * Returns the markup smrm of this vr limit config tech spec.
	 *
	 * @return the markup smrm of this vr limit config tech spec
	 */
	@AutoEscape
	public String getMarkupSMRM();

	/**
	 * Sets the markup smrm of this vr limit config tech spec.
	 *
	 * @param markupSMRM the markup smrm of this vr limit config tech spec
	 */
	public void setMarkupSMRM(String markupSMRM);

	/**
	 * Returns the searching drive config of this vr limit config tech spec.
	 *
	 * @return the searching drive config of this vr limit config tech spec
	 */
	public long getSearchingDriveConfig();

	/**
	 * Sets the searching drive config of this vr limit config tech spec.
	 *
	 * @param searchingDriveConfig the searching drive config of this vr limit config tech spec
	 */
	public void setSearchingDriveConfig(long searchingDriveConfig);

	/**
	 * Returns the searching drive config desc of this vr limit config tech spec.
	 *
	 * @return the searching drive config desc of this vr limit config tech spec
	 */
	@AutoEscape
	public String getSearchingDriveConfigDesc();

	/**
	 * Sets the searching drive config desc of this vr limit config tech spec.
	 *
	 * @param searchingDriveConfigDesc the searching drive config desc of this vr limit config tech spec
	 */
	public void setSearchingDriveConfigDesc(String searchingDriveConfigDesc);

	/**
	 * Returns the sequence no of this vr limit config tech spec.
	 *
	 * @return the sequence no of this vr limit config tech spec
	 */
	public int getSequenceNo();

	/**
	 * Sets the sequence no of this vr limit config tech spec.
	 *
	 * @param sequenceNo the sequence no of this vr limit config tech spec
	 */
	public void setSequenceNo(int sequenceNo);

	/**
	 * Returns the specification code of this vr limit config tech spec.
	 *
	 * @return the specification code of this vr limit config tech spec
	 */
	@AutoEscape
	public String getSpecificationCode();

	/**
	 * Sets the specification code of this vr limit config tech spec.
	 *
	 * @param specificationCode the specification code of this vr limit config tech spec
	 */
	public void setSpecificationCode(String specificationCode);

	/**
	 * Returns the specification name of this vr limit config tech spec.
	 *
	 * @return the specification name of this vr limit config tech spec
	 */
	@AutoEscape
	public String getSpecificationName();

	/**
	 * Sets the specification name of this vr limit config tech spec.
	 *
	 * @param specificationName the specification name of this vr limit config tech spec
	 */
	public void setSpecificationName(String specificationName);

	/**
	 * Returns the synch date of this vr limit config tech spec.
	 *
	 * @return the synch date of this vr limit config tech spec
	 */
	public Date getSynchDate();

	/**
	 * Sets the synch date of this vr limit config tech spec.
	 *
	 * @param synchDate the synch date of this vr limit config tech spec
	 */
	public void setSynchDate(Date synchDate);

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
	public int compareTo(VRLimitConfigTechSpec vrLimitConfigTechSpec);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRLimitConfigTechSpec> toCacheModel();

	@Override
	public VRLimitConfigTechSpec toEscapedModel();

	@Override
	public VRLimitConfigTechSpec toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}