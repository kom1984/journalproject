package com.example.newsproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="contact")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_contact;
	
	private String nom;
	
	private String prenom;
	
	private String email;
		
	private String message;
	
	

}
