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
        String nombreAutomataFile;
        
        try {
            
            System.out.println("Cargando informacion del archivo...");
            Scanner input = new Scanner(new File(rutaDiccionario));  
            Automata automataArchivo = new Automata();
            while (input.hasNext()) {
                String line = input.nextLine();
                
                //Analizo la linea que corresponde
                String[] letras = line.split(":");
                for (String letra: letras) {
                    letra = letra.trim();
                    
                    if(contador == 1){
                        nombreAutomataFile = letra; 
                        automataArchivo.setNombre(letra);
                        if (ManejadorListas.obtenerAutomata(nombreAutomataFile) == null) {
                            automataArchivo.setNombre(nombreAutomataFile);
                            ManejadorListas.agregarAutomata(automataArchivo);
                        }else{
                            automataArchivo = ManejadorListas.obtenerAutomata(letra);
                        }
                        automataArchivo = ManejadorListas.obtenerAutomata(nombreAutomataFile);
                    }else if(contador == 2) {
                        String[] detalleEstados = letra.split(",");
                        ManejadorListas.obtenerAutomata(automataArchivo.getNombre()).setEstados(detalleEstados);
                    }else if(contador == 4){
                        if(ManejadorListas.obtenerAutomata(letra) == null){
                            System.out.println("No existe este automata");
                        }
                    }else if(contador == 5){
                        String[] simbolos = letra.split(",");
                        ManejadorListas.obtenerAutomata(automataArchivo.getNombre()).setSimbolos(simbolos);
                    }else if(contador == 8){
                        ManejadorListas.obtenerAutomata(automataArchivo.getNombre()).seteInicial(letra);
                    }else if(contador == 11){
                        ManejadorListas.obtenerAutomata(automataArchivo.getNombre()).seteFinal(letra);
                    }else if(contador == 14){
                        String[] transiciones = letra.split(";");
                    }
                    contador++;
                }
                
            }
            System.out.println("El archivo se ha cargado correctamente.");
            
            
            
            
            
            System.out.println("Listado de automatas");
            for (int i = 0; i < ManejadorListas.arregloAutomatas().size(); i++) {
                System.out.println(ManejadorListas.arregloAutomatas().get(i).getNombre());
                System.out.println(ManejadorListas.arregloAutomatas().get(i).getEstados()[i]);
            }
            
        } catch (Exception e) {
        }
    }
            
}
