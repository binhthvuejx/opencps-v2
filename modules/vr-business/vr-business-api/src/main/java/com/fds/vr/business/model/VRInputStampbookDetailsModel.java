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
 * The base model interface for the VRInputStampbookDetails service. Represents a row in the &quot;vr_inputstampbookdetails&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRInputStampbookDetailsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRInputStampbookDetailsImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRInputStampbookDetails
 * @see com.fds.vr.business.model.impl.VRInputStampbookDetailsImpl
 * @see com.fds.vr.business.model.impl.VRInputStampbookDetailsModelImpl
 * @generated
 */
@ProviderType
public interface VRInputStampbookDetailsModel extends BaseModel<VRInputStampbookDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr input stampbook details model instance should use the {@link VRInputStampbookDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this vr input stampbook details.
	 *
	 * @return the primary key of this vr input stampbook details
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr input stampbook details.
	 *
	 * @param primaryKey the primary key of this vr input stampbook details
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr input stampbook details.
	 *
	 * @return the ID of this vr input stampbook details
	 */
	public long getId();

	/**
	 * Sets the ID of this vr input stampbook details.
	 *
	 * @param id the ID of this vr input stampbook details
	 */
	public void setId(long id);

	/**
	 * Returns the mt core of this vr input stampbook details.
	 *
	 * @return the mt core of this vr input stampbook details
	 */
	public long getMtCore();

	/**
	 * Sets the mt core of this vr input stampbook details.
	 *
	 * @param mtCore the mt core of this vr input stampbook details
	 */
	public void setMtCore(long mtCore);

	/**
	 * Returns the stamp serial no of this vr input stampbook details.
	 *
	 * @return the stamp serial no of this vr input stampbook details
	 */
	@AutoEscape
	public String getStampSerialNo();

	/**
	 * Sets the stamp serial no of this vr input stampbook details.
	 *
	 * @param stampSerialNo the stamp serial no of this vr input stampbook details
	 */
	public void setStampSerialNo(String stampSerialNo);

	/**
	 * Returns the sequence no of this vr input stampbook details.
	 *
	 * @return the sequence no of this vr input stampbook details
	 */
	public long getSequenceNo();

	/**
	 * Sets the sequence no of this vr input stampbook details.
	 *
	 * @param sequenceNo the sequence no of this vr input stampbook details
	 */
	public void setSequenceNo(long sequenceNo);

	/**
	 * Returns the dossier ID of this vr input stampbook details.
	 *
	 * @return the dossier ID of this vr input stampbook details
	 */
	public long getDossierId();

	/**
	 * Sets the dossier ID of this vr input stampbook details.
	 *
	 * @param dossierId the dossier ID of this vr input stampbook details
	 */
	public void setDossierId(long dossierId);

	/**
	 * Returns the certificate ID of this vr input stampbook details.
	 *
	 * @return the certificate ID of this vr input stampbook details
	 */
	public long getCertificateId();

	/**
	 * Sets the certificate ID of this vr input stampbook details.
	 *
	 * @param certificateId the certificate ID of this vr input stampbook details
	 */
	public void setCertificateId(long certificateId);

	/**
	 * Returns the certificate number of this vr input stampbook details.
	 *
	 * @return the certificate number of this vr input stampbook details
	 */
	@AutoEscape
	public String getCertificateNumber();

	/**
	 * Sets the certificate number of this vr input stampbook details.
	 *
	 * @param certificateNumber the certificate number of this vr input stampbook details
	 */
	public void setCertificateNumber(String certificateNumber);

	/**
	 * Returns the certificate date of this vr input stampbook details.
	 *
	 * @return the certificate date of this vr input stampbook details
	 */
	public Date getCertificateDate();

	/**
	 * Sets the certificate date of this vr input stampbook details.
	 *
	 * @param certificateDate the certificate date of this vr input stampbook details
	 */
	public void setCertificateDate(Date certificateDate);

	/**
	 * Returns the vehicle record ID of this vr input stampbook details.
	 *
	 * @return the vehicle record ID of this vr input stampbook details
	 */
	public long getVehicleRecordId();

	/**
	 * Sets the vehicle record ID of this vr input stampbook details.
	 *
	 * @param vehicleRecordId the vehicle record ID of this vr input stampbook details
	 */
	public void setVehicleRecordId(long vehicleRecordId);

	/**
	 * Returns the frame no of this vr input stampbook details.
	 *
	 * @return the frame no of this vr input stampbook details
	 */
	@AutoEscape
	public String getFrameNo();

	/**
	 * Sets the frame no of this vr input stampbook details.
	 *
	 * @param frameNo the frame no of this vr input stampbook details
	 */
	public void setFrameNo(String frameNo);

	/**
	 * Returns the box no of this vr input stampbook details.
	 *
	 * @return the box no of this vr input stampbook details
	 */
	@AutoEscape
	public String getBoxNo();

	/**
	 * Sets the box no of this vr input stampbook details.
	 *
	 * @param BoxNo the box no of this vr input stampbook details
	 */
	public void setBoxNo(String BoxNo);

	/**
	 * Returns the vin no of this vr input stampbook details.
	 *
	 * @return the vin no of this vr input stampbook details
	 */
	@AutoEscape
	public String getVinNo();

	/**
	 * Sets the vin no of this vr input stampbook details.
	 *
	 * @param vinNo the vin no of this vr input stampbook details
	 */
	public void setVinNo(String vinNo);

	/**
	 * Returns the engine no of this vr input stampbook details.
	 *
	 * @return the engine no of this vr input stampbook details
	 */
	@AutoEscape
	public String getEngineNo();

	/**
	 * Sets the engine no of this vr input stampbook details.
	 *
	 * @param engineNo the engine no of this vr input stampbook details
	 */
	public void setEngineNo(String engineNo);

	/**
	 * Returns the qr code of this vr input stampbook details.
	 *
	 * @return the qr code of this vr input stampbook details
	 */
	@AutoEscape
	public String getQrCode();

	/**
	 * Sets the qr code of this vr input stampbook details.
	 *
	 * @param qrCode the qr code of this vr input stampbook details
	 */
	public void setQrCode(String qrCode);

	/**
	 * Returns the copies of this vr input stampbook details.
	 *
	 * @return the copies of this vr input stampbook details
	 */
	public long getCopies();

	/**
	 * Sets the copies of this vr input stampbook details.
	 *
	 * @param copies the copies of this vr input stampbook details
	 */
	public void setCopies(long copies);

	/**
	 * Returns the markup fulfill of this vr input stampbook details.
	 *
	 * @return the markup fulfill of this vr input stampbook details
	 */
	public long getMarkupFulfill();

	/**
	 * Sets the markup fulfill of this vr input stampbook details.
	 *
	 * @param markupFulfill the markup fulfill of this vr input stampbook details
	 */
	public void setMarkupFulfill(long markupFulfill);

	/**
	 * Returns the replaced serial no of this vr input stampbook details.
	 *
	 * @return the replaced serial no of this vr input stampbook details
	 */
	@AutoEscape
	public String getReplacedSerialNo();

	/**
	 * Sets the replaced serial no of this vr input stampbook details.
	 *
	 * @param replacedSerialNo the replaced serial no of this vr input stampbook details
	 */
	public void setReplacedSerialNo(String replacedSerialNo);

	/**
	 * Returns the remark of this vr input stampbook details.
	 *
	 * @return the remark of this vr input stampbook details
	 */
	@AutoEscape
	public String getRemark();

	/**
	 * Sets the remark of this vr input stampbook details.
	 *
	 * @param remark the remark of this vr input stampbook details
	 */
	public void setRemark(String remark);

	/**
	 * Returns the input sheet ID of this vr input stampbook details.
	 *
	 * @return the input sheet ID of this vr input stampbook details
	 */
	public long getInputSheetId();

	/**
	 * Sets the input sheet ID of this vr input stampbook details.
	 *
	 * @param inputSheetId the input sheet ID of this vr input stampbook details
	 */
	public void setInputSheetId(long inputSheetId);

	/**
	 * Returns the book ID of this vr input stampbook details.
	 *
	 * @return the book ID of this vr input stampbook details
	 */
	public long getBookId();

	/**
	 * Sets the book ID of this vr input stampbook details.
	 *
	 * @param bookId the book ID of this vr input stampbook details
	 */
	public void setBookId(long bookId);

	/**
	 * Returns the purchaser ID of this vr input stampbook details.
	 *
	 * @return the purchaser ID of this vr input stampbook details
	 */
	@AutoEscape
	public String getPurchaserId();

	/**
	 * Sets the purchaser ID of this vr input stampbook details.
	 *
	 * @param purchaserId the purchaser ID of this vr input stampbook details
	 */
	public void setPurchaserId(String purchaserId);

	/**
	 * Returns the corporation ID of this vr input stampbook details.
	 *
	 * @return the corporation ID of this vr input stampbook details
	 */
	@AutoEscape
	public String getCorporationId();

	/**
	 * Sets the corporation ID of this vr input stampbook details.
	 *
	 * @param corporationId the corporation ID of this vr input stampbook details
	 */
	public void setCorporationId(String corporationId);

	/**
	 * Returns the issuing status of this vr input stampbook details.
	 *
	 * @return the issuing status of this vr input stampbook details
	 */
	public long getIssuingStatus();

	/**
	 * Sets the issuing status of this vr input stampbook details.
	 *
	 * @param issuingStatus the issuing status of this vr input stampbook details
	 */
	public void setIssuingStatus(long issuingStatus);

	/**
	 * Returns the clearing status of this vr input stampbook details.
	 *
	 * @return the clearing status of this vr input stampbook details
	 */
	public long getClearingStatus();

	/**
	 * Sets the clearing status of this vr input stampbook details.
	 *
	 * @param clearingStatus the clearing status of this vr input stampbook details
	 */
	public void setClearingStatus(long clearingStatus);

	/**
	 * Returns the stamp status of this vr input stampbook details.
	 *
	 * @return the stamp status of this vr input stampbook details
	 */
	public long getStampStatus();

	/**
	 * Sets the stamp status of this vr input stampbook details.
	 *
	 * @param stampStatus the stamp status of this vr input stampbook details
	 */
	public void setStampStatus(long stampStatus);

	/**
	 * Returns the issuing date of this vr input stampbook details.
	 *
	 * @return the issuing date of this vr input stampbook details
	 */
	public Date getIssuingDate();

	/**
	 * Sets the issuing date of this vr input stampbook details.
	 *
	 * @param issuingDate the issuing date of this vr input stampbook details
	 */
	public void setIssuingDate(Date issuingDate);

	/**
	 * Returns the printing date of this vr input stampbook details.
	 *
	 * @return the printing date of this vr input stampbook details
	 */
	public Date getPrintingDate();

	/**
	 * Sets the printing date of this vr input stampbook details.
	 *
	 * @param printingDate the printing date of this vr input stampbook details
	 */
	public void setPrintingDate(Date printingDate);

	/**
	 * Returns the noticeof lost date of this vr input stampbook details.
	 *
	 * @return the noticeof lost date of this vr input stampbook details
	 */
	public Date getNoticeofLostDate();

	/**
	 * Sets the noticeof lost date of this vr input stampbook details.
	 *
	 * @param noticeofLostDate the noticeof lost date of this vr input stampbook details
	 */
	public void setNoticeofLostDate(Date noticeofLostDate);

	/**
	 * Returns the noticeof cancel date of this vr input stampbook details.
	 *
	 * @return the noticeof cancel date of this vr input stampbook details
	 */
	public Date getNoticeofCancelDate();

	/**
	 * Sets the noticeof cancel date of this vr input stampbook details.
	 *
	 * @param noticeofCancelDate the noticeof cancel date of this vr input stampbook details
	 */
	public void setNoticeofCancelDate(Date noticeofCancelDate);

	/**
	 * Returns the noticeof return date of this vr input stampbook details.
	 *
	 * @return the noticeof return date of this vr input stampbook details
	 */
	public Date getNoticeofReturnDate();

	/**
	 * Sets the noticeof return date of this vr input stampbook details.
	 *
	 * @param noticeofReturnDate the noticeof return date of this vr input stampbook details
	 */
	public void setNoticeofReturnDate(Date noticeofReturnDate);

	/**
	 * Returns the clearing date of this vr input stampbook details.
	 *
	 * @return the clearing date of this vr input stampbook details
	 */
	public Date getClearingDate();

	/**
	 * Sets the clearing date of this vr input stampbook details.
	 *
	 * @param clearingDate the clearing date of this vr input stampbook details
	 */
	public void setClearingDate(Date clearingDate);

	/**
	 * Returns the clearing advance payment ID of this vr input stampbook details.
	 *
	 * @return the clearing advance payment ID of this vr input stampbook details
	 */
	public long getClearingAdvancePaymentID();

	/**
	 * Sets the clearing advance payment ID of this vr input stampbook details.
	 *
	 * @param clearingAdvancePaymentID the clearing advance payment ID of this vr input stampbook details
	 */
	public void setClearingAdvancePaymentID(long clearingAdvancePaymentID);

	/**
	 * Returns the modify date of this vr input stampbook details.
	 *
	 * @return the modify date of this vr input stampbook details
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vr input stampbook details.
	 *
	 * @param modifyDate the modify date of this vr input stampbook details
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vr input stampbook details.
	 *
	 * @return the sync date of this vr input stampbook details
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vr input stampbook details.
	 *
	 * @param syncDate the sync date of this vr input stampbook details
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
	public int compareTo(VRInputStampbookDetails vrInputStampbookDetails);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRInputStampbookDetails> toCacheModel();

	@Override
	public VRInputStampbookDetails toEscapedModel();

	@Override
	public VRInputStampbookDetails toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}