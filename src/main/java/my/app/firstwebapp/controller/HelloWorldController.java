package my.app.firstwebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class HelloWorldController {
    @RequestMapping("/sayhello")
    public String say(){
        return "Hello,This is Program Two from branch mater via nginx. Version is 1203";
    }
}
