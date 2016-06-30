package ddb.smartcenter.gateway.vo;

import java.util.Date;

/**
 * 指令事件收集 
 * @author Win7
 *
 */
public class EventCollect {
	
	private int ID;
	private String Model;
	private String EventName;
	private int uId;
	private String deviceMac;
	private String deviceIMEI;
	private String gateWayMac;
	private String gateWayDeviceId;
	private String reqCont;
	private Date EventDate;
	private int isSucc;
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
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
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
