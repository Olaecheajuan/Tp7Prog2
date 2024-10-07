package agroquimicos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Crear enfermedades

        Enfermedad roya = new Enfermedad("Roya");
        roya.addEstadosPatologicos("Manchas marrones");
        roya.addEstadosPatologicos("Pérdida de hojas");

        Enfermedad mildiu = new Enfermedad("Mildiu");
        mildiu.addEstadosPatologicos("Manchas amarillas");
        mildiu.addEstadosPatologicos("Daño en tallos");

        // Crear Cultivos
        Cultivo trigo = new Cultivo("Trigo");
        trigo.addEnfermedades(roya);

        Cultivo maiz = new Cultivo("Maíz");
        maiz.addEnfermedades(mildiu);

        // Crear Productos Químicos
        ProductoQuimico herbicida = new ProductoQuimico("Herbicida");
        herbicida.addEstadosPatologicos("Manchas marrones");
        herbicida.addEstadosPatologicos("Pérdida de hojas");

        ProductoQuimico fungicida = new ProductoQuimico("Fungicida");
        fungicida.addEstadosPatologicos("Manchas amarillas");
        fungicida.addEstadosPatologicos("Daño en tallos");


        herbicida.addCultivoDesaconsejado(maiz);

        EmpresaAgricola granja = new EmpresaAgricola();
        granja.addProductosQuimicos(herbicida);
        granja.addProductosQuimicos(fungicida);

        // Crear Filtros
        Filtro filtroPorEnfermedadRoya = new FiltroPorEnfermedad(roya);
        Filtro filtroPorEnfermedadMildiu = new FiltroPorEnfermedad(mildiu);
        Filtro filtroPorCultivoTrigo = new FiltroPorCultivo(trigo);
        Filtro filtroPorCultivoMaiz = new FiltroPorCultivo(maiz);

        // Filtro combinado (AND) para Cultivo Trigo y Enfermedad Roya
        Filtro filtroCompuestoTrigoRoya = new FiltroAnd(filtroPorCultivoTrigo, filtroPorEnfermedadRoya);

        // Filtro OR para buscar productos que sean útiles para Trigo o Maíz
        Filtro filtroOrTrigoOMaiz = new FiltroOr(filtroPorCultivoTrigo, filtroPorCultivoMaiz);

        // 1. Listar productos que traten la enfermedad Roya
        System.out.println("Productos que tratan la enfermedad Roya:");
        ArrayList<ProductoQuimico> productosQueTratanRoya = granja.listar(filtroPorEnfermedadRoya);
        listarProductos(productosQueTratanRoya);

        // 2. Listar productos útiles para el cultivo de Trigo
        System.out.println("\nProductos útiles para el cultivo de Trigo:");
        ArrayList<ProductoQuimico> productosUtilesTrigo = granja.listar(filtroPorCultivoTrigo);
        listarProductos(productosUtilesTrigo);

        // 3. Listar productos que sean útiles tanto para el cultivo de Trigo como para tratar la enfermedad Roya (AND)
        System.out.println("\nProductos útiles para Trigo y que traten la enfermedad Roya:");
        ArrayList<ProductoQuimico> productosUtilesTrigoYRoya = granja.listar(filtroCompuestoTrigoRoya);
        listarProductos(productosUtilesTrigoYRoya);

        // 4. Listar productos que sean útiles para el cultivo de Trigo o el cultivo de Maíz (OR)
        System.out.println("\nProductos útiles para Trigo o Maíz:");
        ArrayList<ProductoQuimico> productosUtilesTrigoOMaiz = granja.listar(filtroOrTrigoOMaiz);
        listarProductos(productosUtilesTrigoOMaiz);
    }
    // Método auxiliar para listar productos
    public static void listarProductos(ArrayList<ProductoQuimico> productos) {
        if (productos.isEmpty()) {
            System.out.println("No se encontraron productos.");
        } else {
            for (ProductoQuimico pq : productos) {
                System.out.println("- " + pq.getNombre());
            }
        }
    }
    }

