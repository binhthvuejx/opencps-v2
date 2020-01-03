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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for VRVehicleTypeCertificate. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRVehicleTypeCertificateLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRVehicleTypeCertificateLocalService
 * @see com.fds.vr.business.service.base.VRVehicleTypeCertificateLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRVehicleTypeCertificateLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRVehicleTypeCertificateLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRVehicleTypeCertificateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr vehicle type certificate to the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleTypeCertificate the vr vehicle type certificate
	* @return the vr vehicle type certificate that was added
	*/
	public static com.fds.vr.business.model.VRVehicleTypeCertificate addVRVehicleTypeCertificate(
		com.fds.vr.business.model.VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		return getService().addVRVehicleTypeCertificate(vrVehicleTypeCertificate);
	}

	/**
	* Creates a new vr vehicle type certificate with the primary key. Does not add the vr vehicle type certificate to the database.
	*
	* @param id the primary key for the new vr vehicle type certificate
	* @return the new vr vehicle type certificate
	*/
	public static com.fds.vr.business.model.VRVehicleTypeCertificate createVRVehicleTypeCertificate(
		long id) {
		return getService().createVRVehicleTypeCertificate(id);
	}

	/**
	* Deletes the vr vehicle type certificate from the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleTypeCertificate the vr vehicle type certificate
	* @return the vr vehicle type certificate that was removed
	*/
	public static com.fds.vr.business.model.VRVehicleTypeCertificate deleteVRVehicleTypeCertificate(
		com.fds.vr.business.model.VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		return getService()
				   .deleteVRVehicleTypeCertificate(vrVehicleTypeCertificate);
	}

	/**
	* Deletes the vr vehicle type certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate that was removed
	* @throws PortalException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRVehicleTypeCertificate deleteVRVehicleTypeCertificate(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRVehicleTypeCertificate(id);
	}

	public static com.fds.vr.business.model.VRVehicleTypeCertificate fetchVRVehicleTypeCertificate(
		long id) {
		return getService().fetchVRVehicleTypeCertificate(id);
	}

	/**
	* Returns the vr vehicle type certificate with the primary key.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate
	* @throws PortalException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRVehicleTypeCertificate getVRVehicleTypeCertificate(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRVehicleTypeCertificate(id);
	}

	/**
	* Updates the vr vehicle type certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleTypeCertificate the vr vehicle type certificate
	* @return the vr vehicle type certificate that was updated
	*/
	public static com.fds.vr.business.model.VRVehicleTypeCertificate updateVRVehicleTypeCertificate(
		com.fds.vr.business.model.VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		return getService()
				   .updateVRVehicleTypeCertificate(vrVehicleTypeCertificate);
	}

	public static com.fds.vr.business.model.VRVehicleTypeCertificate updateVehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date modifiedDate,
		org.opencps.dossiermgt.model.Registration registration,
		org.opencps.dossiermgt.model.DossierFile dossierFile) {
		return getService()
				   .updateVehicleTypeCertificate(mapValues, modifiedDate,
			registration, dossierFile);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr vehicle type certificates.
	*
	* @return the number of vr vehicle type certificates
	*/
	public static int getVRVehicleTypeCertificatesCount() {
		return getService().getVRVehicleTypeCertificatesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the vr vehicle type certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of vr vehicle type certificates
	*/
	public static java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> getVRVehicleTypeCertificates(
		int start, int end) {
		return getService().getVRVehicleTypeCertificates(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static VRVehicleTypeCertificateLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRVehicleTypeCertificateLocalService, VRVehicleTypeCertificateLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRVehicleTypeCertificateLocalService.class);
}