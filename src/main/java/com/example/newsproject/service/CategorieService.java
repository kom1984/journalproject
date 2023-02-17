package com.example.newsproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.newsproject.repository.CategorieRepository;

@Service
public class CategorieService {
	@Autowired
	private CategorieRepository catrepo;
	

}
