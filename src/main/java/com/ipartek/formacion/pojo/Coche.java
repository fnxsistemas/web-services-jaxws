package com.ipartek.formacion.pojo;

import java.io.Serializable;

/**
 * @author Raúl de Roba 08/03/17
 *
 */
public class Coche implements Serializable{
	private static final long serialVersionUID = 1L;
	/* Atributos de la clase.*/
	private int codigo;
	private String nombre;	

	/* Constructor de la clase.*/
	public Coche() {
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
