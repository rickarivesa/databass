/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bass.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author ELITEBOOK
 */
public class tablesBass extends AbstractTableModel {

    List <ModelBass> basses;
    
    public tablesBass(List<ModelBass> basses){
        this.basses = basses;
    }
    
    @Override
    public int getRowCount() {
        return basses.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return basses.get(row).getID();
            case 1:
                return basses.get(row).getNama();
            case 2:
                return basses.get(row).getwarna();
            case 3:
                return basses.get(row).getjmlSenar();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Warna";
            case 3:
                return "Jumlah Senar";
            default:
                return null;
        }
    }
}
