package com.ipartek.formacion.service;

import java.util.HashMap;
import java.util.Map;

import com.ipartek.formacion.pojo.Coche;
import com.ipartek.formacion.service.interfaces.CocheService;

/**
 * @author Raúl de Roba 08/03/17
 *
 */
public class CocheServiceImp implements CocheService{
	/* Se declara un atributo con un mapa de coches.*/
	Map<Integer,Coche> coches;

	/* Constructor vacio del servicio. */
	public CocheServiceImp() {
		/* Se instancia el mapa del atributo de la calse.*/
		coches = new HashMap<Integer, Coche>();
		/* Se llama al metodo que inicializa la lista.*/
		init();
	}

	/* Metodo que inicializa la lista.*/
	private void init() {
		/* Se instancia una clase coche para cargar la lista.*/
		Coche coche = new Coche();
		/* Se asigna el codigo del coche.*/
		coche.setCodigo(0);
		/* Se asigna el nombre del coche.*/
		coche.setNombre("Renault Megane");
		/* Se añade el coche en el mapa.*/
		coches.put(coche.getCodigo(), coche);
		
		/* Se reinstancia el coche para inicializarlo.*/
		coche = new Coche();
		/* Se asigna el codigo del coche.*/
		coche.setCodigo(1);
		/* Se asigna el nombre del coche.*/
		coche.setNombre("Audi A3");
		/* Se añade el coche en el mapa.*/
		coches.put(coche.getCodigo(), coche);
		
		/* Se reinstancia el coche para inicializarlo.*/
		coche = new Coche();
		/* Se asigna el codigo del coche.*/
		coche.setCodigo(2);
		/* Se asigna el nombre del coche.*/
		coche.setNombre("Citro�n C5");
		/* Se añade el coche en el mapa.*/
		coches.put(coche.getCodigo(), coche);
	}

	/* Metodo que devuelve el mapa de los coches.*/
	public Map<Integer, Coche> getAll() {
		/* Se devuelve el mapa de los coches. */		
		return coches;
	}

	/* Metodo que devuelve un coche en base al codigo pasado por paramretro.*/
	public Coche getById(int id) {
		/* Se devuelve el coche en base al codigo pasado por paramretro.*/
		return coches.get(id);
	}

}
