/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bass.controller;

import bass.dao.*;
import bass.model.ModelBass;
import bass.model.tablesBass;
import bass.view.ViewBass;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ELITEBOOK
 */
public class ControllerBAss{
    bassDAO databass;
    ViewBass bassForm;
    List<ModelBass> basses;

    public ControllerBAss(ViewBass bassForm) {
        this.bassForm = bassForm;
        databass = new BassDAOimpl();
        basses = databass.getAllBass();
    }
    
    public void reset(){
        bassForm.getTxtID().setText("");
        bassForm.getTxtName().setText("");
        bassForm.getTxtWarna().setText("");
        bassForm.getTxtJmlSenar().setSelectedIndex(0);
    }
    
    public void addBass(){
        ModelBass basses = new ModelBass();
        basses.setID(Integer.parseInt(bassForm.getTxtID().getText()));
        basses.setNama(bassForm.getTxtName().getText());
        basses.setWarna(bassForm.getTxtWarna().getText());
        basses.setjmlSenar(Integer.parseInt(bassForm.getTxtJmlSenar().getSelectedItem().toString()));
        
        databass.addBass(basses);
    }
    
    public void updateBass(){
        ModelBass basses = new ModelBass();
        basses.setID(Integer.parseInt(bassForm.getTxtID().getText()));
        basses.setNama(bassForm.getTxtName().getText());
        basses.setWarna(bassForm.getTxtWarna().getText());
        basses.setjmlSenar(Integer.parseInt(bassForm.getTxtJmlSenar().getSelectedItem().toString()));
        
        databass.updateBass(basses);
    }
    public void isiTable(){
        basses = databass.getAllBass();
        tablesBass datatable = new tablesBass(basses);
        bassForm.getTableData().setModel(datatable);
    }
    
    public void isiField(int row){
        bassForm.getTxtID().setText(Integer.toString(basses.get(row).getID()));
        bassForm.getTxtName().setText(basses.get(row).getNama().toString());
        bassForm.getTxtWarna().setText(basses.get(row).getwarna().toString());
        bassForm.getTxtJmlSenar().setSelectedItem(Integer.toString(basses.get(row).getjmlSenar()));
    }
    
    public void delete(){
        if(bassForm.getTxtID().getText() != null){
            int id = Integer.parseInt(bassForm.getTxtID().getText());
            databass.deleteBass(id);
        }
        else {
            JOptionPane.showMessageDialog(bassForm, "Pilih data yang akan di hapus");
        }
    }
    
    public void carinama() {
        
    }
}
