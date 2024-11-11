package me.shinsunyoung.springbootdeveloper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserViewController {

    // /login 경로로 접근하면 login() 메서드가 login.html 반환
    @GetMapping("/login")
    public String login() {
        return "oauthLogin";
    }

    // /signup 경로로 접근하면 signup() 메서드가 signup.html 반환
    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
}
