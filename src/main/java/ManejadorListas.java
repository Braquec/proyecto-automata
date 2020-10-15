

import java.util.ArrayList;

public class ManejadorListas {
    public static ArrayList<String> palabrasReservadas = new ArrayList<String>();
    public static ArrayList<String> operadores = new ArrayList<String>();
    public static ArrayList<String> numeros = new ArrayList<String>();
    
    public static ArrayList<Automata> automata = new ArrayList<Automata>();
    
    
    public static void agregarAutomata(Automata result){
        automata.add(result);
    }
    
}
