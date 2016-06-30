package ddb.smartcenter.gateway.resource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import ddb.smartcenter.gateway.ReturnMsg;
import ddb.smartcenter.gateway.bo.GateWayBo;
import ddb.smartcenter.gateway.input.RoleEditParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import kkd.common.logger.LogWriter;



@Path("role")
@Api(value = "/role(用户角色操作类接口)")
public class RoleResource {

@Path("edit")
@POST
@Produces(value=MediaType.APPLICATION_JSON)
@ApiOperation(value = "编辑角色", notes = "用户角色权限操作",response = ReturnMsg.class, httpMethod = "POST")
public ReturnMsg roleEdit(RoleEditParam param,@ApiParam(value = "用户ID")@QueryParam("uid") String uId,@ApiParam(value = "用户token")@QueryParam("token") String token,
		@ApiParam(value = "设备号")@QueryParam("devId") String deviceId){
		
		//修改用户对应角色
		GateWayBo gbo=new GateWayBo();
		//查询当前用户角色权限
		String userRole=gbo.queryUserRole(deviceId, param.getGateWayMac());
		if(param.getSetAs().equals("admin") && userRole.equals("admin")
			|| userRole.equals("normal")){//权限不足
			return new ReturnMsg("ERR", "权限不足");
		}else{
			boolean flag = gbo.editGateAwayRole(param.getSetAs(), Integer.parseInt(uId), param.getGateWayMac());
			if(flag!=true){
				LogWriter.debug("------------------->修改用户角色失败！");
				return new ReturnMsg("ERR", "修改失败");
			}else{
				return new ReturnMsg("SUC", "");
			}
		}
   }
   
}
