/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nemanja
 */
public class PoreskaStopa {
    private Long sifra;
    private String skraceniNaziv;
    private double iznos;

    public PoreskaStopa(Long sifra, String skraceniNaziv, double iznos) {
        this.sifra = sifra;
        this.skraceniNaziv = skraceniNaziv;
        this.iznos = iznos;
    }

    public Long getSifra() {
        return sifra;
    }

    public void setSifra(Long sifra) {
        this.sifra = sifra;
    }

    public String getSkraceniNaziv() {
        return skraceniNaziv;
    }

    public void setSkraceniNaziv(String skraceniNaziv) {
        this.skraceniNaziv = skraceniNaziv;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    @Override
    public String toString() {
        return skraceniNaziv + " " + iznos;
    }
}
