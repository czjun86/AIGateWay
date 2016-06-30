package ddb.smartcenter.gateway.input;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "绑定请求参数")  
@JsonSerialize
@XmlRootElement
public class GateWayBindParam {
	
	@ApiModelProperty(value = "网关Mac,唯一标识", required = true) 
	private String gateWayMac;
	@ApiModelProperty(value = "网关设备ID", required = true) 
	private String gateWayDeviceId;
	@ApiModelProperty(value = "绑定时终端MAC", required = true) 
	private String deviceMac;
	@ApiModelProperty(value = "用户手机号", required = true) 
	private String phone;

	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getDeviceMac() {
		return deviceMac;
	}
	public void setDeviceMac(String deviceMac) {
		this.deviceMac = deviceMac;
	}
}