package com.bpl.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bpl.entity.BookStoreEntity;
import com.bpl.service.IBookStoreService;



@RestController
public class BookStoreRestController {

	@Autowired
	private IBookStoreService service;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveBookStore(@RequestBody BookStoreEntity entity){
		String msg=service.registerBookStore(entity);
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}
}
