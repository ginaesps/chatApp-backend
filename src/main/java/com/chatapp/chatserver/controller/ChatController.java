package com.chatapp.chatserver.controller;

import com.chatapp.chatserver.controller.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    //create dynamic topics in spring
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate

    @MessageMapping("/private-message")
    public Message receivePrivateMessage(@Payload Message message) {

        simpMessagingTemplate.convertAndSendToUser(message.getReceiverName(), "/private", message); // /user/nombreDelUusario/private
        return message;
    }
}
