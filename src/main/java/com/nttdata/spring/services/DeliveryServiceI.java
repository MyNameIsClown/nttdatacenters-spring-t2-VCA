package com.nttdata.spring.services;

import com.nttdata.spring.repository.Pedido;
import com.nttdata.spring.repository.Producto;

/**
 * Administrador de pedidos
 * 
 * @author Victor Carrasco
 *
 */
public interface DeliveryServiceI {
	/**
	 * Crea un pedido
	 * @param id
	 * @param destinatario
	 * @param direccionDestinatario
	 * @param esEnvioPeninsular
	 */
	public Pedido crearPedido(Integer id, String destinatario, String direccionEntrega);
	
	/**
	 * Inserta el producto pasado por parametro en el pedido pasado como parametro
	 * @param producto
	 * @param pedido
	 */
	public void insertarProductoAPedido(Producto producto, Pedido pedido);
	
	/**
	 * Consulta los datos del pedido pasado como parametro
	 * @param pedido
	 */
	public void consultarDatosPedido(Pedido pedido);
	
	/**
	 * Calcula el precio del precio PVP del producto
	 * @param producto
	 * @return
	 */
	public Double calcularPrecioProductoPVP(Producto producto);
	
	/**
	 * Calcula el precio total del pedido
	 * @param pedido
	 * @return
	 */
	public Double precioPVPTotal(Pedido pedido);
}
