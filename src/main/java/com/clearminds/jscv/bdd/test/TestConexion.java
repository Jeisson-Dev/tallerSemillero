package com.clearminds.jscv.bdd.test;

import java.sql.Connection;

import com.clearminds.jscv.bdd.ConexionBDD;
import com.clearminds.jscv.excepciones.BDDException;

public class TestConexion {

	public static void main(String[] args) {
		try {
			Connection conn = ConexionBDD.obtenerConexion();
			if (conn!=null) {
				System.out.println("Conexión exitosa");
			}
		} catch (BDDException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}