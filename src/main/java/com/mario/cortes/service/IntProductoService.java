package com.mario.cortes.service;

import java.util.List;

import com.mario.cortes.model.Producto;

public interface IntProductoService {
	//logica del negocio
	public List<Producto> obtenerTodos();
	public void guardar(Producto producto);
	public void eliminar(Integer idProducto);
	public Producto buscarPorId(Integer idProducto);

}
