package ddb.smartcenter.gateway.vo;

import java.util.Date;

/**
 * 网关链接关系
 * @author Win7
 *
 */
public class Bind_Mapping2 {

	private int ID;
	private String name;
	private String deviceName;
	private String deviceNickName;
	private String deviceMact;
	private Date bindDate;
	private int ConnTimes;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceNickName() {
		return deviceNickName;
	}
	public void setDeviceNickName(String deviceNickName) {
		this.deviceNickName = deviceNickName;
	}
	public String getDeviceMact() {
		return deviceMact;
	}
	public void setDeviceMact(String deviceMact) {
		this.deviceMact = deviceMact;
	}
	public Date getBindDate() {
		return bindDate;
	}
	public void setBindDate(Date bindDate) {
		this.bindDate = bindDate;
	}
	public int getConnTimes() {
		return ConnTimes;
	}
	public void setConnTimes(int connTimes) {
		ConnTimes = connTimes;
	}
	
	
}
