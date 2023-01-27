package com.chatapp.chatserver.controller.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {

    private String senderName;
    private String receiverName;
    private String messageBody;
    private String dateTime;
    private Status status;
}
