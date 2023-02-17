package com.example.newsproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.newsproject.model.ArticleModel;

public interface ArticleRepository extends JpaRepository<ArticleModel,Long> {
	
	//ArticleModel findFirstByOrderByid_articleDesc(); 
	//List<ArticleModel> findFirst10ByOrderByid_articleDesc();
	@Query(value="SELECT * FROM article ORDER BY id_article DESC LIMIT 10", nativeQuery=true)
	public List<ArticleModel> findresults();
	
	@Query(value="SELECT * FROM article WHERE id_categorie=1", nativeQuery=true)
	public List<ArticleModel> findSports();
	@Query(value="SELECT * FROM article WHERE id_categorie=2", nativeQuery=true)
	public List<ArticleModel> findPolitique();
	@Query(value="SELECT * FROM article WHERE id_categorie=3", nativeQuery=true)
	public List<ArticleModel> findEconomie();
	@Query(value="SELECT * FROM article WHERE id_categorie=4", nativeQuery=true)
	public List<ArticleModel> findPlanete();
	@Query(value="SELECT * FROM article WHERE id_categorie=5", nativeQuery=true)
	public List<ArticleModel> findHighTech();
	
}
