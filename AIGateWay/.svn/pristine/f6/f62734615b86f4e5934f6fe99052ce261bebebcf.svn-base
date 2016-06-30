package ddb.smartcenter.gateway.out;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import ddb.smartcenter.gateway.ReturnMsg;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户列表响应消息")  
@JsonSerialize
@XmlRootElement
public class GetUserByGateWayRM extends ReturnMsg {

	@ApiModelProperty(value = "用户响应数据", required = true) 
	private List<GateWayUsers> users;
	
	public GetUserByGateWayRM(String errCode, String errMsg) {
		super(errCode, errMsg);
	}
	
	public GetUserByGateWayRM(String errCode, String errMsg,List<GateWayUsers> users) {
		super(errCode, errMsg);
		this.users=users;
	}

	public List<GateWayUsers> getUsers() {
		return users;
	}

	public void setUsers(List<GateWayUsers> users) {
		this.users = users;
	}

	
	
}
