package vivero.Filtro;

import vivero.Planta;

public class FiltroPorRiegoInfYSolSup extends Filtro{
    public boolean seCumple(Planta p){
        return p.getReqAgua() < 3 && p.getReqSol() > 5;
    }
}
