package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

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
    //@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    //public String helloWithQueryParam(@RequestParam String name) {
   //     return "Hello, " + name + "!";
   // }

   // @GetMapping("{name}")
   // public String helloWithPathParam(@RequestParam String name, String language) {
   //     return language + name
   // }

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
                "<option value='English'>" +
                "English" + "</option>" +
                "<option value='Spanish'>" +
                "Spanish" + "</option>" +
                "<option value='French'>" +
                "French" + "</option>" +
                "<option value='German'>" +
                "German" + "</option>" +
                "<option value='Japanese'>" +
                "Japanese" + "</option>" +
                "</select>" +
                "<input type='submit' value='Greet Me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("hello")
    public static String createMessage(String name, String language) {

        if (language.equals("English")) {
            language = "Hello, ";
        }
        else if (language.equals("Spanish")) {
            language = "Hola, ";
        }
        else if (language.equals("French")) {
            language = "Bonjour, ";
        }
        else if (language.equals("German")) {
            language = "Hallo, ";
        }
        else if(language.equals("Japanese")) {
            language = "こんにちは";
        }
        return language + name;
    }

}






