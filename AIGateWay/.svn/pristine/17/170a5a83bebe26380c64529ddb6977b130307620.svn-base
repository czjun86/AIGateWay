package ddb.smartcenter.gateway.resource;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import ddb.smartcenter.gateway.ReturnMsg;
import ddb.smartcenter.gateway.bo.GateWayBo;
import ddb.smartcenter.gateway.input.GateWayBindParam;
import ddb.smartcenter.gateway.input.GateWayGetByUserParam;
import ddb.smartcenter.gateway.out.GateWayBindRM;
import ddb.smartcenter.gateway.out.GateWayGetByUserRM;
import ddb.smartcenter.gateway.out.GateWayList;
import ddb.smartcenter.gateway.vo.Bind_Mapping;
import ddb.smartcenter.gateway.vo.GateWay;
import ddb.smartcenter.gateway.vo.PlatFormInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import kkd.common.logger.LogWriter;


@Path("gateway")
@Api(value = "/gateway(网关操作类接口)")
public class GateWayResource {

@Path("bind")
@POST
@Produces(value=MediaType.APPLICATION_JSON)
@ApiOperation(value = "网关绑定", notes = "根据uid绑定网关设备",response = GateWayBindRM.class, httpMethod = "POST")
public ReturnMsg bindGateWay(GateWayBindParam param,@ApiParam(value = "用户ID")@QueryParam("uid") String uId,@ApiParam(value = "用户token")@QueryParam("token") String token,
		@ApiParam(value = "设备号")@QueryParam("devId") String deviceId){

		GateWay ga=new GateWay();
		GateWayBo gbo=new GateWayBo();
		
		ga.setMac(param.getDeviceMac());
		ga.setDeviceId(param.getGateWayDeviceId());
		
		Bind_Mapping bm=new Bind_Mapping();
		bm.setDeviceMac(param.getDeviceMac());
		bm.setGateWayMac(param.getDeviceMac());
		bm.setuId(Integer.parseInt(uId));
		bm.setPhone(Integer.parseInt(param.getPhone()));
		//查询网关是是否第一次被绑定
		boolean isBind=gbo.queryIsBind(param.getGateWayMac());
		if(isBind){
			bm.setUserRole("SU");//超级管理员
		}else{
			bm.setUserRole("normal");//普通用户
		}
		
		
		//绑定
		boolean flg1=gbo.bindGateAway(ga);//插入绑定网关
		boolean flg2=gbo.bindGateAwayMapping(bm);//插入绑定关系
		if(flg1!=true || flg2!=true){//绑定失败
			LogWriter.debug("绑定网关失败，uId:"+uId+",phone:"+param.getPhone());
			return new GateWayBindRM("ERR", "绑定网关失败");
		}else{
			return new GateWayBindRM("SUC", "");
		}
	
	   
   }

@SuppressWarnings("null")
@Path("getByUser")
@POST
@Produces(value=MediaType.APPLICATION_JSON)
@ApiOperation(value = "网关列表", notes = "获取用户绑定的网关列表",response = GateWayGetByUserRM.class, httpMethod = "POST")
public ReturnMsg getByUser(GateWayGetByUserParam param,@ApiParam(value = "用户ID")@QueryParam("uid") String uId,@ApiParam(value = "用户token")@QueryParam("token") String token,
		@ApiParam(value = "设备号")@QueryParam("devId") String deviceId,
		@ApiParam(value= "用户最后一次选择的地区编号")@QueryParam("curDist") String curDist){

		String district=curDist;
		//	String district="UNICOM_CQ";
		
		GateWayBo bo=new GateWayBo();
		List<GateWayList> list = bo.queryGateAways(Integer.parseInt(uId));
		PlatFormInfo plat = bo.queryPlatInfo(district);
		if(plat!=null){
			if(list!=null && list.size()>0){
				return new GateWayGetByUserRM("SUC", "",plat.getPlatCode(),plat.getPlatName()
						   ,plat.getPlatAddr(),plat.getPlatPort(),list);
			}else{
				return new GateWayGetByUserRM("ERR", "获取用户绑定的网关数据失败",plat.getPlatCode(),plat.getPlatName()
						   ,plat.getPlatAddr(),plat.getPlatPort(),list);
			}
		}else{
			return new GateWayGetByUserRM("ERR", "获取云平台信息失败",null,null
					   ,null,null,list);
		}
		
   }

   
}
