/**
 * 
 */
package com.ipartek.formacion.pojo;

import java.util.Map;

/**
 * @author Raúl de Roba 10/03/17 
 *
 */
public class PeliculaCollection {
	Map<Integer,Pelicula> peliculas;

	/**
	 * @return peliculas 
	 * Se devuelve el atributo peliculas. 
	 */
	public Map<Integer, Pelicula> getPeliculas() {
		/* Se devuelve el atributo peliculas.*/
		return this.peliculas;
	}

	/**
	 * @param peliculas 
	 * Se asigna el atributo peliculas pasado por parametro.
	 */
	public void setPeliculas(Map<Integer, Pelicula> peliculas) {
		/* Se asigna el atributo peliculas pasado por parametro.*/
		this.peliculas = peliculas;
	}

}
