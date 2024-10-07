package busquedadedocumentos.Filtro;

import busquedadedocumentos.Documento;

public class FiltroPorPalabraEnTitulo extends Filtro {
    private String palabra;
    public FiltroPorPalabraEnTitulo(String palabra) {
        this.palabra = palabra;
    }
    public boolean seCumple(Documento documento) {
        return documento.getNombre().toLowerCase().contains(palabra.toLowerCase());
    }
}
