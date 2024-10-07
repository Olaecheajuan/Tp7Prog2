package agroquimicos;

import java.util.ArrayList;

public class EmpresaAgricola {
    ArrayList<ProductoQuimico> productos;
    public EmpresaAgricola() {
        productos = new ArrayList<ProductoQuimico>();
    }

    public void addProductosQuimicos(ProductoQuimico producto) {
        if(!this.productos.contains(producto)) {
            this.productos.add(producto);
        }
    }
    public void removeProductosQuimicos(ProductoQuimico producto) {
        if(this.productos.contains(producto)) {
            this.productos.remove(producto);
        }
    }
    public ArrayList<ProductoQuimico> getProductos() {
        return new ArrayList<ProductoQuimico>(productos);
    }


    public ArrayList<ProductoQuimico> listar(Filtro filtro){
        ArrayList<ProductoQuimico> salida = new ArrayList<ProductoQuimico>();
        for (int i = 0; i < this.productos.size(); i++) {
            ProductoQuimico pq = this.productos.get(i);
            if(filtro.cumple(pq)){
                salida.add(pq);
            }
        }
        return salida;
    }
}
