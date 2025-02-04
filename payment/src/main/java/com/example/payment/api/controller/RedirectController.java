package com.example.payment.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")
public class RedirectController {

    @GetMapping
    public RedirectView redirectToSwagger() {
        return new RedirectView("/swagger-ui.html");
    }
}
