package busquedadedocumentos;

import busquedadedocumentos.Filtro.*;

public class Main {
    public static void main(String[] args) {
        Documento d1 = new Documento("Aladin y los 4 reyes magos", "Habia una vez...");
        d1.addAutores("Juan Olaechea");
        d1.addAutores("Esteban quito");
        d1.addPalabrasClaves("Misterio");
        d1.addPalabrasClaves("Suspenso");
        Documento d2 = new Documento("Papa noel y las aventuras del rayo mcqueen", "Rodolfo paez...");
        d2.addAutores("Juan Olaechea");
        d2.addAutores("Roberto Sanchez");
        d2.addPalabrasClaves("Misterio");
        d2.addPalabrasClaves("Drama");
        Documento d3 = new Documento("Lionel messi y su sexto sentido", "El mejor jugador de la historia...");
        d3.addAutores("Brenda gonzalez");
        d3.addAutores("Pedro gomez");
        d3.addPalabrasClaves("Accion");
        d3.addPalabrasClaves("Explicito");
        Documento d4 = new Documento("Ronaldo el fracasado mayor", "El peor jugador de la historia...");
        d4.addAutores("Paula gonzalez");
        d4.addAutores("Lucas perez");

        Coleccion coleccion = new Coleccion();

        coleccion.addDocumento(d1);
        coleccion.addDocumento(d2);
        coleccion.addDocumento(d3);
        coleccion.addDocumento(d4);

        // Todos los documentos cuyo título sea exactamente igual a un título dado.
        System.out.println("Titulo exacto");
        FiltroPorTituloExacto f1 = new FiltroPorTituloExacto("Aladin y los 4 reyes magos");
        System.out.println(coleccion.buscarDocumento(f1));
        //Todos los documentos cuyo título contenga una palabra o frase dada.
        System.out.println("Titulo con palabra o frase");
        FiltroPorPalabraEnTitulo f2 = new FiltroPorPalabraEnTitulo("MESSI");
        System.out.println(coleccion.buscarDocumento(f2));
        //Todos los documentos que contengan una palabra clave dada.
        System.out.println("Por palabra clave");
        FiltroPorPalabraClave f3 = new FiltroPorPalabraClave("Misterio");
        System.out.println(coleccion.buscarDocumento(f3));
        //Todos los documentos que no contengan ninguna palabra clave.
        System.out.println("Ninguna palabra clave");
        FiltroPorNingunaPalabraClave f4 = new FiltroPorNingunaPalabraClave();
        System.out.println(coleccion.buscarDocumento(f4));
        //Todos los documentos de un autor determinado
        System.out.println("Todos los documentos de un autor");
        FiltroPorDocumentoDeUnAutor f5 = new FiltroPorDocumentoDeUnAutor("Juan olaechea");
        System.out.println(coleccion.buscarDocumento(f5));
        //Todos los documentos cuyo contenido tenga una palabra o frase dada.
        System.out.println("Palabra en el contenido");
        FiltroPorPalabraContenido f6 = new FiltroPorPalabraContenido("El mEjor");
        System.out.println(coleccion.buscarDocumento(f6));
        // Todos los documentos cuyo contenido tenga al menos 20 palabras.
        System.out.println("Documento con mas de 20 palabras");
        FiltroCantidadPalabrasContenido f7 = new FiltroCantidadPalabrasContenido();
        System.out.println(coleccion.buscarDocumento(f7));
    }
}
