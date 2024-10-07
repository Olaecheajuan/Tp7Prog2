package candycrush.Filtro;

import candycrush.Ficha;

public class FiltroNot extends Filtro {
    Filtro f1;
    public FiltroNot(Filtro f1) {
        this.f1 = f1;
    }

    @Override
    public boolean seCumple(Ficha ficha) {
        return !f1.seCumple(ficha);
    }
}
