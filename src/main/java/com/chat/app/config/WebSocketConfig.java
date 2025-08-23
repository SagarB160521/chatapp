package com.chat.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker//directs the path to the chatroom
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {//STOMP protocol for  messaging

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat")//adding or define a endpoint for as chat
                .setAllowedOrigins("http://localhost:5173")//security feature to prevent unautherised
                .withSockJS();//for other unautherised users

    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic"); // sets up a message broker for the topic eg:topic/chatroom1/
        registry.setApplicationDestinationPrefixes("/app");  //
    }


}
