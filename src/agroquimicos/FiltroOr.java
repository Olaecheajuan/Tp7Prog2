package agroquimicos;

public class FiltroOr extends Filtro{
    Filtro c1;
    Filtro c2;

    public FiltroOr(Filtro c1, Filtro c2){
        this.c1 = c1;
        this.c2 = c2;
    }
    public boolean cumple(ProductoQuimico pq){
        return c1.cumple(pq) || c2.cumple(pq);
    }
}
