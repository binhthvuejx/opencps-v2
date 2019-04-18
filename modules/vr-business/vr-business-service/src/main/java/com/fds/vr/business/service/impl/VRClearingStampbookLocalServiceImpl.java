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

package com.fds.vr.business.service.impl;

import aQute.bnd.annotation.ProviderType;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.fds.vr.business.model.VRClearingStampbook;
import com.fds.vr.business.service.base.VRClearingStampbookLocalServiceBaseImpl;
import com.fds.vr.business.service.base.VROutputSheetDetailsLocalServiceBaseImpl;

/**
 * The implementation of the vr clearing stampbook local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRClearingStampbookLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRClearingStampbookLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRClearingStampbookLocalServiceUtil
 */
@ProviderType
public class VRClearingStampbookLocalServiceImpl
	extends VRClearingStampbookLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRClearingStampbookLocalServiceUtil} to access the vr clearing stampbook local service.
	 */
	
	public List<VRClearingStampbook> findByInputSheetId(long mtCore, long inputSheetId) throws PortalException, SystemException {
		try {
			return vrClearingStampbookPersistence.findByInputSheetId(mtCore, inputSheetId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRClearingStampbook>();
		
	}


	public List<VRClearingStampbook> findByInputSheetIdAndBookId(long mtCore, long inputSheetId, long bookId) throws PortalException, SystemException {
		try {
			return vrClearingStampbookPersistence.findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRClearingStampbook>();
		
	}
	
	public List<VRClearingStampbook> findByOutputSheetId(long mtCore, long outputSheetId) throws PortalException, SystemException {
		try {
			return vrClearingStampbookPersistence.findByOutputSheetId(mtCore, outputSheetId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRClearingStampbook>();
		
	}
	
	public List<VRClearingStampbook> findByOutputSheetIdAndBookId(long mtCore, long outputSheetId, long bookId) throws PortalException, SystemException {
		try {
			return vrClearingStampbookPersistence.findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRClearingStampbook>();
		
	}
	
	public List<VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(long mtCore, long inputSheetId, long bookId, String stampType) throws PortalException, SystemException {
		try {
			return vrClearingStampbookPersistence.findByInputSheetIdAndBookIdAndStampType(mtCore, inputSheetId, bookId, stampType);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRClearingStampbook>();
		
	}
	
	public List<VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(long mtCore, long outputSheetId, long bookId, String stampType) throws PortalException, SystemException {
		try {
			return vrClearingStampbookPersistence.findByOutputSheetIdAndBookIdAndStampType(mtCore, outputSheetId, bookId, stampType);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRClearingStampbook>();
		
	}
	
	public List<VRClearingStampbook> findBycertificateId(long mtCore, long certificateId) throws PortalException, SystemException {
		try {
			return vrClearingStampbookPersistence.findBycertificateId(mtCore, certificateId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRClearingStampbook>();
		
	}
	
	public List<VRClearingStampbook> findBycertificateNumber(long mtCore, String certificateNumber) throws PortalException, SystemException {
		try {
			return vrClearingStampbookPersistence.findBycertificateNumber(mtCore, certificateNumber);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRClearingStampbook>();
		
	}
	
	public List<VRClearingStampbook> findBydebitNoteId(long mtCore, long debitNoteId) throws PortalException, SystemException {
		try {
			return vrClearingStampbookPersistence.findBydebitNoteId(mtCore, debitNoteId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRClearingStampbook>();
		
	}
	private Log _log = LogFactoryUtil.getLog(VRClearingStampbookLocalServiceImpl.class);

}