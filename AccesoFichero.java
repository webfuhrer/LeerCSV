package paquete.filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AccesoFichero {
private static String ruta="T:\\LuisSanz\\personas.csv";

public static ArrayList<Persona> leerContactos() {
	ArrayList<Persona> lista=new ArrayList();
	try {
		FileReader fr=new FileReader(ruta);
		BufferedReader br=new BufferedReader(fr);
		String linea=br.readLine();
		
		while(linea!=null)
		{
			String[] datos=linea.split(",");
			Persona p=new Persona();
			
			p.setNombre(datos[0]);
			p.setApellido(datos[1]);
			int edad=Integer.parseInt(datos[2]);
			p.setEdad(edad);
			lista.add(p);
			linea=br.readLine();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return lista;
}

}
