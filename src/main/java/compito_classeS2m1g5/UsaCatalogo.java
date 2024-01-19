package compito_classeS2m1g5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class UsaCatalogo {
    public static void main(String[] args) {
        Libri l1=new Libri("il codice da vinci", 2018,50,"darwin","giallo");
     //   System.out.println(l1);

        Libri l2=new Libri("Fairytail", 2022,30,"hoda","manga");
        Libri l3=new Libri("One Piace",2016,30,"hoda","manga");
        Libri l4=new Libri("Le pagine della nostra vita",2015,180,"button","love");



        Riviste r1=new Riviste("vainyfair",2010,30,PeriodicitaRiviste.SETTIMANALE);
        Riviste r2=new Riviste("qmen",2020,30,PeriodicitaRiviste.MENSILE);
        Riviste r3=new Riviste("chi?",2012,25,PeriodicitaRiviste.SEMESTRALE);
CatalogoBibbliotecario cat1=new CatalogoBibbliotecario();
cat1.aggiungi(l1);
        cat1.aggiungi(l2);
        cat1.aggiungi(l3);
        cat1.aggiungi(l4);
        cat1.aggiungi(r1);
        cat1.aggiungi(r2);
        cat1.aggiungi(r3);
        cat1.toString();
      System.out.println( " nel server ci sono i seguenti dati " + cat1);
        cat1.rimuovi(r1.getCodiceISBN());


        System.out.println(  cat1.filtraisbn(r2.getCodiceISBN()));
        System.out.println( cat1.serchAnno(2020));
        System.out.println( cat1.serachAutore("hoda"));









    }
}
