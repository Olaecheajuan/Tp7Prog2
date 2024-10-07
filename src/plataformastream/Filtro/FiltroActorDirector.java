package plataformastream.Filtro;

import plataformastream.Pelicula;

public class FiltroActorDirector extends Filtro {
    private String actor;
    private String director;
    public FiltroActorDirector(String actor, String director) {
        this.actor = actor;
        this.director = director;
    }

    @Override
    public boolean seCumple(Pelicula pelicula) {
        return pelicula.getActores().contains(actor.toLowerCase()) && !pelicula.getDirector().equalsIgnoreCase(director);
    }
}
