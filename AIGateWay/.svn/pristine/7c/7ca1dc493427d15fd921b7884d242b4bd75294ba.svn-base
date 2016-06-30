package ddb.smartcenter.gateway;


import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "响应消息")  
@JsonSerialize
@XmlRootElement
public class ReturnMsg {
	@ApiModelProperty(value = "错误编码,SUC：成功，ERR_XXX：失败，具体含义详见错误码表", required = true) 
	private String errCode;
	
	@ApiModelProperty(value = "错误描述，可以是中文", required = false) 
	private String errMsg;
	
//	@ApiModelProperty(value = "响应数据,errCode表示失败时，无效", required = false) 	
//	private UserInfo data;

	public String getErrCode() {
		return errCode;
	}


	public String getErrMsg() {
		return errMsg;
	}


//	public UserInfo getData() {
//		return data;
//	}

	
//	public ReturnMsg(String errCode, String errMsg,UserInfo userInfo) {
//
//        this.errCode = errCode;
//
//        this.errMsg = errMsg;
//        if (userInfo != null) this.data = userInfo;
//        else this.data = new UserInfo(28,"春哥11",new Date());
//        
//     }
//	
	public ReturnMsg(String errCode, String errMsg) {

        this.errCode = errCode;

        this.errMsg = errMsg;

     }

}