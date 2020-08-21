package org.travelMVP.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @RequestMapping(value= "goodbye")
    @ResponseBody //just to return plaintext
    public String goodbye(){
        return "Goodbye";
    }


    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    public String helloWithQueryParam(@RequestParam String name, Model model){
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
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
