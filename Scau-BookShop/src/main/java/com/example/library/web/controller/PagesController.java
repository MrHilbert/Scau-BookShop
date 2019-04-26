package com.example.library.web.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PagesController {

	@RequestMapping("contact")
    public String page(){
        return "contact"; 
    }

}
