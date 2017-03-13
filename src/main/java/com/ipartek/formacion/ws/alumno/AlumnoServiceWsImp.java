package com.ipartek.formacion.ws.alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.ipartek.formacion.pojo.Alumno;
import com.ipartek.formacion.pojo.AlumnoColeccion;
import com.ipartek.formacion.service.AlumnoServiceImp;
import com.ipartek.formacion.service.interfaces.AlumnoService;

/**
 * @author Raúl de Roba 08/03/17
 *
 */
/* @WebService Se indica que es un servicio web,el endpointInterface se indica la clase
 * 	servicio que lo va ha contener.*/
@WebService(endpointInterface="com.ipartek.formacion.ws.alumno.AlumnoServiceWs")
public class AlumnoServiceWsImp implements AlumnoServiceWs{
	
	/* Metodo que devuelve la clase que contiene la colecci�n de alumnos.*/
	public AlumnoColeccion getAll() {
		/* Se instancia un objeto servicio de alumnos.*/
		AlumnoService cS = new AlumnoServiceImp();
		/* Se instancia un objeto colecci�n de alumnos para poder devolver.*/
		AlumnoColeccion alumnocoleccion =new AlumnoColeccion();
		/* Se recoge el mapa de alumno recogido del servicio de alumnos. */
		Map<Integer,Alumno> alumnos = cS.getAll();
		/* Se crea una lista para extraer los alumnos del mapa.*/
		List<Alumno> alumnoLista = new ArrayList<Alumno> (alumnos.values()) ;
		/* Se asigna la lista extraida del mapa a la lista de la clase alumnocolecci�n.*/
		alumnocoleccion.setAlumnos(alumnoLista);
		/* Se devuelve el objeto con la lista.*/
		return alumnocoleccion;
	}

	/* Metodo que devuelve un alumno en base al codigo pasado por paramtro.*/
	public Alumno getById(Integer id) {
		/* Se crea un alumno donde trabajar.*/
		Alumno alumno = null;
		/* Se comprueba si se ha pasado un codigo.*/
		if (id != null){
			/* Se llama a la clase servicio de alumno.*/
			AlumnoService cS = new AlumnoServiceImp();
			/* Se recoge el alumno que coincida con el codigo pasado por parametro.*/
			alumno = cS.getById(id);				
		}
		/* Se devuelve el alumno.*/
		return alumno;
	}

}
