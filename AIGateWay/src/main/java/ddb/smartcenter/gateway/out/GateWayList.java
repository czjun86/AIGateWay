package ddb.smartcenter.gateway.out;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户绑定的网关实体扩展类
 * @author Win7
 *
 */
@ApiModel(value = "响应数据2")
public class GateWayList {
	
	@ApiModelProperty(value = "网关名称", required = true) 
	private String name;
	@ApiModelProperty(value = "网关昵称", required = true) 
	private String nickName;
	@ApiModelProperty(value = "网关Mac", required = true) 
	private String mac;
	@ApiModelProperty(value = "网关设备ID", required = true) 
	private String deviceId;
	@ApiModelProperty(value = "网关绑定时间", required = true) 
	private Date bindDate;
	@ApiModelProperty(value = "权限", required = true) 
	private String roleCode;
	@ApiModelProperty(value = "权限模块", required = true) 
	private String module;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public Date getBindDate() {
		return bindDate;
	}
	public void setBindDate(Date bindDate) {
		this.bindDate = bindDate;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
		
	
}
