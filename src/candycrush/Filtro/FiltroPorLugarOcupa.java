package candycrush.Filtro;

import candycrush.Ficha;

public class FiltroPorLugarOcupa extends Filtro{
    @Override
    public boolean seCumple(Ficha ficha) {
        return ficha.getEspacioOcupa() > 4;
    }
}
