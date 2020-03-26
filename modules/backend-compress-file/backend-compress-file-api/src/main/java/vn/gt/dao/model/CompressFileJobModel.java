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

package vn.gt.dao.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CompressFileJob service. Represents a row in the &quot;compressfile_CompressFileJob&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gt.dao.model.impl.CompressFileJobModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gt.dao.model.impl.CompressFileJobImpl}.
 * </p>
 *
 * @author huymq
 * @see CompressFileJob
 * @see vn.gt.dao.model.impl.CompressFileJobImpl
 * @see vn.gt.dao.model.impl.CompressFileJobModelImpl
 * @generated
 */
@ProviderType
public interface CompressFileJobModel extends BaseModel<CompressFileJob> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a compress file job model instance should use the {@link CompressFileJob} interface instead.
	 */

	/**
	 * Returns the primary key of this compress file job.
	 *
	 * @return the primary key of this compress file job
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this compress file job.
	 *
	 * @param primaryKey the primary key of this compress file job
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this compress file job.
	 *
	 * @return the ID of this compress file job
	 */
	public long getId();

	/**
	 * Sets the ID of this compress file job.
	 *
	 * @param id the ID of this compress file job
	 */
	public void setId(long id);

	/**
	 * Returns the create date of this compress file job.
	 *
	 * @return the create date of this compress file job
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this compress file job.
	 *
	 * @param createDate the create date of this compress file job
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this compress file job.
	 *
	 * @return the modified date of this compress file job
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this compress file job.
	 *
	 * @param modifiedDate the modified date of this compress file job
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the list ho so ID of this compress file job.
	 *
	 * @return the list ho so ID of this compress file job
	 */
	@AutoEscape
	public String getListHoSoId();

	/**
	 * Sets the list ho so ID of this compress file job.
	 *
	 * @param listHoSoId the list ho so ID of this compress file job
	 */
	public void setListHoSoId(String listHoSoId);

	/**
	 * Returns the lasted ho so ID of this compress file job.
	 *
	 * @return the lasted ho so ID of this compress file job
	 */
	public long getLastedHoSoId();

	/**
	 * Sets the lasted ho so ID of this compress file job.
	 *
	 * @param lastedHoSoId the lasted ho so ID of this compress file job
	 */
	public void setLastedHoSoId(long lastedHoSoId);

	/**
	 * Returns the status of this compress file job.
	 *
	 * @return the status of this compress file job
	 */
	public boolean getStatus();

	/**
	 * Returns <code>true</code> if this compress file job is status.
	 *
	 * @return <code>true</code> if this compress file job is status; <code>false</code> otherwise
	 */
	public boolean isStatus();

	/**
	 * Sets whether this compress file job is status.
	 *
	 * @param status the status of this compress file job
	 */
	public void setStatus(boolean status);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(vn.gt.dao.model.CompressFileJob compressFileJob);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.gt.dao.model.CompressFileJob> toCacheModel();

	@Override
	public vn.gt.dao.model.CompressFileJob toEscapedModel();

	@Override
	public vn.gt.dao.model.CompressFileJob toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}