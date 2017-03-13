package com.ipartek.formacion.pojo;

import java.io.Serializable;

/**
 * @author Raúl de Roba 08/03/17
 *
 */
public class Alumno implements Serializable{
	private static final long serialVersionUID = 1L;
	/* Atributos de la clase.*/
	private int codigo;
	private String nombre;
	private String apellidos;	

	/**
	 * @return apellidos 
	 * Se devuelve el atributo apellidos. 
	 */
	public String getApellidos() {
		/* Se devuelve el atributo apellidos.*/
		return this.apellidos;
	}

	/**
	 * @param apellidos 
	 * Se asigna el atributo apellidos pasado por parametro.
	 */
	public void setApellidos(String apellidos) {
		/* Se asigna el atributo apellidos pasado por parametro.*/
		this.apellidos = apellidos;
	}

	/* Constructor de la clase.*/
	public Alumno() {
		/* Se llama al contructor del padre.*/
		super();
		/* Se inicializa el codigo.*/
		this.codigo = 0;
	}

	/**
	 * @return codigo 
	 * Se devuelve el atributo codigo. 
	 */
	public int getCodigo() {
		/* Se devuelve el atributo codigo.*/
		return this.codigo;
	}

	/**
	 * @param codigo 
	 * Se asigna el atributo codigo pasado por parametro.
	 */
	public void setCodigo(int codigo) {
		/* Se asigna el atributo codigo pasado por parametro.*/
		this.codigo = codigo;
	}

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


}
