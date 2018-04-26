/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bass.dao;

import bass.view.ViewBass;
import bass.model.*;
import java.util.List;
/**
 *
 * @author ELITEBOOK
 */
public interface bassDAO {
    public List<ModelBass> getAllBass();
    public List<ModelBass> getSearchbyName (String nama);
    public void addBass(ModelBass addData);
    public void deleteBass(ModelBass dltData);
    public void updateBass(ModelBass updData);
}
