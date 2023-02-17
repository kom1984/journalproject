package com.example.newsproject.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="article")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_article;
	
	private String Titre;
	
	private String image_article;
	
	private String Description;
		
	private Date date_ajouter;
	
	@ManyToOne
	@JoinColumn(name="id_categorie",referencedColumnName = "id_categorie",insertable = true, updatable = true)
	private CategorieModel id_categorie;
	
	

}
