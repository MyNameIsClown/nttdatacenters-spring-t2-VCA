package com.nttdata.spring.services;

import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Pedido;
import com.nttdata.spring.repository.Producto;

/**
 * Implementacion de DeliveryService para peninsula
 * 
 * @author Victor Carrasco
 *
 */
@Service("envioExtraPeninsular")
public class DeliveryServicePeninsulaImpl implements DeliveryServiceI{

	@Override
	public Pedido crearPedido(Integer id, String destinatario, String direccionEntrega) {
		Pedido newPedido = new Pedido();
		
		newPedido.setId(id);
		newPedido.setDestinatario(destinatario);
		newPedido.setDireccionEntrega(direccionEntrega);
		newPedido.setEsEnvioPeninsular(true);
		
		return newPedido;		
	}

	@Override
	public void insertarProductoAPedido(Producto producto, Pedido pedido) {
		if(producto!=null&&pedido.isEsEnvioPeninsular()) {
			producto.setPrecioPVP(calcularPrecioProductoPVP(producto));
			pedido.getProductos().add(producto);
		}else {
			System.out.println("Producto: " + producto + "\nno añadido (no cumple con los requisitos)" );		
		}
		
	}

	@Override
	public void consultarDatosPedido(Pedido pedido) {
		System.out.println("ID: " + pedido.getId());
		System.out.println("Destinatario: " + pedido.getDestinatario());
		System.out.println("Direccion entrega: " + pedido.getDireccionEntrega());
		System.out.println("Pedidos: " + pedido.getProductos());
		System.out.println("Precio Total: " + precioPVPTotal(pedido));
	}
	
	@Override
	public Double calcularPrecioProductoPVP(Producto producto) {
		return producto.getPrecioSinImpuestos()*0.21 + producto.getPrecioSinImpuestos();
	}

	@Override
	public Double precioPVPTotal(Pedido pedido) {
		Double precioTotal = 0d;
		for(Producto producto: pedido.getProductos()) {
			precioTotal += producto.getPrecioPVP();
		}
		return precioTotal;
	}

}
