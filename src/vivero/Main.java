package vivero;

import vivero.Filtro.*;

public class Main {
    public static void main(String[] args) {
        Planta p1 = new Planta("Epipremnum auereum","Epipremnum","Araceae","Monocotyledoneae","Interior",4,3);
        p1.addNombreVulgar("potus");
        p1.addNombreVulgar("pothos");
        p1.addNombreVulgar("potos");
        Planta p2 = new Planta("Erythrina crista-galle","Erythrina","Fabaceae","Magnoliopsida","Exterior",9,1);
        p2.addNombreVulgar("ceibo");
        p2.addNombreVulgar("seibo");
        Planta p3 = new Planta("Ficus elastica", "Crassula","Moraceae","Magnoliopsida","interior",3,2);
        p3.addNombreVulgar("Ficus");
        p3.addNombreVulgar("Arbol de caucho");
        Planta p4 = new Planta("Lysimachia auereum","Lysimachia","Primulaceae","Magnoliopsida","Interior",3,5);
        p4.addNombreVulgar("Hierba de oro");
        Planta p5 = new Planta("Sansevieria trifasciata","Sansevieria","Asparagaceae","Monocotyledoneae","interior",3,1);
        p5.addNombreVulgar("Espada de San Jorge");
        p5.addNombreVulgar("Lengua de suegra");
        Vivero v1 = new Vivero();

        v1.addPlanta(p1);
        v1.addPlanta(p5);
        v1.addPlanta(p2);
        v1.addPlanta(p3);
        v1.addPlanta(p4);

        //Todas las plantas cuyo nombre científico incluya la palabra “auereum”
        System.out.println("a");
        FiltroPorNombreCientifico f1 = new FiltroPorNombreCientifico("auereum");
        System.out.println(v1.buscarPlanta(f1));
        //Todas las plantas a las que se conozca vulgarmente como “lengua de suegra”
        System.out.println("b");
        FiltroPorNombreVulgar f2 = new FiltroPorNombreVulgar("lengua de suegra");
        System.out.println(v1.buscarPlanta(f2));
        //Todas las plantas cuya clasificación sea “Crassula”
        System.out.println("c");
        FiltroPorClasificacion f3 = new FiltroPorClasificacion("crassula");
        System.out.println(v1.buscarPlanta(f3));
        //Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3
        System.out.println("d");
        FiltroPorRiegoInfYSolSup f4 = new FiltroPorRiegoInfYSolSup();
        System.out.println(v1.buscarPlanta(f4));
        //Todas las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4
        System.out.println("e");
        FiltroPorRiegoSupYSolInf f5 = new FiltroPorRiegoSupYSolInf();
        System.out.println(v1.buscarPlanta(f5));
        //Todas las plantas de interior que necesiten poco riego (inferior a 3)
        System.out.println("f");
        FiltroInteriorPocoRiego f6 = new FiltroInteriorPocoRiego();
        System.out.println(v1.buscarPlanta(f6));

    }
}
