package com.leo.han.jsonhelper;

import com.google.gson.Gson;

public class GsonHelper<T> implements JsonHelper<T> {

	private Gson gson;

	public GsonHelper() {

		gson = new Gson();
	}

	@Override
	public String ObjectToJSON(T object) throws Exception {
		String json = gson.toJson(object);
		return json;
	}

	@Override
	public T JSONToObject(String json, Class<T> clazz) throws Exception {
		T object = gson.fromJson(json, clazz);
		return object;
	}

}
