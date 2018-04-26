/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bass.model;

/**
 *
 * @author ELITEBOOK
 */
public class ModelBass {
    private int ID;
    private String Nama;
    private String Warna;
    private int jmlSenar;
    
    public ModelBass(){
        
    }
    
    public int getID(){
        return ID;
    }
    
    public void setID(int ID){
        this.ID = ID;
        
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public String getwarna(){
        return Warna;
    }
    
    public void setWarna(String warna){
        this.Warna = warna;
    }
    
    public int getjmlSenar(){
        return jmlSenar;
    }
    
    public void setjmlSenar(int jml){
        this.jmlSenar = jml;
    }
    
}