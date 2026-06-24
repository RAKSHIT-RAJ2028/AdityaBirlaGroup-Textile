package com.ABGTextile.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ABGTextile.DTO.MaterialRequest;
import com.ABGTextile.DTO.MaterialResponse;
import com.ABGTextile.Exception.ResourceNotFoundException;
import com.ABGTextile.Repository.MaterialRepository;
import com.ABGTextile.model.Material;
//import com.ABGTextile.service.Material;

import com.ABGTextile.service.MaterialService;

@Service
public class MaterialServiceImpl implements MaterialService 
{

	@Autowired
	private MaterialRepository materialRepository;
	
	@Override
	public MaterialResponse createMaterial(MaterialRequest request) {
		// TODO Auto-generated method stub
		Material material = new Material();
		material.setName(request.getName());
		material.setDescription(request.getDescription());
		material.setCategory(request.getCategory());

		materialRepository.save(material);
		return mapToResponse(material);
		
	}

	// Database ➔ Material Entity ➔ Service  ➔ MaterialResponse DTO ➔ Controller➔JSON Response
	@Override
	public List<MaterialResponse> getAllMaterial() {
		// TODO Auto-generated method stub
		return materialRepository.findAll().stream().map(this::mapToResponse).toList();
	}

	@Override
	public MaterialResponse getMaterialById(Long id) {
		// TODO Auto-generated method stub
	Material material = materialRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Material not found with id :" + id));

	return mapToResponse(material);
	}

	@Override
	public MaterialResponse updateMaterial(Long id, MaterialRequest request) {
		// TODO Auto-generated method stub
		Material existingMaterial = materialRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Material not found with id :" + id));
		
		existingMaterial.setName(request.getName());
		existingMaterial.setDescription(request.getDescription());
		existingMaterial.setCategory(request.getCategory());

		materialRepository.save(existingMaterial);
		return mapToResponse(existingMaterial);
	}

	@Override
	public void deleteMaterial(Long id) {
		// TODO Auto-generated method stub
		Material mat =  materialRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Material not found"));
		materialRepository.delete(mat);
	}

	
	// ------------------Creating private method to map Material to MaterialResponse---------------------
	private MaterialResponse mapToResponse(Material material) 
	{
		MaterialResponse response = new MaterialResponse();
		response.setMaterialId(material.getMaterialId());
		response.setName(material.getName());
		response.setDescription(material.getDescription());
		response.setCategory(material.getCategory());
		response.setCreatedAt(material.getCretaedAt());
		return response;
	}
	
}
