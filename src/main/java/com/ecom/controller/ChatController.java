package com.ecom.controller;

import com.ecom.model.UserDtls;
import com.ecom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

// Thay đổi từ @RestController sang @Controller
@Controller
public class ChatController {
    @Autowired
    private UserService userService;

    private UserDtls getLoggedInUserDetails(Principal p) {
        String email = p.getName();
        UserDtls userDtls = userService.getUserByEmail(email);
        return userDtls;
    }

    @GetMapping("/user/chat")
    public String showChatPage(Principal p) {
        UserDtls user = getLoggedInUserDetails(p);
        return "chat";
    }
}