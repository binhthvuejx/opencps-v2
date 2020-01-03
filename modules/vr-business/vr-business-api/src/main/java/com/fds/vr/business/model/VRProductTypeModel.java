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
 * The base model interface for the VRProductType service. Represents a row in the &quot;vr_productiontype&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRProductTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRProductTypeImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRProductType
 * @see com.fds.vr.business.model.impl.VRProductTypeImpl
 * @see com.fds.vr.business.model.impl.VRProductTypeModelImpl
 * @generated
 */
@ProviderType
public interface VRProductTypeModel extends BaseModel<VRProductType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr product type model instance should use the {@link VRProductType} interface instead.
	 */

	/**
	 * Returns the primary key of this vr product type.
	 *
	 * @return the primary key of this vr product type
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr product type.
	 *
	 * @param primaryKey the primary key of this vr product type
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr product type.
	 *
	 * @return the ID of this vr product type
	 */
	public long getId();

	/**
	 * Sets the ID of this vr product type.
	 *
	 * @param id the ID of this vr product type
	 */
	public void setId(long id);

	/**
	 * Returns the product plant ID of this vr product type.
	 *
	 * @return the product plant ID of this vr product type
	 */
	public long getProductPlantID();

	/**
	 * Sets the product plant ID of this vr product type.
	 *
	 * @param productPlantID the product plant ID of this vr product type
	 */
	public void setProductPlantID(long productPlantID);

	/**
	 * Returns the sequence no of this vr product type.
	 *
	 * @return the sequence no of this vr product type
	 */
	public long getSequenceNo();

	/**
	 * Sets the sequence no of this vr product type.
	 *
	 * @param sequenceNo the sequence no of this vr product type
	 */
	public void setSequenceNo(long sequenceNo);

	/**
	 * Returns the vehicle class of this vr product type.
	 *
	 * @return the vehicle class of this vr product type
	 */
	@AutoEscape
	public String getVehicleClass();

	/**
	 * Sets the vehicle class of this vr product type.
	 *
	 * @param vehicleClass the vehicle class of this vr product type
	 */
	public void setVehicleClass(String vehicleClass);

	/**
	 * Returns the vehicle type code of this vr product type.
	 *
	 * @return the vehicle type code of this vr product type
	 */
	@AutoEscape
	public String getVehicleTypeCode();

	/**
	 * Sets the vehicle type code of this vr product type.
	 *
	 * @param vehicleTypeCode the vehicle type code of this vr product type
	 */
	public void setVehicleTypeCode(String vehicleTypeCode);

	/**
	 * Returns the vehicle type description of this vr product type.
	 *
	 * @return the vehicle type description of this vr product type
	 */
	@AutoEscape
	public String getVehicleTypeDescription();

	/**
	 * Sets the vehicle type description of this vr product type.
	 *
	 * @param vehicleTypeDescription the vehicle type description of this vr product type
	 */
	public void setVehicleTypeDescription(String vehicleTypeDescription);

	/**
	 * Returns the modify date of this vr product type.
	 *
	 * @return the modify date of this vr product type
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vr product type.
	 *
	 * @param modifyDate the modify date of this vr product type
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vr product type.
	 *
	 * @return the sync date of this vr product type
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vr product type.
	 *
	 * @param syncDate the sync date of this vr product type
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
	public int compareTo(VRProductType vrProductType);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRProductType> toCacheModel();

	@Override
	public VRProductType toEscapedModel();

	@Override
	public VRProductType toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}