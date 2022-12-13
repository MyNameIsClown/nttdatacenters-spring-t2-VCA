package com.nttdata.spring.services;

import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Producto;

@Service("productService")
public class ProductServiceImpl implements ProductServiceI{

	@Override
	public Producto crearProducto(Integer id, String nombre, Double precioSinImpuestos) {
		Producto newProduct = new Producto();
		newProduct.setId(id);
		newProduct.setNombre(nombre);
		newProduct.setPrecioSinImpuestos(precioSinImpuestos);
		
		return newProduct;
	}

}
