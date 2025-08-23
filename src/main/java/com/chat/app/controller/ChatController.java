package com.chat.app.controller;


import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    // /app/sendMessage
    @MessageMapping("/sendMessage")        //maps the message to destination
    @SendTo("/topic/messages")               //the return message is sent to the topic
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }

    @GetMapping("chat")      //who ever visiting to the url:loccalhost8080/chat/ will be directed to the
    public String chat(){   //thymleaf template
        return "chat";
    }

}
