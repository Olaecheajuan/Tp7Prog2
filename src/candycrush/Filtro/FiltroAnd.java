package candycrush.Filtro;

import candycrush.Ficha;

public class FiltroAnd extends Filtro{
    Filtro f1;
    Filtro f2;
    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean seCumple(Ficha ficha) {
        return f1.seCumple(ficha) && f2.seCumple(ficha);
    }
}
