package com.ipartek.formacion.service;

import java.util.HashMap;
import java.util.Map;

import com.ipartek.formacion.pojo.Alumno;
import com.ipartek.formacion.service.interfaces.AlumnoService;

/**
 * @author Raúl de Roba 08/03/17
 *
 */
public class AlumnoServiceImp implements AlumnoService{
	/* Se declara un atributo con un mapa de alumnos.*/
	Map<Integer,Alumno> alumnos;

	/* Constructor vacio del servicio. */
	public AlumnoServiceImp() {
		/* Se instancia el mapa del atributo de la clase.*/
		alumnos = new HashMap<Integer, Alumno>();
		/* Se llama al metodo que inicializa la lista.*/
		init();
	}

	/* Metodo que inicializa la lista.*/
	private void init() {
		/* Se instancia una clase alumno para cargar la lista.*/
		Alumno alumno = new Alumno();
		/* Se asigna el codigo del alumno.*/
		alumno.setCodigo(0);
		/* Se asigna el nombre del alumno.*/
		alumno.setNombre("Raul");
		/* Se asigna el apellido del alumno.*/
		alumno.setNombre("De Roba");		
		/* Se añade el coche en el mapa.*/
		alumnos.put(alumno.getCodigo(), alumno);
		
		/* Se instancia una clase alumno para cargar la lsita.*/
	    alumno = new Alumno();
		/* Se asigna el codigo del alumno.*/
		alumno.setCodigo(1);
		/* Se asigna el nombre del alumno.*/
		alumno.setNombre("Urko");
		/* Se asigna el apellido del alumno.*/
		alumno.setNombre("Villanueva");		
		/* Se añade el coche en el mapa.*/
		alumnos.put(alumno.getCodigo(), alumno);
		
		/* Se instancia una clase alumno para cargar la lsita.*/
		alumno = new Alumno();
		/* Se asigna el codigo del alumno.*/
		alumno.setCodigo(2);
		/* Se asigna el nombre del alumno.*/
		alumno.setNombre("Federico");
		/* Se asigna el apellido del alumno.*/
		alumno.setNombre("Gª Lorca");		
		/* Se añade el coche en el mapa.*/
		alumnos.put(alumno.getCodigo(), alumno);
	}

	/* Metodo que devuelve el mapa de los alumnos.*/
	public Map<Integer, Alumno> getAll() {
		/* Se devuelve el mapa de los alumnos. */		
		return alumnos;
	}

	/* Metodo que devuelve un alumno en base al codigo pasado por paramretro.*/
	public Alumno getById(int id) {
		/* Se devuelve el alumno en base al codigo pasado por paramretro.*/
		return alumnos.get(id);
	}

}
