package hu.balogh.dummyapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class dummyController {

    @GetMapping("/")
    public String getString(){
        return "hello torok";
    }

}
