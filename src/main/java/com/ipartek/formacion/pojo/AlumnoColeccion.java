package com.ipartek.formacion.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Raúl de Roba 08/03/17
 *
 * <p> Clase que contiene una colección de alumnos.</p>
 * <p> Es necesario encapsular la colección en una 
 *     clase porque JAVAX no reconoce listas.</p>
 */
public class AlumnoColeccion implements Serializable {
	private static final long serialVersionUID = 1L;
	/* Se declara una lista de coches como unico artibuto.*/
	private List<Alumno> alumnos;
 
	/* Constructor vacio.*/
	public AlumnoColeccion() {
		/* Se llama al contructor del padre.*/
		super();
		/* Se inicializa la lista de coches instanciando un array de alumnos.*/
		this.alumnos = new ArrayList<Alumno>();
	}
	/**
	 * @return coches 
	 * Se devuelve el atributo alumnos. 
	 */
	public List<Alumno> getAlumnos() {
		/* Se devuelve el atributo coches.*/
		return this.alumnos;
	}

	/**
	 * @param coches 
	 * Se asigna el atributo alumno pasado por parametro.
	 */
	public void setAlumnos(List<Alumno> alumno) {
		/* Se asigna el atributo coches pasado por parametro.*/
		this.alumnos = alumno;
	}


	
	
	
}
