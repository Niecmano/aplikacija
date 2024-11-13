
package z2Model;

public class Predaje {
    private Profesor prof;
    private Predmet pred;

    public Predaje(Profesor prof, Predmet pred) {
        this.prof = prof;
        this.pred = pred;
    }

    public Profesor getProf() {
        return prof;
    }

    public Predmet getPred() {
        return pred;
    }
    
}
