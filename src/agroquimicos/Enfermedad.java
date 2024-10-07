package agroquimicos;

import java.sql.Array;
import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadosPatologicos;
    public Enfermedad(String nombre) {
        this.nombre = nombre;
        estadosPatologicos = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void addEstadosPatologicos(String estado){
        if(!this.estadosPatologicos.contains(estado)){
            this.estadosPatologicos.add(estado);
        }
    }
    public void removeEstadosPatologicos(String estado){
        if(this.estadosPatologicos.contains(estado)){
            this.estadosPatologicos.remove(estado);
        }
    }
    public ArrayList<String> getEstadosPatologicos(){
        return new ArrayList<String>(this.estadosPatologicos);
    }
}
