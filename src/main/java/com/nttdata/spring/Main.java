package com.nttdata.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.nttdata.spring.repository.Pedido;
import com.nttdata.spring.repository.Producto;
import com.nttdata.spring.services.DeliveryServiceI;
import com.nttdata.spring.services.ProductServiceI;

/**
 * Main class
 * 
 * @author Victor Carrasco
 *
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Main implements CommandLineRunner{
	@Autowired
	@Qualifier("envioPeninsular")
	DeliveryServiceI deliveryPeninsular;
	
	@Autowired
	@Qualifier("envioExtraPeninsular")
	DeliveryServiceI deliveryExtraPeninsular;
	
	@Autowired
	ProductServiceI productService;
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	
	/**
	 * Run
	 * 
	 * @param args
	 */
	public void run(String... args) throws Exception{
		Producto p1 = productService.crearProducto(1, "pantalones", 12d);
		Producto p2 = productService.crearProducto(2, "camiseta", 8d);
		Producto p3 = productService.crearProducto(3, "gafas", 50d);
		Producto p4 = productService.crearProducto(4, "chanclas", 10d);
		
		Pedido pd1 = deliveryPeninsular.crearPedido(1, "Juan", "C/Avila 5");
		
		deliveryPeninsular.insertarProductoAPedido(p1, pd1);
		deliveryPeninsular.insertarProductoAPedido(p3, pd1);
		deliveryPeninsular.insertarProductoAPedido(p2, pd1);
		deliveryExtraPeninsular.insertarProductoAPedido(p4, pd1);
		
		deliveryPeninsular.consultarDatosPedido(pd1);
	}
}
