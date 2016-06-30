package ddb.smartcenter.gateway.input;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "上报指令请求参数")  
@JsonSerialize
@XmlRootElement
public class ReqDataParam {
	
	@ApiModelProperty(value = "用户手机号", required = true) 
	private int phone;
	@ApiModelProperty(value = "操作模块", required = true)
	private String model;
	@ApiModelProperty(value = "指令名称", required = true)
	private String eventName;
	@ApiModelProperty(value = "终端Mac", required = true)
	private String deviceMac;
	@ApiModelProperty(value = "网关Mac", required = true)
	private String gateWayMac;
	@ApiModelProperty(value = "网关设备ID", required = true)
	private String gateWayDeviceId;
	@ApiModelProperty(value = "云平台CODE", required = true)
	private String platformCode;
	@ApiModelProperty(value = "操作结果，1：成功 0:失败", required = true)
	private int isSucc;
	@ApiModelProperty(value = "响应内容", required = true)
	private String respCont;
//	@ApiModelProperty(value = "手机IMEI,可空", required = true)
//	private String IMEI;
	
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getDeviceMac() {
		return deviceMac;
	}
	public void setDeviceMac(String deviceMac) {
		this.deviceMac = deviceMac;
	}
	
	public String getGateWayMac() {
		return gateWayMac;
	}
	public void setGateWayMac(String gateWayMac) {
		this.gateWayMac = gateWayMac;
	}
	public String getGateWayDeviceId() {
		return gateWayDeviceId;
	}
	public void setGateWayDeviceId(String gateWayDeviceId) {
		this.gateWayDeviceId = gateWayDeviceId;
	}
	public String getPlatformCode() {
		return platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}
	public int getIsSucc() {
		return isSucc;
	}
	public void setIsSucc(int isSucc) {
		this.isSucc = isSucc;
	}
	public String getRespCont() {
		return respCont;
	}
	public void setRespCont(String respCont) {
		this.respCont = respCont;
	}
//	public String getIMEI() {
//		return IMEI;
//	}
//	public void setIMEI(String iMEI) {
//		IMEI = iMEI;
//	}
	
	
	
}