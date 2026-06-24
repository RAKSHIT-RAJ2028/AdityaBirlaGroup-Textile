package com.ABGTextile.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ABGTextile.model.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material , Long>
{
	

}
