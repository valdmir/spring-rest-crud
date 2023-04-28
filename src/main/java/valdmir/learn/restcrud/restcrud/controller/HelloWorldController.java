package valdmir.learn.restcrud.restcrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //    Get
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }

//    POST
//    PUT
//    DELETE
}
