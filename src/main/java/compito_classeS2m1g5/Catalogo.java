package compito_classeS2m1g5;

import java.time.LocalDate;
import java.util.Date;

abstract class Catalogo {
    private long codiceISBN;
    private String titolo;
    private  LocalDate annoPubblicazione;
    private int numeroPagine;

    public Catalogo( String titolo, LocalDate annoPubblicazione, int numeroPagine) {
        this.codiceISBN = genralsbnlibro();
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "codiceISBN=" + codiceISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }

    public long getCodiceISBN() {
        return codiceISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public LocalDate getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public long genralsbnlibro() {
        long minlimit=1000000000L;
        long maxlimit=9999999999L;

        long randomIsbn=minlimit+(long) (Math.random()*(maxlimit-minlimit));
        return randomIsbn;



    }

    }



