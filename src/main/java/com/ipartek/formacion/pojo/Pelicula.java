package com.ipartek.formacion.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Raíl de Roba 08/03/17
 *
 */
public class Pelicula implements Serializable,Comparable<Pelicula>{
	private static final long serialVersionUID = 1L;
	/* Atributos de la clase.*/
	private int codigo;
	private String nombre;
	private Date fEstreno;	
	private Genero genero;
	
	
	/**
	 * 
	 */
	public Pelicula() {
		super();
		this.codigo=0;
		this.fEstreno=null;
		this.genero=null;
		
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
	/**
	 * @return fEstreno 
	 * Se devuelve el atributo fEstreno. 
	 */
	public Date getfEstreno() {
		/* Se devuelve el atributo fEstreno.*/
		return this.fEstreno;
	}
	/**
	 * @param fEstreno 
	 * Se asigna el atributo fEstreno pasado por parametro.
	 */
	public void setfEstreno(Date fEstreno) {
		/* Se asigna el atributo fEstreno pasado por parametro.*/
		this.fEstreno = fEstreno;
	}
	/**
	 * @return genero 
	 * Se devuelve el atributo genero. 
	 */
	public Genero getGenero() {
		/* Se devuelve el atributo genero.*/
		return this.genero;
	}
	/**
	 * @param genero 
	 * Se asigna el atributo genero pasado por parametro.
	 */
	public void setGenero(Genero genero) {
		/* Se asigna el atributo genero pasado por parametro.*/
		this.genero = genero;
	}
	
	public int compareTo(Pelicula o) {
		
		return (this.getNombre().compareToIgnoreCase(o.getNombre()));
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
}
