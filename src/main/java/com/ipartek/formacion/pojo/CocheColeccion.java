package com.ipartek.formacion.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Raúl de Roba 08/03/17
 *
 * <p> Clase que contiene una colección de coches.</p>
 * <p> Es necesario encapsular la colección en una 
 *     clase porque JAVAX no reconoce listas.</p>
 */
public class CocheColeccion implements Serializable {
	private static final long serialVersionUID = 1L;
	/* Se declara una lista de coches como unico artibuto.*/
	private List<Coche> coches;
 
	/* Constructor vacio.*/
	public CocheColeccion() {
		/* Se llama al contructor del padre.*/
		super();
		/* Se inicializa la lista de coches instanciando un array de coches.*/
		this.coches = new ArrayList<Coche>();
	}
	/**
	 * @return coches 
	 * Se devuelve el atributo coches. 
	 */
	public List<Coche> getCoches() {
		/* Se devuelve el atributo coches.*/
		return this.coches;
	}

	/**
	 * @param coches 
	 * Se asigna el atributo coches pasado por parametro.
	 */
	public void setCoches(List<Coche> coches) {
		/* Se asigna el atributo coches pasado por parametro.*/
		this.coches = coches;
	}


	
	
	
}
