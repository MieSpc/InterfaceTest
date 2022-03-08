package com.auto.test.manager.httpclient;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

@Slf4j
public class HttpclientManager {

    private static CloseableHttpClient httpClient;

    private static CloseableHttpResponse response;

    public String doGet(String uri){
        httpClient = HttpClients.createDefault();
        String url = "";
        HttpGet get = new HttpGet(url);
//        Map<String,String> headerMap = HeaderUtil.getHeaderMap();
//        if (!headerMap.isEmpty()){
//            headerMap.forEach(get::setHeader);
//        }
        try {
            response=httpClient.execute(get);
            HttpEntity responseEntity = response.getEntity();
            if (response.getStatusLine().getStatusCode()==200){
                if (responseEntity != null) {
                    log.info("response:"+EntityUtils.toString(responseEntity));
                    return EntityUtils.toString(responseEntity);
                }
            }else {
                log.error("\n===========  request failed  ===========" +
                        "\nurl:"+url+
                        "\nstatusCode:"+response.getStatusLine().getStatusCode()+
                        "\n===========  request end     ===========");
                return response.getStatusLine().getReasonPhrase();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
}
