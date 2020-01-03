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
 * This class is a wrapper for {@link VRProductionPlantProdEquipment}.
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantProdEquipment
 * @generated
 */
@ProviderType
public class VRProductionPlantProdEquipmentWrapper
	implements VRProductionPlantProdEquipment,
		ModelWrapper<VRProductionPlantProdEquipment> {
	public VRProductionPlantProdEquipmentWrapper(
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment) {
		_vrProductionPlantProdEquipment = vrProductionPlantProdEquipment;
	}

	@Override
	public Class<?> getModelClass() {
		return VRProductionPlantProdEquipment.class;
	}

	@Override
	public String getModelClassName() {
		return VRProductionPlantProdEquipment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("productPlantID", getProductPlantID());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("equipmentCode", getEquipmentCode());
		attributes.put("equipmentName", getEquipmentName());
		attributes.put("equipmentType", getEquipmentType());
		attributes.put("trademark", getTrademark());
		attributes.put("trademarkName", getTrademarkName());
		attributes.put("commercialName", getCommercialName());
		attributes.put("modelCode", getModelCode());
		attributes.put("designSymbolNo", getDesignSymbolNo());
		attributes.put("productionCountryCode", getProductionCountryCode());
		attributes.put("equipmentStatus", getEquipmentStatus());
		attributes.put("notes", getNotes());
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

		Long productPlantID = (Long)attributes.get("productPlantID");

		if (productPlantID != null) {
			setProductPlantID(productPlantID);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String equipmentCode = (String)attributes.get("equipmentCode");

		if (equipmentCode != null) {
			setEquipmentCode(equipmentCode);
		}

		String equipmentName = (String)attributes.get("equipmentName");

		if (equipmentName != null) {
			setEquipmentName(equipmentName);
		}

		String equipmentType = (String)attributes.get("equipmentType");

		if (equipmentType != null) {
			setEquipmentType(equipmentType);
		}

		String trademark = (String)attributes.get("trademark");

		if (trademark != null) {
			setTrademark(trademark);
		}

		String trademarkName = (String)attributes.get("trademarkName");

		if (trademarkName != null) {
			setTrademarkName(trademarkName);
		}

		String commercialName = (String)attributes.get("commercialName");

		if (commercialName != null) {
			setCommercialName(commercialName);
		}

		String modelCode = (String)attributes.get("modelCode");

		if (modelCode != null) {
			setModelCode(modelCode);
		}

		String designSymbolNo = (String)attributes.get("designSymbolNo");

		if (designSymbolNo != null) {
			setDesignSymbolNo(designSymbolNo);
		}

		String productionCountryCode = (String)attributes.get(
				"productionCountryCode");

		if (productionCountryCode != null) {
			setProductionCountryCode(productionCountryCode);
		}

		String equipmentStatus = (String)attributes.get("equipmentStatus");

		if (equipmentStatus != null) {
			setEquipmentStatus(equipmentStatus);
		}

		String notes = (String)attributes.get("notes");

		if (notes != null) {
			setNotes(notes);
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
	public VRProductionPlantProdEquipment toEscapedModel() {
		return new VRProductionPlantProdEquipmentWrapper(_vrProductionPlantProdEquipment.toEscapedModel());
	}

	@Override
	public VRProductionPlantProdEquipment toUnescapedModel() {
		return new VRProductionPlantProdEquipmentWrapper(_vrProductionPlantProdEquipment.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrProductionPlantProdEquipment.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrProductionPlantProdEquipment.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrProductionPlantProdEquipment.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrProductionPlantProdEquipment.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRProductionPlantProdEquipment> toCacheModel() {
		return _vrProductionPlantProdEquipment.toCacheModel();
	}

	@Override
	public int compareTo(
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment) {
		return _vrProductionPlantProdEquipment.compareTo(vrProductionPlantProdEquipment);
	}

	@Override
	public int hashCode() {
		return _vrProductionPlantProdEquipment.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrProductionPlantProdEquipment.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRProductionPlantProdEquipmentWrapper((VRProductionPlantProdEquipment)_vrProductionPlantProdEquipment.clone());
	}

	/**
	* Returns the commercial name of this vr production plant prod equipment.
	*
	* @return the commercial name of this vr production plant prod equipment
	*/
	@Override
	public java.lang.String getCommercialName() {
		return _vrProductionPlantProdEquipment.getCommercialName();
	}

	/**
	* Returns the design symbol no of this vr production plant prod equipment.
	*
	* @return the design symbol no of this vr production plant prod equipment
	*/
	@Override
	public java.lang.String getDesignSymbolNo() {
		return _vrProductionPlantProdEquipment.getDesignSymbolNo();
	}

	/**
	* Returns the equipment code of this vr production plant prod equipment.
	*
	* @return the equipment code of this vr production plant prod equipment
	*/
	@Override
	public java.lang.String getEquipmentCode() {
		return _vrProductionPlantProdEquipment.getEquipmentCode();
	}

	/**
	* Returns the equipment name of this vr production plant prod equipment.
	*
	* @return the equipment name of this vr production plant prod equipment
	*/
	@Override
	public java.lang.String getEquipmentName() {
		return _vrProductionPlantProdEquipment.getEquipmentName();
	}

	/**
	* Returns the equipment status of this vr production plant prod equipment.
	*
	* @return the equipment status of this vr production plant prod equipment
	*/
	@Override
	public java.lang.String getEquipmentStatus() {
		return _vrProductionPlantProdEquipment.getEquipmentStatus();
	}

	/**
	* Returns the equipment type of this vr production plant prod equipment.
	*
	* @return the equipment type of this vr production plant prod equipment
	*/
	@Override
	public java.lang.String getEquipmentType() {
		return _vrProductionPlantProdEquipment.getEquipmentType();
	}

	/**
	* Returns the model code of this vr production plant prod equipment.
	*
	* @return the model code of this vr production plant prod equipment
	*/
	@Override
	public java.lang.String getModelCode() {
		return _vrProductionPlantProdEquipment.getModelCode();
	}

	/**
	* Returns the notes of this vr production plant prod equipment.
	*
	* @return the notes of this vr production plant prod equipment
	*/
	@Override
	public java.lang.String getNotes() {
		return _vrProductionPlantProdEquipment.getNotes();
	}

	/**
	* Returns the production country code of this vr production plant prod equipment.
	*
	* @return the production country code of this vr production plant prod equipment
	*/
	@Override
	public java.lang.String getProductionCountryCode() {
		return _vrProductionPlantProdEquipment.getProductionCountryCode();
	}

	/**
	* Returns the trademark of this vr production plant prod equipment.
	*
	* @return the trademark of this vr production plant prod equipment
	*/
	@Override
	public java.lang.String getTrademark() {
		return _vrProductionPlantProdEquipment.getTrademark();
	}

	/**
	* Returns the trademark name of this vr production plant prod equipment.
	*
	* @return the trademark name of this vr production plant prod equipment
	*/
	@Override
	public java.lang.String getTrademarkName() {
		return _vrProductionPlantProdEquipment.getTrademarkName();
	}

	@Override
	public java.lang.String toString() {
		return _vrProductionPlantProdEquipment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrProductionPlantProdEquipment.toXmlString();
	}

	/**
	* Returns the modify date of this vr production plant prod equipment.
	*
	* @return the modify date of this vr production plant prod equipment
	*/
	@Override
	public Date getModifyDate() {
		return _vrProductionPlantProdEquipment.getModifyDate();
	}

	/**
	* Returns the sync date of this vr production plant prod equipment.
	*
	* @return the sync date of this vr production plant prod equipment
	*/
	@Override
	public Date getSyncDate() {
		return _vrProductionPlantProdEquipment.getSyncDate();
	}

	/**
	* Returns the ID of this vr production plant prod equipment.
	*
	* @return the ID of this vr production plant prod equipment
	*/
	@Override
	public long getId() {
		return _vrProductionPlantProdEquipment.getId();
	}

	/**
	* Returns the primary key of this vr production plant prod equipment.
	*
	* @return the primary key of this vr production plant prod equipment
	*/
	@Override
	public long getPrimaryKey() {
		return _vrProductionPlantProdEquipment.getPrimaryKey();
	}

	/**
	* Returns the product plant ID of this vr production plant prod equipment.
	*
	* @return the product plant ID of this vr production plant prod equipment
	*/
	@Override
	public long getProductPlantID() {
		return _vrProductionPlantProdEquipment.getProductPlantID();
	}

	/**
	* Returns the sequence no of this vr production plant prod equipment.
	*
	* @return the sequence no of this vr production plant prod equipment
	*/
	@Override
	public long getSequenceNo() {
		return _vrProductionPlantProdEquipment.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrProductionPlantProdEquipment.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrProductionPlantProdEquipment.setCachedModel(cachedModel);
	}

	/**
	* Sets the commercial name of this vr production plant prod equipment.
	*
	* @param commercialName the commercial name of this vr production plant prod equipment
	*/
	@Override
	public void setCommercialName(java.lang.String commercialName) {
		_vrProductionPlantProdEquipment.setCommercialName(commercialName);
	}

	/**
	* Sets the design symbol no of this vr production plant prod equipment.
	*
	* @param designSymbolNo the design symbol no of this vr production plant prod equipment
	*/
	@Override
	public void setDesignSymbolNo(java.lang.String designSymbolNo) {
		_vrProductionPlantProdEquipment.setDesignSymbolNo(designSymbolNo);
	}

	/**
	* Sets the equipment code of this vr production plant prod equipment.
	*
	* @param equipmentCode the equipment code of this vr production plant prod equipment
	*/
	@Override
	public void setEquipmentCode(java.lang.String equipmentCode) {
		_vrProductionPlantProdEquipment.setEquipmentCode(equipmentCode);
	}

	/**
	* Sets the equipment name of this vr production plant prod equipment.
	*
	* @param equipmentName the equipment name of this vr production plant prod equipment
	*/
	@Override
	public void setEquipmentName(java.lang.String equipmentName) {
		_vrProductionPlantProdEquipment.setEquipmentName(equipmentName);
	}

	/**
	* Sets the equipment status of this vr production plant prod equipment.
	*
	* @param equipmentStatus the equipment status of this vr production plant prod equipment
	*/
	@Override
	public void setEquipmentStatus(java.lang.String equipmentStatus) {
		_vrProductionPlantProdEquipment.setEquipmentStatus(equipmentStatus);
	}

	/**
	* Sets the equipment type of this vr production plant prod equipment.
	*
	* @param equipmentType the equipment type of this vr production plant prod equipment
	*/
	@Override
	public void setEquipmentType(java.lang.String equipmentType) {
		_vrProductionPlantProdEquipment.setEquipmentType(equipmentType);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrProductionPlantProdEquipment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrProductionPlantProdEquipment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrProductionPlantProdEquipment.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vr production plant prod equipment.
	*
	* @param id the ID of this vr production plant prod equipment
	*/
	@Override
	public void setId(long id) {
		_vrProductionPlantProdEquipment.setId(id);
	}

	/**
	* Sets the model code of this vr production plant prod equipment.
	*
	* @param modelCode the model code of this vr production plant prod equipment
	*/
	@Override
	public void setModelCode(java.lang.String modelCode) {
		_vrProductionPlantProdEquipment.setModelCode(modelCode);
	}

	/**
	* Sets the modify date of this vr production plant prod equipment.
	*
	* @param modifyDate the modify date of this vr production plant prod equipment
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrProductionPlantProdEquipment.setModifyDate(modifyDate);
	}

	@Override
	public void setNew(boolean n) {
		_vrProductionPlantProdEquipment.setNew(n);
	}

	/**
	* Sets the notes of this vr production plant prod equipment.
	*
	* @param notes the notes of this vr production plant prod equipment
	*/
	@Override
	public void setNotes(java.lang.String notes) {
		_vrProductionPlantProdEquipment.setNotes(notes);
	}

	/**
	* Sets the primary key of this vr production plant prod equipment.
	*
	* @param primaryKey the primary key of this vr production plant prod equipment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrProductionPlantProdEquipment.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrProductionPlantProdEquipment.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product plant ID of this vr production plant prod equipment.
	*
	* @param productPlantID the product plant ID of this vr production plant prod equipment
	*/
	@Override
	public void setProductPlantID(long productPlantID) {
		_vrProductionPlantProdEquipment.setProductPlantID(productPlantID);
	}

	/**
	* Sets the production country code of this vr production plant prod equipment.
	*
	* @param productionCountryCode the production country code of this vr production plant prod equipment
	*/
	@Override
	public void setProductionCountryCode(java.lang.String productionCountryCode) {
		_vrProductionPlantProdEquipment.setProductionCountryCode(productionCountryCode);
	}

	/**
	* Sets the sequence no of this vr production plant prod equipment.
	*
	* @param sequenceNo the sequence no of this vr production plant prod equipment
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrProductionPlantProdEquipment.setSequenceNo(sequenceNo);
	}

	/**
	* Sets the sync date of this vr production plant prod equipment.
	*
	* @param syncDate the sync date of this vr production plant prod equipment
	*/
	@Override
	public void setSyncDate(Date syncDate) {
		_vrProductionPlantProdEquipment.setSyncDate(syncDate);
	}

	/**
	* Sets the trademark of this vr production plant prod equipment.
	*
	* @param trademark the trademark of this vr production plant prod equipment
	*/
	@Override
	public void setTrademark(java.lang.String trademark) {
		_vrProductionPlantProdEquipment.setTrademark(trademark);
	}

	/**
	* Sets the trademark name of this vr production plant prod equipment.
	*
	* @param trademarkName the trademark name of this vr production plant prod equipment
	*/
	@Override
	public void setTrademarkName(java.lang.String trademarkName) {
		_vrProductionPlantProdEquipment.setTrademarkName(trademarkName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductionPlantProdEquipmentWrapper)) {
			return false;
		}

		VRProductionPlantProdEquipmentWrapper vrProductionPlantProdEquipmentWrapper =
			(VRProductionPlantProdEquipmentWrapper)obj;

		if (Objects.equals(_vrProductionPlantProdEquipment,
					vrProductionPlantProdEquipmentWrapper._vrProductionPlantProdEquipment)) {
			return true;
		}

		return false;
	}

	@Override
	public VRProductionPlantProdEquipment getWrappedModel() {
		return _vrProductionPlantProdEquipment;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrProductionPlantProdEquipment.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrProductionPlantProdEquipment.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrProductionPlantProdEquipment.resetOriginalValues();
	}

	private final VRProductionPlantProdEquipment _vrProductionPlantProdEquipment;
}