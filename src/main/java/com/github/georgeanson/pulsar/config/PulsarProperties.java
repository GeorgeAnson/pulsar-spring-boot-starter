package com.github.georgeanson.pulsar.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author Anson <br>
 * Created on 2020/10/14 16:50<br>
 * 名称：PulsarProperties.java <br>
 * 描述：<br>
 */
@Component
@ConfigurationProperties(prefix = "spring.pulsar")
public class PulsarProperties {

	private String serviceUrl;
	private Integer ioThreads = 10;
	private Integer listenerThreads = 10;
	private boolean enableTcpNoDelay = false;
	private Integer keepAliveIntervalSec = 20;
	private Integer connectionTimeoutSec = 10;
	private Integer operationTimeoutSec = 15;
	private Integer startingBackoffIntervalMs = 100;
	private Integer maxBackoffIntervalSec = 10;
	private String consumerNameDelimiter = "";

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public Integer getIoThreads() {
		return ioThreads;
	}

	public void setIoThreads(Integer ioThreads) {
		this.ioThreads = ioThreads;
	}

	public Integer getListenerThreads() {
		return listenerThreads;
	}

	public void setListenerThreads(Integer listenerThreads) {
		this.listenerThreads = listenerThreads;
	}

	public boolean isEnableTcpNoDelay() {
		return enableTcpNoDelay;
	}

	public void setEnableTcpNoDelay(boolean enableTcpNoDelay) {
		this.enableTcpNoDelay = enableTcpNoDelay;
	}

	public Integer getKeepAliveIntervalSec() {
		return keepAliveIntervalSec;
	}

	public void setKeepAliveIntervalSec(Integer keepAliveIntervalSec) {
		this.keepAliveIntervalSec = keepAliveIntervalSec;
	}

	public Integer getConnectionTimeoutSec() {
		return connectionTimeoutSec;
	}

	public void setConnectionTimeoutSec(Integer connectionTimeoutSec) {
		this.connectionTimeoutSec = connectionTimeoutSec;
	}

	public Integer getOperationTimeoutSec() {
		return operationTimeoutSec;
	}

	public void setOperationTimeoutSec(Integer operationTimeoutSec) {
		this.operationTimeoutSec = operationTimeoutSec;
	}

	public Integer getStartingBackoffIntervalMs() {
		return startingBackoffIntervalMs;
	}

	public void setStartingBackoffIntervalMs(Integer startingBackoffIntervalMs) {
		this.startingBackoffIntervalMs = startingBackoffIntervalMs;
	}

	public Integer getMaxBackoffIntervalSec() {
		return maxBackoffIntervalSec;
	}

	public void setMaxBackoffIntervalSec(Integer maxBackoffIntervalSec) {
		this.maxBackoffIntervalSec = maxBackoffIntervalSec;
	}

	public String getConsumerNameDelimiter() {
		return consumerNameDelimiter;
	}

	public void setConsumerNameDelimiter(String consumerNameDelimiter) {
		this.consumerNameDelimiter = consumerNameDelimiter;
	}
}
