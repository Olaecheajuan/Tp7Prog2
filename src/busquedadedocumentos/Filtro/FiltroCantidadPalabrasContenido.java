package busquedadedocumentos.Filtro;

import busquedadedocumentos.Documento;

public class FiltroCantidadPalabrasContenido extends Filtro{
    @Override
    public boolean seCumple(Documento documento) {
        return documento.getContenido().length() >= 20;
    }
}
