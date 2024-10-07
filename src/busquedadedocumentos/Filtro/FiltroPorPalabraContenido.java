package busquedadedocumentos.Filtro;

import busquedadedocumentos.Documento;

public class FiltroPorPalabraContenido extends Filtro{
    private String palabra;
    public FiltroPorPalabraContenido(String palabra) {
        this.palabra = palabra;
    }
    public boolean seCumple(Documento documento) {
        return documento.getContenido().toLowerCase().contains(palabra.toLowerCase());
    }
}
