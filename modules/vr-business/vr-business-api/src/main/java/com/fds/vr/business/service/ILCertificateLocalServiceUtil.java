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
 * Provides the local service utility for ILCertificate. This utility wraps
 * {@link com.fds.vr.business.service.impl.ILCertificateLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see ILCertificateLocalService
 * @see com.fds.vr.business.service.base.ILCertificateLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.ILCertificateLocalServiceImpl
 * @generated
 */
@ProviderType
public class ILCertificateLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.ILCertificateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.fds.vr.business.model.ILCertificate addCertificate(
		com.liferay.portal.kernel.json.JSONObject jsonData,
		org.opencps.dossiermgt.model.Dossier dossier, long dossierFileId,
		java.lang.String dossierTemplateNo, java.lang.String dossierPartNo,
		java.lang.String fileTemplateNo, java.lang.String referenceUid,
		long doanhnghiepid, long vehicleid) {
		return getService()
				   .addCertificate(jsonData, dossier, dossierFileId,
			dossierTemplateNo, dossierPartNo, fileTemplateNo, referenceUid,
			doanhnghiepid, vehicleid);
	}

	/**
	* Adds the il certificate to the database. Also notifies the appropriate model listeners.
	*
	* @param ilCertificate the il certificate
	* @return the il certificate that was added
	*/
	public static com.fds.vr.business.model.ILCertificate addILCertificate(
		com.fds.vr.business.model.ILCertificate ilCertificate) {
		return getService().addILCertificate(ilCertificate);
	}

	/**
	* Creates a new il certificate with the primary key. Does not add the il certificate to the database.
	*
	* @param id the primary key for the new il certificate
	* @return the new il certificate
	*/
	public static com.fds.vr.business.model.ILCertificate createILCertificate(
		long id) {
		return getService().createILCertificate(id);
	}

	/**
	* Deletes the il certificate from the database. Also notifies the appropriate model listeners.
	*
	* @param ilCertificate the il certificate
	* @return the il certificate that was removed
	*/
	public static com.fds.vr.business.model.ILCertificate deleteILCertificate(
		com.fds.vr.business.model.ILCertificate ilCertificate) {
		return getService().deleteILCertificate(ilCertificate);
	}

	/**
	* Deletes the il certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the il certificate
	* @return the il certificate that was removed
	* @throws PortalException if a il certificate with the primary key could not be found
	*/
	public static com.fds.vr.business.model.ILCertificate deleteILCertificate(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteILCertificate(id);
	}

	public static com.fds.vr.business.model.ILCertificate fetchByDossierFileId(
		long dossierFileId) {
		return getService().fetchByDossierFileId(dossierFileId);
	}

	public static com.fds.vr.business.model.ILCertificate fetchByLicenceNo(
		java.lang.String licenceNo)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().fetchByLicenceNo(licenceNo);
	}

	public static com.fds.vr.business.model.ILCertificate fetchILCertificate(
		long id) {
		return getService().fetchILCertificate(id);
	}

	/**
	* Returns the il certificate with the primary key.
	*
	* @param id the primary key of the il certificate
	* @return the il certificate
	* @throws PortalException if a il certificate with the primary key could not be found
	*/
	public static com.fds.vr.business.model.ILCertificate getILCertificate(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getILCertificate(id);
	}

	public static com.fds.vr.business.model.ILCertificate searchByRegNumbber(
		java.lang.String keyword) {
		return getService().searchByRegNumbber(keyword);
	}

	public static com.fds.vr.business.model.ILCertificate updateCertificate(
		com.liferay.portal.kernel.json.JSONObject jsonData, long dossierFileId) {
		return getService().updateCertificate(jsonData, dossierFileId);
	}

	/**
	* Updates the il certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ilCertificate the il certificate
	* @return the il certificate that was updated
	*/
	public static com.fds.vr.business.model.ILCertificate updateILCertificate(
		com.fds.vr.business.model.ILCertificate ilCertificate) {
		return getService().updateILCertificate(ilCertificate);
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

	public static int countByDossierFileId(long dossierFileId) {
		return getService().countByDossierFileId(dossierFileId);
	}

	public static int countByServiceCode(java.lang.String govAgencyCode,
		java.lang.String[] serviceCodes, java.util.Date fromDate,
		java.util.Date toDate) {
		return getService()
				   .countByServiceCode(govAgencyCode, serviceCodes, fromDate,
			toDate);
	}

	/**
	* Returns the number of il certificates.
	*
	* @return the number of il certificates
	*/
	public static int getILCertificatesCount() {
		return getService().getILCertificatesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.ILCertificate> getAllCertificate() {
		return getService().getAllCertificate();
	}

	public static java.util.List<com.fds.vr.business.model.ILCertificate> getByApplicant(
		java.lang.String serviceCode, java.lang.String applicant) {
		return getService().getByApplicant(serviceCode, applicant);
	}

	public static java.util.List<com.fds.vr.business.model.ILCertificate> getCertByValidFrom(
		java.lang.String serviceCode, java.lang.String applicant,
		java.lang.String regSearch) {
		return getService().getCertByValidFrom(serviceCode, applicant, regSearch);
	}

	public static java.util.List<com.fds.vr.business.model.ILCertificate> getDocAcceptList(
		java.lang.String keywords, java.lang.String serviceCode,
		java.lang.String govAgencyCode, java.lang.String routeCode,
		java.lang.String fromDate, java.lang.String toDate, int start, int limit) {
		return getService()
				   .getDocAcceptList(keywords, serviceCode, govAgencyCode,
			routeCode, fromDate, toDate, start, limit);
	}

	/**
	* Returns a range of all the il certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.ILCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of il certificates
	* @param end the upper bound of the range of il certificates (not inclusive)
	* @return the range of il certificates
	*/
	public static java.util.List<com.fds.vr.business.model.ILCertificate> getILCertificates(
		int start, int end) {
		return getService().getILCertificates(start, end);
	}

	public static java.util.List<com.fds.vr.business.model.ILCertificate> searchGiayPhep(
		java.lang.String keyword, int start, int end) {
		return getService().searchGiayPhep(keyword, start, end);
	}

	public static java.util.List<com.fds.vr.business.model.ILCertificate> searchLienVan(
		java.lang.String keyword, int start, int end) {
		return getService().searchLienVan(keyword, start, end);
	}

	public static java.util.List<com.fds.vr.business.model.ILCertificate> searchListByRegistionNumber(
		java.lang.String keyword) {
		return getService().searchListByRegistionNumber(keyword);
	}

	public static long countByApplicant(java.lang.String serviceCode,
		java.lang.String applicant) {
		return getService().countByApplicant(serviceCode, applicant);
	}

	public static long countDocAcceptList(java.lang.String keywords,
		java.lang.String serviceCode, java.lang.String govAgencyCode,
		java.lang.String routeCode, java.lang.String fromDate,
		java.lang.String toDate) {
		return getService()
				   .countDocAcceptList(keywords, serviceCode, govAgencyCode,
			routeCode, fromDate, toDate);
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

	public static ILCertificateLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ILCertificateLocalService, ILCertificateLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ILCertificateLocalService.class);
}