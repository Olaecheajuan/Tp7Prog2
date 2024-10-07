package plataformastream;


import plataformastream.Filtro.Filtro;

import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Pelicula> peliculas;
    public Plataforma() {
        peliculas = new ArrayList<>();
    }

    public ArrayList<Pelicula> getCatalogo() {
        return new ArrayList<>(peliculas);
    }
    public void addPelicula(Pelicula p) {
        if (!peliculas.contains(p)){
            peliculas.add(p);
        }
    }
    public void removePelicula(Pelicula p) {
        if (peliculas.contains(p)){
            peliculas.remove(p);
        }
    }
    public ArrayList<Pelicula> buscarPelicula(Filtro f) {
        ArrayList<Pelicula> salida = new ArrayList<Pelicula>();
        for(int i = 0; i < peliculas.size(); i++) {
            Pelicula pelicula = peliculas.get(i);
            if(f.seCumple(pelicula)){
                salida.add(pelicula);
            }
        }
        return salida;
    }
}
