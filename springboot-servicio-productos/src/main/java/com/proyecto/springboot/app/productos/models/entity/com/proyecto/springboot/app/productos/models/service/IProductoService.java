package com.proyecto.springboot.app.productos.models.entity.com.proyecto.springboot.app.productos.models.service;

import java.util.List;

import com.proyecto.springboot.app.productos.models.entity.com.proyecto.springboot.app.productos.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
	
	
}
