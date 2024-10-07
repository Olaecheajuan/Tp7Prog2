package busquedadedocumentos.Filtro;

import busquedadedocumentos.Documento;

public class FiltroPorDocumentoDeUnAutor extends Filtro{
    public String autor;
    public FiltroPorDocumentoDeUnAutor(String autor) {
        this.autor = autor;
    }
    public boolean seCumple(Documento documento) {
        return documento.getAutores().contains(autor.toLowerCase());
    }
}
