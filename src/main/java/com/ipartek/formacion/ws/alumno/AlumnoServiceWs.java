package com.ipartek.formacion.ws.alumno;



import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.ResponseWrapper;

import com.ipartek.formacion.pojo.Alumno;
import com.ipartek.formacion.pojo.AlumnoColeccion;

/* @WebService Se indica que es un servicio web,el targetNamespace es libre,aunque se pone
 * una referencia la empresa que lo contiene.El nombre corresponde a la url.
 * @XmlSeeAlso Se indica la clase que ha de devolver en XML.
 * @SOAPBinding indica el tipo de estructuración del WSDL. */
@WebService(targetNamespace="http://com.ipartek.formacion/types",name="alumnows")
@XmlSeeAlso(Alumno.class)
@SOAPBinding(use=Use.LITERAL,style=Style.RPC)
public interface AlumnoServiceWs {
	
	/* @WebMethod Se indica que va a ser un metodo de un ws. 
	 * @ResponseWrapper (solo para estilo RPC), indica el objeto que va a devolver.*/
	@WebMethod
	@ResponseWrapper(targetNamespace="http://com.ipartek.formacion/types",
			className="com.ipartek.formnacion.pojo.AlumnoColecccion")
	public AlumnoColeccion getAll();
	
	/* @WebMethod Se indica que va a ser un metodo de un ws.
	 * @ResponseWrapper (solo para estilo RPC), indica el objeto que va a devolver,
	 * si fuera un parametro sería RequestWrapper.
	 * @WebParam (solo para estilo RPC),sirve para tipificar(documentación) el parametro de entrada.*/
	@WebMethod
	@ResponseWrapper(targetNamespace="http://com.ipartek.formacion/types",className="com.ipartek.formnacion.pojo.Alumno")
	public Alumno getById(@WebParam(targetNamespace="http://com.ipartek.formacion/types", mode = Mode.IN) Integer id);
	

}
