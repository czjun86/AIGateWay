package ddb.smartcenter.gateway.input;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "获取token请求参数")  
@JsonSerialize
@XmlRootElement
public class AccessTokenParam {
	
	@ApiModelProperty(value = "用户手机号", required = true) 
	private String phone;

//	@ApiModelProperty(value = "手机IMEI,可空", required = true)
//	private String IMEI;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

//	public String getIMEI() {
//		return IMEI;
//	}
//
//	public void setIMEI(String iMEI) {
//		IMEI = iMEI;
//	}
	
}