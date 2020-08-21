package org.travelMVP.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

//    @RequestMapping(value= "")
//    @ResponseBody //just to return plaintext
//    public String index(){
//        return "Hello, World!";
//    }

    @RequestMapping(value= "goodbye")
    @ResponseBody //just to return plaintext
    public String goodbye(){
        return "Goodbye";
    }

    //create handler for requests of the form /hello?name=LaunchCode
//    @GetMapping("hello")
//    @PostMapping("hello")
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }

    //handles request of the form /hello/User
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    //display the form

    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form method = 'get' action = '/hello'>" + //submits a request to /hello links to hellowithqueryparam
                "<input type = 'text' name = 'name' />" +
                "<input type = 'submit' value = 'Take me to the welcome page!' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }



}
