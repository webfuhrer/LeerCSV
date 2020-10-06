package paquete.filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		ArrayList<Persona> lista_personas =AccesoFichero.leerContactos();
		for(Persona p: lista_personas)
		{
			System.out.println("Persona: "+p);
		}
	}

}
