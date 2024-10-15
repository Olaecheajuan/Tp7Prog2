package busquedadedocumentos.Filtro;

import busquedadedocumentos.Documento;

public class FiltroPorPalabraClave extends Filtro{
    private String palabraClave;
    public FiltroPorPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }
    public boolean seCumple(Documento documento){
        return documento.seEncuentraPalabraClave(palabraClave);
    }
}
