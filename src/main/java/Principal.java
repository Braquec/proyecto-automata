/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author berch
 */

import java.io.*;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        System.out.println("**Bienvenido al Compilador**");
        System.out.println("Por favor ingrese la ruta del archivo con el diccionario");
        
        ObtenerDatos lectura = new ObtenerDatos();        
               
        String rutaDiccionario = lectura.leerDatos();
        int contador = 0, count = 0;
        
        try {
            
            System.out.println("Cargando diccionario de datos....");
            Scanner input = new Scanner(new File(rutaDiccionario));  
            while (input.hasNext()) {
                String line = input.nextLine();
                
                String[] letras = line.split(":");
                
                for (String letra: letras) {
                    letra = letra.trim();
                    System.out.println(letra);
                    if (contador == 2) {
                        String[] detalles = letra.split(",");
                        
                        for (String detalle: detalles){
                            System.err.println(detalle);
                        }    
                    }
                    contador++;
//                    Result res = new Result();
                }
                
            }
            
            
        } catch (Exception e) {
        }
    }
            
}
