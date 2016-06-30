package ddb.smartcenter.gateway.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.alibaba.fastjson.JSONObject;

import ddb.smartcenter.gateway.ReturnMsg;
import ddb.smartcenter.gateway.bo.Bind_Mapping2Bo;
import ddb.smartcenter.gateway.input.Bind_Mapping2;
import ddb.smartcenter.gateway.input.DeviceInfoParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@Path("deviceInfo")
@Api(value = "/deviceInfo(终端信息上报接口)")
public class DeviceInfoResource {

@Path("report")
@POST
@Produces(value=MediaType.APPLICATION_JSON)
@ApiOperation(value = "终端信息上报", notes = "上报修改了数据的终端信息",response = ReturnMsg.class, httpMethod = "POST")
public ReturnMsg report(DeviceInfoParam param,@ApiParam(value = "用户ID")@QueryParam("uid") String uId,@ApiParam(value = "用户token")@QueryParam("token") String token,
		@ApiParam(value = "设备号")@QueryParam("devId") String deviceId){

		Bind_Mapping2 bm2=null;
		 List<Bind_Mapping2> list=new ArrayList<Bind_Mapping2>();
		for(int i=0;i<param.getDevices().size();i++){
		
			bm2=new Bind_Mapping2();
			bm2.setDeviceName(	param.getDevices().get(i).getDeviceName());
			bm2.setDeviceNickName(	param.getDevices().get(i).getDeviceNickName());
			bm2.setDeviceMac(	param.getDevices().get(i).getDeviceMac());
			list.add(bm2);
		}
		
	   Bind_Mapping2Bo bo=new Bind_Mapping2Bo();
	   boolean flag=bo.addTerminals(list);
		
		if(!flag){
			return new ReturnMsg("SUC", "");
		}else{
			return new ReturnMsg("ERR", "上报信息失败");
		}
   }
   
}
