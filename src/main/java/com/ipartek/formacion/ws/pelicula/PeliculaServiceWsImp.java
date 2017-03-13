package com.ipartek.formacion.ws.pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import com.ipartek.formacion.pojo.Pelicula;
import com.ipartek.formacion.service.PeliculaServiceImp;
import com.ipartek.formacion.service.interfaces.PeliculaService;


/**
 * @author Raúl de Roba 08/03/17
 *
 */
/* @WebService Se indica que es un servicio web,el endpointInterface se indica la clase
 * 	servicio que lo va ha contener.*/
@WebService(serviceName="peliculasservice",portName="",targetNamespace="PeliculaWs")
@SOAPBinding(style=Style.DOCUMENT,use=Use.LITERAL)
public class PeliculaServiceWsImp{
	
	// TODO
	@Resource
	private WebServiceContext webServiceContext;
	
	/* Metodo que devuelve una pelicula en base al codigo pasado por paramtro.*/
	@WebMethod(operationName="obtenerporid")
	public PeliculaMensaje getById(Integer id) {
		/* Se crea una clase para recoger el mensaje de las peliculas. */
		PeliculaMensaje peliculaMensaje = new PeliculaMensaje();
		/* Se crea la lista para recoger las peliculas.*/
		List<Pelicula> peliculas = new ArrayList<Pelicula>();
		/* Se crea un pelicula donde trabajar.*/		
		Pelicula pelicula = null;
		/* Se valida la cabecera de la petición. */
		if (validarPeticion()){
			/* Se comprueba si se ha pasado un codigo.*/
			if (id != null){
				/* Se llama a la clase servicio de pelicula.*/
				PeliculaService pS = new PeliculaServiceImp();	
				/* Se recoge la pelicula pasada por id desde el servicio.*/
				pelicula = pS.getById(id);				
				/* Se comrpueba si existe pelicula.*/
				if (pelicula == null){	
					/* Se carga mensaje de error en la clase de PeliculaMensaje.*/
					peliculaMensaje.setMensaje("No encontrada");				
				}else{
					/* Se añade la pelicula a la lista.*/
					peliculas.add(pelicula);
					/* Se asigna la lista de peliculas a la clase PeliculaMensaje.*/
					peliculaMensaje.setPeliculas(peliculas);
				}
			}
		}else{
			/* Se carga mensaje de error en la clase de PeliculaMensaje.*/
			peliculaMensaje.setMensaje("No VALIDO");	
		}
		/* Se devuelve la clase PeliculaMensaje que contiene 
		 * la lista de peliculas y el mensaje.*/
		return peliculaMensaje;
	}
	
	/* Metodo que devuelve una pelicula en base al codigo pasado por paramtro.*/
	@WebMethod(operationName="obtenerportodo")
	public PeliculaMensaje getAll() {
		/* Se crea una clase para recoger el mensaje de las peliculas. */
		PeliculaMensaje peliculaMensaje = new PeliculaMensaje();
		/* Se crea la lista para recoger las peliculas.*/
		List<Pelicula> peliculas = null;
		/* Se valida la cabecera de la petición. */
		if (validarPeticion()){
			/* Se llama a la clase servicio de pelicula.*/
			PeliculaService pS = new PeliculaServiceImp();	
			/* Se construye un Array para contener el get que devuelve el getAll del service.*/
			peliculas = new ArrayList<Pelicula>(pS.getAll());				
			/* Se comrpueba si existe pelicula.*/
			if (peliculas == null){	
				/* Se carga mensaje de error en la clase de PeliculaMensaje.*/
				peliculaMensaje.setMensaje("No encontrada");				
			}else{
				/* Se asigna la lista de peliculas a la clase PeliculaMensaje.*/
				peliculaMensaje.setPeliculas(peliculas);
			}
		}else{
			/* Se carga mensaje de error en la clase de PeliculaMensaje.*/
			peliculaMensaje.setMensaje("No Valido");	
		}
		/* Se devuelve la clase PeliculaMensaje que contiene 
		 * la lista de peliculas y el mensaje.*/
		return peliculaMensaje;
	}
	
	/* Metodo que elimina una pelicula en base al codigo pasado por parametro.*/
	@WebMethod(operationName="borrarpelicula")
	public PeliculaMensaje delete (Integer codigo) {
		PeliculaMensaje peliculaMensaje = null;
	
		/* Se valida la cabecera de la petición. */
		if (validarPeticion()){
			/* Se llama a la clase servicio de pelicula.*/
			PeliculaService pS = new PeliculaServiceImp();	
			/* Se construye un Array para contener el get que devuelve el getAll del service.*/
			pS.delete(codigo);
			List<Pelicula> peliculas = new ArrayList<Pelicula>(pS.getAll());	
			peliculaMensaje.setPeliculas(peliculas);		
		}
		return peliculaMensaje;	
	}
	
	private boolean validarPeticion(){
		boolean valido = true;
		/* MessageContext es un mapa de mapas que contiene en contexto de la petición. */
		MessageContext contextoMensaje = webServiceContext.getMessageContext();
		/* Se crea un mapa que puede contener cualquier cosa,sin un clase expecifica.
		 * Se recogen todos los encabezados de la petición.*/
		Map<?,?> encabezados = (Map<?, ?>) contextoMensaje.get(MessageContext.HTTP_REQUEST_HEADERS);
		/* Se recoge el atributo 'sesionId' del encabezado que a su vez es una lista. */
		List<?> sesion = (List<?>) encabezados.get("sesionId");
		/* Se declara la costante para el nombre de sesion.*/
		final String SESIONID = "ipsesion";
		/* Se comprueba que se haya recogido sesion. */
		if(sesion!=null){
			/* Se comprueba el primer elemento de la lista con en nombre de la sesión.*/
			if(SESIONID.equals(sesion.get(0).toString())){
				/* Se asigna petición valida.*/
				valido = true;
			}			
		}
		/* Se devuelve la validación.*/
		return valido;		
	}

}
