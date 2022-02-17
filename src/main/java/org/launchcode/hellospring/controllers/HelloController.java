package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    // handles request at path /hello
   // @GetMapping("hello")
    //@ResponseBody
    //public String hello() {
     //   return "Hello, Spring!";
    //}

    // lives at /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    //lives at /hello/hello
    // handles request of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    // lives at /hello/{name}
    // handles the request of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@RequestParam String name) {
        return "Bonjour, " + name + "!";
    }
    // lives at /hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='hello'>" + // submit a request to /hello
                "<input type='text' name='name'>" +
                "<select name='language' id=language-select>" +
                "<option value=''>" +
                "--Select Language--" + "</option>" +
                "<option value='english'>" +
                "English" + "</option>" +
                "<option value='Spanish'>" +
                "Spanish" + "</option>" +
                "<option value='french'>" +
                "French" + "</option>" +
                "<option value='german'>" +
                "German" + "</option>" +
                "<option value='Japanese'>" +
                "Japanese" + "</option>" +
                "</select>" +
                "<input type='submit' value='Greet Me!'>" +
                 "</form>" +
                "</body>" +
                "</html>";
    }
}
