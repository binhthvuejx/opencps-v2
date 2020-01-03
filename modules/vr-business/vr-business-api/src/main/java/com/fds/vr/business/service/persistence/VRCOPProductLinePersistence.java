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

import com.fds.vr.business.exception.NoSuchVRCOPProductLineException;
import com.fds.vr.business.model.VRCOPProductLine;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vrcop product line service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRCOPProductLinePersistenceImpl
 * @see VRCOPProductLineUtil
 * @generated
 */
@ProviderType
public interface VRCOPProductLinePersistence extends BasePersistence<VRCOPProductLine> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCOPProductLineUtil} to access the vrcop product line persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vrcop product line in the entity cache if it is enabled.
	*
	* @param vrcopProductLine the vrcop product line
	*/
	public void cacheResult(VRCOPProductLine vrcopProductLine);

	/**
	* Caches the vrcop product lines in the entity cache if it is enabled.
	*
	* @param vrcopProductLines the vrcop product lines
	*/
	public void cacheResult(java.util.List<VRCOPProductLine> vrcopProductLines);

	/**
	* Creates a new vrcop product line with the primary key. Does not add the vrcop product line to the database.
	*
	* @param id the primary key for the new vrcop product line
	* @return the new vrcop product line
	*/
	public VRCOPProductLine create(long id);

	/**
	* Removes the vrcop product line with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop product line
	* @return the vrcop product line that was removed
	* @throws NoSuchVRCOPProductLineException if a vrcop product line with the primary key could not be found
	*/
	public VRCOPProductLine remove(long id)
		throws NoSuchVRCOPProductLineException;

	public VRCOPProductLine updateImpl(VRCOPProductLine vrcopProductLine);

	/**
	* Returns the vrcop product line with the primary key or throws a {@link NoSuchVRCOPProductLineException} if it could not be found.
	*
	* @param id the primary key of the vrcop product line
	* @return the vrcop product line
	* @throws NoSuchVRCOPProductLineException if a vrcop product line with the primary key could not be found
	*/
	public VRCOPProductLine findByPrimaryKey(long id)
		throws NoSuchVRCOPProductLineException;

	/**
	* Returns the vrcop product line with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop product line
	* @return the vrcop product line, or <code>null</code> if a vrcop product line with the primary key could not be found
	*/
	public VRCOPProductLine fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCOPProductLine> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vrcop product lines.
	*
	* @return the vrcop product lines
	*/
	public java.util.List<VRCOPProductLine> findAll();

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
	public java.util.List<VRCOPProductLine> findAll(int start, int end);

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
	public java.util.List<VRCOPProductLine> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductLine> orderByComparator);

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
	public java.util.List<VRCOPProductLine> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductLine> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vrcop product lines from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vrcop product lines.
	*
	* @return the number of vrcop product lines
	*/
	public int countAll();
}