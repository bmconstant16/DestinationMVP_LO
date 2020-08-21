package org.travelMVP.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value= "")
    @ResponseBody //just to return plaintext
    public String index(){
        return "Hello, World!";
    }

    @RequestMapping(value= "goodbye")
    @ResponseBody //just to return plaintext
    public String goodbye(){
        return "Goodbye";
    }
}
