package baza;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import z2Model.*;

public class DBBroker {

    private static Konekcija konekcija;

    public DBBroker() {
        konekcija = Konekcija.getInstance();
    }

    public List<Profesor> vratiListuProfesora() {
        List<Profesor> prof = new ArrayList<>();
        try {
            Statement st = konekcija.getConn().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM profesor");
            while (rs.next()) {
                String zvanje = rs.getString("zvanje").toUpperCase();
                String status = rs.getString("status").toUpperCase();
                prof.add(new Profesor(rs.getLong("id"), rs.getString("ime"), rs.getString("prezime"), Zvanje.valueOf(zvanje), Status.valueOf(status)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prof;
    }

    public void azurirajProfUBazi(Profesor prof) {
        try {
            PreparedStatement ps = konekcija.getConn().prepareStatement("UPDATE profesor SET ime=?, prezime=?,zvanje=? WHERE id = ?");
            ps.setString(1, prof.getIme());
            ps.setString(2, prof.getPrezime());
            ps.setString(3, String.valueOf(prof.getZvanje()));
            ps.setLong(4, prof.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Predaje> vratiAngazovanjaIzBaze(List<Profesor> izabrani) {
        
        List<Predaje> ang = new ArrayList<>();
        try {
            for (Profesor prof : izabrani) {
                String upit = "SELECT predmet.* FROM profesor JOIN predaje ON profesor.id=predaje.profID\n"
                        + "JOIN predmet ON predaje.predmetID=predmet.id WHERE profesor.id =" + prof.getId();
                Statement st = konekcija.getConn().createStatement();
                ResultSet rs = st.executeQuery(upit);
                while (rs.next()) {
                    Predmet subj = new Predmet(rs.getLong("predmet.id"), rs.getString("predmet.naziv"), rs.getInt("predmet.espb"));
                    ang.add(new Predaje(prof, subj));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ang;
    }

}
