package com.auto.test.kafka;

import com.alibaba.fastjson.JSON;
import com.auto.test.entity.SimpleLongRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(String name){
        SimpleLongRequest request=new SimpleLongRequest();
        request.setData(123L);
        kafkaTemplate.send("testTopic", JSON.toJSONString(request));
    }
}