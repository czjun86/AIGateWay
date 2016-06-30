package ddb.smartcenter.gateway.resource;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


import ddb.smartcenter.gateway.ReturnMsg;
import ddb.smartcenter.gateway.bo.GateWayBo;
import ddb.smartcenter.gateway.input.UserGetParam;
import ddb.smartcenter.gateway.out.GateWayUsers;
import ddb.smartcenter.gateway.out.GetUserByGateWayRM;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@Path("user")
@Api(value = "/user(用户操作类接口)")
public class UserResource {

@Path("getByGateway")
@POST
@Produces(value=MediaType.APPLICATION_JSON)
@ApiOperation(value = "获取用户", notes = "获取网关绑定的用户列表",response = GetUserByGateWayRM.class, httpMethod = "POST")
public ReturnMsg getUsers(UserGetParam param,@ApiParam(value = "用户ID")@QueryParam("uid") String uId,@ApiParam(value = "用户token")@QueryParam("token") String token,
		@ApiParam(value = "设备号")@QueryParam("devId") String deviceId){
	
		GateWayBo gbo=new GateWayBo();
		List<GateWayUsers> list=gbo.queryGateAwayUsers(param.getGateWayMac());;
		if(list.size()>0&& list!=null){
			 return new GetUserByGateWayRM("SUC", "",list);
		}else{
			 return new GetUserByGateWayRM("ERR", "查询网关绑定用户列表失败",list);
		}
   }
   
}
