
package aplikasi.gaji.koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class koneksi {
public Connection con ;
public ResultSet res ;
public Statement stat ;

public void koneksi(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            String url ="jdbc:mysql://localhost:3306/gaji";
            String user="root";
            String pass="";
           con=DriverManager.getConnection(url,user,pass);
           stat=con.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
        }
    } catch (Exception e) {
        System.out.println("Gagal");
    }}}
