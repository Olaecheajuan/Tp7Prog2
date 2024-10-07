package busquedadedocumentos.Filtro;

import busquedadedocumentos.Documento;

public class FiltroNot extends Filtro {
    Filtro f1;
    public FiltroNot(Filtro f1) {
        this.f1 = f1;

    }
    public boolean seCumple(Documento documento){
        return !f1.seCumple(documento);
    }
}
