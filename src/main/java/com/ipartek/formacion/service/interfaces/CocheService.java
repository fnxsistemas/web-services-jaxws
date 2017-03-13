package com.ipartek.formacion.service.interfaces;

import java.util.Map;

import com.ipartek.formacion.pojo.Coche;

/**
 * @author Raúl de Roba 08/03/17
 *
 */
public interface CocheService {
	public Map<Integer,Coche> getAll();
	public Coche getById(int id);

}
