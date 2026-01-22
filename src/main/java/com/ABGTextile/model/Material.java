package com.ABGTextile.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//CREATE TABLE materials (
//	    material_id INT AUTO_INCREMENT PRIMARY KEY,
//	    name VARCHAR(100) NOT NULL,
//	    description TEXT,
//	    category VARCHAR(50),  -- e.g., Natural, Synthetic, Blended
//	    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
//	);

@Entity
public class Material 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String name;
	
	private String text;
	
	private String category;
	
	@CreationTimestamp
	@Column(name="created_at", nullable = false )
	private LocalDateTime createdAt;
	
	@UpdateTimestamp
	@Column(name="update_at" , nullable = false)
	private LocalDateTime updatedAt;
	

}
