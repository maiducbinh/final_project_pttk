package com.ecom.controller;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

// Thay đổi từ @RestController sang @Controller
@Controller
public class ChatController {

    @GetMapping("/user/chat")
    public String showChatPage() {
        return "chat";
    }
}