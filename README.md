# Proyek Akhir Pemrograman Berbasis Objek 1
Aplikasi Sistem Kasir Minimarket

## Deskripsi
Aplikasi ini merupakan program sederhana yang dibuat menggunakan bahasa pemrograman Java untuk membantu
proses transaksi pada sebuah minimarket. Program memungkinkan kasir memasukkan data barang yang dibeli
pelanggan, menghitung subtotal setiap barang, menghitung total pembayaran, serta memberikan potongan
harga bagi pelanggan yang memiliki status member.

Aplikasi ini dibuat untuk memenuhi tugas akhir mata kuliah Pemrograman Berbasis Objek 1 dengan menerapkan
konsep-konsep dasar Object Oriented Programming (OOP), yaitu Class, Object, Attribute, Constructor, Mutator,
Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, Input Output Sederhana, Array, dan Error Handling.

## Penjelasan Kode
1. **Class**

Class merupakan cetakan (blueprint) yang digunakan untuk membuat objek.
Pada program ini terdapat tiga class yaitu: Barang, ransaksi, Main
``` java
public class Barang {

}

public class Transaksi extends Barang {

}

public class Main {

}
```

2. **Object**

Object adalah hasil instansiasi dari sebuah class.
Pada aplikasi ini object dibuat ketika pengguna menginput data barang
```java
daftarBarang[i] = new Transaksi(kode, nama, harga, jumlah);
```
dan
``` java
daftarBarang[i] = new Transaksi(kode, nama, harga, jumlah);
```

3. **Attribute**

Attribute merupakan variabel yang dimiliki oleh class.
Contohnya pada class Barang:
``` java
private String kode;
private String nama;
private double harga;
```
Artribut tambahan class Transaksi:
``` java
private int jumlah;
```
4. **Constructor**

Constructor digunakan untuk memberikan nilai awal ketika object dibuat.
Constructor pada class Barang:
```java
public Barang(String kode, String nama, double harga){

    this.kode = kode;
    this.nama = nama;
    this.harga = harga;
}
```
Constructor pada class Transaksi:
```java
public Transaksi(String kode,String nama,double harga,int jumlah){

    super(kode,nama,harga);
    this.jumlah = jumlah;
}
```

5. **Mutator (Setter)**

Method setter digunakan untuk mengubah nilai attribute.
Contohnya:
```java
public void setHarga(double harga){

    this.harga = harga;

}

public void setJumlah(int jumlah){

    this.jumlah = jumlah;

}
```

6. **Accessor (Getter)**

Getter digunakan untuk mengambil nilai dari suatu attribute.
```java
public double getHarga(){

    return harga;

}

public int getJumlah(){

    return jumlah;

}
```

7. **Encapsulation**

Konsep Encapsulation diterapkan dengan menjadikan seluruh attribute bersifat private,
sehingga tidak dapat diakses secara langsung dari luar class
```java
private String kode;
private String nama;
private double harga;
private int jumlah;
```
Data hanya dapat diakses menggunakan method Getter dan Setter

8. **Inheritance**

Inheritance diterapkan dengan membuat class Transaksi mewarisi class Barang
```java
public class Transaksi extends Barang{

}
```

9. ***Polymorphism***

Polymorphism diterapkan menggunakan Method Overriding.

Method tampilData() pada class Barang dioverride pada class Transaksi sehingga
menghasilkan tampilan informasi yang lebih lengkap
Class Barang:
```java
public void tampilData(){

    System.out.println(getKode()+" "+getNama());

}
```
Class Transaksi:
```java
@Override
public void tampilData(){

    System.out.println(
        getKode()+" "+
        getNama()+" "+
        getHarga()+" "+
        jumlah+" "+
        hitungSubtotal());

}
```

10. **Seleksi**

Seleksi digunakan untuk menentukan apakah pelanggan memperoleh diskon atau tidak
```java
if(member.equalsIgnoreCase("Y")){

    diskon = total * 0.10;

}else{

    diskon = 0;

}
```

11. **Perulangan**

Perulangan digunakan untuk menginput data barang sekaligus menampilkan seluruh transaksi
```java
for(int i=0;i<jumlahBarang;i++){

    ....

}
```

12. **Input Output Sederhana**

Program menggunakan class Scanner untuk menerima input dari pengguna
```java
Scanner input = new Scanner(System.in);

System.out.print("Nama Barang : ");
String nama = input.nextLine();
```
OutPut tampil menggunakan
```java
System.out.println("Total Bayar : "+bayar);
```

13. **Array**

Array digunakan untuk menyimpan beberapa object Transaksi.
```java
Transaksi[] daftarBarang = new Transaksi[jumlahBarang];
```
Setiap elemen array akan menyimpan satu data transaksi barang

14. **Error Handling**

Error Handling menggunakan blok try-catch agar program tidak berhenti ketika pengguna salah memasukkan input
```java
try{

    // proses program

}catch(Exception e){

    System.out.println("Input tidak valid.");

}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Arifin Ilham

NPM: 2410010106
