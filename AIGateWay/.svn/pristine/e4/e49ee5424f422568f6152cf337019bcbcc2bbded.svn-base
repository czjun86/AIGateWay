package ddb.smartcenter.gateway.input;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "获取用户列表请求参数")  
@JsonSerialize
@XmlRootElement
public class UserGetParam {
	
	@ApiModelProperty(value = "网关Mac,唯一标识", required = true) 
	private String gateWayMac;
	
	@ApiModelProperty(value = "用户手机号", required = true) 
	private String phone;

	public String getGateWayMac() {
		return gateWayMac;
	}

	public void setGateWayMac(String gateWayMac) {
		this.gateWayMac = gateWayMac;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}