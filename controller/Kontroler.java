
package controller;

import baza.DBBroker;
import java.util.ArrayList;
import java.util.List;
import model.*;
import z2Model.*;

public class Kontroler {
    private DBBroker dbb;
    private List<Proizvod> proizvodi;
    private List<Proizvodjac> proizvodjaci;
    private List<PoreskaStopa> pstope;
    private static Kontroler kontroler;
    public static Kontroler getInstance(){
        if(kontroler==null){
            kontroler = new Kontroler();
        }
        return kontroler;
    }
    private Kontroler(){
        dbb = new DBBroker();
        proizvodi = new ArrayList<>();
        proizvodjaci = new ArrayList<>();
        pstope = new ArrayList<>();
        
        PoreskaStopa pstopa1 = new PoreskaStopa(1L, "PDV10", 10.0);
        PoreskaStopa pstopa2 = new PoreskaStopa(2L, "PDV20", 20.0);
        PoreskaStopa pstopa3 = new PoreskaStopa(3L, "PDV5", 5.0);
        pstope.add(pstopa1); pstope.add(pstopa2); pstope.add(pstopa3);
        
        Proizvodjac proizvodjac1 = new Proizvodjac(1L, "TechMaster");
        Proizvodjac proizvodjac2 = new Proizvodjac(2L, "FreshFoods");
        Proizvodjac proizvodjac3 = new Proizvodjac(3L, "GreenLife");
        Proizvodjac proizvodjac4 = new Proizvodjac(4L, "HomeEssentials");
        Proizvodjac proizvodjac5 = new Proizvodjac(5L, "AutoGear");
        proizvodjaci.add(proizvodjac1); proizvodjaci.add(proizvodjac2); proizvodjaci.add(proizvodjac3);
        proizvodjaci.add(proizvodjac4); proizvodjaci.add(proizvodjac5);

        Proizvod proizvod1 = new Proizvod(1L, "Laptop X200", 950.0, proizvodjac1, pstopa1);
        Proizvod proizvod2 = new Proizvod(2L, "Organik Jabuke", 2.5, proizvodjac2, pstopa3);
        Proizvod proizvod3 = new Proizvod(3L, "Bio Čaj", 5.0, proizvodjac3, pstopa3);
        Proizvod proizvod4 = new Proizvod(4L, "Usisivač QPower", 150.0, proizvodjac4, pstopa2);
        Proizvod proizvod5 = new Proizvod(5L, "Auto Punjač FastCharge", 25.0, proizvodjac5, pstopa2);
        
        proizvodi.add(proizvod1);
        proizvodi.add(proizvod2);
        proizvodi.add(proizvod3);
        proizvodi.add(proizvod4);
        proizvodi.add(proizvod5);
    }

    public List<Proizvod> getProizvodi() {
        return proizvodi;
    }

    public List<Proizvodjac> getProizvodjaci() {
        return proizvodjaci;
    }

    public List<PoreskaStopa> getPstope() {
        return pstope;
    }

    public void azurirajProizvode(Proizvod izmenjeni) {

        for (Proizvod p : proizvodi) {
            if(izmenjeni.getSifra().equals(p.getSifra())){
                p.setCena(izmenjeni.getCena());
                p.setNaziv(izmenjeni.getNaziv());
                p.setProizvodjac(izmenjeni.getProizvodjac());
                p.setPstopa(izmenjeni.getPstopa());
            }
        }
    }

    public List<Profesor> vratiListuProfesora() {
        return dbb.vratiListuProfesora();
    }

    public void azurirajProfesora(Profesor prof) {
        dbb.azurirajProfUBazi(prof);
    }

    public List<Predaje> vratiListuAngazovanja(List<Profesor> izabrani) {
        return dbb.vratiAngazovanjaIzBaze(izabrani);
    }
}
