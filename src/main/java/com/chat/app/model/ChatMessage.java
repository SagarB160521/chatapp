package com.chat.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {
    private Long id;
    private String sender;
    private String content;
//    private LocalDateTime timestamp; // new field
//    public ChatMessage() {
//        this.timestamp = LocalDateTime.now();
//    }
}
