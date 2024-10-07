package vivero.Filtro;


import vivero.Planta;

public class FiltroPorClasificacion extends Filtro{
    private String clasificacion;
    public FiltroPorClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public boolean seCumple(Planta p){
        return p.getClasificacionSuperior().toLowerCase().equals(clasificacion.toLowerCase());
    }
}
