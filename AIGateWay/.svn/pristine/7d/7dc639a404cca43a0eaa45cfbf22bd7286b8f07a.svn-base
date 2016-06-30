package ddb.smartcenter.gateway.bo;

import java.util.List;

import ddb.smartcenter.gateway.dao.Bind_Mapping2Dao;
import ddb.smartcenter.gateway.input.Bind_Mapping2;
import kkd.common.dao.dbuitl.JDBC;
import kkd.common.dao.dbuitl.JDBC.DbHelper;
import kkd.common.dao.dbuitl.JDBC.MyBack;

public class Bind_Mapping2Bo {

	Bind_Mapping2Dao dao=new Bind_Mapping2Dao();
	JDBC jdbc=new JDBC();
	
	public Boolean addTerminals(final List<Bind_Mapping2> bm2){
		return (Boolean) jdbc.execute(new MyBack() {
			@Override
			public Boolean exe(DbHelper dh) throws Exception {
				return dao.insertTerminals(dh, bm2);
			}
		});
	}
}
