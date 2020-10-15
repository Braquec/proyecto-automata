

import java.io.*;

public class ObtenerDatos {
    BufferedReader br;
    String recolector;
    
    public String leerDatos(){
        br = new BufferedReader(new InputStreamReader(System.in ));
        try{
            recolector = br.readLine();
        }catch(IOException i){
            System.out.println("Error al escribir los datos ingresados");
            System.exit(1);
        }
        return recolector;
    }
}
