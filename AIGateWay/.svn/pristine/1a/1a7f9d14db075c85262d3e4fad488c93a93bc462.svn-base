package ddb.smartcenter.gateway.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import ddb.smartcenter.gateway.input.Bind_Mapping2;
import kkd.common.dao.dbuitl.JDBC.DbHelper;

public class Bind_Mapping2Dao {

	public boolean insertTerminals(DbHelper dh,List<Bind_Mapping2> bm2) throws SQLException{
		
		StringBuilder sb=new StringBuilder();
		sb.append("insert into GateAway_Bind_Mapping2(DeviceName,DeviceNickName,DeviceMact,BindDate) values");
		for(int i=0;i<bm2.size();i++){
			if(i==bm2.size()-1){
				sb.append("("+bm2.get(i).getDeviceName()+","+bm2.get(i).getDeviceNickName()+
						","+bm2.get(i).getDeviceMac()+","+new Date()+")");
			}else{
				sb.append("("+bm2.get(i).getDeviceName()+","+bm2.get(i).getDeviceNickName()+
						","+bm2.get(i).getDeviceMac()+","+new Date()+"),");
			}
		}
		
		int row=dh.executeUpdate(sb.toString(), null);
		
		return row > 0 ? true :false; 
	}
}
