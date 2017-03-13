package com.ipartek.formacion.service.interfaces;

import java.util.Set;

import com.ipartek.formacion.pojo.Pelicula;

/**
 * @author Raúl de Roba 08/03/17
 *
 */
public interface PeliculaService {
	public Set<Pelicula> getAll();
	public Pelicula getById(int id);
	public void delete(int codigo);

}
