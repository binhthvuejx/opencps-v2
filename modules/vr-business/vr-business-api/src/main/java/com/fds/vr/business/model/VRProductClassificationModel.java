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
 * The base model interface for the VRProductClassification service. Represents a row in the &quot;vr_productclassification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRProductClassificationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRProductClassificationImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRProductClassification
 * @see com.fds.vr.business.model.impl.VRProductClassificationImpl
 * @see com.fds.vr.business.model.impl.VRProductClassificationModelImpl
 * @generated
 */
@ProviderType
public interface VRProductClassificationModel extends BaseModel<VRProductClassification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr product classification model instance should use the {@link VRProductClassification} interface instead.
	 */

	/**
	 * Returns the primary key of this vr product classification.
	 *
	 * @return the primary key of this vr product classification
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr product classification.
	 *
	 * @param primaryKey the primary key of this vr product classification
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr product classification.
	 *
	 * @return the ID of this vr product classification
	 */
	public long getId();

	/**
	 * Sets the ID of this vr product classification.
	 *
	 * @param id the ID of this vr product classification
	 */
	public void setId(long id);

	/**
	 * Returns the product plant ID of this vr product classification.
	 *
	 * @return the product plant ID of this vr product classification
	 */
	public long getProductPlantID();

	/**
	 * Sets the product plant ID of this vr product classification.
	 *
	 * @param productPlantID the product plant ID of this vr product classification
	 */
	public void setProductPlantID(long productPlantID);

	/**
	 * Returns the sequence no of this vr product classification.
	 *
	 * @return the sequence no of this vr product classification
	 */
	public long getSequenceNo();

	/**
	 * Sets the sequence no of this vr product classification.
	 *
	 * @param sequenceNo the sequence no of this vr product classification
	 */
	public void setSequenceNo(long sequenceNo);

	/**
	 * Returns the product classification code of this vr product classification.
	 *
	 * @return the product classification code of this vr product classification
	 */
	@AutoEscape
	public String getProductClassificationCode();

	/**
	 * Sets the product classification code of this vr product classification.
	 *
	 * @param productClassificationCode the product classification code of this vr product classification
	 */
	public void setProductClassificationCode(String productClassificationCode);

	/**
	 * Returns the product classification description of this vr product classification.
	 *
	 * @return the product classification description of this vr product classification
	 */
	@AutoEscape
	public String getProductClassificationDescription();

	/**
	 * Sets the product classification description of this vr product classification.
	 *
	 * @param productClassificationDescription the product classification description of this vr product classification
	 */
	public void setProductClassificationDescription(
		String productClassificationDescription);

	/**
	 * Returns the modify date of this vr product classification.
	 *
	 * @return the modify date of this vr product classification
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vr product classification.
	 *
	 * @param modifyDate the modify date of this vr product classification
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vr product classification.
	 *
	 * @return the sync date of this vr product classification
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vr product classification.
	 *
	 * @param syncDate the sync date of this vr product classification
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
	public int compareTo(VRProductClassification vrProductClassification);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRProductClassification> toCacheModel();

	@Override
	public VRProductClassification toEscapedModel();

	@Override
	public VRProductClassification toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}