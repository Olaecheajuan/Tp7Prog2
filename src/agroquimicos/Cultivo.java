package agroquimicos;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    ArrayList<Enfermedad> enfermedades;
    public Cultivo(String nombre) {
        this.nombre = nombre;
        enfermedades = new ArrayList<Enfermedad>();
    }
    public boolean esDeUtilidad(ProductoQuimico prod){
        ArrayList<Cultivo> cultivos = prod.getCultivosDesaconsejados();
        for(int i = 0; i < cultivos.size(); i++){
            Cultivo cult = cultivos.get(i);
            if(this.getNombre().equals(cult.getNombre())) {
                return false;
            }
        }
        for(int i = 0; i < enfermedades.size(); i++){
            if(chequearEnfermedad(prod, this.enfermedades.get(i))){
                return true;
            }
        }
        return false;
    }
    public boolean chequearEnfermedad(ProductoQuimico produc, Enfermedad enfermedad) {
        return produc.getEstadosPatologicos().containsAll(enfermedad.getEstadosPatologicos());

    }
    public String getNombre() {
        return nombre;
    }

    public void addEnfermedades(Enfermedad enfer){
        if(!this.enfermedades.contains(enfer)){
            this.enfermedades.add(enfer);
        }
    }

    public ArrayList<Enfermedad> getEnfermedades() {
        return new ArrayList<>(this.enfermedades);
    }
    public boolean equals(Object o1){
        if (o1 instanceof Cultivo) {
            Cultivo cult = (Cultivo) o1;
            return cult.getNombre().equals(this.getNombre());
        }
        return false;
    }

}
