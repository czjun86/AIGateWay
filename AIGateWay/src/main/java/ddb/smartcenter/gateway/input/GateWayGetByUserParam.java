package ddb.smartcenter.gateway.input;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "获取网关列表请求参数")  
@JsonSerialize
@XmlRootElement
public class GateWayGetByUserParam {
	
	@ApiModelProperty(value = "用户手机号", required = true) 
	private String phone;
	
//	@ApiModelProperty(value = "用户区域", required = true)
//	private String district;
	
	
//	public String getDistrict() {
//		return district;
//	}
//	public void setDistrict(String district) {
//		this.district = district;
//	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}