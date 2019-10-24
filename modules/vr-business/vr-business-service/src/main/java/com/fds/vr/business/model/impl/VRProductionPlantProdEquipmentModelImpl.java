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

package com.fds.vr.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRProductionPlantProdEquipment;
import com.fds.vr.business.model.VRProductionPlantProdEquipmentModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VRProductionPlantProdEquipment service. Represents a row in the &quot;vr_productionplantprodequipment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VRProductionPlantProdEquipmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VRProductionPlantProdEquipmentImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantProdEquipmentImpl
 * @see VRProductionPlantProdEquipment
 * @see VRProductionPlantProdEquipmentModel
 * @generated
 */
@ProviderType
public class VRProductionPlantProdEquipmentModelImpl extends BaseModelImpl<VRProductionPlantProdEquipment>
	implements VRProductionPlantProdEquipmentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vr production plant prod equipment model instance should use the {@link VRProductionPlantProdEquipment} interface instead.
	 */
	public static final String TABLE_NAME = "vr_productionplantprodequipment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "mtCore", Types.BIGINT },
			{ "sequenceNo", Types.BIGINT },
			{ "equipmentCode", Types.VARCHAR },
			{ "equipmentName", Types.VARCHAR },
			{ "equipmentType", Types.VARCHAR },
			{ "trademark", Types.VARCHAR },
			{ "trademarkName", Types.VARCHAR },
			{ "commercialName", Types.VARCHAR },
			{ "modelCode", Types.VARCHAR },
			{ "productionCountryCode", Types.VARCHAR },
			{ "equipmentStatus", Types.VARCHAR },
			{ "notes", Types.VARCHAR },
			{ "modifyDate", Types.TIMESTAMP },
			{ "syncDate", Types.TIMESTAMP },
			{ "productionPlantCode", Types.VARCHAR },
			{ "productionPlantId", Types.BIGINT },
			{ "quantity", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("mtCore", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("sequenceNo", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("equipmentCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("equipmentName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("equipmentType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("trademark", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("trademarkName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("commercialName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("modelCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("productionCountryCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("equipmentStatus", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("notes", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("modifyDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("syncDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("productionPlantCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("productionPlantId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("quantity", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table vr_productionplantprodequipment (id LONG not null primary key,mtCore LONG,sequenceNo LONG,equipmentCode VARCHAR(75) null,equipmentName VARCHAR(75) null,equipmentType VARCHAR(75) null,trademark VARCHAR(75) null,trademarkName VARCHAR(75) null,commercialName VARCHAR(75) null,modelCode VARCHAR(75) null,productionCountryCode VARCHAR(75) null,equipmentStatus VARCHAR(75) null,notes VARCHAR(75) null,modifyDate DATE null,syncDate DATE null,productionPlantCode VARCHAR(75) null,productionPlantId LONG,quantity LONG)";
	public static final String TABLE_SQL_DROP = "drop table vr_productionplantprodequipment";
	public static final String ORDER_BY_JPQL = " ORDER BY vrProductionPlantProdEquipment.modifyDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_productionplantprodequipment.modifyDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.fds.vr.business.model.VRProductionPlantProdEquipment"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.fds.vr.business.model.VRProductionPlantProdEquipment"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.fds.vr.service.util.ServiceProps.get(
				"lock.expiration.time.com.fds.vr.business.model.VRProductionPlantProdEquipment"));

	public VRProductionPlantProdEquipmentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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
		attributes.put("mtCore", getMtCore());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("equipmentCode", getEquipmentCode());
		attributes.put("equipmentName", getEquipmentName());
		attributes.put("equipmentType", getEquipmentType());
		attributes.put("trademark", getTrademark());
		attributes.put("trademarkName", getTrademarkName());
		attributes.put("commercialName", getCommercialName());
		attributes.put("modelCode", getModelCode());
		attributes.put("productionCountryCode", getProductionCountryCode());
		attributes.put("equipmentStatus", getEquipmentStatus());
		attributes.put("notes", getNotes());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());
		attributes.put("productionPlantCode", getProductionPlantCode());
		attributes.put("productionPlantId", getProductionPlantId());
		attributes.put("quantity", getQuantity());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
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

		String productionPlantCode = (String)attributes.get(
				"productionPlantCode");

		if (productionPlantCode != null) {
			setProductionPlantCode(productionPlantCode);
		}

		Long productionPlantId = (Long)attributes.get("productionPlantId");

		if (productionPlantId != null) {
			setProductionPlantId(productionPlantId);
		}

		Long quantity = (Long)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public long getMtCore() {
		return _mtCore;
	}

	@Override
	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	@Override
	public long getSequenceNo() {
		return _sequenceNo;
	}

	@Override
	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	@Override
	public String getEquipmentCode() {
		if (_equipmentCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _equipmentCode;
		}
	}

	@Override
	public void setEquipmentCode(String equipmentCode) {
		_equipmentCode = equipmentCode;
	}

	@Override
	public String getEquipmentName() {
		if (_equipmentName == null) {
			return StringPool.BLANK;
		}
		else {
			return _equipmentName;
		}
	}

	@Override
	public void setEquipmentName(String equipmentName) {
		_equipmentName = equipmentName;
	}

	@Override
	public String getEquipmentType() {
		if (_equipmentType == null) {
			return StringPool.BLANK;
		}
		else {
			return _equipmentType;
		}
	}

	@Override
	public void setEquipmentType(String equipmentType) {
		_equipmentType = equipmentType;
	}

	@Override
	public String getTrademark() {
		if (_trademark == null) {
			return StringPool.BLANK;
		}
		else {
			return _trademark;
		}
	}

	@Override
	public void setTrademark(String trademark) {
		_trademark = trademark;
	}

	@Override
	public String getTrademarkName() {
		if (_trademarkName == null) {
			return StringPool.BLANK;
		}
		else {
			return _trademarkName;
		}
	}

	@Override
	public void setTrademarkName(String trademarkName) {
		_trademarkName = trademarkName;
	}

	@Override
	public String getCommercialName() {
		if (_commercialName == null) {
			return StringPool.BLANK;
		}
		else {
			return _commercialName;
		}
	}

	@Override
	public void setCommercialName(String commercialName) {
		_commercialName = commercialName;
	}

	@Override
	public String getModelCode() {
		if (_modelCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _modelCode;
		}
	}

	@Override
	public void setModelCode(String modelCode) {
		_modelCode = modelCode;
	}

	@Override
	public String getProductionCountryCode() {
		if (_productionCountryCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _productionCountryCode;
		}
	}

	@Override
	public void setProductionCountryCode(String productionCountryCode) {
		_productionCountryCode = productionCountryCode;
	}

	@Override
	public String getEquipmentStatus() {
		if (_equipmentStatus == null) {
			return StringPool.BLANK;
		}
		else {
			return _equipmentStatus;
		}
	}

	@Override
	public void setEquipmentStatus(String equipmentStatus) {
		_equipmentStatus = equipmentStatus;
	}

	@Override
	public String getNotes() {
		if (_notes == null) {
			return StringPool.BLANK;
		}
		else {
			return _notes;
		}
	}

	@Override
	public void setNotes(String notes) {
		_notes = notes;
	}

	@Override
	public Date getModifyDate() {
		return _modifyDate;
	}

	@Override
	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	@Override
	public Date getSyncDate() {
		return _syncDate;
	}

	@Override
	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	@Override
	public String getProductionPlantCode() {
		if (_productionPlantCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _productionPlantCode;
		}
	}

	@Override
	public void setProductionPlantCode(String productionPlantCode) {
		_columnBitmask |= PRODUCTIONPLANTCODE_COLUMN_BITMASK;

		if (_originalProductionPlantCode == null) {
			_originalProductionPlantCode = _productionPlantCode;
		}

		_productionPlantCode = productionPlantCode;
	}

	public String getOriginalProductionPlantCode() {
		return GetterUtil.getString(_originalProductionPlantCode);
	}

	@Override
	public long getProductionPlantId() {
		return _productionPlantId;
	}

	@Override
	public void setProductionPlantId(long productionPlantId) {
		_productionPlantId = productionPlantId;
	}

	@Override
	public long getQuantity() {
		return _quantity;
	}

	@Override
	public void setQuantity(long quantity) {
		_quantity = quantity;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			VRProductionPlantProdEquipment.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VRProductionPlantProdEquipment toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VRProductionPlantProdEquipment)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VRProductionPlantProdEquipmentImpl vrProductionPlantProdEquipmentImpl = new VRProductionPlantProdEquipmentImpl();

		vrProductionPlantProdEquipmentImpl.setId(getId());
		vrProductionPlantProdEquipmentImpl.setMtCore(getMtCore());
		vrProductionPlantProdEquipmentImpl.setSequenceNo(getSequenceNo());
		vrProductionPlantProdEquipmentImpl.setEquipmentCode(getEquipmentCode());
		vrProductionPlantProdEquipmentImpl.setEquipmentName(getEquipmentName());
		vrProductionPlantProdEquipmentImpl.setEquipmentType(getEquipmentType());
		vrProductionPlantProdEquipmentImpl.setTrademark(getTrademark());
		vrProductionPlantProdEquipmentImpl.setTrademarkName(getTrademarkName());
		vrProductionPlantProdEquipmentImpl.setCommercialName(getCommercialName());
		vrProductionPlantProdEquipmentImpl.setModelCode(getModelCode());
		vrProductionPlantProdEquipmentImpl.setProductionCountryCode(getProductionCountryCode());
		vrProductionPlantProdEquipmentImpl.setEquipmentStatus(getEquipmentStatus());
		vrProductionPlantProdEquipmentImpl.setNotes(getNotes());
		vrProductionPlantProdEquipmentImpl.setModifyDate(getModifyDate());
		vrProductionPlantProdEquipmentImpl.setSyncDate(getSyncDate());
		vrProductionPlantProdEquipmentImpl.setProductionPlantCode(getProductionPlantCode());
		vrProductionPlantProdEquipmentImpl.setProductionPlantId(getProductionPlantId());
		vrProductionPlantProdEquipmentImpl.setQuantity(getQuantity());

		vrProductionPlantProdEquipmentImpl.resetOriginalValues();

		return vrProductionPlantProdEquipmentImpl;
	}

	@Override
	public int compareTo(
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment) {
		int value = 0;

		value = DateUtil.compareTo(getModifyDate(),
				vrProductionPlantProdEquipment.getModifyDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRProductionPlantProdEquipment)) {
			return false;
		}

		VRProductionPlantProdEquipment vrProductionPlantProdEquipment = (VRProductionPlantProdEquipment)obj;

		long primaryKey = vrProductionPlantProdEquipment.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
<<<<<<<
		VRProductionPlantProdEquipmentModelImpl vrProductionPlantProdEquipmentModelImpl =
			this;

		vrProductionPlantProdEquipmentModelImpl._originalMtCore = vrProductionPlantProdEquipmentModelImpl._mtCore;

		vrProductionPlantProdEquipmentModelImpl._setOriginalMtCore = false;

		vrProductionPlantProdEquipmentModelImpl._originalProductPlantID = vrProductionPlantProdEquipmentModelImpl._productPlantID;

		vrProductionPlantProdEquipmentModelImpl._setOriginalProductPlantID = false;

		vrProductionPlantProdEquipmentModelImpl._originalProductionPlantCode = vrProductionPlantProdEquipmentModelImpl._productionPlantCode;

		vrProductionPlantProdEquipmentModelImpl._columnBitmask = 0;
=======

>>>>>>>
	}

	@Override
	public CacheModel<VRProductionPlantProdEquipment> toCacheModel() {
		VRProductionPlantProdEquipmentCacheModel vrProductionPlantProdEquipmentCacheModel =
			new VRProductionPlantProdEquipmentCacheModel();

		vrProductionPlantProdEquipmentCacheModel.id = getId();

		vrProductionPlantProdEquipmentCacheModel.mtCore = getMtCore();

		vrProductionPlantProdEquipmentCacheModel.sequenceNo = getSequenceNo();

		vrProductionPlantProdEquipmentCacheModel.equipmentCode = getEquipmentCode();

		String equipmentCode = vrProductionPlantProdEquipmentCacheModel.equipmentCode;

		if ((equipmentCode != null) && (equipmentCode.length() == 0)) {
			vrProductionPlantProdEquipmentCacheModel.equipmentCode = null;
		}

		vrProductionPlantProdEquipmentCacheModel.equipmentName = getEquipmentName();

		String equipmentName = vrProductionPlantProdEquipmentCacheModel.equipmentName;

		if ((equipmentName != null) && (equipmentName.length() == 0)) {
			vrProductionPlantProdEquipmentCacheModel.equipmentName = null;
		}

		vrProductionPlantProdEquipmentCacheModel.equipmentType = getEquipmentType();

		String equipmentType = vrProductionPlantProdEquipmentCacheModel.equipmentType;

		if ((equipmentType != null) && (equipmentType.length() == 0)) {
			vrProductionPlantProdEquipmentCacheModel.equipmentType = null;
		}

		vrProductionPlantProdEquipmentCacheModel.trademark = getTrademark();

		String trademark = vrProductionPlantProdEquipmentCacheModel.trademark;

		if ((trademark != null) && (trademark.length() == 0)) {
			vrProductionPlantProdEquipmentCacheModel.trademark = null;
		}

		vrProductionPlantProdEquipmentCacheModel.trademarkName = getTrademarkName();

		String trademarkName = vrProductionPlantProdEquipmentCacheModel.trademarkName;

		if ((trademarkName != null) && (trademarkName.length() == 0)) {
			vrProductionPlantProdEquipmentCacheModel.trademarkName = null;
		}

		vrProductionPlantProdEquipmentCacheModel.commercialName = getCommercialName();

		String commercialName = vrProductionPlantProdEquipmentCacheModel.commercialName;

		if ((commercialName != null) && (commercialName.length() == 0)) {
			vrProductionPlantProdEquipmentCacheModel.commercialName = null;
		}

		vrProductionPlantProdEquipmentCacheModel.modelCode = getModelCode();

		String modelCode = vrProductionPlantProdEquipmentCacheModel.modelCode;

		if ((modelCode != null) && (modelCode.length() == 0)) {
			vrProductionPlantProdEquipmentCacheModel.modelCode = null;
		}

		vrProductionPlantProdEquipmentCacheModel.productionCountryCode = getProductionCountryCode();

		String productionCountryCode = vrProductionPlantProdEquipmentCacheModel.productionCountryCode;

		if ((productionCountryCode != null) &&
				(productionCountryCode.length() == 0)) {
			vrProductionPlantProdEquipmentCacheModel.productionCountryCode = null;
		}

		vrProductionPlantProdEquipmentCacheModel.equipmentStatus = getEquipmentStatus();

		String equipmentStatus = vrProductionPlantProdEquipmentCacheModel.equipmentStatus;

		if ((equipmentStatus != null) && (equipmentStatus.length() == 0)) {
			vrProductionPlantProdEquipmentCacheModel.equipmentStatus = null;
		}

		vrProductionPlantProdEquipmentCacheModel.notes = getNotes();

		String notes = vrProductionPlantProdEquipmentCacheModel.notes;

		if ((notes != null) && (notes.length() == 0)) {
			vrProductionPlantProdEquipmentCacheModel.notes = null;
		}

		Date modifyDate = getModifyDate();

		if (modifyDate != null) {
			vrProductionPlantProdEquipmentCacheModel.modifyDate = modifyDate.getTime();
		}
		else {
			vrProductionPlantProdEquipmentCacheModel.modifyDate = Long.MIN_VALUE;
		}

		Date syncDate = getSyncDate();

		if (syncDate != null) {
			vrProductionPlantProdEquipmentCacheModel.syncDate = syncDate.getTime();
		}
		else {
			vrProductionPlantProdEquipmentCacheModel.syncDate = Long.MIN_VALUE;
		}

		vrProductionPlantProdEquipmentCacheModel.productionPlantCode = getProductionPlantCode();

		String productionPlantCode = vrProductionPlantProdEquipmentCacheModel.productionPlantCode;

		if ((productionPlantCode != null) &&
				(productionPlantCode.length() == 0)) {
			vrProductionPlantProdEquipmentCacheModel.productionPlantCode = null;
		}

		vrProductionPlantProdEquipmentCacheModel.productionPlantId = getProductionPlantId();

		vrProductionPlantProdEquipmentCacheModel.quantity = getQuantity();

		return vrProductionPlantProdEquipmentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", mtCore=");
		sb.append(getMtCore());
		sb.append(", sequenceNo=");
		sb.append(getSequenceNo());
		sb.append(", equipmentCode=");
		sb.append(getEquipmentCode());
		sb.append(", equipmentName=");
		sb.append(getEquipmentName());
		sb.append(", equipmentType=");
		sb.append(getEquipmentType());
		sb.append(", trademark=");
		sb.append(getTrademark());
		sb.append(", trademarkName=");
		sb.append(getTrademarkName());
		sb.append(", commercialName=");
		sb.append(getCommercialName());
		sb.append(", modelCode=");
		sb.append(getModelCode());
		sb.append(", productionCountryCode=");
		sb.append(getProductionCountryCode());
		sb.append(", equipmentStatus=");
		sb.append(getEquipmentStatus());
		sb.append(", notes=");
		sb.append(getNotes());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append(", syncDate=");
		sb.append(getSyncDate());
		sb.append(", productionPlantCode=");
		sb.append(getProductionPlantCode());
		sb.append(", productionPlantId=");
		sb.append(getProductionPlantId());
		sb.append(", quantity=");
		sb.append(getQuantity());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("com.fds.vr.business.model.VRProductionPlantProdEquipment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mtCore</column-name><column-value><![CDATA[");
		sb.append(getMtCore());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNo</column-name><column-value><![CDATA[");
		sb.append(getSequenceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equipmentCode</column-name><column-value><![CDATA[");
		sb.append(getEquipmentCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equipmentName</column-name><column-value><![CDATA[");
		sb.append(getEquipmentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equipmentType</column-name><column-value><![CDATA[");
		sb.append(getEquipmentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trademark</column-name><column-value><![CDATA[");
		sb.append(getTrademark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trademarkName</column-name><column-value><![CDATA[");
		sb.append(getTrademarkName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commercialName</column-name><column-value><![CDATA[");
		sb.append(getCommercialName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modelCode</column-name><column-value><![CDATA[");
		sb.append(getModelCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productionCountryCode</column-name><column-value><![CDATA[");
		sb.append(getProductionCountryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equipmentStatus</column-name><column-value><![CDATA[");
		sb.append(getEquipmentStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>notes</column-name><column-value><![CDATA[");
		sb.append(getNotes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncDate</column-name><column-value><![CDATA[");
		sb.append(getSyncDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productionPlantCode</column-name><column-value><![CDATA[");
		sb.append(getProductionPlantCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productionPlantId</column-name><column-value><![CDATA[");
		sb.append(getProductionPlantId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantity</column-name><column-value><![CDATA[");
		sb.append(getQuantity());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VRProductionPlantProdEquipment.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VRProductionPlantProdEquipment.class
		};
	private long _id;
	private long _mtCore;
	private long _sequenceNo;
	private String _equipmentCode;
	private String _equipmentName;
	private String _equipmentType;
	private String _trademark;
	private String _trademarkName;
	private String _commercialName;
	private String _modelCode;
	private String _productionCountryCode;
	private String _equipmentStatus;
	private String _notes;
	private Date _modifyDate;
	private Date _syncDate;
	private String _productionPlantCode;
	private String _originalProductionPlantCode;
	private long _productionPlantId;
	private long _quantity;
	private VRProductionPlantProdEquipment _escapedModel;
}