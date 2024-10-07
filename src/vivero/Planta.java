package vivero;

import java.util.ArrayList;

public class Planta {
    private String nombreCientifico;
    ArrayList<String> nombresVulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private String lugarProsperacion;
    private int reqSol;
    private int reqAgua;
    public Planta(String nombreCientifico, String clasificacionSuperior, String familia, String clase, String lugarProsperacion, int reqSol, int reqAgua) {
        this.nombreCientifico = nombreCientifico;
        this.clasificacionSuperior = clasificacionSuperior;
        this.familia = familia;
        this.clase = clase;
        this.lugarProsperacion = lugarProsperacion;
        this.reqSol = reqSol;
        this.reqAgua = reqAgua;
        nombresVulgares = new ArrayList<>();
    }
    //agrego el nombre vulgar
    public void addNombreVulgar(String nombreVulgar) {
        if(!nombresVulgares.contains(nombreVulgar.toLowerCase())){
            nombresVulgares.add(nombreVulgar.toLowerCase());
        }
    }
    //borro el nombre
    public void removeNombreVulgar(String nombreVulgar) {
        if(nombresVulgares.contains(nombreVulgar.toLowerCase())){
            nombresVulgares.remove(nombreVulgar.toLowerCase());
        }
    }
    //obtengo el nombre
    public ArrayList<String> getNombresVulgares() {
        return new ArrayList<>(nombresVulgares);
    }



    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getLugarProsperacion() {
        return lugarProsperacion;
    }

    public void setLugarProsperacion(String lugarProsperacion) {
        this.lugarProsperacion = lugarProsperacion;
    }

    public int getReqSol() {
        return reqSol;
    }

    public void setReqSol(int reqSol) {
        this.reqSol = reqSol;
    }

    public int getReqAgua() {
        return reqAgua;
    }

    public void setReqAgua(int reqAgua) {
        this.reqAgua = reqAgua;
    }
    public String toString(){
        return nombreCientifico + "-" + familia + "-" + clase + "\n";
    }
}
