package sistemkasirminimarket;

public class Transaksi extends Barang {
     private int jumlah;

    // Constructor
    public Transaksi(String kode, String nama, double harga, int jumlah) {
        super(kode, nama, harga);
        this.jumlah = jumlah;
    }

    // Mutator
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Accessor
    public int getJumlah() {
        return jumlah;
    }

    // Menghitung subtotal
    public double hitungSubtotal() {
        return getHarga() * jumlah;
    }

    // Polymorphism (Override)
    @Override
    public void tampilData() {
        System.out.println(
                getKode() + "\t"
                + getNama() + "\tRp."
                + getHarga() + "\t"
                + jumlah + "\tRp."
                + hitungSubtotal());
    }
}
