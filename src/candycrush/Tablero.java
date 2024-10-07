package candycrush;



import candycrush.Filtro.Filtro;

import java.util.ArrayList;

public class Tablero {
    private int puntajeMinimo;
    ArrayList<Ficha> fichas;
    private int dificultad;
    public Tablero(int puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
        fichas = new ArrayList<Ficha>();
    }

    public int calcularDificultad(){
        int sumaFort = 0;
        int sumaPoderDest = 0;
        for (int i = 0; i < fichas.size(); i++) {
            Ficha ficha = fichas.get(i);
            sumaFort += ficha.getFortaleza();
            sumaPoderDest += ficha.getPoderDestruccion();
        }
        return sumaFort / sumaPoderDest;

    }

    public int getPuntajeMinimo() {
        return puntajeMinimo;
    }

    public void setPuntajeMinimo(int puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
    }

    public void addFichas(Ficha ficha) {
        if(!fichas.contains(ficha)) {
            fichas.add(ficha);
        }
    }
    public ArrayList<Ficha> getFichas() {
        return new ArrayList<>(fichas);
    }
    public void removeFichas(Ficha ficha) {
        if(fichas.contains(ficha)) {
            fichas.remove(ficha);
        }
    }
    public ArrayList<Ficha> buscarFicha(Filtro f) {
        ArrayList<Ficha> salida = new ArrayList<Ficha>();
        for(int i = 0; i < fichas.size(); i++) {
            Ficha ficha = fichas.get(i);
            if(f.seCumple(ficha)){
                salida.add(ficha);
            }
        }
        return salida;
    }
}
