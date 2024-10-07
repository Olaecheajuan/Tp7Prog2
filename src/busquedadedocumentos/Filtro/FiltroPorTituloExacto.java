package busquedadedocumentos.Filtro;

import busquedadedocumentos.Documento;

public class FiltroPorTituloExacto extends Filtro{
    private String titulo;
    public FiltroPorTituloExacto(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public boolean seCumple(Documento documento) {
        return documento.getNombre().equalsIgnoreCase(titulo);
    }
}
