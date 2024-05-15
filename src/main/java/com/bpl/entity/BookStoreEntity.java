package com.bpl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="BOOKSTORE_TBL")
@Entity
@Data
public class BookStoreEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long storeId;
	
	private String storeName;
	
	private String bookName;
	
	private Double bookPrice; 
}
