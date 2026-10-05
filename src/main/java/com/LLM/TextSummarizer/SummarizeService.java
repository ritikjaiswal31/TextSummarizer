package com.LLM.TextSummarizer;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.stereotype.Service;

@Service
public class SummarizeService {

    private ChatClient chatClient;

    private SummarizeService(ChatClient.Builder builder){
        this.chatClient = builder.build();
    }

    public String summarize(String ticket){
        String output = chatClient.prompt()
                .user("Summarize this support ticket in 2 lines : \n\n" + ticket)
                .options(OpenAiChatOptions.builder()
                        .maxTokens(500))
                .call()
                .content();
        return output;
    }
}
