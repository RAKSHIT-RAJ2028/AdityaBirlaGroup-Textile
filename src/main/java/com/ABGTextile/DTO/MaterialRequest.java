package com.ABGTextile.DTO;

import jakarta.validation.constraints.NotBlank;

public class MaterialRequest 
{

	@NotBlank(message="Name is required")
	private String name;
	@NotBlank(message="Description is required")
	private String description;
	@NotBlank(message="Category is required")
	private String category;
	
	//Getter and Setter
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
	
	
}
