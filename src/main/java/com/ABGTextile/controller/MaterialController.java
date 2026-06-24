package com.ABGTextile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ABGTextile.DTO.MaterialRequest;
import com.ABGTextile.DTO.MaterialResponse;
import com.ABGTextile.model.Material;
import com.ABGTextile.service.MaterialService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/materials")
public class MaterialController 
{
	@Autowired
	private MaterialService materialService;
	
	//----------CREATE---------
	@PostMapping
	public ResponseEntity<MaterialResponse>createMaterial( @Valid @RequestBody MaterialRequest request)
	{
		return ResponseEntity.ok(materialService.createMaterial(request));
		
	}
	
	//----------READ ALL----------
	@GetMapping
	public ResponseEntity<List<MaterialResponse>>getAllMaterial()
	{
		return ResponseEntity.ok(materialService.getAllMaterial());
	}
	
	//----------READ BY ID----------
	@GetMapping("/{id}")
	public ResponseEntity<MaterialResponse>getMaterial(@PathVariable Long id)
	{
		return ResponseEntity.ok(materialService.getMaterialById(id));
	}
	
	//----------UPDATE----------
	@PutMapping("/{id}")
	public ResponseEntity<MaterialResponse> updateMaterial(@PathVariable Long id , @Valid @RequestBody MaterialRequest request)
	{
		return ResponseEntity.ok(materialService.updateMaterial(id, request));
		
	}
	
	//----------DELETE----------
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteMaterial(@PathVariable Long id)
	{
		materialService.deleteMaterial(id);
		return ResponseEntity.ok("Material Deleted successfully");
	}
	
	
	

}
