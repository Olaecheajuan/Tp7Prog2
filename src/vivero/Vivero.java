package vivero;

import vivero.Filtro.Filtro;

import java.util.ArrayList;

public class Vivero {
    ArrayList<Planta> plantas;
    public Vivero() {
        plantas = new ArrayList<>();
    }
    public void addPlanta(Planta p) {
        if(!plantas.contains(p)) {
            plantas.add(p);
        }
    }
    public void removePlanta(Planta p) {
        if(plantas.contains(p)) {
            plantas.remove(p);
        }
    }
    public ArrayList<Planta> getPlantas() {
        return new ArrayList<>(plantas);
    }

    public ArrayList<Planta> buscarPlanta(Filtro f){
        ArrayList<Planta> salida = new ArrayList<>();
        for(int i=0; i<plantas.size(); i++){
            Planta p = plantas.get(i);
            if(f.seCumple(p)){
                salida.add(p);
            }
        }
        return salida;
    }

}
