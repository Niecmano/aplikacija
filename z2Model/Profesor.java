/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package z2Model;

/**
 *
 * @author Nemanja
 */
public class Profesor {
    private Long id;
    private String ime;
    private String prezime;
    private Zvanje zvanje;
    private Status status;

    
    public Profesor(String ime, String prezime, Zvanje zvanje, Status status) {
        this.ime = ime;
        this.prezime = prezime;
        this.zvanje = zvanje;
        this.status = status;
    }
    
    public Profesor(Long id, String ime, String prezime, Zvanje zvanje, Status status) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.zvanje = zvanje;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Zvanje getZvanje() {
        return zvanje;
    }

    public void setZvanje(Zvanje zvanje) {
        this.zvanje = zvanje;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return zvanje+" "+ime+" "+prezime;
    }
}
