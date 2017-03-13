package com.ipartek.formacion.ws.coche;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.ipartek.formacion.pojo.Coche;
import com.ipartek.formacion.pojo.CocheColeccion;
import com.ipartek.formacion.service.CocheServiceImp;
import com.ipartek.formacion.service.interfaces.CocheService;

/**
 * @author Raúl de Roba 08/03/17
 *
 */
/* @WebService Se indica que es un servicio web,el endpointInterface se indica la clase
 * 	servicio que lo va ha contener.*/
@WebService(endpointInterface="com.ipartek.formacion.ws.coche.CocheServiceWs")
public class CocheServiceWsImp implements CocheServiceWs{
	
	/* Metodo que devuelve la clase que contiene la colecci�n de coches.*/
	public CocheColeccion getAll() {
		/* Se instancia un objeto servicio de coches.*/
		CocheService cS = new CocheServiceImp();
		/* Se instancia un objeto colecci�n de coches para poder devolver.*/
		CocheColeccion cochecoleccion =new CocheColeccion();
		/* Se recoge el mapa de coches recogido del servicio de coches. */
		Map<Integer,Coche> coches = cS.getAll();
		/* Se crea una lista para extraer los coches del mapa.*/
		List<Coche> cocheLista = new ArrayList<Coche> (coches.values()) ;
		/* Se asigna la lista extraida del mapa a la lista de la clase cochecolecci�n.*/
		cochecoleccion.setCoches(cocheLista);
		/* Se devuelve el objeto con la lista.*/
		return cochecoleccion;
	}

	/* Metodo que devuelve un coche en base al codigo pasado por paramtro.*/
	public Coche getById(Integer id) {
		/* Se crea un coche donde trabajar.*/
		Coche coche = null;
		/* Se comprueba si se ha pasado un codigo.*/
		if (id != null){
			/* Se llama a la clase servicio de coche.*/
			CocheService cS = new CocheServiceImp();
			/* Se recoge el coche que coincida con el codigo pasado por parametro.*/
			coche = cS.getById(id);	
		}
		System.out.println("Codigo" + coche.getCodigo());
		/* Se devuelve el coche.*/
		return coche;
	}

}
