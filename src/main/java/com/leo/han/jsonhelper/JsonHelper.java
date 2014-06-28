package com.leo.han.jsonhelper;

public interface JsonHelper<T> {
	String ObjectToJSON(T object) throws Exception;

	T JSONToObject(String json, Class<T> clazz) throws Exception;
}
