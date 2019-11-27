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
 * The base model interface for the VRProductionPlantSupplier service. Represents a row in the &quot;vr_productionplantsupplier&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRProductionPlantSupplierModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRProductionPlantSupplierImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantSupplier
 * @see com.fds.vr.business.model.impl.VRProductionPlantSupplierImpl
 * @see com.fds.vr.business.model.impl.VRProductionPlantSupplierModelImpl
 * @generated
 */
@ProviderType
public interface VRProductionPlantSupplierModel extends BaseModel<VRProductionPlantSupplier> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr production plant supplier model instance should use the {@link VRProductionPlantSupplier} interface instead.
	 */

	/**
	 * Returns the primary key of this vr production plant supplier.
	 *
	 * @return the primary key of this vr production plant supplier
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr production plant supplier.
	 *
	 * @param primaryKey the primary key of this vr production plant supplier
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr production plant supplier.
	 *
	 * @return the ID of this vr production plant supplier
	 */
	public long getId();

	/**
	 * Sets the ID of this vr production plant supplier.
	 *
	 * @param id the ID of this vr production plant supplier
	 */
	public void setId(long id);

	/**
	 * Returns the mt core of this vr production plant supplier.
	 *
	 * @return the mt core of this vr production plant supplier
	 */
	public long getMtCore();

	/**
	 * Sets the mt core of this vr production plant supplier.
	 *
	 * @param mtCore the mt core of this vr production plant supplier
	 */
	public void setMtCore(long mtCore);

	/**
	 * Returns the corporation code of this vr production plant supplier.
	 *
	 * @return the corporation code of this vr production plant supplier
	 */
	@AutoEscape
	public String getCorporationCode();

	/**
	 * Sets the corporation code of this vr production plant supplier.
	 *
	 * @param corporationCode the corporation code of this vr production plant supplier
	 */
	public void setCorporationCode(String corporationCode);

	/**
	 * Returns the corporation name of this vr production plant supplier.
	 *
	 * @return the corporation name of this vr production plant supplier
	 */
	@AutoEscape
	public String getCorporationName();

	/**
	 * Sets the corporation name of this vr production plant supplier.
	 *
	 * @param corporationName the corporation name of this vr production plant supplier
	 */
	public void setCorporationName(String corporationName);

	/**
	 * Returns the corporation address of this vr production plant supplier.
	 *
	 * @return the corporation address of this vr production plant supplier
	 */
	@AutoEscape
	public String getCorporationAddress();

	/**
	 * Sets the corporation address of this vr production plant supplier.
	 *
	 * @param corporationAddress the corporation address of this vr production plant supplier
	 */
	public void setCorporationAddress(String corporationAddress);

	/**
	 * Returns the modify date of this vr production plant supplier.
	 *
	 * @return the modify date of this vr production plant supplier
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vr production plant supplier.
	 *
	 * @param modifyDate the modify date of this vr production plant supplier
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vr production plant supplier.
	 *
	 * @return the sync date of this vr production plant supplier
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vr production plant supplier.
	 *
	 * @param syncDate the sync date of this vr production plant supplier
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
	public int compareTo(VRProductionPlantSupplier vrProductionPlantSupplier);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRProductionPlantSupplier> toCacheModel();

	@Override
	public VRProductionPlantSupplier toEscapedModel();

	@Override
	public VRProductionPlantSupplier toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}