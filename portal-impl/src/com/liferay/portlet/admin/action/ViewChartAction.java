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

package com.liferay.portlet.admin.action;

import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.struts.ActionConstants;
import com.liferay.portal.struts.PortletAction;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.util.WebKeys;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;

import java.io.OutputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.DialShape;
import org.jfree.chart.plot.MeterInterval;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.ValueDataset;

/**
 * @author Matthew Kong
 */
public class ViewChartAction extends PortletAction {

	@Override
	public void processAction(
			ActionMapping mapping, ActionForm form, PortletConfig portletConfig,
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		String type = ParamUtil.getString(actionRequest, "type", "max");
		long maxMemory = ParamUtil.getLong(actionRequest, "maxMemory");
		long totalMemory = ParamUtil.getLong(actionRequest, "totalMemory");
		long usedMemory = ParamUtil.getLong(actionRequest, "usedMemory");

		ValueDataset valueDataset = null;

		StringBundler sb = new StringBundler(5);

		sb.append(themeDisplay.translate("used-memory"));
		sb.append(StringPool.SPACE);
		sb.append(StringPool.FORWARD_SLASH);
		sb.append(StringPool.SPACE);

		if (type.equals("total")) {
			valueDataset = new DefaultValueDataset(
				(usedMemory * 100) / totalMemory);

			sb.append(themeDisplay.translate("total-memory"));
		}
		else {
			valueDataset = new DefaultValueDataset(
				(usedMemory * 100) / maxMemory);

			sb.append(themeDisplay.translate("maximum-memory"));
		}

		MeterPlot meterPlot = getMeterPlot(themeDisplay, valueDataset);

		JFreeChart jFreeChart = getJFreeChart(sb.toString(), meterPlot);

		HttpServletResponse response = PortalUtil.getHttpServletResponse(
			actionResponse);

		response.setContentType(ContentTypes.IMAGE_JPEG);

		OutputStream outputStream = response.getOutputStream();

		ChartUtilities.writeChartAsPNG(outputStream, jFreeChart, 280, 180);

		setForward(actionRequest, ActionConstants.COMMON_NULL);
	}

	protected JFreeChart getJFreeChart(String title, MeterPlot meterPlot) {
		JFreeChart jFreeChart = new JFreeChart(
			title, new Font(null, Font.PLAIN, 13), meterPlot, true);

		jFreeChart.removeLegend();
		jFreeChart.setBackgroundPaint(Color.white);

		return jFreeChart;
	}

	protected MeterPlot getMeterPlot(
		ThemeDisplay themeDisplay, ValueDataset valueDataset) {

		MeterPlot meterPlot = new MeterPlot(valueDataset);

		meterPlot.addInterval(
			new MeterInterval(
				themeDisplay.translate("normal"), new Range(0.0D, 75D),
				Color.lightGray, new BasicStroke(2.0F),
				new Color(0, 255, 0, 64)));

		meterPlot.addInterval(
			new MeterInterval(
				themeDisplay.translate("warning"), new Range(75D, 90D),
				Color.lightGray, new BasicStroke(2.0F),
				new Color(255, 255, 0, 64)));

		meterPlot.addInterval(
			new MeterInterval(
				themeDisplay.translate("critical"), new Range(90D, 100D),
				Color.lightGray, new BasicStroke(2.0F),
				new Color(255, 0, 0, 128)));

		meterPlot.setDialBackgroundPaint(Color.white);
		meterPlot.setDialShape(DialShape.PIE);
		meterPlot.setDialOutlinePaint(Color.gray);
		meterPlot.setTickLabelFont(new Font(null, Font.PLAIN, 10));
		meterPlot.setTickLabelPaint(Color.darkGray);
		meterPlot.setTickLabelsVisible(true);
		meterPlot.setTickPaint(Color.lightGray);
		meterPlot.setTickSize(5D);
		meterPlot.setMeterAngle(180);
		meterPlot.setNeedlePaint(Color.darkGray);
		meterPlot.setRange(new Range(0.0D, 100D));
		meterPlot.setValueFont(new Font(null, Font.PLAIN, 10));
		meterPlot.setValuePaint(Color.black);
		meterPlot.setUnits("%");

		return meterPlot;
	}

	@Override
	protected boolean isCheckMethodOnProcessAction() {
		return _CHECK_METHOD_ON_PROCESS_ACTION;
	}

	private static final boolean _CHECK_METHOD_ON_PROCESS_ACTION = false;

}