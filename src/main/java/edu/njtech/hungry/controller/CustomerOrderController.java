package edu.njtech.hungry.controller;

import edu.njtech.hungry.service.HorsemanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/CostomerOrder")
public class CustomerOrderController {
    @Autowired
    private HorsemanService horsemanServivce;

    @RequestMapping("/select")
    public String login(){
        return "CustormerOrder";
    }
}
