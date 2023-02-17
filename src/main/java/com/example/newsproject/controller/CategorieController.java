package com.example.newsproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.newsproject.service.CategorieService;

@Controller
public class CategorieController {
	@Autowired
	private CategorieService catser;

}
