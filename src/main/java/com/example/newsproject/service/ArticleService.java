package com.example.newsproject.service;

import java.util.List;

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
	public List<ArticleModel> getResults(){
		return articlerepo.findresults();
	}
	public List<ArticleModel> getSports(){
		return articlerepo.findSports();
	}
		public ArticleModel getSportsById(Long id)
		{
			return articlerepo.findById(id).get();
		}
	
	public List<ArticleModel> getPolitique(){
		return articlerepo.findPolitique();
	}
	public List<ArticleModel> getEconomie(){
		return articlerepo.findEconomie();
	}
	public List<ArticleModel> getPlanete(){
		return articlerepo.findPlanete();
	}
	public List<ArticleModel> getHighTech(){
		return articlerepo.findHighTech();
	}
	
	/*public void countMethod() {
		long count = articlerepo.count();
		System.out.printf("count of records",count);
	}*/

}
