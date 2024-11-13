/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nemanja
 */
public class Proizvod {
    private Long sifra;
    private String naziv;
    private double cena;
    private Proizvodjac proizvodjac;
    private PoreskaStopa pstopa;

    public Proizvod(Long sifra, String naziv, double cena, Proizvodjac proizvodjac, PoreskaStopa pstopa) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cena = cena;
        this.proizvodjac = proizvodjac;
        this.pstopa = pstopa;
    }

    public Long getSifra() {
        return sifra;
    }

    public void setSifra(Long sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Proizvodjac getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(Proizvodjac proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public PoreskaStopa getPstopa() {
        return pstopa;
    }

    public void setPstopa(PoreskaStopa pstopa) {
        this.pstopa = pstopa;
    }

    @Override
    public String toString() {
        return sifra+" "+naziv+" "+cena+"EUR, proizvodjac:"+proizvodjac.getNaziv();
    }
    
}
