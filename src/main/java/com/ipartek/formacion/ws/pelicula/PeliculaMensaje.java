/**
 * 
 */
package com.ipartek.formacion.ws.pelicula;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.pojo.Pelicula;

/**
 * @author Raúl de 03/03/17
 *
 */
public class PeliculaMensaje implements Serializable{

	private static final long serialVersionUID = 1L;
	/* Atributo con la lista de peliculas */
	List<Pelicula> peliculas;
	/* Atribtuo con el mensaje del servicio.*/
	String mensaje;
	
	/* Constructor vacio de la clase.*/
	public PeliculaMensaje() {
		/* Se llama al constructor del padre.*/
		super();
		/* Se inicializa la lista de peliculas. */
		this.peliculas = new ArrayList<Pelicula>();
		/* Se inicializa el mensaje de la clase.*/
		this.mensaje=null;
	}

	/**
	 * @return peliculas 
	 * Se devuelve el atributo peliculas. 
	 */
	public List<Pelicula> getPeliculas() {
		/* Se devuelve el atributo peliculas.*/
		return this.peliculas;
	}

	/**
	 * @param peliculas 
	 * Se asigna el atributo peliculas pasado por parametro.
	 */
	public void setPeliculas(List<Pelicula> peliculas) {
		/* Se asigna el atributo peliculas pasado por parametro.*/
		this.peliculas = peliculas;
	}

	/**
	 * @return mensaje 
	 * Se devuelve el atributo mensaje. 
	 */
	public String getMensaje() {
		/* Se devuelve el atributo mensaje.*/
		return this.mensaje;
	}
	/**
	 * @param mensaje 
	 * Se asigna el atributo mensaje pasado por parametro.
	 */
	public void setMensaje(String mensaje) {
		/* Se asigna el atributo mensaje pasado por parametro.*/
		this.mensaje = mensaje;
	}
}
