package com.ghosttrio.withslack.controller;

import com.ghosttrio.withslack.service.message.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/basics")
public class BasicMessageController {

    private final MessageService messageService;

    @GetMapping("/messages")
    public void basicMessageSend(@RequestParam String text) {
        messageService.send(text);
    }
}
