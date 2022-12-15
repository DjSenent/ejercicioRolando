package com.formacion.apirest.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.formacion.apirest.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{
	
	public Producto findByNombre(String nombre);
	
	
	 @Query("select u from Producto u where u.nombre = ?1")
	 public Producto findByNombre2(String nombre);
	 
}
