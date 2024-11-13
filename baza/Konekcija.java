
package baza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Konekcija {
    private static Konekcija konekcija;
    private static Connection conn;
    public static Konekcija getInstance(){
        if(konekcija==null) konekcija = new Konekcija();
        return konekcija;
    }
    private Konekcija(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ps2019rok","root","");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    public Connection getConn(){
        return conn;
    }
}
