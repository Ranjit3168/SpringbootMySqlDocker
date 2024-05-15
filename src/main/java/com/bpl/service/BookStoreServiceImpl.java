package com.bpl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpl.entity.BookStoreEntity;
import com.bpl.repo.BookStoreRepository;

@Service
public class BookStoreServiceImpl implements IBookStoreService {

	@Autowired
	private BookStoreRepository bookRepo;
	
	@Override
	public String registerBookStore(BookStoreEntity entity) {
		Long idVal=bookRepo.save(entity).getStoreId();
		return "BookStore registered with id Value"+idVal;
	}

}
