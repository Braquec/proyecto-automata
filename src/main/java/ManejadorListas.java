

import java.util.ArrayList;

public class ManejadorListas {
    public static ArrayList<String> palabrasReservadas = new ArrayList<String>();
    public static ArrayList<String> operadores = new ArrayList<String>();
    public static ArrayList<String> numeros = new ArrayList<String>();
    
    public static ArrayList<Automata> automatas = new ArrayList<Automata>();
    
    public static Automata obtenerAutomata(String nombre){
        for (Automata aut: automatas) {
            if (aut.getNombre().equals(nombre)) {
                return aut;
            }
        }
        return null;
    }
    
    public static void agregarAutomata(Automata result){
        automatas.add(result);
    }
    
}
