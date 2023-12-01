package com.openai.chatgtp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author wuKeFan
 * Created By Zeeshan on 12-11-2023
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatBotRequest {

    private String model;
    private List<Message> messages;
    private int n;
    private double temperature;
    private int max_tokens;
}
