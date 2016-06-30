package ddb.smartcenter.gateway.bo;

import java.util.List;

import ddb.smartcenter.gateway.dao.EventCollectDao;
import ddb.smartcenter.gateway.out.EventCollectRM;
import ddb.smartcenter.gateway.vo.EventCollect;
import kkd.common.dao.dbuitl.JDBC;
import kkd.common.dao.dbuitl.JDBC.DbHelper;
import kkd.common.dao.dbuitl.JDBC.MyBack;
import kkd.common.util.StringUtil;

public class EventCollectBo {

	EventCollectDao dao=new EventCollectDao();
	JDBC jdbc=new JDBC();
	
	public boolean addEventCollect(final EventCollect ec){
		if(ec==null) return false;
		return (Boolean) jdbc.execute(new MyBack() {
			
			@Override
			public Boolean exe(DbHelper dh) throws Exception {
				return dao.insertEvent(dh, ec);
			}
		});
	}
	
	@SuppressWarnings("unchecked")
	public List<EventCollectRM> queryEvents(final String uId){
		if(StringUtil.isEmpty(uId)) return null;
		return (List<EventCollectRM>) jdbc.execute(new MyBack() {
			
			@Override
			public Object exe(DbHelper dh) throws Exception {
				return dao.queryEvent(dh, uId);
			}
		});
	}
}
