package com.examples.my.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.examples.my.service.SimpleService;
@Controller
//@RequestMapping("/hello")
public class SimpleController {
	@Autowired
	private SimpleService simpleService;
	@RequestMapping("/login")
    public String hello(Model model) {
		
	        model.addAttribute("msg", simpleService.getMessage());
            return "result";
	}
}