/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jeremie
 */
public class ModelUtilisateur extends AbstractTableModel{
    //on declare un tableau
    
    private String[] colonne;
    // on declare un vector
    private Vector<String> Rows;

    @Override
    public int getRowCount() {
        return Rows.size();
    }

    @Override
    public int getColumnCount() {
        return.colonne.length;
    }

     
    @Override
    public Object getColumnName (int index){
  

        return colonne[index];
        
    }

    
     
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
  
         return.Rows.get(rowIndex)[columnIndex];

    }
    
    
    public void lowData (ArrayList<Utilisitateur> lesUsers)
    
}
