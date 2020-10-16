
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author berch
 */
public class Automata {
    private String nombre;
    private String[] estados;
    private String[] simbolos;
    private String eInicial;
    private String eFinal;
    private String[] transiciones;
    private ArrayList<Transicion> trax;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getEstados() {
        return estados;
    }

    public void setEstados(String[] estados) {
        this.estados = estados;
    }
    

    public String[] getSimbolos() {
        return simbolos;
    }

    public void setSimbolos(String[] simbolos) {
        this.simbolos = simbolos;
    }

    public String geteInicial() {
        return eInicial;
    }

    public void seteInicial(String eInicial) {
        this.eInicial = eInicial;
    }

    public String geteFinal() {
        return eFinal;
    }

    public void seteFinal(String eFinal) {
        this.eFinal = eFinal;
    }

    public String[] getTransiciones() {
        return transiciones;
    }

    public void setTransiciones(String[] transiciones) {
        this.transiciones = transiciones;
    }

    public Automata(String nombre, String[] simbolos, String eInicial, String eFinal, String[] transiciones) {
        this.nombre = nombre;
        this.simbolos = simbolos;
        this.eInicial = eInicial;
        this.eFinal = eFinal;
        this.transiciones = transiciones;
    }
    
    public Automata(){
        
    }
    
}
