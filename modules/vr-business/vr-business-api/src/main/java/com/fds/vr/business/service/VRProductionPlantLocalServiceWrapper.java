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
 * Provides a wrapper for {@link VRProductionPlantLocalService}.
 *
 * @author LamTV
 * @see VRProductionPlantLocalService
 * @generated
 */
@ProviderType
public class VRProductionPlantLocalServiceWrapper
	implements VRProductionPlantLocalService,
		ServiceWrapper<VRProductionPlantLocalService> {
	public VRProductionPlantLocalServiceWrapper(
		VRProductionPlantLocalService vrProductionPlantLocalService) {
		_vrProductionPlantLocalService = vrProductionPlantLocalService;
	}

	/**
	* Adds the vr production plant to the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlant the vr production plant
	* @return the vr production plant that was added
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlant addVRProductionPlant(
		com.fds.vr.business.model.VRProductionPlant vrProductionPlant) {
		return _vrProductionPlantLocalService.addVRProductionPlant(vrProductionPlant);
	}

	/**
	* Creates a new vr production plant with the primary key. Does not add the vr production plant to the database.
	*
	* @param id the primary key for the new vr production plant
	* @return the new vr production plant
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlant createVRProductionPlant(
		long id) {
		return _vrProductionPlantLocalService.createVRProductionPlant(id);
	}

	/**
	* Deletes the vr production plant from the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlant the vr production plant
	* @return the vr production plant that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlant deleteVRProductionPlant(
		com.fds.vr.business.model.VRProductionPlant vrProductionPlant) {
		return _vrProductionPlantLocalService.deleteVRProductionPlant(vrProductionPlant);
	}

	/**
	* Deletes the vr production plant with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant that was removed
	* @throws PortalException if a vr production plant with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlant deleteVRProductionPlant(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionPlantLocalService.deleteVRProductionPlant(id);
	}

	@Override
	public com.fds.vr.business.model.VRProductionPlant fetchVRProductionPlant(
		long id) {
		return _vrProductionPlantLocalService.fetchVRProductionPlant(id);
	}

	/**
	* Returns the vr production plant with the primary key.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant
	* @throws PortalException if a vr production plant with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlant getVRProductionPlant(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionPlantLocalService.getVRProductionPlant(id);
	}

	@Override
	public com.fds.vr.business.model.VRProductionPlant updateProductionPlant(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues) {
		return _vrProductionPlantLocalService.updateProductionPlant(mapValues);
	}

	/**
	* Updates the vr production plant in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlant the vr production plant
	* @return the vr production plant that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlant updateVRProductionPlant(
		com.fds.vr.business.model.VRProductionPlant vrProductionPlant) {
		return _vrProductionPlantLocalService.updateVRProductionPlant(vrProductionPlant);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrProductionPlantLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrProductionPlantLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrProductionPlantLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionPlantLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionPlantLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr production plants.
	*
	* @return the number of vr production plants
	*/
	@Override
	public int getVRProductionPlantsCount() {
		return _vrProductionPlantLocalService.getVRProductionPlantsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrProductionPlantLocalService.getOSGiServiceIdentifier();
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
		return _vrProductionPlantLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrProductionPlantLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrProductionPlantLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the vr production plants.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of vr production plants
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRProductionPlant> getVRProductionPlants(
		int start, int end) {
		return _vrProductionPlantLocalService.getVRProductionPlants(start, end);
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
		return _vrProductionPlantLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrProductionPlantLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRProductionPlantLocalService getWrappedService() {
		return _vrProductionPlantLocalService;
	}

	@Override
	public void setWrappedService(
		VRProductionPlantLocalService vrProductionPlantLocalService) {
		_vrProductionPlantLocalService = vrProductionPlantLocalService;
	}

	private VRProductionPlantLocalService _vrProductionPlantLocalService;
}