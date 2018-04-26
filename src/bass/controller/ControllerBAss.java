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
    
    public void addBass(){
        ModelBass basses = new ModelBass();
        basses.setID(Integer.parseInt(bassForm.getTxtID().getText()));
        basses.setNama(bassForm.getTxtName().getText());
        basses.setWarna(bassForm.getTxtWarna().getText());
        basses.setjmlSenar(Integer.parseInt(bassForm.getTxtJmlSenar().getSelectedItem().toString()));
        
        databass.addBass(basses);
    }
    
    public void isiTable(){
        basses = databass.getAllBass();
        tablesBass datatable = new tablesBass(basses);
        bassForm.getTableData().setModel(datatable);
    }
}
