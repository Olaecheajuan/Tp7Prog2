package plataformastream.Filtro;

import plataformastream.Pelicula;

public class FiltroPorPalabraTitulo extends Filtro{
    private String palabra;
    public FiltroPorPalabraTitulo(String palabra){
        this.palabra = palabra;
    }

    @Override
    public boolean seCumple(Pelicula pelicula) {
        return pelicula.getTitulo().toLowerCase().contains(palabra.toLowerCase());
    }
}
