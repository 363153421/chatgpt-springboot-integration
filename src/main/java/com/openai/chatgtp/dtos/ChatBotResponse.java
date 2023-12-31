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
@AllArgsConstructor
@NoArgsConstructor
public class ChatBotResponse {

    private List<Choice> choices;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Choice {
        private int index;
        private Message message;
    }
}
