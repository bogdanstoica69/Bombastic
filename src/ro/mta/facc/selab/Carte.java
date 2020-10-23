package ro.mta.facc.selab;

public class Carte implements Comparable<Carte> {
    private String titlu;
    private String autor;
    private int an_publicatie;
    private int nrPagini;

    @Override
    public int compareTo(Carte o) {
      return Integer.compare(this.nrPagini, o.nrPagini);
    }

    public Carte(String titlu, String autor, int an_publicatie, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.an_publicatie = an_publicatie;
        this.nrPagini = nrPagini;
    }

    @Override
    public String toString() {
        return this.titlu + " " + this.autor + " aparuta in anul " + this.an_publicatie;}}
