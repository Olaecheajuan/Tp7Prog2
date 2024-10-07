package vivero.Filtro;

import vivero.Planta;

public class FiltroPorNombreCientifico extends Filtro{
    private String palabra;
    public FiltroPorNombreCientifico(String palabra){
        this.palabra = palabra;
    }
    @Override
    public boolean seCumple(Planta p){
        return p.getNombreCientifico().toLowerCase().contains(palabra.toLowerCase());
    }
}
