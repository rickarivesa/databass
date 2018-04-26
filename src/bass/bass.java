/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bass;

import bass.view.ViewBass;
import bass.connection.koneksi;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ELITEBOOK
 */
public class bass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tes Koneksi Database
        //koneksi.getKoneksi();
        new ViewBass().setVisible(true);
    }
    
}
