package vivero.Filtro;

import vivero.Planta;

public class FiltroInteriorPocoRiego extends Filtro{
    @Override
    public boolean seCumple(Planta p) {
        if(p.getLugarProsperacion().equalsIgnoreCase("interior")){
            return p.getReqAgua() < 3;
        }
        return false;
    }
}
