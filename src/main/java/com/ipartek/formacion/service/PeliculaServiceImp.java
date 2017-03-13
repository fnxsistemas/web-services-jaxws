package com.ipartek.formacion.service;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


import com.ipartek.formacion.pojo.Genero;
import com.ipartek.formacion.pojo.Pelicula;
import com.ipartek.formacion.service.interfaces.PeliculaService;

/**
 * @author Raúl de Roba 08/03/17
 *
 */
public class PeliculaServiceImp implements PeliculaService{
	/* Se declara un atributo con un lista de peliculas.*/
	Set<Pelicula> peliculas;

	/* Constructor vacio del servicio. */
	public PeliculaServiceImp() {
		/* Se instancia el mapa del atributo de la clase.*/
		peliculas = new TreeSet<Pelicula>();
		/* Se llama al metodo que inicializa la lista.*/
		init();
	}

	/* Metodo que inicializa la lista.*/
	private void init() {
		/* Se instancia una clase alumno para cargar la lsita.*/
		Pelicula pelicula = new Pelicula();
		/* Se asigna el codigo del pelicula.*/
		pelicula.setCodigo(0);
		/* Se asigna el nombre de la pelicula.*/
		pelicula.setNombre("Pelicula Uno");
		/* Se asigna la fecha de estreno.*/
		pelicula.setfEstreno(new Date());
		/* Se genera la clase para guardar el genero.*/
		Genero genero = new Genero();
		/* Se asocia el nombre del genero.*/
		genero.setNombre("Risas");
		/* Se asocia el genero a la pelicula.*/
		pelicula.setGenero(genero);
		/* Se añade la pelicula a la lista.*/
		peliculas.add(pelicula);
		
		/* Se instancia una clase alumno para cargar la lsita.*/
		pelicula = new Pelicula();
		/* Se asigna el codigo del pelicula.*/
		pelicula.setCodigo(1);
		/* Se asigna el nombre de la pelicula.*/
		pelicula.setNombre("Pelicula Dos");
		/* Se asigna la fecha de estreno.*/
		pelicula.setfEstreno(new Date());
		/* Se genera la clase para guardar el genero.*/
		genero = new Genero();
		/* Se asocia el nombre del genero.*/
		genero.setNombre("No Risas");
		/* Se asocia el genero a la pelicula.*/
		pelicula.setGenero(genero);
		/* Se añade la pelicula a la lista.*/
		peliculas.add(pelicula);
		
		/* Se instancia una clase alumno para cargar la lsita.*/
		pelicula = new Pelicula();
		/* Se asigna el codigo del pelicula.*/
		pelicula.setCodigo(2);
		/* Se asigna el nombre de la pelicula.*/
		pelicula.setNombre("Pelicula Tres");
		/* Se asigna la fecha de estreno.*/
		pelicula.setfEstreno(new Date());
		/* Se genera la clase para guardar el genero.*/
		genero = new Genero();
		/* Se asocia el nombre del genero.*/
		genero.setNombre("Pa cagarse");
		/* Se asocia el genero a la pelicula.*/
		pelicula.setGenero(genero);
		/* Se añade la pelicula a la lista.*/
		peliculas.add(pelicula);		
		
	   
	}

	/* Metodo que devuelve la lista de peliculas.*/
	public Set<Pelicula> getAll() {
		/* Se devuelve el mapa de los peliculas. */		
		return peliculas;
	}

	/* Metodo que devuelve una pelicula en base al codigo pasado por paramretro.*/
	public Pelicula getById(int id) {
		Pelicula pelicula = encontrarPorCodigo(id);
		/* Se devuelve el alumno en base al codigo pasado por paramretro.*/
		return pelicula;
	}

	/* Metodo que busca una pelicula por un codigo pasado por parametro.*/
	private Pelicula encontrarPorCodigo(int id) {
		/* Se inicializa la variable que va a devolver si se ha encontrado la pelicula.*/
		boolean encontrado = false;
		/* Se instancia un objetp pelicula sobre la que recoger la pelicula encontrada. */
		Pelicula pelicula = null;
		/* Se crea un iterador para recorrer la lista de peliculas sobre la lista de la clase.*/
		Iterator<Pelicula> iteradorPeliculas = peliculas.iterator();
		/* Mientras no se haya encontrado la pelicula y 
		 * no se haya alcanzado el final de la lista.*/
		while (iteradorPeliculas.hasNext() && !encontrado){
			/* Se crea un obejeto pelicula para recoger la pelicula actual y 
			 * poder asi compararla.*/
			Pelicula peliculaAux = iteradorPeliculas.next();
			/* Se compara el codigo de la pelicula con el código pasado por parametro.*/
			if(peliculaAux.getCodigo() == id){
				/* Se asigna true al flag que comprueba si se ha encontrado la pelicula.*/
				encontrado = true;
				/* Se asigna la pelicula encontrada.*/
				pelicula = peliculaAux;
			}
	
		}	
		/* Se devuelve la pelcicula.*/
		return pelicula;
	}
	
	/* Metodo que elimina una pelicula de la lista.*/
	public void delete(int codigo){
		/* Se recoge la pelicula.*/
		Pelicula pelicula = this.encontrarPorCodigo(codigo);
		/* Se elimina la pelicula. */
		peliculas.remove(pelicula);
	}

	
}
