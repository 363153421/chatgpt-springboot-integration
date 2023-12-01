package com.openai.chatgtp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wuKeFan
 * Created By Zeeshan on 12-11-2023
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private String role;
    private String content;

}
