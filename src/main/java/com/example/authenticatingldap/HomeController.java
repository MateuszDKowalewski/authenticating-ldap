package com.example.authenticatingldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//    @GetMapping("/")
//    public String index() {
//        return ("<h1>Welcome!</h1>");
//    }
//
//    @GetMapping("/user")
//    public String user() {
//        return ("<h1>Welcome user!</h1>");
//    }
//
//    @GetMapping("/admin")
//    public String admin() {
//        return ("<h1>Welcome admin!</h1>");
//    }

    @GetMapping("/")
    public String index() {
        return "Welcome to the home page!";
    }

}
