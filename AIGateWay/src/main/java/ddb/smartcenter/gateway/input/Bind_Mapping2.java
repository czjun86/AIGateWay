package ddb.smartcenter.gateway.input;

import io.swagger.annotations.ApiModelProperty;

/**
 * 网关链接关系
 * @author Win7
 *
 */
public class Bind_Mapping2 {
//
//	private int ID;
//	private String name;
	
	@ApiModelProperty(value = "终端名称", required = true) 
	private String deviceName;
	@ApiModelProperty(value = "终端昵称", required = true) 
	private String deviceNickName;
	@ApiModelProperty(value = "终端Mac", required = true) 
	private String deviceMac;
	
//	private Date bindDate;
//	private int ConnTimes;
//	public int getID() {
//		return ID;
//	}
//	public void setID(int iD) {
//		ID = iD;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
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
	public String getDeviceMac() {
		return deviceMac;
	}
	public void setDeviceMac(String deviceMac) {
		this.deviceMac = deviceMac;
	}
//	public Date getBindDate() {
//		return bindDate;
//	}
//	public void setBindDate(Date bindDate) {
//		this.bindDate = bindDate;
//	}
//	public int getConnTimes() {
//		return ConnTimes;
//	}
//	public void setConnTimes(int connTimes) {
//		ConnTimes = connTimes;
//	}
	
	
}
