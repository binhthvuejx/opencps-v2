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
 * The base model interface for the ILVehicleCustomsBorderGuard service. Represents a row in the &quot;il_vehicle_customsborderguard&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.ILVehicleCustomsBorderGuardModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.ILVehicleCustomsBorderGuardImpl}.
 * </p>
 *
 * @author LamTV
 * @see ILVehicleCustomsBorderGuard
 * @see com.fds.vr.business.model.impl.ILVehicleCustomsBorderGuardImpl
 * @see com.fds.vr.business.model.impl.ILVehicleCustomsBorderGuardModelImpl
 * @generated
 */
@ProviderType
public interface ILVehicleCustomsBorderGuardModel extends BaseModel<ILVehicleCustomsBorderGuard> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a il vehicle customs border guard model instance should use the {@link ILVehicleCustomsBorderGuard} interface instead.
	 */

	/**
	 * Returns the primary key of this il vehicle customs border guard.
	 *
	 * @return the primary key of this il vehicle customs border guard
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this il vehicle customs border guard.
	 *
	 * @param primaryKey the primary key of this il vehicle customs border guard
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this il vehicle customs border guard.
	 *
	 * @return the ID of this il vehicle customs border guard
	 */
	public long getId();

	/**
	 * Sets the ID of this il vehicle customs border guard.
	 *
	 * @param id the ID of this il vehicle customs border guard
	 */
	public void setId(long id);

	/**
	 * Returns the registration number of this il vehicle customs border guard.
	 *
	 * @return the registration number of this il vehicle customs border guard
	 */
	@AutoEscape
	public String getRegistrationNumber();

	/**
	 * Sets the registration number of this il vehicle customs border guard.
	 *
	 * @param registrationNumber the registration number of this il vehicle customs border guard
	 */
	public void setRegistrationNumber(String registrationNumber);

	/**
	 * Returns the exp imp gate type of this il vehicle customs border guard.
	 *
	 * @return the exp imp gate type of this il vehicle customs border guard
	 */
	@AutoEscape
	public String getExpImpGateType();

	/**
	 * Sets the exp imp gate type of this il vehicle customs border guard.
	 *
	 * @param expImpGateType the exp imp gate type of this il vehicle customs border guard
	 */
	public void setExpImpGateType(String expImpGateType);

	/**
	 * Returns the exp imp gate of this il vehicle customs border guard.
	 *
	 * @return the exp imp gate of this il vehicle customs border guard
	 */
	@AutoEscape
	public String getExpImpGate();

	/**
	 * Sets the exp imp gate of this il vehicle customs border guard.
	 *
	 * @param expImpGate the exp imp gate of this il vehicle customs border guard
	 */
	public void setExpImpGate(String expImpGate);

	/**
	 * Returns the exp imp gate code of this il vehicle customs border guard.
	 *
	 * @return the exp imp gate code of this il vehicle customs border guard
	 */
	@AutoEscape
	public String getExpImpGateCode();

	/**
	 * Sets the exp imp gate code of this il vehicle customs border guard.
	 *
	 * @param expImpGateCode the exp imp gate code of this il vehicle customs border guard
	 */
	public void setExpImpGateCode(String expImpGateCode);

	/**
	 * Returns the driver name of this il vehicle customs border guard.
	 *
	 * @return the driver name of this il vehicle customs border guard
	 */
	@AutoEscape
	public String getDriverName();

	/**
	 * Sets the driver name of this il vehicle customs border guard.
	 *
	 * @param driverName the driver name of this il vehicle customs border guard
	 */
	public void setDriverName(String driverName);

	/**
	 * Returns the driver licence no of this il vehicle customs border guard.
	 *
	 * @return the driver licence no of this il vehicle customs border guard
	 */
	@AutoEscape
	public String getDriverLicenceNo();

	/**
	 * Sets the driver licence no of this il vehicle customs border guard.
	 *
	 * @param driverLicenceNo the driver licence no of this il vehicle customs border guard
	 */
	public void setDriverLicenceNo(String driverLicenceNo);

	/**
	 * Returns the registration date of this il vehicle customs border guard.
	 *
	 * @return the registration date of this il vehicle customs border guard
	 */
	public Date getRegistrationDate();

	/**
	 * Sets the registration date of this il vehicle customs border guard.
	 *
	 * @param registrationDate the registration date of this il vehicle customs border guard
	 */
	public void setRegistrationDate(Date registrationDate);

	/**
	 * Returns the customs departure date of this il vehicle customs border guard.
	 *
	 * @return the customs departure date of this il vehicle customs border guard
	 */
	public Date getCustomsDepartureDate();

	/**
	 * Sets the customs departure date of this il vehicle customs border guard.
	 *
	 * @param customsDepartureDate the customs departure date of this il vehicle customs border guard
	 */
	public void setCustomsDepartureDate(Date customsDepartureDate);

	/**
	 * Returns the customs arrival date of this il vehicle customs border guard.
	 *
	 * @return the customs arrival date of this il vehicle customs border guard
	 */
	public Date getCustomsArrivalDate();

	/**
	 * Sets the customs arrival date of this il vehicle customs border guard.
	 *
	 * @param customsArrivalDate the customs arrival date of this il vehicle customs border guard
	 */
	public void setCustomsArrivalDate(Date customsArrivalDate);

	/**
	 * Returns the border guards departure date of this il vehicle customs border guard.
	 *
	 * @return the border guards departure date of this il vehicle customs border guard
	 */
	public Date getBorderGuardsDepartureDate();

	/**
	 * Sets the border guards departure date of this il vehicle customs border guard.
	 *
	 * @param borderGuardsDepartureDate the border guards departure date of this il vehicle customs border guard
	 */
	public void setBorderGuardsDepartureDate(Date borderGuardsDepartureDate);

	/**
	 * Returns the border guards arrival date of this il vehicle customs border guard.
	 *
	 * @return the border guards arrival date of this il vehicle customs border guard
	 */
	public Date getBorderGuardsArrivalDate();

	/**
	 * Sets the border guards arrival date of this il vehicle customs border guard.
	 *
	 * @param borderGuardsArrivalDate the border guards arrival date of this il vehicle customs border guard
	 */
	public void setBorderGuardsArrivalDate(Date borderGuardsArrivalDate);

	/**
	 * Returns the sync date of this il vehicle customs border guard.
	 *
	 * @return the sync date of this il vehicle customs border guard
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this il vehicle customs border guard.
	 *
	 * @param syncDate the sync date of this il vehicle customs border guard
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
	public int compareTo(
		ILVehicleCustomsBorderGuard ilVehicleCustomsBorderGuard);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ILVehicleCustomsBorderGuard> toCacheModel();

	@Override
	public ILVehicleCustomsBorderGuard toEscapedModel();

	@Override
	public ILVehicleCustomsBorderGuard toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}