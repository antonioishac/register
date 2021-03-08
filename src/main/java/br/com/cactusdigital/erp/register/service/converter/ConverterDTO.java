package br.com.cactusdigital.erp.register.service.converter;

import com.google.gson.Gson;
import feign.Response;

import java.io.IOException;

public class ConverterDTO {

    private ConverterDTO() {
        throw new IllegalStateException("Utility Class");
    }

    public static<T> Object converterWithGson(Response response, Class<T> clazz) {
        Gson gson = new Gson();
        return gson.fromJson(String.valueOf(response.body()), clazz);
    }

    public static<T> Object asObject(Response response, Class<T> clazz) throws IOException {
        return null;
    }
}
