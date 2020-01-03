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
 * The base model interface for the VRInventory service. Represents a row in the &quot;vr_inventory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRInventoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRInventoryImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRInventory
 * @see com.fds.vr.business.model.impl.VRInventoryImpl
 * @see com.fds.vr.business.model.impl.VRInventoryModelImpl
 * @generated
 */
@ProviderType
public interface VRInventoryModel extends BaseModel<VRInventory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr inventory model instance should use the {@link VRInventory} interface instead.
	 */

	/**
	 * Returns the primary key of this vr inventory.
	 *
	 * @return the primary key of this vr inventory
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr inventory.
	 *
	 * @param primaryKey the primary key of this vr inventory
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr inventory.
	 *
	 * @return the ID of this vr inventory
	 */
	public long getId();

	/**
	 * Sets the ID of this vr inventory.
	 *
	 * @param id the ID of this vr inventory
	 */
	public void setId(long id);

	/**
	 * Returns the yearof period of this vr inventory.
	 *
	 * @return the yearof period of this vr inventory
	 */
	public long getYearofPeriod();

	/**
	 * Sets the yearof period of this vr inventory.
	 *
	 * @param yearofPeriod the yearof period of this vr inventory
	 */
	public void setYearofPeriod(long yearofPeriod);

	/**
	 * Returns the previous period of this vr inventory.
	 *
	 * @return the previous period of this vr inventory
	 */
	@AutoEscape
	public String getPreviousPeriod();

	/**
	 * Sets the previous period of this vr inventory.
	 *
	 * @param previousPeriod the previous period of this vr inventory
	 */
	public void setPreviousPeriod(String previousPeriod);

	/**
	 * Returns the previous period code of this vr inventory.
	 *
	 * @return the previous period code of this vr inventory
	 */
	@AutoEscape
	public String getPreviousPeriodCode();

	/**
	 * Sets the previous period code of this vr inventory.
	 *
	 * @param previousPeriodCode the previous period code of this vr inventory
	 */
	public void setPreviousPeriodCode(String previousPeriodCode);

	/**
	 * Returns the book ID of this vr inventory.
	 *
	 * @return the book ID of this vr inventory
	 */
	public long getBookId();

	/**
	 * Sets the book ID of this vr inventory.
	 *
	 * @param bookId the book ID of this vr inventory
	 */
	public void setBookId(long bookId);

	/**
	 * Returns the vehicle class of this vr inventory.
	 *
	 * @return the vehicle class of this vr inventory
	 */
	@AutoEscape
	public String getVehicleClass();

	/**
	 * Sets the vehicle class of this vr inventory.
	 *
	 * @param vehicleClass the vehicle class of this vr inventory
	 */
	public void setVehicleClass(String vehicleClass);

	/**
	 * Returns the stamp type of this vr inventory.
	 *
	 * @return the stamp type of this vr inventory
	 */
	@AutoEscape
	public String getStampType();

	/**
	 * Sets the stamp type of this vr inventory.
	 *
	 * @param stampType the stamp type of this vr inventory
	 */
	public void setStampType(String stampType);

	/**
	 * Returns the stamp short no of this vr inventory.
	 *
	 * @return the stamp short no of this vr inventory
	 */
	@AutoEscape
	public String getStampShortNo();

	/**
	 * Sets the stamp short no of this vr inventory.
	 *
	 * @param stampShortNo the stamp short no of this vr inventory
	 */
	public void setStampShortNo(String stampShortNo);

	/**
	 * Returns the serial start no of this vr inventory.
	 *
	 * @return the serial start no of this vr inventory
	 */
	@AutoEscape
	public String getSerialStartNo();

	/**
	 * Sets the serial start no of this vr inventory.
	 *
	 * @param serialStartNo the serial start no of this vr inventory
	 */
	public void setSerialStartNo(String serialStartNo);

	/**
	 * Returns the serial end no of this vr inventory.
	 *
	 * @return the serial end no of this vr inventory
	 */
	@AutoEscape
	public String getSerialEndNo();

	/**
	 * Sets the serial end no of this vr inventory.
	 *
	 * @param serialEndNo the serial end no of this vr inventory
	 */
	public void setSerialEndNo(String serialEndNo);

	/**
	 * Returns the total quantities of this vr inventory.
	 *
	 * @return the total quantities of this vr inventory
	 */
	public long getTotalQuantities();

	/**
	 * Sets the total quantities of this vr inventory.
	 *
	 * @param totalQuantities the total quantities of this vr inventory
	 */
	public void setTotalQuantities(long totalQuantities);

	/**
	 * Returns the total in use of this vr inventory.
	 *
	 * @return the total in use of this vr inventory
	 */
	public long getTotalInUse();

	/**
	 * Sets the total in use of this vr inventory.
	 *
	 * @param totalInUse the total in use of this vr inventory
	 */
	public void setTotalInUse(long totalInUse);

	/**
	 * Returns the total not used of this vr inventory.
	 *
	 * @return the total not used of this vr inventory
	 */
	public long getTotalNotUsed();

	/**
	 * Sets the total not used of this vr inventory.
	 *
	 * @param totalNotUsed the total not used of this vr inventory
	 */
	public void setTotalNotUsed(long totalNotUsed);

	/**
	 * Returns the remark of this vr inventory.
	 *
	 * @return the remark of this vr inventory
	 */
	@AutoEscape
	public String getRemark();

	/**
	 * Sets the remark of this vr inventory.
	 *
	 * @param remark the remark of this vr inventory
	 */
	public void setRemark(String remark);

	/**
	 * Returns the corporation ID of this vr inventory.
	 *
	 * @return the corporation ID of this vr inventory
	 */
	@AutoEscape
	public String getCorporationId();

	/**
	 * Sets the corporation ID of this vr inventory.
	 *
	 * @param corporationId the corporation ID of this vr inventory
	 */
	public void setCorporationId(String corporationId);

	/**
	 * Returns the check type of this vr inventory.
	 *
	 * @return the check type of this vr inventory
	 */
	public long getCheckType();

	/**
	 * Sets the check type of this vr inventory.
	 *
	 * @param checkType the check type of this vr inventory
	 */
	public void setCheckType(long checkType);

	/**
	 * Returns the check status of this vr inventory.
	 *
	 * @return the check status of this vr inventory
	 */
	public long getCheckStatus();

	/**
	 * Sets the check status of this vr inventory.
	 *
	 * @param checkStatus the check status of this vr inventory
	 */
	public void setCheckStatus(long checkStatus);

	/**
	 * Returns the modify date of this vr inventory.
	 *
	 * @return the modify date of this vr inventory
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vr inventory.
	 *
	 * @param modifyDate the modify date of this vr inventory
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vr inventory.
	 *
	 * @return the sync date of this vr inventory
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vr inventory.
	 *
	 * @param syncDate the sync date of this vr inventory
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
	public int compareTo(VRInventory vrInventory);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRInventory> toCacheModel();

	@Override
	public VRInventory toEscapedModel();

	@Override
	public VRInventory toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}