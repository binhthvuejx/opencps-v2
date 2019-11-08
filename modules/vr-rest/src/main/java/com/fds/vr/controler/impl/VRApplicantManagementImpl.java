package com.fds.vr.controler.impl;

import com.fds.vr.business.action.VRApplicantProfileAction;
import com.fds.vr.business.action.impl.VRApplicantProfileActionImpl;
import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.impl.VRApplicantProfileImpl;
import com.fds.vr.controler.VRApplicantManagement;
import com.fds.vr.model.VRApplicantProfileApiModel;
import com.fds.vr.model.VRApplicantProfileBeanParam;
import com.fds.vr.util.VRRestUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;
import java.util.Locale;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * @author trungnt
 *
 */
public class VRApplicantManagementImpl implements VRApplicantManagement {
	private Log _log = LogFactoryUtil.getLog(VRApplicantManagementImpl.class);

	@Override
	public Response findApplicantProfile(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, VRApplicantProfileBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRApplicantProfileAction actionImpl = new VRApplicantProfileActionImpl();
			result = actionImpl.findVRApplicantProfile(user, serviceContext, params);
			return Response.status(200).entity(result.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrappicantprofile")).build();
		}
	}

	@Override
	public Response findApplicantProfileDetail(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRApplicantProfileBeanParam query) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		try {
			LinkedHashMap<String, Object> params = VRRestUtil.getParamMap(query);
			VRApplicantProfileAction actionImpl = new VRApplicantProfileActionImpl();
			result = actionImpl.findVRApplicantProfileDetail(user, serviceContext, params);
			if (result != null && result.length() > 0) {
				return Response.status(200).entity(result.toJSONString()).build();
			} else {
				return Response.status(404).entity(VRRestUtil.errorMessage("Not found")).build();
			}

		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity(VRRestUtil.errorMessage("Can't get vrappicantprofile")).build();
		}
	}

	@Override
	public Response updateVRApplicantProfile(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRApplicantProfileApiModel model) {

		try {

			VRApplicantProfile object = (VRApplicantProfile) VRRestUtil.mappingModel(model,
					new VRApplicantProfileImpl());

			VRApplicantProfileActionImpl actionImpl = new VRApplicantProfileActionImpl();

			_log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> object " + JSONFactoryUtil.looseSerializeDeep(object));

			JSONObject result = actionImpl.updateVRApplicantProfile(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {

			_log.error(e);

			return Response.status(500).entity(VRRestUtil.errorMessage("server internal error!")).build();
		}

	}

	@Override
	public Response createVRApplicantProfile(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, VRApplicantProfileApiModel model) {

		try {

			VRApplicantProfile object = (VRApplicantProfile) VRRestUtil.mappingModel(model,
					new VRApplicantProfileImpl());

			VRApplicantProfileAction action = new VRApplicantProfileActionImpl();

			JSONObject result = action.createVRApplicantProfile(object);

			return Response.status(result.getInt("status")).entity(result.getString("content")).build();

		} catch (Exception e) {
			_log.error(e);

			return Response.status(HttpsURLConnection.HTTP_INTERNAL_ERROR).build();
		}

	}

}
