package com.rayan.hopper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Khalid Aleadini";
        String itemName = "Copper wire";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("names",name);
        model.addAttribute("itemNames",itemName);
        model.addAttribute("prices",price);
        model.addAttribute("descriptions",description);
        model.addAttribute("vendors",vendor);



    
        return "index.jsp";
    }
    //...
    

}
