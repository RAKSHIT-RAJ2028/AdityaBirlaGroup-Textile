package com.ABGTextile.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name="materials")
public class Material
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long materialId	;
	
	private String name;
	
	private String description;
	
	private String category;
	
	@CreationTimestamp
	private LocalDateTime cretaedAt;

	// Getter and Setter 
	public Long getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDateTime getCretaedAt() {
		return cretaedAt;
	}

	public void setCretaedAt(LocalDateTime cretaedAt) {
		this.cretaedAt = cretaedAt;
	}
	
	
	
	
}

