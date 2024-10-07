package busquedadedocumentos;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private String contenido;
    ArrayList<String> autores;
    ArrayList<String> palabrasClaves;

    public Documento(String nombre, String contenido) {
        this.titulo = nombre;
        this.contenido = contenido;
        autores = new ArrayList<>();
        palabrasClaves = new ArrayList<>();
    }
    public ArrayList<String> getAutores() {
        return new ArrayList<>(autores);
    }
    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<>(palabrasClaves);
    }
    public void addAutores(String autor){
        if(!autores.contains(autor.toLowerCase())){
            autores.add(autor.toLowerCase());
        }
    }
    public void addPalabrasClaves(String pal){
        if(!palabrasClaves.contains(pal.toLowerCase())){
            palabrasClaves.add(pal.toLowerCase());
        }
    }
    public void removeAutores(String autor){
        if(autores.contains(autor)){
            autores.remove(autor);
        }
    }
    public void removePalabrasClaves(String pal){
        if(palabrasClaves.contains(pal)){
            palabrasClaves.remove(pal);
        }
    }
    public String getNombre() {
        return titulo;
    }

    public void setNombre(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String toString(){
        return titulo + "-" + contenido + "\n";
    }

}
