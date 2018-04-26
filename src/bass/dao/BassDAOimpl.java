/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bass.dao;

import bass.connection.koneksi;
import java.sql.Connection;
import bass.model.ModelBass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ELITEBOOK
 */
public class BassDAOimpl implements bassDAO{

    Connection connect;
    
    public BassDAOimpl(){
        connect = koneksi.getKoneksi();
    }

    @Override
    public List<ModelBass> getAllBass() {
        List<ModelBass> basses = null;
        try{
            basses = new ArrayList<ModelBass>();
            String sql = "select * from bass;";
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                ModelBass data = new ModelBass();
                data.setID(rs.getInt("id"));
                data.setNama(rs.getString("Nama"));
                data.setWarna(rs.getString("warna"));
                data.setjmlSenar(rs.getInt("Jml_Senar"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(BassDAOimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return basses;
    }

    @Override
    public List<ModelBass> getSearchbyName(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addBass(ModelBass addData) {
        PreparedStatement statement = null;
        try {
            String sql = "INSERT INTO bass (ID, Nama, Warna, Jml_Senar) VALUES (?, ?, ?, ?);";
            statement = connect.prepareStatement(sql);
            statement.setInt(1, addData.getID());
            statement.setString(2, addData.getNama());
            statement.setString(3, addData.getwarna());
            statement.setInt(4, addData.getjmlSenar());
            statement.executeUpdate();
//            ResultSet rs = statement.getGeneratedKeys();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void deleteBass(ModelBass dltData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBass(ModelBass updData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
