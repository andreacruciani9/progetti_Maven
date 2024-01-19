package compito_classeS2m1g5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsaCatalogo {
    public static void main(String[] args) {
        Libri l1=new Libri("il codice da vinci", LocalDate.now(),50,"darwin","giallo");
        System.out.println(l1);

        Libri l2=new Libri("Fairytail", LocalDate.now(),30,"hoda","manga");
        Libri l3=new Libri("One Piace",LocalDate.ofEpochDay(2016),30,"hoda","manga");
        Libri l4=new Libri("Le pagine della nostra vita",LocalDate.ofEpochDay(2015),180,"button","love");

     List<Libri>listaLibri=new ArrayList<>();
     listaLibri.add(l1);
     listaLibri.add(l2);
     listaLibri.add(l3);
     listaLibri.add(l4);
     listaLibri.toString();
        System.out.print(listaLibri);

        Riviste r1=new Riviste("vainyfair",LocalDate.now(),30,PeriodicitaRiviste.SETTIMANALE);
        Riviste r2=new Riviste("qmen",LocalDate.of(2020,01,30),30,PeriodicitaRiviste.MENSILE);
        Riviste r3=new Riviste("chi?",LocalDate.of(2023,02,14),25,PeriodicitaRiviste.SEMESTRALE);
List<Riviste>listaRiviste=new ArrayList<>();
listaRiviste.add(r1);
listaRiviste.add(r2);
listaRiviste.add(r3);





    }
}
