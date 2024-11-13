
package z2Model;


public class Predmet {
    private Long id;
    private String naziv;
    private int ESPB;

    public Predmet(Long id, String naziv, int ESPB) {
        this.id = id;
        this.naziv = naziv;
        this.ESPB = ESPB;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getESPB() {
        return ESPB;
    }

    public void setESPB(int ESPB) {
        this.ESPB = ESPB;
    }

    @Override
    public String toString() {
        return naziv + ", ESPB:" + ESPB;
    }
    
    
}
