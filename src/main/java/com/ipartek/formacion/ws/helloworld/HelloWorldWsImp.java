/**
 * 
 */
package com.ipartek.formacion.ws.helloworld;

import javax.jws.WebService;

/**
 * @author Raúl de Roba 07/03/17
 *
 */
/* @WebService Se indica que es un servicio web,el endpointInterface se indica la clase
 * 	servicio que lo va ha contener.*/
@WebService(endpointInterface="com.ipartek.formacion.ws.helloworld.HelloWorldWS")
public class HelloWorldWsImp implements HelloWorldWS{

	public String obtenerHolaMundo() {
		return "Hola Mundo";
	}



}
