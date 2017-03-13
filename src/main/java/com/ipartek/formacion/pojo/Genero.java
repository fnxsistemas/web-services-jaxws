/**
 * 
 */
package com.ipartek.formacion.pojo;

import java.io.Serializable;

/**
 * @author Curso
 *
 */
public class Genero implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nombre;

	/**
	 * @return nombre 
	 * Se devuelve el atributo nombre. 
	 */
	public String getNombre() {
		/* Se devuelve el atributo nombre.*/
		return this.nombre;
	}

	/**
	 * @param nombre 
	 * Se asigna el atributo nombre pasado por parametro.
	 */
	public void setNombre(String nombre) {
		/* Se asigna el atributo nombre pasado por parametro.*/
		this.nombre = nombre;
	}

	/**
	 * 
	 */
	public Genero() {
		super();
		this.nombre="comedia";
	}
	
	

}
