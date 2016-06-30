package ddb.smartcenter.gateway.input;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "终端信息上报请求参数")  
@JsonSerialize
@XmlRootElement
public class DeviceInfoParam {
	
	@ApiModelProperty(value = "用户手机号", required = true) 
	private int phone;
	@ApiModelProperty(value = "网关Mac", required = true)
	private String gateWayMac;
	@ApiModelProperty(value = "终端信息列表", required = true) 
	private List<Bind_Mapping2> devices;
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getGateWayMac() {
		return gateWayMac;
	}
	public void setGateWayMac(String gateWayMac) {
		this.gateWayMac = gateWayMac;
	}
	public List<Bind_Mapping2> getDevices() {
		return devices;
	}
	public void setDevices(List<Bind_Mapping2> devices) {
		this.devices = devices;
	}

}