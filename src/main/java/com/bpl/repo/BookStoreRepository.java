package com.bpl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bpl.entity.BookStoreEntity;

public interface BookStoreRepository extends JpaRepository<BookStoreEntity, Long> {

}
