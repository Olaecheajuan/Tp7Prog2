package plataformastream;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private ArrayList<String> genero;
    private String director;
    private ArrayList<String> actores;
    private int anioEstreno;
    private int duracionPelicula;

    public Pelicula(String titulo, String sinopsis, String director, int anioEstreno, int duracionPelicula) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.duracionPelicula = duracionPelicula;
        genero = new ArrayList<>();
        actores = new ArrayList<>();
    }
    public void addActores(String actores) {
        if (!this.actores.contains(actores.toLowerCase())) {
            this.actores.add(actores.toLowerCase());
        }
    }

    public ArrayList<String> getActores() {
        return new ArrayList<>(actores);
    }
    public void removeActores(String actores) {
        if (this.actores.contains(actores.toLowerCase())) {
            this.actores.remove(actores.toLowerCase());
        }
    }
    public void addGenero(String genero) {
        if (!this.genero.contains(genero.toLowerCase())) {
            this.genero.add(genero.toLowerCase());
        }
    }

    public ArrayList<String> getGenero() {
        return new ArrayList<>(genero);
    }
    public void removeGenero(String genero) {
        if (this.genero.contains(genero.toLowerCase())) {
            this.genero.remove(genero.toLowerCase());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public int getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(int duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    public String toString(){
        return titulo + "-" + director + "-" + anioEstreno + "-" + duracionPelicula + "\n";
    }
}
