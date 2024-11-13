
package view;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import z2Model.Predaje;


public class ModelTabeleAngazovanja extends AbstractTableModel{
    private List<Predaje> izabranaAngazovanja;
    private String[] cols = {"ime","prezime","naziv","espb"};
    public ModelTabeleAngazovanja(List<Predaje> izabranaAngazovanja){
        this.izabranaAngazovanja=izabranaAngazovanja;
    }
    @Override
    public int getRowCount() {
        return izabranaAngazovanja.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Predaje ang = izabranaAngazovanja.get(rowIndex);
        switch(columnIndex){
            case 0:
                return ang.getProf().getIme();
            case 1:
                return ang.getProf().getPrezime();
            case 2:
                return ang.getPred().getNaziv();
            case 3:
                return ang.getPred().getESPB();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return cols[column];
    }
    
}
