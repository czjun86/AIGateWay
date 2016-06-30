package ddb.smartcenter.gateway.control;


import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.filter.LoggingFilter;

import org.glassfish.jersey.server.ResourceConfig;

import ddb.smartcenter.gateway.DDBJacksonJsonProvider;



@ApplicationPath("/api")
public class APIApplication extends ResourceConfig{

    public APIApplication() {
        
    	//指定资源所在包名
        packages("ddb.smartcenter.gateway.resource");
        
        //注册日志过滤器
        register(LoggingFilter.class);
        
        //注册JSON转换器，自定义的Provider统一处理了日期格式问题
        register(DDBJacksonJsonProvider.class); 

        //注册swagger
        register(io.swagger.jaxrs.listing.ApiListingResource.class);
        register(io.swagger.jaxrs.listing.SwaggerSerializers.class);        

    }  
    

}
