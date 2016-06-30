package ddb.smartcenter.gateway.bo;

import java.util.List;

import ddb.smartcenter.gateway.dao.GateWayDao;
import ddb.smartcenter.gateway.out.GateWayList;
import ddb.smartcenter.gateway.out.GateWayUsers;
import ddb.smartcenter.gateway.vo.Bind_Mapping;
import ddb.smartcenter.gateway.vo.GateWay;
import ddb.smartcenter.gateway.vo.PlatFormInfo;
import kkd.common.dao.dbuitl.JDBC;
import kkd.common.dao.dbuitl.JDBC.DbHelper;
import kkd.common.dao.dbuitl.JDBC.MyBack;
import kkd.common.util.StringUtil;

public class GateWayBo {

	JDBC jdbc=new JDBC();
	GateWayDao dao=new GateWayDao();
	
	@SuppressWarnings("unchecked")
	public List<GateWayList> queryGateAways(final int uId){
		return(List<GateWayList>)jdbc.execute(new MyBack() {
			
			@Override
			public List<GateWayList> exe(DbHelper dh) throws Exception {
				return dao.queryUserBindGateAway(dh, uId);
			}
		});
	}
	
	public PlatFormInfo queryPlatInfo(final String district){
		if(StringUtil.isEmpty(district)) return null;
		return (PlatFormInfo) jdbc.execute(new MyBack() {
			
			@Override
			public PlatFormInfo exe(DbHelper dh) throws Exception {
				return dao.queryPlatBydist(dh,district);
			}
		});
	}
	
	public boolean bindGateAway(final GateWay ga){
		return (Boolean) jdbc.execute(new MyBack() {
			
			@Override
			public Boolean exe(DbHelper dh) throws Exception {

				return dao.insertGateAway(dh, ga);
			}
		});
	}
	
	public boolean bindGateAwayMapping(final Bind_Mapping bm){
		return (Boolean) jdbc.execute(new MyBack() {
			
			@Override
			public Object exe(DbHelper dh) throws Exception {
				return dao.insertGateAwayBindMapping(dh, bm);
			}
		});
	}
	
	public boolean editGateAwayRole(final String role,final int uId,final String gateAwayMac){
		return (Boolean) jdbc.execute(new MyBack() {
			
			@Override
			public Object exe(DbHelper dh) throws Exception {
				return dao.updateBindGateAwayRole(dh, role, uId, gateAwayMac);
			}
		});
	}
	
	@SuppressWarnings("unchecked")
	public List<GateWayUsers> queryGateAwayUsers(final String gateAwayMac){
		return(List<GateWayUsers>)jdbc.execute(new MyBack() {
			
			@Override
			public List<GateWayUsers> exe(DbHelper dh) throws Exception {
				return dao.queryGateAwayUsers(dh, gateAwayMac);
			}
		});
	}
	
	public boolean queryIsBind(final String gateWayMac){
		return (Boolean) jdbc.execute(new MyBack() {
			
			@Override
			public Object exe(DbHelper dh) throws Exception {
				return dao.quyerUserIsBind(dh, gateWayMac);
			}
		});
	}
	
	public String queryUserRole(final String devId,final String gateWayMac){
		return (String) jdbc.execute(new MyBack() {
					
					@Override
					public String exe(DbHelper dh) throws Exception {
						return dao.queryUserRole(dh, devId, gateWayMac);
					}
				});
	}
}
