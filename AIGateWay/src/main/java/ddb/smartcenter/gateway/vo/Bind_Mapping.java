package ddb.smartcenter.gateway.vo;

import java.util.Date;

/**
 * 网关绑定关系
 * @author Win7
 *
 */
public class Bind_Mapping {
	
	private int	ID;
	private String gateWayMac;
	private Date bindDate;
	private int	bindStatus;
	private String deviceName;
	private String deviceMac;
	private int uId;
	private int phone;
	private String userRole;
	private String platCode;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getGateWayMac() {
		return gateWayMac;
	}
	public void setGateWayMac(String gateWayMac) {
		this.gateWayMac = gateWayMac;
	}
	public Date getBindDate() {
		return bindDate;
	}
	public void setBindDate(Date bindDate) {
		this.bindDate = bindDate;
	}
	public int getBindStatus() {
		return bindStatus;
	}
	public void setBindStatus(int bindStatus) {
		this.bindStatus = bindStatus;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceMac() {
		return deviceMac;
	}
	public void setDeviceMac(String deviceMac) {
		this.deviceMac = deviceMac;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getPlatCode() {
		return platCode;
	}
	public void setPlatCode(String platCode) {
		this.platCode = platCode;
	}
}
