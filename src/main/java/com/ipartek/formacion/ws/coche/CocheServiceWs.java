package com.ipartek.formacion.ws.coche;



import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.ipartek.formacion.pojo.Coche;
import com.ipartek.formacion.pojo.CocheColeccion;


/* @WebService Se indica que es un servicio web,el targetNamespace es libre,aunque se pone
 * una referencia la empresa que lo contiene.El nombre corresponde a la url.
 * @SOAPBinding indica el tipo de estructuración del WSDL. */
@WebService(targetNamespace="http://com.ipartek.formacion/types",wsdlLocation="Cocheservice.wsdl" ,name ="cochews")
@SOAPBinding(use=Use.LITERAL,style=Style.DOCUMENT)
public interface CocheServiceWs {
	
	/* @WebMethod Se indica que va a ser un metodo de un ws.*/
	@WebMethod	
	public CocheColeccion getAll();
	
	/* @WebMethod Se indica que va a ser un metodo de un ws.
	 * se puede incluir el atributo 'operationName' para que desde WSDL se 
	 * llame de otra manera.*/
	@WebMethod(operationName="obtenercoche")
	public Coche getById(Integer id);
	

}
