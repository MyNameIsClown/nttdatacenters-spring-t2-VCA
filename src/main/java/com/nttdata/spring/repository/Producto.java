package com.nttdata.spring.repository;

/**
 * Producto
 * 
 * @author Victor Carrasco
 *
 */
public class Producto {
	/** ID */
	private Integer id;
	
	/** Nombre */
	private String nombre;
	
	/** Precio PVP */
	private Double precioPVP;
	
	/** Precio sin impuestos */
	private Double precioSinImpuestos;

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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the precioPVP
	 */
	public Double getPrecioPVP() {
		return precioPVP;
	}

	/**
	 * @param precioPVP the precioPVP to set
	 */
	public void setPrecioPVP(Double precioPVP) {
		this.precioPVP = precioPVP;
	}

	/**
	 * @return the precioSinImpuestos
	 */
	public Double getPrecioSinImpuestos() {
		return precioSinImpuestos;
	}

	/**
	 * @param precioSinImpuestos the precioSinImpuestos to set
	 */
	public void setPrecioSinImpuestos(Double precioSinImpuestos) {
		this.precioSinImpuestos = precioSinImpuestos;
	}
	
	/**
	 * To String
	 */
	@Override
	public String toString() {
		return "\n\tProducto id=" + id + ", nombre=" + nombre + ", precioPVP=" + precioPVP + ", precioSinImpuestos="
				+ precioSinImpuestos + "]";
	}
	
	
	
}
