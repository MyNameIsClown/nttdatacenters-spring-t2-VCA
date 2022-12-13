package com.nttdata.spring.repository;

import java.util.List;

/**
 * Pedido
 * 
 * @author Victor Carrasco
 *
 */
public class Pedido {
	/** ID */
	private Integer id;
	
	/** Destinatario */
	private String destinatario;
	
	/** Direccion entrega */
	private String direccionEntrega;
	
	/** Es envio peninsular */
	private boolean esEnvioPeninsular;
	
	/** Lista de productos */
	private List<Producto> productos;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the destinatario
	 */
	public String getDestinatario() {
		return destinatario;
	}

	/**
	 * @param destinatario the destinatario to set
	 */
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	/**
	 * @return the direccionEntrega
	 */
	public String getDireccionEntrega() {
		return direccionEntrega;
	}

	/**
	 * @param direccionEntrega the direccionEntrega to set
	 */
	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}

	/**
	 * @return the esEnvioPeninsular
	 */
	public boolean isEsEnvioPeninsular() {
		return esEnvioPeninsular;
	}

	/**
	 * @param esEnvioPeninsular the esEnvioPeninsular to set
	 */
	public void setEsEnvioPeninsular(boolean esEnvioPeninsular) {
		this.esEnvioPeninsular = esEnvioPeninsular;
	}

	/**
	 * @return the productos
	 */
	public List<Producto> getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	/**
	 * To String
	 */
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", destinatario=" + destinatario + ", direccionEntrega=" + direccionEntrega
				+ ", esEnvioPeninsular=" + esEnvioPeninsular + ", productos=" + productos + "]";
	}
	
	
	
}
