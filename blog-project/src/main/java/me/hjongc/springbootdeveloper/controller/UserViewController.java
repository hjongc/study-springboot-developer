package me.hjongc.springbootdeveloper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserViewController {
    @GetMapping("/login")
    public String login() {
        return "oauthLogin";
        // return "oauthlogin";
        // -> local에서는 대소문자 구분없이 잘 작동하였음.
        // -> 하지만, AWS 배포 환경에서는 대소문자 구분해줘야함!!!
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
}
