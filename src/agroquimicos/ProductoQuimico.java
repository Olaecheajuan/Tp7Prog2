package agroquimicos;

import java.util.ArrayList;

public class ProductoQuimico {
    private String nombre;
    ArrayList<Cultivo> cultivosDesaconsejados;
    ArrayList<String> estadosPatologicos;
    public ProductoQuimico(String nombre) {
        this.nombre = nombre;
        cultivosDesaconsejados = new ArrayList<Cultivo>();
        estadosPatologicos = new ArrayList<String>();
    }
    public String getNombre() {
        return nombre;
    }
    public void addCultivoDesaconsejado(Cultivo cultivo) {
        if(!this.cultivosDesaconsejados.contains(cultivo)) {
            this.cultivosDesaconsejados.add(cultivo);
        }
    }
    public ArrayList<Cultivo> getCultivosDesaconsejados() {
        return new ArrayList<Cultivo>(this.cultivosDesaconsejados);
    }
    public ArrayList<String> getEstadosPatologicos(){
        return new ArrayList<String>(this.estadosPatologicos);
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
    public void removeCultivoDesaconsejado(Cultivo cultivo){
        if(!this.cultivosDesaconsejados.contains(cultivo)) {
            this.cultivosDesaconsejados.add(cultivo);
        }
    }
    public boolean puedeTratarEnfermedad(Enfermedad enf){
        return this.estadosPatologicos.containsAll(enf.getEstadosPatologicos());
    }
    public boolean equals(Object o1){
        if (o1 instanceof ProductoQuimico) {
            ProductoQuimico pq = (ProductoQuimico) o1;
            return pq.getNombre().equals(this.getNombre());
        }
        return false;
    }
}
