package ddb.smartcenter.gateway.dao;

import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.RowSet;

import ddb.smartcenter.gateway.out.EventCollectRM;
import ddb.smartcenter.gateway.vo.EventCollect;
import kkd.common.dao.dbuitl.SqlParameter;
import kkd.common.dao.dbuitl.JDBC.DbHelper;

public class EventCollectDao {

	
	public boolean insertEvent(DbHelper dh,EventCollect ec) throws SQLException{
		String sql="INSERT INTO GateAway_Event_Collect(Model,EventName,Uid,DeviceMact,DeviceIMEI,GateAwayMac,GateAwayDeviceId,"
				+ "reqCont,EventDate,isSucc,respCont) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		
		List<SqlParameter> param=new ArrayList<SqlParameter>();
		param.add(new SqlParameter(Types.VARCHAR, ec.getModel()));
		param.add(new SqlParameter(Types.VARCHAR, ec.getEventName()));
		param.add(new SqlParameter(Types.VARCHAR, ec.getuId()));
		param.add(new SqlParameter(Types.VARCHAR, ec.getDeviceMac()));
		param.add(new SqlParameter(Types.VARCHAR, ec.getDeviceIMEI()));
		param.add(new SqlParameter(Types.VARCHAR, ec.getGateWayMac()));
		param.add(new SqlParameter(Types.VARCHAR, ec.getGateWayDeviceId()));
		param.add(new SqlParameter(Types.VARCHAR, ec.getReqCont()));
		param.add(new SqlParameter(Types.VARCHAR, new Date()));
		param.add(new SqlParameter(Types.VARCHAR, ec.getIsSucc()));
		param.add(new SqlParameter(Types.VARCHAR,ec.getRespCont()));
		
		int row=dh.executeUpdate(sql, param);
		
		return row > 0 ? true :false;
	}
	
	/**
	 * 查询指令
	 * @param dh
	 * @param uId
	 * @return
	 * @throws SQLException
	 */
	public List<EventCollectRM> queryEvent(DbHelper dh,String uId) throws SQLException{
		List<EventCollectRM> list=new ArrayList<EventCollectRM>();
		EventCollectRM erm=null;
		String sql="SELECT * FROM `GateAway_Event_Collect` where Uid=?";
		List<SqlParameter> param=new ArrayList<SqlParameter>();
		param.add(new SqlParameter(Types.VARCHAR, uId));
		
		RowSet rs=dh.executeQuery(sql, param);
		while(rs.next()){
			erm=new EventCollectRM();
			erm.setID(rs.getInt("ID"));
			erm.setModel(rs.getString("Model"));
			erm.setEventName(rs.getString("EventName"));
			erm.setuId(rs.getString("Uid"));
			erm.setDeviceMac(rs.getString("DeviceMact"));
			erm.setDeviceIMEI(rs.getString("DeviceIMEI"));
			erm.setGateWayMac(rs.getString("GateAwayMac"));
			erm.setGateWayDeviceId(rs.getString("GateAwayDeviceId"));
			erm.setReqCont(rs.getString("reqCont"));
			erm.setEventDate(rs.getDate("EventDate"));
			erm.setIsSucc(rs.getInt("isSucc"));
			erm.setRespCont(rs.getString("respCont"));
			list.add(erm);
		}
		return list;
	}
	
}