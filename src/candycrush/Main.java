package candycrush;

import candycrush.Filtro.*;

public class Main {
    public static void main(String[] args) {
        Ficha chocolate = new Ficha("chocolate",1,5,4);
        Ficha piedra = new Ficha("piedra",6,1,0);
        Ficha carameloRayas = new Ficha("carameloRayas",1,1,10);

        FichaEspecial torta = new FichaEspecial("torta",8,2);

        Tablero t1 = new Tablero(10);

        t1.addFichas(chocolate);
        t1.addFichas(piedra);
        t1.addFichas(carameloRayas);
        t1.addFichas(torta);
        torta.getPoderDestruccion();
        System.out.println(t1.calcularDificultad());
        //Todas las fichas que posean un poder de destrucción mayor a 2
        FiltroPorPoderDestruccion f1 = new FiltroPorPoderDestruccion();
        System.out.println(t1.buscarFicha(f1));
        //Todas las fichas que ocupen más de 4 lugares
        FiltroPorLugarOcupa f2 = new FiltroPorLugarOcupa();
        System.out.println(t1.buscarFicha(f2));
        //Todas las fichas que tengan una fortaleza mayor a 5
        FiltroPorFortaleza f3 = new FiltroPorFortaleza();
        System.out.println(t1.buscarFicha(f3));
        //Filtro not
        FiltroNot f4 = new FiltroNot(f1);
        System.out.println(t1.buscarFicha(f4));
        //Filtro or
        FiltroOr f5 = new FiltroOr(f1,f2);
        System.out.println(t1.buscarFicha(f5));
        //Filtro and
        FiltroAnd f6 = new FiltroAnd(f1,f2);
        System.out.println(t1.buscarFicha(f6));
    }
}
