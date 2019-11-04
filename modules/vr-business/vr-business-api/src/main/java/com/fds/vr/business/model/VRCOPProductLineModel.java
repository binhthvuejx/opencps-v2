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
 * The base model interface for the VRCOPProductLine service. Represents a row in the &quot;vr_copproductline&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRCOPProductLineModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRCOPProductLineImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRCOPProductLine
 * @see com.fds.vr.business.model.impl.VRCOPProductLineImpl
 * @see com.fds.vr.business.model.impl.VRCOPProductLineModelImpl
 * @generated
 */
@ProviderType
public interface VRCOPProductLineModel extends BaseModel<VRCOPProductLine> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vrcop product line model instance should use the {@link VRCOPProductLine} interface instead.
	 */

	/**
	 * Returns the primary key of this vrcop product line.
	 *
	 * @return the primary key of this vrcop product line
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vrcop product line.
	 *
	 * @param primaryKey the primary key of this vrcop product line
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vrcop product line.
	 *
	 * @return the ID of this vrcop product line
	 */
	public long getId();

	/**
	 * Sets the ID of this vrcop product line.
	 *
	 * @param id the ID of this vrcop product line
	 */
	public void setId(long id);

	/**
	 * Returns the cop report repository ID of this vrcop product line.
	 *
	 * @return the cop report repository ID of this vrcop product line
	 */
	public long getCopReportRepositoryID();

	/**
	 * Sets the cop report repository ID of this vrcop product line.
	 *
	 * @param copReportRepositoryID the cop report repository ID of this vrcop product line
	 */
	public void setCopReportRepositoryID(long copReportRepositoryID);

	/**
	 * Returns the cop report no of this vrcop product line.
	 *
	 * @return the cop report no of this vrcop product line
	 */
	@AutoEscape
	public String getCopReportNo();

	/**
	 * Sets the cop report no of this vrcop product line.
	 *
	 * @param copReportNo the cop report no of this vrcop product line
	 */
	public void setCopReportNo(String copReportNo);

	/**
	 * Returns the cop product type ID of this vrcop product line.
	 *
	 * @return the cop product type ID of this vrcop product line
	 */
	public long getCopProductTypeID();

	/**
	 * Sets the cop product type ID of this vrcop product line.
	 *
	 * @param copProductTypeID the cop product type ID of this vrcop product line
	 */
	public void setCopProductTypeID(long copProductTypeID);

	/**
	 * Returns the sequence no of this vrcop product line.
	 *
	 * @return the sequence no of this vrcop product line
	 */
	public long getSequenceNo();

	/**
	 * Sets the sequence no of this vrcop product line.
	 *
	 * @param sequenceNo the sequence no of this vrcop product line
	 */
	public void setSequenceNo(long sequenceNo);

	/**
	 * Returns the trademark of this vrcop product line.
	 *
	 * @return the trademark of this vrcop product line
	 */
	@AutoEscape
	public String getTrademark();

	/**
	 * Sets the trademark of this vrcop product line.
	 *
	 * @param trademark the trademark of this vrcop product line
	 */
	public void setTrademark(String trademark);

	/**
	 * Returns the trademark name of this vrcop product line.
	 *
	 * @return the trademark name of this vrcop product line
	 */
	@AutoEscape
	public String getTrademarkName();

	/**
	 * Sets the trademark name of this vrcop product line.
	 *
	 * @param trademarkName the trademark name of this vrcop product line
	 */
	public void setTrademarkName(String trademarkName);

	/**
	 * Returns the commercial name of this vrcop product line.
	 *
	 * @return the commercial name of this vrcop product line
	 */
	@AutoEscape
	public String getCommercialName();

	/**
	 * Sets the commercial name of this vrcop product line.
	 *
	 * @param commercialName the commercial name of this vrcop product line
	 */
	public void setCommercialName(String commercialName);

	/**
	 * Returns the model code of this vrcop product line.
	 *
	 * @return the model code of this vrcop product line
	 */
	@AutoEscape
	public String getModelCode();

	/**
	 * Sets the model code of this vrcop product line.
	 *
	 * @param modelCode the model code of this vrcop product line
	 */
	public void setModelCode(String modelCode);

	/**
	 * Returns the design symbol no of this vrcop product line.
	 *
	 * @return the design symbol no of this vrcop product line
	 */
	@AutoEscape
	public String getDesignSymbolNo();

	/**
	 * Sets the design symbol no of this vrcop product line.
	 *
	 * @param designSymbolNo the design symbol no of this vrcop product line
	 */
	public void setDesignSymbolNo(String designSymbolNo);

	/**
	 * Returns the modify date of this vrcop product line.
	 *
	 * @return the modify date of this vrcop product line
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vrcop product line.
	 *
	 * @param modifyDate the modify date of this vrcop product line
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vrcop product line.
	 *
	 * @return the sync date of this vrcop product line
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vrcop product line.
	 *
	 * @param syncDate the sync date of this vrcop product line
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
	public int compareTo(VRCOPProductLine vrcopProductLine);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRCOPProductLine> toCacheModel();

	@Override
	public VRCOPProductLine toEscapedModel();

	@Override
	public VRCOPProductLine toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}