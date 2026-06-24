package com.ABGTextile.service;

import java.util.List;

import com.ABGTextile.DTO.MaterialRequest;
import com.ABGTextile.DTO.MaterialResponse;
import com.ABGTextile.model.Material;


public interface MaterialService 
{
	    // Methods which should implement in MaterialService
		MaterialResponse createMaterial(MaterialRequest request); // - POST
		List<MaterialResponse> getAllMaterial(); // - GET
		MaterialResponse getMaterialById(Long id ); // - GET
		MaterialResponse updateMaterial(Long id , MaterialRequest request); // // - PUT
		void deleteMaterial(Long id);

}
