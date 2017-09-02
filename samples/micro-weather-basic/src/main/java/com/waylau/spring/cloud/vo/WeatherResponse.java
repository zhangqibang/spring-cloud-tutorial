package com.waylau.spring.cloud.vo;

import java.io.Serializable;

/**
 * 返回消息对象.
 * 
 * @since 1.0.0 2017年9月2日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class WeatherResponse implements Serializable {
	 
    private static final long serialVersionUID = 1L;
    
    private WeatherData data; // 消息数据
    private String status; // 消息状态
    private String desc; // 消息描述
    
	public WeatherData getData() {
		return data;
	}
	public void setData(WeatherData data) {
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
    
}