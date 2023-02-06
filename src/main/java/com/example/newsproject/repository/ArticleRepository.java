package com.example.newsproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.newsproject.model.ArticleModel;

public interface ArticleRepository extends JpaRepository<ArticleModel,Long> {

}
