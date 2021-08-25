package com.auto.test.utils;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class JsonUtil {
    protected static final ObjectMapper objectMapper = new ObjectMapper();

    public JsonUtil() {
    }

    public static String getJsonFromObject(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonGenerationException var2) {
            throw new RuntimeException("get json error", var2);
        } catch (JsonMappingException var3) {
            throw new RuntimeException("get json error", var3);
        } catch (IOException var4) {
            throw new RuntimeException("get json error", var4);
        }
    }
}
