package com.tutomato.disasteralert.websocket.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class WebSocketV1Controller {

    private final Logger logger = LoggerFactory.getLogger(WebSocketV1Controller.class);
    public static CounterV1 socketCounter = new CounterV1();


    @MessageMapping("/plus")
    @SendTo("/topic/counter")
    public int getCounter() throws Exception {
        Thread.sleep(1000); // simulated delay
        socketCounter.plus();
        logger.info("counter to string: {}", socketCounter.toString());
        return socketCounter.getCounter();
    }


    @MessageMapping("/plus/double/{message}")
    public void plusDouble(@PathVariable String  message) throws Exception {
        logger.info("client message: {}", message);
        socketCounter.plus();
        getCounter();
    }

}
