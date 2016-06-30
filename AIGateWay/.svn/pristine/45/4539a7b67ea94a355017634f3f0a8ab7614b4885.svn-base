package ddb.smartcenter.gateway.out;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import ddb.smartcenter.gateway.ReturnMsg;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "响应消息2")  
@JsonSerialize
@XmlRootElement
public class GateWayGetByUserRM extends ReturnMsg {

	@ApiModelProperty(value = "云平台CODE", required = true) 
	private String platCode;
	@ApiModelProperty(value = "云平台名称", required = true) 
	private String platName;
	@ApiModelProperty(value = "云平台地址", required = true) 
	private String platAddr;
	@ApiModelProperty(value = "云平台端口", required = true) 
	private String platPort;
	@ApiModelProperty(value = "网关列表", required = true) 
	private List<GateWayList> gateWays;
	
	public GateWayGetByUserRM(String errCode, String errMsg) {
		super(errCode, errMsg);
	}
	
	public GateWayGetByUserRM(String errCode, String errMsg,String platCode,String platName,String platAddr,
			String platPort,List<GateWayList> gateWays) {
		super(errCode, errMsg);
		this.platCode=platCode;
		this.platName=platName;
		this.platAddr=platAddr;
		this.platPort=platPort;
		this.gateWays=gateWays;
	}

	public String getPlatCode() {
		return platCode;
	}

	public void setPlatCode(String platCode) {
		this.platCode = platCode;
	}

	public String getPlatName() {
		return platName;
	}

	public void setPlatName(String platName) {
		this.platName = platName;
	}

	public String getPlatAddr() {
		return platAddr;
	}

	public void setPlatAddr(String platAddr) {
		this.platAddr = platAddr;
	}

	public String getPlatPort() {
		return platPort;
	}

	public void setPlatPort(String platPort) {
		this.platPort = platPort;
	}

	public List<GateWayList> getGateWays() {
		return gateWays;
	}

	public void setGateWays(List<GateWayList> gateWays) {
		this.gateWays = gateWays;
	}	
	
}
