package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestAuthController {
    @GetMapping("/test")
    public String checkAPI(){
        return "It's work";
    }
}
