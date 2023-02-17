package com.example.newsproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.newsproject.service.ArticleService;

@Controller
public class ArticleController {
	
	
	@Autowired
	private ArticleService artiservice;
	
	@GetMapping("/")
	public String index (Model model)
	{
	//model.addAttribute("article",artiservice.getAllArticles());
		model.addAttribute("article",artiservice.getResults());
	//addAttribute("article",artiservice.getAllArticles());
	
	return "index";
	
	}
	@GetMapping("/index")
	public String indexpage (Model model)
	{
	//model.addAttribute("article",artiservice.getAllArticles());
	model.addAttribute("article",artiservice.getResults());
	//addAttribute("article",artiservice.getAllArticles());
	
	return "index";
	
	}
	
	@GetMapping("/sports1")
	public String sportsPage (Model model)
	{
	model.addAttribute("sport",artiservice.getSports());	
	return "/publicTemplates/sports1";	
	}
	
	@GetMapping("/politique")
	public String politiquePage (Model model)
	{
	model.addAttribute("politique",artiservice.getPolitique());	
	return "/publicTemplates/politique";	
	}
	@GetMapping("/economie")
	public String economiePage (Model model)
	{
	model.addAttribute("economie",artiservice.getEconomie());	
	return "/publicTemplates/economie";	
	}
	@GetMapping("/planete")
	public String planetePage (Model model)
	{
	model.addAttribute("planete",artiservice.getPlanete());	
	return "/publicTemplates/planete";	
	}
	@GetMapping("/hightech")
	public String hightechPage (Model model)
	{
	model.addAttribute("hightech",artiservice.getHighTech());	
	return "/publicTemplates/hightech";	
	}
	
	@GetMapping("/sports/{id}")
	public String sportsId(@PathVariable Long id,Model model)
	
	{
		
		model.addAttribute("sport",artiservice.getSportsById(id));
		
		return "publicTemplates/sports";
	}

	@GetMapping("/sports/{id}#")
	public String sportId(@PathVariable Long id,Model model)
	
	{
		
		//model.addAttribute("sport",artiservice.getSportsById(id));		
		return "index";
	}

	
}


	

