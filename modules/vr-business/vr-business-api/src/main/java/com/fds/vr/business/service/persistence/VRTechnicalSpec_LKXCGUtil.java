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

package com.fds.vr.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRTechnicalSpec_LKXCG;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr technical spec_lkxcg service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRTechnicalSpec_LKXCGPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_LKXCGPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRTechnicalSpec_LKXCGPersistenceImpl
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_LKXCGUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG) {
		getPersistence().clearCache(vrTechnicalSpec_LKXCG);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VRTechnicalSpec_LKXCG> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRTechnicalSpec_LKXCG> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRTechnicalSpec_LKXCG> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRTechnicalSpec_LKXCG update(
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG) {
		return getPersistence().update(vrTechnicalSpec_LKXCG);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRTechnicalSpec_LKXCG update(
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG,
		ServiceContext serviceContext) {
		return getPersistence().update(vrTechnicalSpec_LKXCG, serviceContext);
	}

	/**
	* Returns all the vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @return the matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDossierNo(
		java.lang.String dossierNo, long mtCore) {
		return getPersistence().findByDossierNo(dossierNo, mtCore);
	}

	/**
	* Returns a range of all the vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDossierNo(
		java.lang.String dossierNo, long mtCore, int start, int end) {
		return getPersistence().findByDossierNo(dossierNo, mtCore, start, end);
	}

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDossierNo(
		java.lang.String dossierNo, long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .findByDossierNo(dossierNo, mtCore, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDossierNo(
		java.lang.String dossierNo, long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDossierNo(dossierNo, mtCore, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG findByDossierNo_First(
		java.lang.String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByDossierNo_First(dossierNo, mtCore, orderByComparator);
	}

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG fetchByDossierNo_First(
		java.lang.String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .fetchByDossierNo_First(dossierNo, mtCore, orderByComparator);
	}

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG findByDossierNo_Last(
		java.lang.String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByDossierNo_Last(dossierNo, mtCore, orderByComparator);
	}

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG fetchByDossierNo_Last(
		java.lang.String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .fetchByDossierNo_Last(dossierNo, mtCore, orderByComparator);
	}

	/**
	* Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param id the primary key of the current vr technical spec_lkxcg
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public static VRTechnicalSpec_LKXCG[] findByDossierNo_PrevAndNext(long id,
		java.lang.String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByDossierNo_PrevAndNext(id, dossierNo, mtCore,
			orderByComparator);
	}

	/**
	* Removes all the vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	*/
	public static void removeByDossierNo(java.lang.String dossierNo, long mtCore) {
		getPersistence().removeByDossierNo(dossierNo, mtCore);
	}

	/**
	* Returns the number of vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @return the number of matching vr technical spec_lkxcgs
	*/
	public static int countByDossierNo(java.lang.String dossierNo, long mtCore) {
		return getPersistence().countByDossierNo(dossierNo, mtCore);
	}

	/**
	* Returns all the vr technical spec_lkxcgs where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDossierIdCTN(
		java.lang.String dossierIdCTN) {
		return getPersistence().findByDossierIdCTN(dossierIdCTN);
	}

	/**
	* Returns a range of all the vr technical spec_lkxcgs where dossierIdCTN = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end) {
		return getPersistence().findByDossierIdCTN(dossierIdCTN, start, end);
	}

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where dossierIdCTN = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .findByDossierIdCTN(dossierIdCTN, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where dossierIdCTN = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDossierIdCTN(dossierIdCTN, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG findByDossierIdCTN_First(
		java.lang.String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByDossierIdCTN_First(dossierIdCTN, orderByComparator);
	}

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG fetchByDossierIdCTN_First(
		java.lang.String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .fetchByDossierIdCTN_First(dossierIdCTN, orderByComparator);
	}

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG findByDossierIdCTN_Last(
		java.lang.String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByDossierIdCTN_Last(dossierIdCTN, orderByComparator);
	}

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG fetchByDossierIdCTN_Last(
		java.lang.String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .fetchByDossierIdCTN_Last(dossierIdCTN, orderByComparator);
	}

	/**
	* Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where dossierIdCTN = &#63;.
	*
	* @param id the primary key of the current vr technical spec_lkxcg
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public static VRTechnicalSpec_LKXCG[] findByDossierIdCTN_PrevAndNext(
		long id, java.lang.String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByDossierIdCTN_PrevAndNext(id, dossierIdCTN,
			orderByComparator);
	}

	/**
	* Removes all the vr technical spec_lkxcgs where dossierIdCTN = &#63; from the database.
	*
	* @param dossierIdCTN the dossier ID ctn
	*/
	public static void removeByDossierIdCTN(java.lang.String dossierIdCTN) {
		getPersistence().removeByDossierIdCTN(dossierIdCTN);
	}

	/**
	* Returns the number of vr technical spec_lkxcgs where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the number of matching vr technical spec_lkxcgs
	*/
	public static int countByDossierIdCTN(java.lang.String dossierIdCTN) {
		return getPersistence().countByDossierIdCTN(dossierIdCTN);
	}

	/**
	* Returns all the vr technical spec_lkxcgs where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDeliverableCode(
		java.lang.String deliverableCode) {
		return getPersistence().findByDeliverableCode(deliverableCode);
	}

	/**
	* Returns a range of all the vr technical spec_lkxcgs where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end) {
		return getPersistence()
				   .findByDeliverableCode(deliverableCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .findByDeliverableCode(deliverableCode, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG findByDeliverableCode_First(
		java.lang.String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByDeliverableCode_First(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG fetchByDeliverableCode_First(
		java.lang.String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .fetchByDeliverableCode_First(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG findByDeliverableCode_Last(
		java.lang.String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByDeliverableCode_Last(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG fetchByDeliverableCode_Last(
		java.lang.String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .fetchByDeliverableCode_Last(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where deliverableCode = &#63;.
	*
	* @param id the primary key of the current vr technical spec_lkxcg
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public static VRTechnicalSpec_LKXCG[] findByDeliverableCode_PrevAndNext(
		long id, java.lang.String deliverableCode,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByDeliverableCode_PrevAndNext(id, deliverableCode,
			orderByComparator);
	}

	/**
	* Removes all the vr technical spec_lkxcgs where deliverableCode = &#63; from the database.
	*
	* @param deliverableCode the deliverable code
	*/
	public static void removeByDeliverableCode(java.lang.String deliverableCode) {
		getPersistence().removeByDeliverableCode(deliverableCode);
	}

	/**
	* Returns the number of vr technical spec_lkxcgs where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the number of matching vr technical spec_lkxcgs
	*/
	public static int countByDeliverableCode(java.lang.String deliverableCode) {
		return getPersistence().countByDeliverableCode(deliverableCode);
	}

	/**
	* Returns all the vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDossierId(long dossierId,
		long mtCore) {
		return getPersistence().findByDossierId(dossierId, mtCore);
	}

	/**
	* Returns a range of all the vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDossierId(long dossierId,
		long mtCore, int start, int end) {
		return getPersistence().findByDossierId(dossierId, mtCore, start, end);
	}

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .findByDossierId(dossierId, mtCore, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDossierId(dossierId, mtCore, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG findByDossierId_First(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByDossierId_First(dossierId, mtCore, orderByComparator);
	}

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG fetchByDossierId_First(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .fetchByDossierId_First(dossierId, mtCore, orderByComparator);
	}

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG findByDossierId_Last(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByDossierId_Last(dossierId, mtCore, orderByComparator);
	}

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG fetchByDossierId_Last(long dossierId,
		long mtCore, OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .fetchByDossierId_Last(dossierId, mtCore, orderByComparator);
	}

	/**
	* Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param id the primary key of the current vr technical spec_lkxcg
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public static VRTechnicalSpec_LKXCG[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByDossierId_PrevAndNext(id, dossierId, mtCore,
			orderByComparator);
	}

	/**
	* Removes all the vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	*/
	public static void removeByDossierId(long dossierId, long mtCore) {
		getPersistence().removeByDossierId(dossierId, mtCore);
	}

	/**
	* Returns the number of vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the number of matching vr technical spec_lkxcgs
	*/
	public static int countByDossierId(long dossierId, long mtCore) {
		return getPersistence().countByDossierId(dossierId, mtCore);
	}

	/**
	* Returns all the vr technical spec_lkxcgs where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @return the matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByConvertAssembleId(
		long convertAssembleId) {
		return getPersistence().findByConvertAssembleId(convertAssembleId);
	}

	/**
	* Returns a range of all the vr technical spec_lkxcgs where convertAssembleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param convertAssembleId the convert assemble ID
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByConvertAssembleId(
		long convertAssembleId, int start, int end) {
		return getPersistence()
				   .findByConvertAssembleId(convertAssembleId, start, end);
	}

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where convertAssembleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param convertAssembleId the convert assemble ID
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .findByConvertAssembleId(convertAssembleId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where convertAssembleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param convertAssembleId the convert assemble ID
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByConvertAssembleId(convertAssembleId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG findByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByConvertAssembleId_First(convertAssembleId,
			orderByComparator);
	}

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG fetchByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .fetchByConvertAssembleId_First(convertAssembleId,
			orderByComparator);
	}

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG findByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByConvertAssembleId_Last(convertAssembleId,
			orderByComparator);
	}

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG fetchByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .fetchByConvertAssembleId_Last(convertAssembleId,
			orderByComparator);
	}

	/**
	* Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where convertAssembleId = &#63;.
	*
	* @param id the primary key of the current vr technical spec_lkxcg
	* @param convertAssembleId the convert assemble ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public static VRTechnicalSpec_LKXCG[] findByConvertAssembleId_PrevAndNext(
		long id, long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByConvertAssembleId_PrevAndNext(id, convertAssembleId,
			orderByComparator);
	}

	/**
	* Removes all the vr technical spec_lkxcgs where convertAssembleId = &#63; from the database.
	*
	* @param convertAssembleId the convert assemble ID
	*/
	public static void removeByConvertAssembleId(long convertAssembleId) {
		getPersistence().removeByConvertAssembleId(convertAssembleId);
	}

	/**
	* Returns the number of vr technical spec_lkxcgs where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @return the number of matching vr technical spec_lkxcgs
	*/
	public static int countByConvertAssembleId(long convertAssembleId) {
		return getPersistence().countByConvertAssembleId(convertAssembleId);
	}

	/**
	* Returns all the vr technical spec_lkxcgs where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @return the matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByReferenceUid(
		java.lang.String referenceUid) {
		return getPersistence().findByReferenceUid(referenceUid);
	}

	/**
	* Returns a range of all the vr technical spec_lkxcgs where referenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param referenceUid the reference uid
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByReferenceUid(
		java.lang.String referenceUid, int start, int end) {
		return getPersistence().findByReferenceUid(referenceUid, start, end);
	}

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where referenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param referenceUid the reference uid
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByReferenceUid(
		java.lang.String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .findByReferenceUid(referenceUid, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where referenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param referenceUid the reference uid
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findByReferenceUid(
		java.lang.String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByReferenceUid(referenceUid, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG findByReferenceUid_First(
		java.lang.String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByReferenceUid_First(referenceUid, orderByComparator);
	}

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG fetchByReferenceUid_First(
		java.lang.String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .fetchByReferenceUid_First(referenceUid, orderByComparator);
	}

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG findByReferenceUid_Last(
		java.lang.String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByReferenceUid_Last(referenceUid, orderByComparator);
	}

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public static VRTechnicalSpec_LKXCG fetchByReferenceUid_Last(
		java.lang.String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence()
				   .fetchByReferenceUid_Last(referenceUid, orderByComparator);
	}

	/**
	* Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where referenceUid = &#63;.
	*
	* @param id the primary key of the current vr technical spec_lkxcg
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public static VRTechnicalSpec_LKXCG[] findByReferenceUid_PrevAndNext(
		long id, java.lang.String referenceUid,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence()
				   .findByReferenceUid_PrevAndNext(id, referenceUid,
			orderByComparator);
	}

	/**
	* Removes all the vr technical spec_lkxcgs where referenceUid = &#63; from the database.
	*
	* @param referenceUid the reference uid
	*/
	public static void removeByReferenceUid(java.lang.String referenceUid) {
		getPersistence().removeByReferenceUid(referenceUid);
	}

	/**
	* Returns the number of vr technical spec_lkxcgs where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @return the number of matching vr technical spec_lkxcgs
	*/
	public static int countByReferenceUid(java.lang.String referenceUid) {
		return getPersistence().countByReferenceUid(referenceUid);
	}

	/**
	* Caches the vr technical spec_lkxcg in the entity cache if it is enabled.
	*
	* @param vrTechnicalSpec_LKXCG the vr technical spec_lkxcg
	*/
	public static void cacheResult(VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG) {
		getPersistence().cacheResult(vrTechnicalSpec_LKXCG);
	}

	/**
	* Caches the vr technical spec_lkxcgs in the entity cache if it is enabled.
	*
	* @param vrTechnicalSpec_LKXCGs the vr technical spec_lkxcgs
	*/
	public static void cacheResult(
		List<VRTechnicalSpec_LKXCG> vrTechnicalSpec_LKXCGs) {
		getPersistence().cacheResult(vrTechnicalSpec_LKXCGs);
	}

	/**
	* Creates a new vr technical spec_lkxcg with the primary key. Does not add the vr technical spec_lkxcg to the database.
	*
	* @param id the primary key for the new vr technical spec_lkxcg
	* @return the new vr technical spec_lkxcg
	*/
	public static VRTechnicalSpec_LKXCG create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr technical spec_lkxcg with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr technical spec_lkxcg
	* @return the vr technical spec_lkxcg that was removed
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public static VRTechnicalSpec_LKXCG remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence().remove(id);
	}

	public static VRTechnicalSpec_LKXCG updateImpl(
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG) {
		return getPersistence().updateImpl(vrTechnicalSpec_LKXCG);
	}

	/**
	* Returns the vr technical spec_lkxcg with the primary key or throws a {@link NoSuchVRTechnicalSpec_LKXCGException} if it could not be found.
	*
	* @param id the primary key of the vr technical spec_lkxcg
	* @return the vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public static VRTechnicalSpec_LKXCG findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr technical spec_lkxcg with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr technical spec_lkxcg
	* @return the vr technical spec_lkxcg, or <code>null</code> if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public static VRTechnicalSpec_LKXCG fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRTechnicalSpec_LKXCG> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr technical spec_lkxcgs.
	*
	* @return the vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr technical spec_lkxcgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr technical spec_lkxcgs
	*/
	public static List<VRTechnicalSpec_LKXCG> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr technical spec_lkxcgs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr technical spec_lkxcgs.
	*
	* @return the number of vr technical spec_lkxcgs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRTechnicalSpec_LKXCGPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRTechnicalSpec_LKXCGPersistence, VRTechnicalSpec_LKXCGPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRTechnicalSpec_LKXCGPersistence.class);
}