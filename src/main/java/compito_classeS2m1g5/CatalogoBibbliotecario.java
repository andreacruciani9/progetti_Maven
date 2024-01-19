package compito_classeS2m1g5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CatalogoBibbliotecario {
    private List<Catalogo> catalogoLibri;

    public CatalogoBibbliotecario() {
        this.catalogoLibri = new ArrayList<>();
    }

    public List<Catalogo> getCatalogoLibri() {
        return catalogoLibri;
    }

    public void setCatalogoLibri(List<Catalogo> catalogoLibri) {
        this.catalogoLibri = catalogoLibri;
    }
    public void aggiungi(Catalogo cat){
        catalogoLibri.add(cat);


    }
    public void rimuovi(long isbn){

        catalogoLibri.removeIf(cat->cat.getCodiceISBN()==isbn);
    }

public Catalogo filtraisbn(Long isbn){

   return    catalogoLibri.stream().filter(cat->cat.getCodiceISBN()==isbn).findFirst().get();

    }

    public List<Catalogo> serchAnno( int i){
        return catalogoLibri.stream().filter(cat->cat.getAnnoPubblicazione()==i).toList();
    }
    public List<Catalogo>  serachAutore(String aut ){
        return catalogoLibri.stream().filter(p->p instanceof Libri).filter(cat->((Libri)cat).getAutore().equals(aut)).toList();

    }



    @Override
    public String toString() {
        return "CatalogoBibbliotecario{" +
                "catalogoLibri=" + catalogoLibri +
                '}';
    }
}
