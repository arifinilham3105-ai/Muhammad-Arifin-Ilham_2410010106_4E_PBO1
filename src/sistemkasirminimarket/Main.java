package sistemkasirminimarket;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("==============================");
            System.out.println(" SISTEM KASIR MINIMARKET ");
            System.out.println("==============================");

            System.out.print("Masukkan jumlah barang : ");
            int jumlahBarang = input.nextInt();

            // Array Object
            Transaksi[] daftarBarang = new Transaksi[jumlahBarang];

            // Perulangan
            for (int i = 0; i < jumlahBarang; i++) {

                input.nextLine();

                System.out.println("\nBarang ke-" + (i + 1));

                System.out.print("Kode Barang : ");
                String kode = input.nextLine();

                System.out.print("Nama Barang : ");
                String nama = input.nextLine();

                System.out.print("Harga : ");
                double harga = input.nextDouble();

                System.out.print("Jumlah Beli : ");
                int qty = input.nextInt();

                // Object
                daftarBarang[i] = new Transaksi(kode, nama, harga, qty);
            }

            double total = 0;

            System.out.println("\n===============================================");
            System.out.println("Kode\tNama\tHarga\tQty\tSubtotal");
            System.out.println("===============================================");

            for (int i = 0; i < jumlahBarang; i++) {

                daftarBarang[i].tampilData();
                total += daftarBarang[i].hitungSubtotal();

            }

            System.out.println("-----------------------------------------------");
            System.out.println("Total Belanja : Rp." + total);

            input.nextLine();

            System.out.print("Member (Y/T) : ");
            String member = input.nextLine();

            double diskon;

            // Seleksi
            if (member.equalsIgnoreCase("Y")) {

                diskon = total * 0.10;

            } else {

                diskon = 0;

            }

            double bayar = total - diskon;

            System.out.println("Diskon       : Rp." + diskon);
            System.out.println("Total Bayar  : Rp." + bayar);

            System.out.println("\nTerima Kasih Telah Berbelanja.");

        } catch (Exception e) {

            // Error Handling
            System.out.println("Input yang dimasukkan tidak valid!");
        }

    }
}
