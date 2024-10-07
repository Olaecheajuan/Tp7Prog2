package plataformastream.Filtro;

import plataformastream.Pelicula;

public class FiltroPorGenero extends Filtro{
    private String genero;
    public FiltroPorGenero(String genero){
        this.genero = genero;
    }

    @Override
    public boolean seCumple(Pelicula pelicula) {
        return pelicula.getGenero().contains(genero.toLowerCase());
    }
}
