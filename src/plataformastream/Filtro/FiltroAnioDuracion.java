package plataformastream.Filtro;

import plataformastream.Pelicula;

public class FiltroAnioDuracion extends Filtro{
    private int anio;
    private int duracion;
    public FiltroAnioDuracion(int anio, int duracion) {
        this.anio = anio;
        this.duracion = duracion;
    }

    @Override
    public boolean seCumple(Pelicula pelicula) {
        return pelicula.getAnioEstreno() < anio && pelicula.getDuracionPelicula() < duracion;
    }
}
