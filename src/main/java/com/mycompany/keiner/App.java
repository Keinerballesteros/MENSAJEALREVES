

package com.mycompany.keiner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;




public class App {

public static void main(String[] args) throws IOException{
        
        File file = new File("datos.txt"); 
        FileWriter writer = new FileWriter(file);
        PrintWriter pw = new PrintWriter(writer);
        try {     
            if (file.createNewFile()) {
                System.out.println("Fichero "+ file.getName() +" creado");
            }            
            else {
                System.out.println("No se ha podido crear el fichero. Probablemente ya exista.");
            }
        }catch(IOException error){
            System.out.println("Error al crear el fichero.");
            error.printStackTrace();
        }
        pw.print("Hola mundo cruel");
        pw.close();
        FileReader fileReader = new FileReader (file);
        BufferedReader ReadLine = new BufferedReader(fileReader);
        String line;
        line = ReadLine.readLine();
        System.out.println(line);
        String mensaje = "";
        int index = line.length();
        for (int i = index-1; i >= 0; i--) {
           mensaje += line.charAt(i);
        }
        System.out.println(mensaje);
        File newFile = new File("Archivo.txt");
        FileWriter writter = new FileWriter(newFile);
        PrintWriter print = new PrintWriter(writter);
        print.print(mensaje);
        print.close();
        
    }
}
