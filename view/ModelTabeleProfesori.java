/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import z2Model.Profesor;


public class ModelTabeleProfesori extends AbstractTableModel {
    private String[] kolone = {"Ime","Prezime","Zvanje","Status"};
    private List<Profesor> profe;

    public ModelTabeleProfesori(List<Profesor> profe) {
        this.profe = profe;
    }
    
    @Override
    public int getRowCount() {
        return profe.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //row -> profa
        // column -> konkretni atribut profe 
        Profesor prof = profe.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> prof.getIme();
            case 1 -> prof.getPrezime();
            case 2 -> prof.getZvanje();
            case 3 -> prof.getStatus();
            default -> "N/A";
        };
    }
    

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
}
