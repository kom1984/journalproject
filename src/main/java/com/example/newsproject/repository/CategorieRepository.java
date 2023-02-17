package com.example.newsproject.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.newsproject.model.ArticleModel;
import com.example.newsproject.model.CategorieModel;

public interface CategorieRepository extends JpaRepository<CategorieModel, Long> {	
	//@Query("SELECT * FROM article RIGHT JOIN categories ON article.id_article == '1' AND categories.id_article =='1'", nativeQuery=true)
  //public List<CategorieModel> findAllSports();
	//@Query(value="SELECT * FROM article WHERE id_categorie=1", nativeQuery=true)
	//public List<ArticleModel> findSports();
	
}
