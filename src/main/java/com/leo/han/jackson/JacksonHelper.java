package com.leo.han.jackson;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonHelper<T> {

	public String ObjectToJSON(T object) throws JsonProcessingException {
		String json = new ObjectMapper().writeValueAsString(object);
		return json;
	}

	public T JSONToObject(String json, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
		T object = new ObjectMapper().readValue(json, clazz);
          return object;
	}

}
