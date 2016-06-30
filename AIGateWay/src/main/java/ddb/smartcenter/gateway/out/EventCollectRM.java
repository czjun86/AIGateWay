package ddb.smartcenter.gateway.out;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 指令事件收集 
 * @author Win7
 *
 */
@ApiModel(value = "指令查询响应消息")  
@JsonSerialize
@XmlRootElement
public class EventCollectRM {
	
	private int ID;
	@ApiModelProperty(value = "网关模块", required = true) 
	private String Model;
	@ApiModelProperty(value = "指令名称", required = true) 
	private String EventName;
	@ApiModelProperty(value = "用户ID", required = true) 
	private String uId;
	@ApiModelProperty(value = "终端Mac", required = true) 
	private String deviceMac;
	@ApiModelProperty(value = "终端IMEI", required = true) 
	private String deviceIMEI;
	@ApiModelProperty(value = "网关Mac", required = true) 
	private String gateWayMac;
	@ApiModelProperty(value = "网关设备ID", required = true) 
	private String gateWayDeviceId;
	@ApiModelProperty(value = "请求内容", required = true) 
	private String reqCont;
	@ApiModelProperty(value = "操作时间", required = true) 
	private Date EventDate;
	@ApiModelProperty(value = "操作结果", required = true) 
	private int isSucc;
	@ApiModelProperty(value = "操作响应内容", required = true) 
	private String respCont;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getEventName() {
		return EventName;
	}
	public void setEventName(String eventName) {
		EventName = eventName;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	
	public String getDeviceIMEI() {
		return deviceIMEI;
	}
	public void setDeviceIMEI(String deviceIMEI) {
		this.deviceIMEI = deviceIMEI;
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
	public String getReqCont() {
		return reqCont;
	}
	public void setReqCont(String reqCont) {
		this.reqCont = reqCont;
	}
	public Date getEventDate() {
		return EventDate;
	}
	public void setEventDate(Date eventDate) {
		EventDate = eventDate;
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
	
	
	
}
