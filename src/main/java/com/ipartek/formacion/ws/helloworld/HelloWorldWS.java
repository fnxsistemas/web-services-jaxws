/**
 * 
 */
package com.ipartek.formacion.ws.helloworld;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

/**
 * @author Raúl de Roba 07/03/17
 *
 */
/* @WebService(targetNamespace) Identificador de los servicios. Es un nombre libre,
 * aunque se usa url para que se identifique mejor.
 * @SOAPBinding Indica el tipo de Ws. */
@WebService(targetNamespace="http://ipartek.formacion.com")
@SOAPBinding(style=Style.RPC, use = Use.LITERAL)
public interface HelloWorldWS {
	public String obtenerHolaMundo();

}
