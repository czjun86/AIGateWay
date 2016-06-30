package ddb.smartcenter.gateway.out;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import ddb.smartcenter.gateway.ReturnMsg;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "获取token响应消息")  
@JsonSerialize
@XmlRootElement
public class AccessTokenRM extends ReturnMsg {

	@ApiModelProperty(value = "云平台token", required = true) 
	private String token;
	
	public AccessTokenRM(String errCode, String errMsg,String token) {
		super(errCode, errMsg);
		this.token=token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
