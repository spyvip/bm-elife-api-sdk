package com.qianmi.open.api.request;

import java.util.Map;

import com.qianmi.open.api.QianmiRequest;
import com.qianmi.open.api.tool.util.QianmiHashMap;
import com.qianmi.open.api.response.LogisticsCodesGetResponse;
import com.qianmi.open.api.ApiRuleException;

/**
 * API: qianmi.elife.logistics.codes.get request
 *
 * @author auto
 * @since 1.0
 */
public class LogisticsCodesGetRequest implements QianmiRequest<LogisticsCodesGetResponse> {

    private Map<String, String> headerMap = new QianmiHashMap();
	private QianmiHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

    public Long getTimestamp() {
    	return this.timestamp;
    }
    public void setTimestamp(Long timestamp) {
    	this.timestamp = timestamp;
    }

	public String getApiMethodName() {
		return "qianmi.elife.logistics.codes.get";
	}

	public Map<String, String> getTextParams() {
		QianmiHashMap txtParams = new QianmiHashMap();
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new QianmiHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<LogisticsCodesGetResponse> getResponseClass() {
		return LogisticsCodesGetResponse.class;
	}

	public void check() throws ApiRuleException {
    }

	public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}