package vivero.Filtro;

import vivero.Planta;

public class FiltroPorRiegoSupYSolInf extends Filtro{
    @Override
    public boolean seCumple(Planta p) {
        return p.getReqSol() < 4 && p.getReqAgua() > 4;
    }
}
