package com.ipartek.formacion.service.interfaces;

import java.util.Map;

import com.ipartek.formacion.pojo.Alumno;

/**
 * @author Raúl de Roba 08/03/17
 *
 */
public interface AlumnoService {
	public Map<Integer,Alumno> getAll();
	public Alumno getById(int id);

}
