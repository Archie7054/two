package my.app.firstwebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class HelloWorldController {
    @RequestMapping("/sayhello")
    public String say(){
        return "Hello,This is Program One from branch mater";
    }
}
