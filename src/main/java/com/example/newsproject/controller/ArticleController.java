package com.example.newsproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.newsproject.service.ArticleService;

@Controller
public class ArticleController {
	
	
	@Autowired
	private ArticleService artiservice;
	
	@GetMapping("/")
	public String index(Model model)
	{
	model.addAttribute("article",artiservice.getAllArticles());
	//addAttribute("article",artiservice.getAllArticles());
	
	return "index";
	
	}
}


	

