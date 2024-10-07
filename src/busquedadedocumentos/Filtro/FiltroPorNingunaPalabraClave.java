package busquedadedocumentos.Filtro;

import busquedadedocumentos.Documento;

public class FiltroPorNingunaPalabraClave extends Filtro {
    public boolean seCumple(Documento documento){
        return documento.getPalabrasClaves().isEmpty();
    }
}
