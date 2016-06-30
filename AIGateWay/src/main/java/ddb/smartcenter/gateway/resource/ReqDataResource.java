package ddb.smartcenter.gateway.resource;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.alibaba.fastjson.JSONObject;

import ddb.smartcenter.gateway.ReturnMsg;
import ddb.smartcenter.gateway.bo.EventCollectBo;
import ddb.smartcenter.gateway.input.EventQueryParam;
import ddb.smartcenter.gateway.input.ReqDataParam;
import ddb.smartcenter.gateway.out.EventCollectRM;
import ddb.smartcenter.gateway.out.EventGetList;
import ddb.smartcenter.gateway.vo.EventCollect;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@Path("req")
@Api(value = "/req(网关指令操作接口)")
public class ReqDataResource {

@Path("report")
@POST
@Produces(value=MediaType.APPLICATION_JSON)
@ApiOperation(value = "上报指令", notes = "收集用户对智能网关相关操作的指令",response = ReturnMsg.class, httpMethod = "POST")
public ReturnMsg report(ReqDataParam param,@ApiParam(value = "用户ID")@QueryParam("uid") String uId,@ApiParam(value = "用户token")@QueryParam("token") String token,
		@ApiParam(value = "设备号")@QueryParam("devId") String deviceId){

		EventCollect ec=new EventCollect();
		ec.setDeviceIMEI(deviceId);
		ec.setDeviceMac(param.getDeviceMac());
		ec.setEventName(param.getEventName());
		ec.setGateWayDeviceId(param.getGateWayDeviceId());
		ec.setGateWayMac(param.getGateWayMac());
		ec.setIsSucc(param.getIsSucc());
		ec.setModel(param.getModel());
		ec.setRespCont(param.getRespCont());
		ec.setuId(Integer.parseInt(uId));
		
		EventCollectBo bo=new EventCollectBo();
		boolean flag=bo.addEventCollect(ec);
		if(flag!=true){
			return new ReturnMsg("ERR", "上报用户指令集失败");

		}else{
			return new ReturnMsg("SUC", "");
		}
	
	   
   }

@Path("query")
@POST
@Produces(value=MediaType.APPLICATION_JSON)
@ApiOperation(value = "查询指令", notes = "查询操作过的指令",response = EventGetList.class, httpMethod = "POST")
public ReturnMsg select(EventQueryParam param,@ApiParam(value = "用户ID")@QueryParam("uid") String uId,@ApiParam(value = "用户token")@QueryParam("token") String token,
		@ApiParam(value = "设备号")@QueryParam("devId") String deviceId){

		EventCollectBo bo=new EventCollectBo();
		List<EventCollectRM> list=bo.queryEvents(uId);

		if(list!=null && list.size()>0){
			return new EventGetList("SUC","",list);
		}else{
			
		}return new EventGetList("ERR","查询列表为空",list);
	   
   }
   
}
