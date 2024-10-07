package busquedadedocumentos;

import busquedadedocumentos.Filtro.Filtro;

import java.util.ArrayList;

public class Coleccion {
    ArrayList<Documento> documentos;
    public Coleccion() {
        documentos = new ArrayList<>();
    }
    public ArrayList<Documento> getDocumentos() {
        return new ArrayList<>(documentos);
    }
    public void addDocumento(Documento d) {
        if(!documentos.contains(d)) {
            documentos.add(d);
        }
    }
    public void removeDocumento(Documento d) {
        if(documentos.contains(d)) {
            documentos.remove(d);
        }
    }

    public ArrayList<Documento> buscarDocumento(Filtro f) {
        ArrayList<Documento> salida = new ArrayList<Documento>();
        for(int i = 0; i < documentos.size(); i++) {
            Documento d = documentos.get(i);
            if(f.seCumple(d)){
                salida.add(d);
            }
        }
        return salida;
    }
}
