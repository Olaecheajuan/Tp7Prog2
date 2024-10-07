package candycrush.Filtro;

import candycrush.Ficha;

public class FiltroPorFortaleza extends Filtro{
    @Override
    public boolean seCumple(Ficha ficha) {
        return ficha.getFortaleza() > 5;
    }
}
