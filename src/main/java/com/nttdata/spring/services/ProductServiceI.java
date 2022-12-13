package com.nttdata.spring.services;

import com.nttdata.spring.repository.Producto;

/**
 * Producto service
 * 
 * @author Victor Carrasco
 *
 */
public interface ProductServiceI {
	/**
	 * Crea un producto
	 * 
	 * @param id
	 * @param nombre
	 * @param precioSinImpuestos
	 * @return
	 */
	public Producto crearProducto(Integer id, String nombre, Double precioSinImpuestos);
}
