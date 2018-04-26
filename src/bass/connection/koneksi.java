/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bass.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ELITEBOOK
 */
public class koneksi {
    private static Connection konek;
    public static Connection getKoneksi()
    {
    if (konek == null)
    {
    try {
        String url;
        url = "jdbc:mariadb://localhost/bass";
        String username="root";
        String password="";
        
        DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
        konek = DriverManager.getConnection(url,username, password); 
        JOptionPane.showMessageDialog(null, "Koneksi Berhasil","Pesan",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("Koneksi Suskes");
    } catch (SQLException e){
        JOptionPane.showMessageDialog(null, e + "Error : ","Pesan",JOptionPane.ERROR_MESSAGE);
        //System.out.println(e);
    }
    }
    return konek;
    }
}
