package ddb.smartcenter.gateway;
import java.text.SimpleDateFormat;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;


public class DDBJacksonJsonProvider extends JacksonJsonProvider {
	public DDBJacksonJsonProvider() {
	}

	@Override
	public ObjectMapper locateMapper(Class<?> type, MediaType mediaType) {
		ObjectMapper mapper = super.locateMapper(type, mediaType);
		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		
		return mapper;
	}
}