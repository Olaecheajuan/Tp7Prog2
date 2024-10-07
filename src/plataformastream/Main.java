package plataformastream;

import plataformastream.Filtro.*;

public class Main {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("La nueva luna","Una chica se llama nueva luna","Juan olaechea",2023,93);
        Pelicula p2 = new Pelicula("Noche estrellada","Por que el actor se estrello de noche","Robert de niro",2014,90);
        Pelicula p3 = new Pelicula("La mama de luna", "La mama de luna es un trava","Alfredo montes de oca",2011,140);
        Pelicula p4 = new Pelicula("El batman","batman","Martin scorsese",2011,96);

        p1.addActores("WILL SMITH");
        p1.addActores("jaden SMITH");
        p1.addGenero("comedia");
        p1.addGenero("misterio");
        p4.addActores("WILL SMITH");
        p4.addActores("jaden SMITH");
        p4.addGenero("suspenso");
        p4.addGenero("misterio");
        p2.addActores("margot robbie");
        p2.addGenero("terror");
        p3.addActores("emma watson");
        p3.addActores("jaden SMITH");
        p3.addGenero("terror");
        p3.addGenero("documental");

        Plataforma plataforma = new Plataforma();

        plataforma.addPelicula(p1);
        plataforma.addPelicula(p2);
        plataforma.addPelicula(p3);
        plataforma.addPelicula(p4);

        //Buscar todas las películas que en el título contenga la palabra “luna”
        FiltroPorPalabraTitulo f1 = new FiltroPorPalabraTitulo("luna");
        System.out.println(plataforma.buscarPelicula(f1));
        //Buscar todas las películas que contengan un género específico (por ejemplo,“terror”).
        FiltroPorGenero f2 = new FiltroPorGenero("terror");
        System.out.println(plataforma.buscarPelicula(f2));
        //Buscar todas las películas en las que haya actuado Will Smith y cuyo directo NO haya sido Martin Scorsese.
        FiltroActorDirector f3 = new FiltroActorDirector("will SMITH", "mARTIN scorsese");
        System.out.println(plataforma.buscarPelicula(f3));
        //Buscar todas las películas que se hayan grabado antes del 2015 y cuya duración sea menor a 95 minutos.
        FiltroAnioDuracion f4 = new FiltroAnioDuracion(2015,95);
        System.out.println(plataforma.buscarPelicula(f4));
        //Películas cuya duración sea menor a 120 minutos, que no sean del género “comedia”.
        RentabilidadPorDuracionYGenero r1 = new RentabilidadPorDuracionYGenero("comedia", 93);
        System.out.println(plataforma.buscarPelicula(r1));
        //Películas posteriores del 2017, a no ser que se trate de películas del género “infantil” o “documental”.
        RentabilidadPorAnioGenero r2 = new RentabilidadPorAnioGenero(2017,"documental");
        System.out.println(plataforma.buscarPelicula(r2));
    }
}
