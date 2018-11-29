package arsyad;
import javax.swing.JComboBox;

public class Item {
    public class item {
        private String name;
        private String Jumlah;
        private double harga;
        
        public Item (String name, int harga) {
            this.name = name;
            this.harga = harga;
        }
        @Override
        public String toString() {
            return this.name;
        }
    }
}
