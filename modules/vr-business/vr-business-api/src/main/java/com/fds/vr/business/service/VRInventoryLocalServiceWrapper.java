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

package com.fds.vr.business.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VRInventoryLocalService}.
 *
 * @author LamTV
 * @see VRInventoryLocalService
 * @generated
 */
@ProviderType
public class VRInventoryLocalServiceWrapper implements VRInventoryLocalService,
	ServiceWrapper<VRInventoryLocalService> {
	public VRInventoryLocalServiceWrapper(
		VRInventoryLocalService vrInventoryLocalService) {
		_vrInventoryLocalService = vrInventoryLocalService;
	}

	/**
	* Adds the vr inventory to the database. Also notifies the appropriate model listeners.
	*
	* @param vrInventory the vr inventory
	* @return the vr inventory that was added
	*/
	@Override
	public com.fds.vr.business.model.VRInventory addVRInventory(
		com.fds.vr.business.model.VRInventory vrInventory) {
		return _vrInventoryLocalService.addVRInventory(vrInventory);
	}

	/**
	* Creates a new vr inventory with the primary key. Does not add the vr inventory to the database.
	*
	* @param id the primary key for the new vr inventory
	* @return the new vr inventory
	*/
	@Override
	public com.fds.vr.business.model.VRInventory createVRInventory(long id) {
		return _vrInventoryLocalService.createVRInventory(id);
	}

	/**
	* Deletes the vr inventory from the database. Also notifies the appropriate model listeners.
	*
	* @param vrInventory the vr inventory
	* @return the vr inventory that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRInventory deleteVRInventory(
		com.fds.vr.business.model.VRInventory vrInventory) {
		return _vrInventoryLocalService.deleteVRInventory(vrInventory);
	}

	/**
	* Deletes the vr inventory with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr inventory
	* @return the vr inventory that was removed
	* @throws PortalException if a vr inventory with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRInventory deleteVRInventory(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInventoryLocalService.deleteVRInventory(id);
	}

	@Override
	public com.fds.vr.business.model.VRInventory fetchVRInventory(long id) {
		return _vrInventoryLocalService.fetchVRInventory(id);
	}

	/**
	* Returns the vr inventory with the primary key.
	*
	* @param id the primary key of the vr inventory
	* @return the vr inventory
	* @throws PortalException if a vr inventory with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRInventory getVRInventory(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInventoryLocalService.getVRInventory(id);
	}

	/**
	* Updates the vr inventory in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrInventory the vr inventory
	* @return the vr inventory that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRInventory updateVRInventory(
		com.fds.vr.business.model.VRInventory vrInventory) {
		return _vrInventoryLocalService.updateVRInventory(vrInventory);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrInventoryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrInventoryLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrInventoryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInventoryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInventoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr inventories.
	*
	* @return the number of vr inventories
	*/
	@Override
	public int getVRInventoriesCount() {
		return _vrInventoryLocalService.getVRInventoriesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrInventoryLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vrInventoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vrInventoryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vrInventoryLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the vr inventories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @return the range of vr inventories
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRInventory> getVRInventories(
		int start, int end) {
		return _vrInventoryLocalService.getVRInventories(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vrInventoryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _vrInventoryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRInventoryLocalService getWrappedService() {
		return _vrInventoryLocalService;
	}

	@Override
	public void setWrappedService(
		VRInventoryLocalService vrInventoryLocalService) {
		_vrInventoryLocalService = vrInventoryLocalService;
	}

	private VRInventoryLocalService _vrInventoryLocalService;
}