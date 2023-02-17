package com.example.newsproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.example.newsproject.model.ContactModel;
import com.example.newsproject.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactservice;

  @GetMapping("/contact")
  public String contactForm(Model model) {
    model.addAttribute("contact", new ContactModel());
    return "/publictemplates/contact";
  }
  @RequestMapping(value="/submit",method = RequestMethod.POST)    
  public String save(@ModelAttribute("contact") ContactModel contact){    
      contactservice.save(contact);    
      return "redirect:/contact"; 
  }
           
  @PostMapping("/contact")
  public String contactSubmit(@ModelAttribute ContactModel contact, Model model) {
    model.addAttribute("contact", contact);
    return "/publictemplates/contactresult";
  }

}