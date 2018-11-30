package arsyad;

import javax.swing.table.DefaultTableModel;

public class ModelTransaksi {
    private double total=0;
    
    private  DefaultTableModel tabel = new DefaultTableModel();
    
    //Menambahkan kolom Code dan Item pada tabel
    public ModelTransaksi () {
        getTabel().addColumn("Code");
        getTabel().addColumn("Item");
          
    }
    //Menambahkan Kontruktor
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public DefaultTableModel getTabel() {
        return tabel;
    }

    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
    
      
}
