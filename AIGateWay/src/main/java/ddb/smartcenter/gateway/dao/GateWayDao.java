package ddb.smartcenter.gateway.dao;

import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.RowSet;

import ddb.smartcenter.gateway.out.GateWayList;
import ddb.smartcenter.gateway.out.GateWayUsers;
import ddb.smartcenter.gateway.vo.Bind_Mapping;
import ddb.smartcenter.gateway.vo.GateWay;
import ddb.smartcenter.gateway.vo.PlatFormInfo;
import kkd.common.dao.dbuitl.JDBC.DbHelper;
import kkd.common.dao.dbuitl.SqlParameter;



/**
 * 网关相关数据操作类
 * @author Win7
 *
 */
public class GateWayDao {

	/**
	 * 查询用户绑定的网关列表
	 * @param dh
	 * @param uId
	 * @return
	 * @throws SQLException
	 */
	public List<GateWayList> queryUserBindGateAway(DbHelper dh,int uId) throws SQLException{
		List<GateWayList> list=new ArrayList<GateWayList>();
		GateWayList ga=null;
		
		StringBuilder sb=new StringBuilder();
		sb.append("SELECT g.Mac,g.`Name`,g.NickName,g.DeviceId,bm.BindDate,ua.AccCode,ua.AccName FROM `GateAway_Bind_Mapping` bm LEFT JOIN GateAway  g ON g.Mac=bm.GateAwayMac");
		sb.append(" LEFT JOIN User_Role r ON r.RoleCode=bm.UserRole");
		sb.append(" LEFT JOIN Role_Access_Mapping am ON am.RoleCode=r.RoleCode");
		sb.append(" LEFT JOIN User_Access ua ON ua.AccCode=r.RoleName ");
		sb.append(" where bm.Uid=?");
		
		List<SqlParameter> param=new ArrayList<SqlParameter>();
		param.add(new SqlParameter(Types.INTEGER, uId));
		
		RowSet rs=dh.executeQuery(sb.toString(), param);
		while(rs.next()){
			ga=new GateWayList();
			ga.setMac(rs.getString("Mac"));
			ga.setName(rs.getString("Name"));
			ga.setNickName(rs.getString("NickName"));
			ga.setDeviceId(rs.getString("DeviceId"));
			ga.setBindDate(rs.getDate("BindDate"));
			ga.setRoleCode(rs.getString("AccCode"));
			ga.setModule(rs.getString("AccName"));
			list.add(ga);
		}
		return list;
	}

	
	/**
	 * 根据区域查询用户绑定网关的云平台信息
	 * @param dh
	 * @param platCode
	 * @param district
	 * @return
	 * @throws SQLException
	 */
	public PlatFormInfo queryPlatBydist(DbHelper dh,String district) throws SQLException{
		PlatFormInfo plat=null;
		String sql="SELECT * from PlatformInfo where District=?";
		
		List<SqlParameter> param=new ArrayList<SqlParameter>();
		param.add(new SqlParameter(Types.VARCHAR, district));
		
		RowSet rs=dh.executeQuery(sql, param);
		if(rs.next()){
			plat=new PlatFormInfo();
			plat.setID(rs.getInt("ID"));
			plat.setPlatCode(rs.getString("PlatCode"));
			plat.setPlatName(rs.getString("PlatName"));
			plat.setPlatAddr(rs.getString("PlatAddr"));
			plat.setPlatPort(rs.getString("PlatPort"));
			plat.setDistrict(rs.getString("District"));
		}
		return plat;
	}
	
	/**
	 * 插入用户绑定网关数据
	 * @param dh
	 * @param ga
	 * @return
	 * @throws SQLException
	 */
	public boolean insertGateAway(DbHelper dh,GateWay ga) throws SQLException{
		String sql="INSERT into GateAway(Mac,DeviceId,) VALUES(?,?)";
		List<SqlParameter> param=new ArrayList<SqlParameter>();
		param.add(new SqlParameter(Types.VARCHAR, ga.getMac()));
		param.add(new SqlParameter(Types.VARCHAR, ga.getDeviceId()));
		int row=dh.executeUpdate(sql, param);
		
		return row > 0 ? true : false;
	}
	
	/**
	 * 插入用户绑定网关关系数据
	 * @param dh
	 * @param bm
	 * @return
	 * @throws SQLException
	 */
	public boolean insertGateAwayBindMapping(DbHelper dh,Bind_Mapping bm) throws SQLException{
		String sql="insert into GateAway_Bind_Mapping(GateAwayMac,BindDate,BindStatus,DeviceName,DeviceMact,Uid,Phone,UserRole) VALUES(?,?,?,?,?,?,?,?)";
		List<SqlParameter> param=new ArrayList<SqlParameter>();
		param.add(new SqlParameter(Types.VARCHAR, bm.getGateWayMac()));
		param.add(new SqlParameter(Types.VARCHAR, new Date()));
		param.add(new SqlParameter(Types.VARCHAR, bm.getBindStatus()));
		param.add(new SqlParameter(Types.VARCHAR, bm.getDeviceName()));
		param.add(new SqlParameter(Types.VARCHAR, bm.getDeviceMac()));
		param.add(new SqlParameter(Types.VARCHAR, bm.getuId()));
		param.add(new SqlParameter(Types.VARCHAR, bm.getPhone()));
		param.add(new SqlParameter(Types.VARCHAR, bm.getUserRole()));
		
		int row=dh.executeUpdate(sql, param);
		
		return row > 0 ? true : false;
	}
	
	/**
	 * 更新用户绑定网关角色
	 * @param dh
	 * @param role
	 * @param uId
	 * @param gateAwayMac
	 * @return
	 * @throws SQLException
	 */
	public boolean updateBindGateAwayRole(DbHelper dh,String role,int uId,String gateAwayMac) throws SQLException{
		String sql="UPDATE GateAway_Bind_Mapping SET UserRole=? where Uid =? and GateAwayMac=?";
		List<SqlParameter> param=new ArrayList<SqlParameter>();
		param.add(new SqlParameter(Types.VARCHAR, role));
		param.add(new SqlParameter(Types.INTEGER, uId));
		param.add(new SqlParameter(Types.VARCHAR, gateAwayMac));
		
		int row=dh.executeUpdate(sql, param);
		
		return row > 0 ? true : false;
	}
	
	/**
	 * 查询网关绑定的用户列表
	 * @param dh
	 * @param gateAwayMac
	 * @return
	 * @throws SQLException
	 */
	public List<GateWayUsers> queryGateAwayUsers(DbHelper dh,String gateAwayMac) throws SQLException{
		List<GateWayUsers> list=new ArrayList<GateWayUsers>();
		GateWayUsers gau=null;
		
		String sql="SELECT bm.Uid,bm.Phone,bm.UserRole,bm.BindDate,bm.DeviceName,bm.GateAwayMac from GateAway_Bind_Mapping bm where bm.GateAwayMac=?";
		List<SqlParameter> param=new ArrayList<SqlParameter>();
		param.add(new SqlParameter(Types.VARCHAR, gateAwayMac));
		
		RowSet rs=dh.executeQuery(sql, param);
		while(rs.next()){
			gau=new GateWayUsers();
			gau.setuId(rs.getInt("Uid"));
			gau.setPhone(rs.getInt("Phone"));
			gau.setBindDate(rs.getDate("BindDate"));
			gau.setRoleCode(rs.getString("UserRole"));
			gau.setMac(rs.getString("GateAwayMac"));
			gau.setDeviceName(rs.getString("DeviceName"));
			list.add(gau);
		}
		return list;
	}
	
	/**
	 * 根据mac查询网关是否第一次绑定
	 * @param dh
	 * @param gateWayMac
	 * @return
	 * @throws SQLException 
	 */
	public boolean quyerUserIsBind(DbHelper dh,String gateWayMac) throws SQLException{
		String sql="SELECT count(GateAwayMac) 'count' FROM `GateAway_Bind_Mapping` where GateAwayMac=?";
		List<SqlParameter> param=new ArrayList<SqlParameter>();
		param.add(new SqlParameter(Types.VARCHAR, gateWayMac));
		RowSet rs=dh.executeQuery(sql, param);
		int count=0;
		if(rs.next()){
			count=rs.getInt("count");
		}
		return count >0 ? false : true;
	}
	
	/**
	 * 根据设备id查询当前网关用户的权限角色
	 * @param dh
	 * @param devId
	 * @param gateWayMac
	 * @return
	 * @throws SQLException
	 */
	public String queryUserRole(DbHelper dh,String devId,String gateWayMac) throws SQLException{
		String sql="SELECT m.UserRole FROM `GateAway` g LEFT JOIN GateAway_Bind_Mapping m ON m.GateAwayMac=g.Mac"
				+" where g.DeviceId=? and GateAwayMac=?";
		List<SqlParameter> param=new ArrayList<SqlParameter>();
		param.add(new SqlParameter(Types.VARCHAR, devId));
		param.add(new SqlParameter(Types.VARCHAR, gateWayMac));
		RowSet rs=dh.executeQuery(sql, param);
		String userRole="";
		if(rs.next()){
			userRole=rs.getString("UserRole");
		}
		return userRole;
	}
}
