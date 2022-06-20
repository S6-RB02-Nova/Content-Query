package com.nova.app.rabbitmq;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nova.app.models.Content;
import com.nova.app.services.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContentJsonConsumer {

    @Autowired
    private ObjectMapper objectMapper;

    private final ContentService contentService;

    @RabbitListener(queues = "q.content.create", concurrency = "2-6")
    public void listen(String message) throws JsonProcessingException {
        Content content = objectMapper.readValue(message, Content.class);
        contentService.saveContent(content);
    }
}
