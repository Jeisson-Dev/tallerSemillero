package com.clearminds.jscv.servicios;

import com.clearminds.jscv.bdd.ConexionBDD;
import com.clearminds.jscv.excepciones.BDDException;

import java.sql.Connection;

public class ServicioBase {
	Connection conexion = null;

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public void abrirConexion() throws BDDException {
		conexion = ConexionBDD.obtenerConexion();
	}

	public void cerrarConexion() {
		try {
			if (conexion != null) {
				conexion.close();
				System.out.println("Conexión cerrada");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al cerrar la conexión");
		}
	}

}