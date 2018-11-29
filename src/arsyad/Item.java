package arsyad;
import javax.swing.JComboBox;

public class Item {
    public class item {
        private String name; //untuk membuat variabel name bertipe String
        private String Jumlah; //untuk membuat variabel Jumlah bertipe String
        private double harga; //untuk membuat variabel harga bertipe double

        //Membuat Construktor 
        public item(String name, String Jumlah, double harga) {
            this.name = name;
            this.Jumlah = Jumlah;
            this.harga = harga;
        }
        //
        @Override
        public String toString() {
            return this.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getJumlah() {
            return Jumlah;
        }

        public void setJumlah(String Jumlah) {
            this.Jumlah = Jumlah;
        }

        public double getHarga() {
            return harga;
        }

        public void setHarga(double harga) {
            this.harga = harga;
        }
    }
}
