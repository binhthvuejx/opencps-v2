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
 * Provides a wrapper for {@link VRTechnicalSpec_LKXMYLocalService}.
 *
 * @author LamTV
 * @see VRTechnicalSpec_LKXMYLocalService
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_LKXMYLocalServiceWrapper
	implements VRTechnicalSpec_LKXMYLocalService,
		ServiceWrapper<VRTechnicalSpec_LKXMYLocalService> {
	public VRTechnicalSpec_LKXMYLocalServiceWrapper(
		VRTechnicalSpec_LKXMYLocalService vrTechnicalSpec_LKXMYLocalService) {
		_vrTechnicalSpec_LKXMYLocalService = vrTechnicalSpec_LKXMYLocalService;
	}

	/**
	* Adds the vr technical spec_lkxmy to the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_LKXMY the vr technical spec_lkxmy
	* @return the vr technical spec_lkxmy that was added
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_LKXMY addVRTechnicalSpec_LKXMY(
		com.fds.vr.business.model.VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY) {
		return _vrTechnicalSpec_LKXMYLocalService.addVRTechnicalSpec_LKXMY(vrTechnicalSpec_LKXMY);
	}

	/**
	* Creates a new vr technical spec_lkxmy with the primary key. Does not add the vr technical spec_lkxmy to the database.
	*
	* @param id the primary key for the new vr technical spec_lkxmy
	* @return the new vr technical spec_lkxmy
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_LKXMY createVRTechnicalSpec_LKXMY(
		long id) {
		return _vrTechnicalSpec_LKXMYLocalService.createVRTechnicalSpec_LKXMY(id);
	}

	/**
	* Deletes the vr technical spec_lkxmy from the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_LKXMY the vr technical spec_lkxmy
	* @return the vr technical spec_lkxmy that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_LKXMY deleteVRTechnicalSpec_LKXMY(
		com.fds.vr.business.model.VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY) {
		return _vrTechnicalSpec_LKXMYLocalService.deleteVRTechnicalSpec_LKXMY(vrTechnicalSpec_LKXMY);
	}

	/**
	* Deletes the vr technical spec_lkxmy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr technical spec_lkxmy
	* @return the vr technical spec_lkxmy that was removed
	* @throws PortalException if a vr technical spec_lkxmy with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_LKXMY deleteVRTechnicalSpec_LKXMY(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_LKXMYLocalService.deleteVRTechnicalSpec_LKXMY(id);
	}

	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_LKXMY fetchVRTechnicalSpec_LKXMY(
		long id) {
		return _vrTechnicalSpec_LKXMYLocalService.fetchVRTechnicalSpec_LKXMY(id);
	}

	/**
	* Returns the vr technical spec_lkxmy with the primary key.
	*
	* @param id the primary key of the vr technical spec_lkxmy
	* @return the vr technical spec_lkxmy
	* @throws PortalException if a vr technical spec_lkxmy with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_LKXMY getVRTechnicalSpec_LKXMY(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_LKXMYLocalService.getVRTechnicalSpec_LKXMY(id);
	}

	/**
	* Updates the vr technical spec_lkxmy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_LKXMY the vr technical spec_lkxmy
	* @return the vr technical spec_lkxmy that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_LKXMY updateVRTechnicalSpec_LKXMY(
		com.fds.vr.business.model.VRTechnicalSpec_LKXMY vrTechnicalSpec_LKXMY) {
		return _vrTechnicalSpec_LKXMYLocalService.updateVRTechnicalSpec_LKXMY(vrTechnicalSpec_LKXMY);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrTechnicalSpec_LKXMYLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrTechnicalSpec_LKXMYLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrTechnicalSpec_LKXMYLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_LKXMYLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_LKXMYLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr technical spec_lkxmies.
	*
	* @return the number of vr technical spec_lkxmies
	*/
	@Override
	public int getVRTechnicalSpec_LKXMYsCount() {
		return _vrTechnicalSpec_LKXMYLocalService.getVRTechnicalSpec_LKXMYsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrTechnicalSpec_LKXMYLocalService.getOSGiServiceIdentifier();
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
		return _vrTechnicalSpec_LKXMYLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTechnicalSpec_LKXMYLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTechnicalSpec_LKXMYLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXMY> findByConvertAssembleId(
		long convertAssembleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_LKXMYLocalService.findByConvertAssembleId(convertAssembleId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXMY> findByDeliverableCode(
		java.lang.String deliverableCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_LKXMYLocalService.findByDeliverableCode(deliverableCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXMY> findByDossierId(
		long dossierId, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_LKXMYLocalService.findByDossierId(dossierId,
			mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXMY> findByDossierIdCTN(
		java.lang.String dossierIdCTN)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_LKXMYLocalService.findByDossierIdCTN(dossierIdCTN);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXMY> findByDossierNo(
		java.lang.String dossierNo, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_LKXMYLocalService.findByDossierNo(dossierNo,
			mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXMY> findByReferenceUid(
		java.lang.String referenceUid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_LKXMYLocalService.findByReferenceUid(referenceUid);
	}

	/**
	* Returns a range of all the vr technical spec_lkxmies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_LKXMYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_lkxmies
	* @param end the upper bound of the range of vr technical spec_lkxmies (not inclusive)
	* @return the range of vr technical spec_lkxmies
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXMY> getVRTechnicalSpec_LKXMYs(
		int start, int end) {
		return _vrTechnicalSpec_LKXMYLocalService.getVRTechnicalSpec_LKXMYs(start,
			end);
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
		return _vrTechnicalSpec_LKXMYLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrTechnicalSpec_LKXMYLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRTechnicalSpec_LKXMYLocalService getWrappedService() {
		return _vrTechnicalSpec_LKXMYLocalService;
	}

	@Override
	public void setWrappedService(
		VRTechnicalSpec_LKXMYLocalService vrTechnicalSpec_LKXMYLocalService) {
		_vrTechnicalSpec_LKXMYLocalService = vrTechnicalSpec_LKXMYLocalService;
	}

	private VRTechnicalSpec_LKXMYLocalService _vrTechnicalSpec_LKXMYLocalService;
}