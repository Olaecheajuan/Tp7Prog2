package busquedadedocumentos.Filtro;

import busquedadedocumentos.Documento;

public class FiltroOr extends Filtro {
    Filtro f1;
    Filtro f2;
    public FiltroOr(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    public boolean seCumple(Documento documento){
        return f1.seCumple(documento) || f2.seCumple(documento);
    }
}
