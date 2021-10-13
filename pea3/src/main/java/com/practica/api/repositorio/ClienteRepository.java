package com.practica.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practica.api.modelo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	/*public List<Producto> findByPedidoInterno(PedidoInterno pedidointerno);
	public List<Producto> findByVenta(Venta venta);
	public List<Producto> findByCompra(Compra compra);*/
	
}
