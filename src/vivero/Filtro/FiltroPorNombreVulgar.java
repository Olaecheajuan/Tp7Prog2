package vivero.Filtro;

import vivero.Planta;

public class FiltroPorNombreVulgar extends Filtro{
    private String nombre;
    public FiltroPorNombreVulgar(String nombre) {
        this.nombre = nombre;
    }
    public boolean seCumple(Planta p){
        return p.getNombresVulgares().contains(nombre.toLowerCase());
    }
}
