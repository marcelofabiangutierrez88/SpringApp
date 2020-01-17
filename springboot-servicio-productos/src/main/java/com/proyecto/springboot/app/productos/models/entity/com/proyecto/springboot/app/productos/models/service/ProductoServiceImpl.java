package com.proyecto.springboot.app.productos.models.entity.com.proyecto.springboot.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.springboot.app.productos.models.entity.com.proyecto.springboot.app.productos.models.dao.ProductoDao;
import com.proyecto.springboot.app.productos.models.entity.com.proyecto.springboot.app.productos.models.entity.Producto;


@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private  ProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = true )
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}
	

	@Override
	@Transactional(readOnly = true )
	public Producto findById(Long id) {
		return productoDao.findById(id).orElse(null);
	}

}
