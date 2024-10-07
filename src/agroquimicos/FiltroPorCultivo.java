package agroquimicos;

public class FiltroPorCultivo extends Filtro {
    private Cultivo cultivo;
    public FiltroPorCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }
    @Override
    public boolean cumple(ProductoQuimico pq) {
        return cultivo.esDeUtilidad(pq);
    }

    public Cultivo getCultivo() {
        return cultivo;
    }

    public void setCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }
}
