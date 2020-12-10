package com.clearminds.jscv.test;

import com.clearminds.jscv.dtos.Estudiante;
import com.clearminds.jscv.excepciones.BDDException;
import com.clearminds.jscv.servicios.ServicioEstudiante;

public class TestActualizar {

	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.actualizarEstudiante(new Estudiante("Pedro", "Navaja", 2));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

}
