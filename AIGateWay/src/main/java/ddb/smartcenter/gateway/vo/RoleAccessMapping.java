package ddb.smartcenter.gateway.vo;

/**
 * 用户权限映射表
 * @author Win7
 *
 */
public class RoleAccessMapping {

	private int ID;
	private String RoleCode;
	private String RoleName;
	private String desc;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getRoleCode() {
		return RoleCode;
	}
	public void setRoleCode(String roleCode) {
		RoleCode = roleCode;
	}
	public String getRoleName() {
		return RoleName;
	}
	public void setRoleName(String roleName) {
		RoleName = roleName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
