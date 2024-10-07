package candycrush.Filtro;

import candycrush.Ficha;

public class FiltroPorPoderDestruccion extends Filtro {

    public boolean seCumple(Ficha ficha){
        return ficha.getPoderDestruccion() > 2;
    }
}
