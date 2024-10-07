package plataformastream.Filtro;

import plataformastream.Pelicula;

public class RentabilidadPorDuracionYGenero extends Filtro{
    private String genero;
    private int duracion;
    public RentabilidadPorDuracionYGenero(String genero, int duracion) {
        this.genero = genero;
        this.duracion = duracion;
    }
    public boolean seCumple(Pelicula pelicula) {

        return pelicula.getDuracionPelicula() < this.duracion && !pelicula.getGenero().contains(this.genero);
    }
}
