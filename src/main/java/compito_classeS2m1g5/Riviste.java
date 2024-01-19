package compito_classeS2m1g5;

import java.time.LocalDate;
import java.util.Date;

public class Riviste extends Catalogo{

    private PeriodicitaRiviste periodicita;
    public Riviste( String titolo, LocalDate annoPubblicazione, int numeroPagine, PeriodicitaRiviste periodicita) {
        super( titolo, annoPubblicazione, numeroPagine);
        this.periodicita =periodicita;




    }


    public PeriodicitaRiviste getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(PeriodicitaRiviste periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Riviste{" +
                "periodicita=" + periodicita +
                ", codiceISBN='" + getCodiceISBN() + '\'' +
                ", titolo='" + getTitolo() + '\'' +
                ", annoPubblicazione='" + getAnnoPubblicazione() + '\'' +
                ", numeroPagine='" + getNumeroPagine() + '\'' +


                '}';
    }


}
