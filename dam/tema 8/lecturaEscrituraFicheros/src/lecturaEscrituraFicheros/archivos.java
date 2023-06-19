package lecturaEscrituraFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class archivos {

	public static void main(String[] args) {
	 
		//escritura de ficheros
		try {
			File f3=new File("nuevo.txt");
			FileWriter fw=new FileWriter(f3);
			PrintWriter pf=new PrintWriter(fw);
			
			pf.println("hola esto es un ejemplo");
			pf.append("otra linea");
			
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//lector de ficheros
		File f = new File ("heroes_information.csv");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.exists());
		
		File a =new File("src");
		File f2= null;
		for (File file : a.listFiles()) {
			System.out.println(file.getAbsolutePath());
			
		}
		ArrayList<superHeroe> superHeroes=new ArrayList<superHeroe>();
		try {
		 FileReader fr = new FileReader(f);
		 BufferedReader bf = new BufferedReader(fr);
		 
		 
		 String linea=" ";
		 bf.readLine();
		 
		 while((linea=bf.readLine()) != null) {
			
			// System.out.println(linea);
			 
			 
			 
			 String[] valoresLinea =linea.split(",");
			
			 
			superHeroe s= new superHeroe(
					valoresLinea[1],valoresLinea[4],
					valoresLinea[2],valoresLinea[3],
					Double.valueOf(valoresLinea[6]),valoresLinea[7],
					valoresLinea[9]);
			
			superHeroes.add(s);
			
		 }
		 fr.close();
		 
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("error controlado");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		for(superHeroe sh : superHeroes) {
			if(sh.getAlimento().equals("bad")) {
			System.out.println(sh.getNombre());
			}
		}
		
	}

}
