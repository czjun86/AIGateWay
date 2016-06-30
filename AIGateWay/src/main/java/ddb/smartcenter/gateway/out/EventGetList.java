package ddb.smartcenter.gateway.out;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import ddb.smartcenter.gateway.ReturnMsg;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "指令列表响应消息")  
@JsonSerialize
@XmlRootElement
public class EventGetList extends ReturnMsg {

	@ApiModelProperty(value = "指令列表", required = true) 
	private List<EventCollectRM> events;

	public EventGetList(String errCode, String errMsg) {
		super(errCode, errMsg);
	}
	
	public EventGetList(String errCode, String errMsg,List<EventCollectRM> events) {
		super(errCode, errMsg);
		this.events=events;
	}
	
	public List<EventCollectRM> getEvents() {
		return events;
	}

	public void setEvents(List<EventCollectRM> events) {
		this.events = events;
	}
	
	
}
