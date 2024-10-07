package plataformastream.Filtro;

import plataformastream.Pelicula;

public class RentabilidadPorAnioGenero extends Filtro{
    private int anio;
    private String genero;
    public RentabilidadPorAnioGenero(int anio, String genero) {
        this.anio = anio;
        this.genero = genero;
    }

    @Override
    public boolean seCumple(Pelicula pelicula) {
        return pelicula.getAnioEstreno() > anio || pelicula.getGenero().contains(genero.toLowerCase());
    }
}
