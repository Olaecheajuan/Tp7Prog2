package candycrush;

public class FichaEspecial extends Ficha {
    public FichaEspecial(String nombre, int fortaleza, int espacioOcupa) {
        super(nombre, fortaleza, espacioOcupa,0);
        actualizarPoder();
    }
    public void actualizarPoder(){
        int nuevoPoder = getPoderDestruccion();
        setPoderDestruccion(nuevoPoder);
    }
    public int getPoderDestruccion(){
        return getFortaleza() / getEspacioOcupa();
    }
}
