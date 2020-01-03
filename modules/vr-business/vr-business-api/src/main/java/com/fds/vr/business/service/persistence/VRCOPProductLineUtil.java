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

import com.fds.vr.business.model.VRCOPProductLine;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vrcop product line service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRCOPProductLinePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCOPProductLinePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRCOPProductLinePersistenceImpl
 * @generated
 */
@ProviderType
public class VRCOPProductLineUtil {
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
	public static void clearCache(VRCOPProductLine vrcopProductLine) {
		getPersistence().clearCache(vrcopProductLine);
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
	public static List<VRCOPProductLine> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRCOPProductLine> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRCOPProductLine> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRCOPProductLine> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRCOPProductLine update(VRCOPProductLine vrcopProductLine) {
		return getPersistence().update(vrcopProductLine);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRCOPProductLine update(VRCOPProductLine vrcopProductLine,
		ServiceContext serviceContext) {
		return getPersistence().update(vrcopProductLine, serviceContext);
	}

	/**
	* Caches the vrcop product line in the entity cache if it is enabled.
	*
	* @param vrcopProductLine the vrcop product line
	*/
	public static void cacheResult(VRCOPProductLine vrcopProductLine) {
		getPersistence().cacheResult(vrcopProductLine);
	}

	/**
	* Caches the vrcop product lines in the entity cache if it is enabled.
	*
	* @param vrcopProductLines the vrcop product lines
	*/
	public static void cacheResult(List<VRCOPProductLine> vrcopProductLines) {
		getPersistence().cacheResult(vrcopProductLines);
	}

	/**
	* Creates a new vrcop product line with the primary key. Does not add the vrcop product line to the database.
	*
	* @param id the primary key for the new vrcop product line
	* @return the new vrcop product line
	*/
	public static VRCOPProductLine create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vrcop product line with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop product line
	* @return the vrcop product line that was removed
	* @throws NoSuchVRCOPProductLineException if a vrcop product line with the primary key could not be found
	*/
	public static VRCOPProductLine remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductLineException {
		return getPersistence().remove(id);
	}

	public static VRCOPProductLine updateImpl(VRCOPProductLine vrcopProductLine) {
		return getPersistence().updateImpl(vrcopProductLine);
	}

	/**
	* Returns the vrcop product line with the primary key or throws a {@link NoSuchVRCOPProductLineException} if it could not be found.
	*
	* @param id the primary key of the vrcop product line
	* @return the vrcop product line
	* @throws NoSuchVRCOPProductLineException if a vrcop product line with the primary key could not be found
	*/
	public static VRCOPProductLine findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductLineException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vrcop product line with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop product line
	* @return the vrcop product line, or <code>null</code> if a vrcop product line with the primary key could not be found
	*/
	public static VRCOPProductLine fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRCOPProductLine> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vrcop product lines.
	*
	* @return the vrcop product lines
	*/
	public static List<VRCOPProductLine> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vrcop product lines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product lines
	* @param end the upper bound of the range of vrcop product lines (not inclusive)
	* @return the range of vrcop product lines
	*/
	public static List<VRCOPProductLine> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vrcop product lines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product lines
	* @param end the upper bound of the range of vrcop product lines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop product lines
	*/
	public static List<VRCOPProductLine> findAll(int start, int end,
		OrderByComparator<VRCOPProductLine> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop product lines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product lines
	* @param end the upper bound of the range of vrcop product lines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop product lines
	*/
	public static List<VRCOPProductLine> findAll(int start, int end,
		OrderByComparator<VRCOPProductLine> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vrcop product lines from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vrcop product lines.
	*
	* @return the number of vrcop product lines
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRCOPProductLinePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCOPProductLinePersistence, VRCOPProductLinePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRCOPProductLinePersistence.class);
}