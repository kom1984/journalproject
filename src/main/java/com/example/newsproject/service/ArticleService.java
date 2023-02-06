package com.example.newsproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.newsproject.model.ArticleModel;
import com.example.newsproject.repository.ArticleRepository;

@Service
public class ArticleService {
	@Autowired
	private ArticleRepository articlerepo;
	public Iterable<ArticleModel> getAllArticles()
	{
		return articlerepo.findAll();
	}

}
