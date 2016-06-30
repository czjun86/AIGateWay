package ddb.smartcenter.gateway.input;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "编辑角色请求参数")  
@JsonSerialize
@XmlRootElement
public class RoleEditParam {
	
	@ApiModelProperty(value = "网关Mac,唯一标识", required = true) 
	private String gateWayMac;
	
	@ApiModelProperty(value = "用户手机号", required = true) 
	private String phone;
	
	@ApiModelProperty(value = "设置后角色", required = true) 
	private String setAs;


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

	public String getSetAs() {
		return setAs;
	}

	public void setSetAs(String setAs) {
		this.setAs = setAs;
	}
	
	
}