package com.example.newsproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.newsproject.model.ContactModel;

public interface ContactRepository extends JpaRepository<ContactModel,Long>{

}
