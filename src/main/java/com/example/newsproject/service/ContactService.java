package com.example.newsproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.newsproject.model.ContactModel;
import com.example.newsproject.repository.ContactRepository;

@Service
public class ContactService {
	@Autowired
	private ContactRepository contactrepo;
	public Iterable<ContactModel> getAllContact()
	{
		return contactrepo.findAll();
	}
	public void save(ContactModel contact) {
		   
		contactrepo.save(contact);   
		}    
	}

