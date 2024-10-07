package agroquimicos;

public class FiltroPorEnfermedad extends Filtro{
    private Enfermedad enfermedad;
    public FiltroPorEnfermedad(Enfermedad enfermedad){
        this.enfermedad = enfermedad;
    }
    public Enfermedad getEnfermedad() {
        return enfermedad;
    }
    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }
    public boolean cumple(ProductoQuimico pq){
        return pq.puedeTratarEnfermedad(enfermedad);
    }
}
