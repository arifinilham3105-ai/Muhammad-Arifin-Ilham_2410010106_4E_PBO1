package sistemkasirminimarket;

public class Barang {
     // Encapsulation (private)
    private String kode;
    private String nama;
    private double harga;

    // Constructor
    public Barang(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    // Mutator (Setter)
    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Accessor (Getter)
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Polymorphism
    public void tampilData() {
        System.out.println(kode + " - " + nama + " - Rp." + harga);
    }
}
