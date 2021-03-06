/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.dynamicdatamapping.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the d d m structure link local service. This utility wraps {@link com.liferay.portlet.dynamicdatamapping.service.impl.DDMStructureLinkLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDMStructureLinkLocalService
 * @see com.liferay.portlet.dynamicdatamapping.service.base.DDMStructureLinkLocalServiceBaseImpl
 * @see com.liferay.portlet.dynamicdatamapping.service.impl.DDMStructureLinkLocalServiceImpl
 * @generated
 */
public class DDMStructureLinkLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.dynamicdatamapping.service.impl.DDMStructureLinkLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the d d m structure link to the database. Also notifies the appropriate model listeners.
	*
	* @param ddmStructureLink the d d m structure link
	* @return the d d m structure link that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink addDDMStructureLink(
		com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink ddmStructureLink)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDDMStructureLink(ddmStructureLink);
	}

	/**
	* Creates a new d d m structure link with the primary key. Does not add the d d m structure link to the database.
	*
	* @param structureLinkId the primary key for the new d d m structure link
	* @return the new d d m structure link
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink createDDMStructureLink(
		long structureLinkId) {
		return getService().createDDMStructureLink(structureLinkId);
	}

	/**
	* Deletes the d d m structure link with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param structureLinkId the primary key of the d d m structure link
	* @return the d d m structure link that was removed
	* @throws PortalException if a d d m structure link with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink deleteDDMStructureLink(
		long structureLinkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDDMStructureLink(structureLinkId);
	}

	/**
	* Deletes the d d m structure link from the database. Also notifies the appropriate model listeners.
	*
	* @param ddmStructureLink the d d m structure link
	* @return the d d m structure link that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink deleteDDMStructureLink(
		com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink ddmStructureLink)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDDMStructureLink(ddmStructureLink);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink fetchDDMStructureLink(
		long structureLinkId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDDMStructureLink(structureLinkId);
	}

	/**
	* Returns the d d m structure link with the primary key.
	*
	* @param structureLinkId the primary key of the d d m structure link
	* @return the d d m structure link
	* @throws PortalException if a d d m structure link with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink getDDMStructureLink(
		long structureLinkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDDMStructureLink(structureLinkId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the d d m structure links.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of d d m structure links
	* @param end the upper bound of the range of d d m structure links (not inclusive)
	* @return the range of d d m structure links
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink> getDDMStructureLinks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDDMStructureLinks(start, end);
	}

	/**
	* Returns the number of d d m structure links.
	*
	* @return the number of d d m structure links
	* @throws SystemException if a system exception occurred
	*/
	public static int getDDMStructureLinksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDDMStructureLinksCount();
	}

	/**
	* Updates the d d m structure link in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ddmStructureLink the d d m structure link
	* @return the d d m structure link that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink updateDDMStructureLink(
		com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink ddmStructureLink)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDDMStructureLink(ddmStructureLink);
	}

	/**
	* Updates the d d m structure link in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ddmStructureLink the d d m structure link
	* @param merge whether to merge the d d m structure link with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the d d m structure link that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink updateDDMStructureLink(
		com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink ddmStructureLink,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDDMStructureLink(ddmStructureLink, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink addStructureLink(
		long classNameId, long classPK, long structureId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addStructureLink(classNameId, classPK, structureId,
			serviceContext);
	}

	public static void deleteClassStructureLink(long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteClassStructureLink(classPK);
	}

	public static void deleteStructureLink(
		com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink structureLink)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteStructureLink(structureLink);
	}

	public static void deleteStructureLink(long structureLinkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteStructureLink(structureLinkId);
	}

	public static void deleteStructureStructureLinks(long structureId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteStructureStructureLinks(structureId);
	}

	public static com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink getClassStructureLink(
		long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getClassStructureLink(classPK);
	}

	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink> getClassStructureLinks(
		long classNameId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getClassStructureLinks(classNameId);
	}

	public static com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink getStructureLink(
		long structureLinkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getStructureLink(structureLinkId);
	}

	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink> getStructureLinks(
		long structureId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStructureLinks(structureId, start, end);
	}

	public static com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink updateStructureLink(
		long structureLinkId, long classNameId, long classPK, long structureId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateStructureLink(structureLinkId, classNameId, classPK,
			structureId);
	}

	public static DDMStructureLinkLocalService getService() {
		if (_service == null) {
			_service = (DDMStructureLinkLocalService)PortalBeanLocatorUtil.locate(DDMStructureLinkLocalService.class.getName());

			ReferenceRegistry.registerReference(DDMStructureLinkLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DDMStructureLinkLocalService.class);
		}

		return _service;
	}

	public void setService(DDMStructureLinkLocalService service) {
		MethodCache.remove(DDMStructureLinkLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DDMStructureLinkLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DDMStructureLinkLocalService.class);
	}

	private static DDMStructureLinkLocalService _service;
}