package com.springapp.mvc.controller;

import com.springapp.mvc.exception.NotValidException;
import com.springapp.mvc.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class SimpleController {

    @Autowired
    ICalculatorService calculatorService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(@RequestParam("op1") String op1, @RequestParam("op2") String op2, @RequestParam("operation") String operation, ModelMap model) {
        int result = 0;
        try {
            result = calculatorService.calculate(op1, op2, operation);
        } catch (NotValidException e) {
            e.printStackTrace();
            model.addAttribute("message", e.getMessage());
        }

        model.addAttribute("message", result);
        return "index";
    }


}