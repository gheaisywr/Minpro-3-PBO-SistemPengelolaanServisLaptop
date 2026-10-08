# Sistem Pengelolaan Servis Laptop

------------------------------------------------------------------------

Program ini merupakan aplikasi berbasis **Command Line Interface (CLI)**
yang dibuat menggunakan bahasa pemrograman **Java** dengan menerapkan
konsep **Pemrograman Berorientasi Objek (PBO)**. Program ini dibuat
untuk memenuhi **tugas Praktikum Mini Project 3 Pemrograman Berorientasi Objek.**

------------------------------------------------------------------------

## Identitas Mahasiswa

**Nama:** Ghea Aisyah Windraswari\
**NIM:** 2509116022\
**Program Studi:** Sistem Informasi\
**Instansi:** Universitas Mulawarman

------------------------------------------------------------------------

## 1. Studi Kasus

### Sistem Pengelolaan Servis Laptop

Program yang dibuat adalah **Sistem Pengelolaan Servis Laptop**. Program
ini digunakan untuk membantu mencatat dan mengelola data pelanggan, data
perangkat, serta data servis dalam satu sistem sederhana.

Program dijalankan melalui **Command Line Interface (CLI)** atau
terminal. Melalui menu yang tersedia, pengguna dapat menambahkan data
servis, melihat data yang sudah tersimpan, mengubah data servis,
menghapus data servis, dan mencari data berdasarkan ID servis.

Pada pengembangan terbaru, perangkat yang dapat dipilih terdiri dari dua
jenis, yaitu **Laptop** dan **Komputer**. Keduanya merupakan turunan
dari class `Perangkat`.

Dalam pembuatannya, program menggunakan konsep **Pemrograman
Berorientasi Objek (PBO)**. Data dan proses program dibagi ke dalam
beberapa class agar setiap class memiliki tugas yang lebih jelas.

### Fitur Program

Program ini memiliki beberapa fitur utama, yaitu:

1.  **Tambah Data Servis**\
    Digunakan untuk memasukkan data pelanggan, data perangkat, dan
    informasi servis.

2.  **Tampilkan Data Servis**\
    Digunakan untuk melihat seluruh data servis yang sudah tersimpan.

3.  **Ubah Data Servis**\
    Digunakan untuk mengubah tanggal, status, dan biaya servis
    berdasarkan ID servis.

4.  **Hapus Data Servis**\
    Digunakan untuk menghapus data servis. Sebelum data dihapus,
    pengguna akan diminta melakukan konfirmasi.

5.  **Cari Data Servis**\
    Digunakan untuk mencari data servis berdasarkan ID servis.

6.  **Keluar**\
    Digunakan untuk mengakhiri penggunaan program.

Selain fitur tersebut, program juga memiliki validasi input untuk
mengurangi kesalahan ketika pengguna memasukkan data.

------------------------------------------------------------------------

## 2. Struktur Package dan MVC

Program menggunakan struktur **MVC (Model-View-Controller)** agar bagian
data, tampilan, dan proses program dapat dipisahkan.

Struktur package program adalah:

```text
ServisLaptop
├── controller
│   └── ServisController.java
│
├── model
│   ├── Pelanggan.java
│   ├── Perangkat.java
│   ├── Laptop.java
│   ├── Komputer.java
│   └── Servis.java
│
├── view
│   └── MenuView.java
│
├── validation
│   └── ValidasiInput.java
│
├── interfaces
│   └── InformasiPerangkat.java
│
└── com.mycompany.servislaptop
    └── ServisLaptop.java
```

### Penjelasan Package

#### `model`

Package `model` berisi class yang digunakan untuk merepresentasikan data
dalam program.

<img width="122" height="83" alt="image" src="https://github.com/user-attachments/assets/7b76992d-b12a-4258-b51c-5d26987bb13e" />

Class yang terdapat di dalamnya yaitu:

-   `Pelanggan`
-   `Perangkat`
-   `Laptop`
-   `Komputer`
-   `Servis`

#### `controller`

Package `controller` berisi `ServisController`.

<img width="154" height="41" alt="image" src="https://github.com/user-attachments/assets/b49be567-189e-4bf2-bc34-29a2f8eafe0d" />

Class `ServisController` bertugas mengatur proses utama pengelolaan data servis, seperti:

- tambah data servis
- tampil data servis
- ubah data servis
- hapus data servis
- cari data servis
- penyimpanan data menggunakan `ArrayList`
- dummy data awal

`ServisController` menggunakan class `ValidasiInput` untuk membantu proses validasi data yang dimasukkan oleh pengguna.

#### `validation`

Package `validation` berisi class `ValidasiInput`.

<img width="125" height="28" alt="image" src="https://github.com/user-attachments/assets/b2751b6e-1789-4c4c-a03b-1e928180966e" />

Class `ValidasiInput` dibuat khusus untuk menangani validasi input dari pengguna. Class ini memiliki beberapa method untuk memvalidasi:

- teks
- angka
- nomor telepon
- tanggal
- biaya servis

Dengan memisahkan `ValidasiInput` ke dalam package `validation`, proses validasi tidak diletakkan langsung di dalam `ServisController`, sehingga kode menjadi lebih terorganisir dan mudah dikelola.

#### `interfaces` (Nilai Tambah)

Package `interfaces` berisi interface `InformasiPerangkat`.

<img width="146" height="29" alt="image" src="https://github.com/user-attachments/assets/714fd7bd-29ad-4a5e-8871-03ff64f85033" />

Interface ini digunakan sebagai nilai tambah pada Mini Project 3 dan
memiliki method `tampilkanInfo()` yang menjadi aturan bagi class
`Perangkat`.

#### `view`

Package `view` berisi `MenuView`.

<img width="118" height="28" alt="image" src="https://github.com/user-attachments/assets/24e6cb42-3d49-4491-bd69-e2b4d505ad21" />

Class ini digunakan untuk menampilkan menu utama dan menerima pilihan
menu dari pengguna.

#### Main Program

Class `ServisLaptop` digunakan sebagai titik awal ketika
program dijalankan. Class ini membuat object `MenuView` kemudian
menjalankan program.

<img width="154" height="27" alt="image" src="https://github.com/user-attachments/assets/9a9feb7e-6e22-4afb-9a71-e2f9d49eabb5" />

Dengan pembagian tersebut, setiap bagian program memiliki tugas yang
lebih jelas dan program menjadi lebih terorganisir.

------------------------------------------------------------------------

## 3. Struktur Class

Program menggunakan beberapa class yang memiliki fungsi berbeda.

### Class yang Digunakan

-   **Perangkat** → sebagai superclass yang menyimpan data umum
    perangkat.
-   **Laptop** → subclass dari `Perangkat` untuk jenis perangkat laptop.
-   **Komputer** → subclass dari `Perangkat` untuk jenis perangkat
    komputer.
-   **Pelanggan** → menyimpan informasi mengenai pelanggan.
-   **Servis** → menyimpan informasi mengenai proses servis.
-   **ServisController** → mengatur proses CRUD dan penyimpanan data.
-   **ValidasiInput** → menangani validasi input pengguna.
-   **MenuView** → menangani tampilan menu utama.
-   **ServisLaptop** → menjadi class utama untuk menjalankan
    program.

### Interface yang Digunakan

-   **InformasiPerangkat** → interface untuk informasi perangkat.

  
Hubungan inheritance pada program dapat digambarkan sebagai berikut:

``` text
                 Perangkat
                Superclass
                /        \
               /          \
              ▼            ▼
          Laptop        Komputer
          Subclass       Subclass
```

Class `Laptop` dan `Komputer` sama-sama mewarisi class `Perangkat`.

Class `Servis` memiliki object `Pelanggan` dan `Perangkat` sebagai
bagian dari data servis.

------------------------------------------------------------------------

## 4. Penjelasan Masing-Masing Class

### 4.1 `Perangkat`

Class `Perangkat` digunakan sebagai **abstract class** yang menjadi dasar
bagi jenis perangkat `Laptop` dan `Komputer`. Class ini menyimpan data
umum yang dimiliki oleh perangkat.

Atribut yang terdapat pada class `Perangkat` yaitu:

-   `idPerangkat`
-   `merk`
-   `tipe`
-   `kerusakan`

Contoh:

``` java
public abstract class Perangkat implements InformasiPerangkat {

    private final String idPerangkat;
    private String merk;
    private String tipe;
    private String kerusakan;

    public Perangkat(String idPerangkat, String merk,
            String tipe, String kerusakan) {

        this.idPerangkat = idPerangkat;
        this.merk = merk;
        this.tipe = tipe;
        this.kerusakan = kerusakan;
    }
}
```

Class `Perangkat` tidak dapat dibuat menjadi object secara langsung karena
merupakan abstract class. Class ini memiliki abstract method
`tampilkanInfo()` yang wajib diimplementasikan oleh subclass.

<img width="389" height="31" alt="image" src="https://github.com/user-attachments/assets/b18a63c2-9fec-4eea-ae8d-4cc4192491bc" />/

<img width="234" height="17" alt="image" src="https://github.com/user-attachments/assets/34068d04-9db6-40ff-bde1-64ac2f1c12fe" />

Class ini menjadi dasar bagi jenis perangkat lain seperti `Laptop` dan
`Komputer`.

------------------------------------------------------------------------

### 4.2 `Laptop`

Class `Laptop` merupakan subclass dari `Perangkat`.

``` java
public class Laptop extends Perangkat {
```

Class `Laptop` memiliki atribut khusus `ukuranLayar` yang membedakannya
dari jenis perangkat lainnya.

Constructor `Laptop` menggunakan `super()` untuk memanggil constructor
dari class `Perangkat`.

``` java
super(idPerangkat, merk, tipe, kerusakan);
```

Class `Laptop` juga melakukan **method overriding** pada method
`tampilkanInfo()`.

``` java
@Override
public void tampilkanInfo() {
    System.out.println("Jenis        : Laptop");
    System.out.println("ID Laptop    : " + getIdPerangkat());
    System.out.println("Merk         : " + getMerk());
    System.out.println("Tipe         : " + getTipe());
    System.out.println("Kerusakan    : " + getKerusakan());
    System.out.println("Ukuran Layar (Inci) : " + ukuranLayar + " Inci");
}
```

------------------------------------------------------------------------

### 4.3 `Komputer`

Class `Komputer` merupakan subclass kedua dari `Perangkat`.

``` java
public class Komputer extends Perangkat {
```

Class `Komputer` memiliki atribut khusus `jenisCasing`.

Class ini juga melakukan overriding terhadap method `tampilkanInfo()`.

``` java
@Override
public void tampilkanInfo() {
    System.out.println("Jenis        : Komputer");
    System.out.println("ID Komputer  : " + getIdPerangkat());
    System.out.println("Merk         : " + getMerk());
    System.out.println("Tipe         : " + getTipe());
    System.out.println("Kerusakan    : " + getKerusakan());
    System.out.println("Jenis Casing : " + jenisCasing);
}
```

Dengan adanya atribut khusus tersebut, `Laptop` dan `Komputer` memiliki
perbedaan yang jelas sebagai subclass dari `Perangkat`.

------------------------------------------------------------------------

### 4.4 `Pelanggan`

Class `Pelanggan` digunakan untuk menyimpan data orang yang menggunakan
layanan servis.

Data yang disimpan terdiri dari:

-   `idPelanggan`
-   `nama`
-   `noTelepon`
-   `alamat`

Contoh:

``` java
public class Pelanggan {

    private final String idPelanggan;
    private String nama;
    private String noTelepon;
    private String alamat;

    public Pelanggan(String idPelanggan, String nama,
            String noTelepon, String alamat) {

        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
    }
}
```

------------------------------------------------------------------------

### 4.5 `Servis`

Class `Servis` digunakan untuk menyimpan informasi mengenai proses
servis.

Atribut yang digunakan yaitu:

-   `idServis`
-   `tanggal`
-   `status`
-   `biaya`
-   `pelanggan`
-   `perangkat`

Contoh:

``` java
public class Servis {

    private final String idServis;
    private String tanggal;
    private String status;
    private int biaya;

    private Pelanggan pelanggan;
    private Perangkat perangkat;
}
```

Object `Pelanggan` dan `Perangkat` disimpan di dalam object `Servis`
sehingga satu data servis memiliki informasi pelanggan dan perangkat
yang berkaitan.

------------------------------------------------------------------------

## 5. Inheritance

Inheritance diterapkan dengan menggunakan satu superclass dan dua
subclass.

Struktur inheritance pada program adalah:

``` text
                 Perangkat
                Superclass
                /        \
               /          \
              ▼            ▼
          Laptop        Komputer
          Subclass       Subclass
```

Class `Perangkat` menjadi superclass:

``` java
public abstract class Perangkat implements InformasiPerangkat {
```

Kemudian `Laptop` menjadi subclass:

``` java
public class Laptop extends Perangkat {
```

Dan `Komputer` menjadi subclass:

``` java
public class Komputer extends Perangkat {
```

Dengan penerapan inheritance, data umum seperti ID perangkat, merk,
tipe, dan kerusakan cukup didefinisikan pada `Perangkat`.

------------------------------------------------------------------------

## 6. Polymorphism

Program menerapkan **polymorphism melalui method overriding dan
overloading**.

### Method Overriding

Method `tampilkanInfo()` didefinisikan sebagai abstract method pada
class `Perangkat`, kemudian diimplementasikan oleh `Laptop` dan
`Komputer`.

``` java
@Override
public void tampilkanInfo()
```

Pada saat program membuat perangkat, tipe object dapat berupa `Laptop`
atau `Komputer`.

Contohnya:

``` java
Perangkat perangkat;

if (pilihanJenis == 1) {

    String ukuranLayar =
            validasi.inputTeks("Ukuran Layar (Inci): ");

    perangkat = new Laptop(
        idPerangkat,
        merk,
        tipe,
        kerusakan,
        ukuranLayar
    );

} else {

    String jenisCasing =
            validasi.inputTeks("Jenis Casing: ");

    perangkat = new Komputer(
        idPerangkat,
        merk,
        tipe,
        kerusakan,
        jenisCasing
    );
}
```

Kemudian ketika method berikut dipanggil:

``` java
perangkat.tampilkanInfo();
```

Java akan menjalankan `tampilkanInfo()` sesuai dengan object yang
digunakan.

Jika object merupakan `Laptop`, maka method `tampilkanInfo()` dari class
`Laptop` yang digunakan.

Jika object merupakan `Komputer`, maka method `tampilkanInfo()` dari
class `Komputer` yang digunakan.

Dengan demikian, program menerapkan polymorphism melalui **method
overriding**.

`Laptop.java`

<img width="461" height="129" alt="image" src="https://github.com/user-attachments/assets/1480aa4b-c091-4850-9321-90c328d51bcc" />

`Komputer.java`

<img width="382" height="125" alt="image" src="https://github.com/user-attachments/assets/1db29fc9-9a18-4ca8-a824-f2d22a207df4" />

### Method Overloading

Polymorphism melalui overloading diterapkan pada class `Servis`.

Class `Servis` memiliki dua method dengan nama yang sama, yaitu
`tampilkanInfo()`, tetapi memiliki parameter yang berbeda.

Method pertama:

``` java
public void tampilkanInfo() {
    tampilkanInfo(true);
}
```

Method kedua:

``` java
public void tampilkanInfo(boolean tampilkanPelanggan) {
    // isi method
}
```

Perbedaan parameter tersebut menunjukkan penerapan **method overloading**.
`Servis.java`

<img width="373" height="412" alt="image" src="https://github.com/user-attachments/assets/791e8f9b-1eb5-4f49-847e-e8b7c194981b" />

------------------------------------------------------------------------

## Abstraction

Abstraction diterapkan menggunakan **abstract class** dan **abstract
method**.

### Abstract Class

Class `Perangkat` dibuat sebagai abstract class:

``` java
public abstract class Perangkat implements InformasiPerangkat
```

Class ini digunakan sebagai class dasar untuk `Laptop` dan `Komputer`.
Karena bersifat abstract, class `Perangkat` tidak dibuat menjadi object
secara langsung.

### Abstract Method

Class `Perangkat` memiliki abstract method:

``` java
public abstract void tampilkanInfo();
```

Method tersebut tidak memiliki isi pada class `Perangkat` dan wajib
diimplementasikan oleh subclass.

Class `Laptop` dan `Komputer` kemudian memberikan implementasi masing-
masing melalui method overriding.

`Perangkat.java`

<img width="532" height="167" alt="image" src="https://github.com/user-attachments/assets/39a6c226-6990-42d5-aefc-d84098cf404b" />


------------------------------------------------------------------------

## Interface

Interface diterapkan sebagai **nilai tambah** melalui interface
`InformasiPerangkat`.

Interface tersebut berada pada package `interfaces` dan memiliki method
`tampilkanInfo()`.

``` java
package interfaces;

public interface InformasiPerangkat {

    void tampilkanInfo();
}
```

Interface tersebut kemudian diterapkan oleh abstract class `Perangkat`:

``` java
public abstract class Perangkat implements InformasiPerangkat
```

Dengan penerapan tersebut, `Perangkat` memiliki aturan untuk menyediakan
method `tampilkanInfo()` yang kemudian diimplementasikan oleh subclass.

`InformasiPerangkat.java`

<img width="249" height="83" alt="image" src="https://github.com/user-attachments/assets/e874b2f6-3f81-4c5f-84af-9e440321c3c2" />

`Perangkat.java`

<img width="389" height="31" alt="image" src="https://github.com/user-attachments/assets/3d7e279a-8f6c-4a2f-aaa1-2821d58b64a7" />

------------------------------------------------------------------------

## 7. Encapsulation

Encapsulation diterapkan dengan membuat atribut pada class menggunakan
access modifier `private`.

Contohnya:

``` java
private final String idPerangkat;
private String merk;
private String tipe;
private String kerusakan;
```

Dengan menggunakan `private`, atribut tidak dapat diakses secara
langsung dari luar class.

Untuk mengakses data tersebut, program menggunakan getter.

Contohnya:

``` java
public String getMerk() {
    return merk;
}
```

Sedangkan untuk mengubah data yang memang dapat diubah, program
menggunakan setter.

Contohnya pada class `Servis`:

``` java
public void setStatus(String status) {
    this.status = status;
}
```

Setter tersebut digunakan ketika proses ubah data servis.

------------------------------------------------------------------------

## 8. Access Modifier

Program menerapkan beberapa access modifier, yaitu `private` dan
`public`.

### `private`

Digunakan pada atribut agar data tidak dapat diakses secara langsung
dari luar class.

Contohnya:

``` java
private String nama;
private String noTelepon;
private String alamat;
```

### `public`

Digunakan pada class, constructor, getter, setter, dan method yang perlu
digunakan oleh bagian program lainnya.

Contohnya:

``` java
public void tambahServis()
```

Penggunaan access modifier mendukung penerapan encapsulation pada
program.

------------------------------------------------------------------------

## 9. Constructor dan Object

Constructor digunakan untuk memberikan nilai awal ketika object dibuat.

Contohnya pada class `Pelanggan`:

``` java
Pelanggan pelanggan = new Pelanggan(
    idPelanggan,
    nama,
    noTelepon,
    alamat
);
```

Object perangkat juga dibuat berdasarkan jenis yang dipilih pengguna.

Jika memilih Laptop:

``` java
Perangkat perangkat = new Laptop(
    idPerangkat,
    merk,
    tipe,
    kerusakan,
    ukuranLayar
);
```

Jika memilih Komputer:

``` java
Perangkat perangkat = new Komputer(
    idPerangkat,
    merk,
    tipe,
    kerusakan,
    jenisCasing
);
```

Kemudian object tersebut digunakan untuk membuat object `Servis`:

``` java
Servis servis = new Servis(
    idServis,
    tanggal,
    status,
    biaya,
    pelanggan,
    perangkat
);
```

------------------------------------------------------------------------

## 10. Penggunaan ArrayList

Program menggunakan satu `ArrayList` untuk menyimpan data servis.

``` java
private ArrayList<Servis> daftarServis = new ArrayList<>();
```

Data pelanggan dan perangkat disimpan sebagai bagian dari object
`Servis`.

Dengan cara ini, data yang saling berhubungan tidak disimpan dalam
beberapa `ArrayList` yang terpisah.

Setelah object `Servis` dibuat, object tersebut dimasukkan ke dalam
`ArrayList`:

``` java
daftarServis.add(servis);
```

Data yang sudah tersimpan kemudian dapat digunakan untuk proses:

-   tampil
-   ubah
-   hapus
-   cari

------------------------------------------------------------------------

## 11. Dummy Data Awal

Program memiliki **dummy data awal** di dalam `ArrayList`.

Dummy data dibuat pada constructor `ServisController` sehingga ketika
program pertama kali dijalankan, data sudah tersedia tanpa harus
melakukan input terlebih dahulu.

Program memiliki empat dummy data:

``` text
=== DAFTAR DATA SERVIS ===
================================
           DATA SERVIS
================================

ID Pelanggan : P001
Nama         : James Chao
No Telepon   : 081234567801
Alamat       : Jl. P. Antasari Samarinda

Jenis        : Laptop
ID Laptop    : L001
Merk         : ASUS
Tipe         : VivoBook 14
Kerusakan    : Keyboard beberapa tombol tidak berfungsi
Ukuran Layar (Inci) : 14 Inci

ID Servis    : S001
Tanggal      : 09-09-2026
Status       : Diproses
Biaya        : Rp250000
================================

================================
           DATA SERVIS
================================

ID Pelanggan : P002
Nama         : Alya Putri
No Telepon   : 081234567802
Alamat       : Jl. S. Parman Samarinda

Jenis        : Komputer
ID Komputer  : K001
Merk         : Lenovo
Tipe         : ThinkCentre
Kerusakan    : Komputer tidak menyala
Jenis Casing : Mini Tower

ID Servis    : S002
Tanggal      : 10-09-2026
Status       : Menunggu
Biaya        : Rp300000
================================

================================
           DATA SERVIS
================================

ID Pelanggan : P003
Nama         : Rizky Maulana
No Telepon   : 081234567803
Alamat       : Jl. Juanda Samarinda

Jenis        : Laptop
ID Laptop    : L002
Merk         : Acer
Tipe         : Aspire 5
Kerusakan    : Layar laptop bergaris
Ukuran Layar (Inci) : 15.6 Inci

ID Servis    : S003
Tanggal      : 11-09-2026
Status       : Selesai
Biaya        : Rp450000
================================

================================
           DATA SERVIS
================================

ID Pelanggan : P004
Nama         : Nadia Safitri
No Telepon   : 081234567804
Alamat       : Jl. Gatot Subroto Samarinda

Jenis        : Komputer
ID Komputer  : K002
Merk         : HP
Tipe         : ProDesk 400
Kerusakan    : Hard disk bermasalah
Jenis Casing : Micro Tower

ID Servis    : S004
Tanggal      : 12-09-2026
Status       : Diproses
Biaya        : Rp500000
================================
```

Contohnya:

``` java
Servis servis1 = new Servis(
    "S001",
    "09-09-2026",
    "Diproses",
    250000,
    pelanggan1,
    perangkat1
);

daftarServis.add(servis1);
```

Dummy data tersebut membuat fitur **Tampilkan Data Servis** dapat
langsung digunakan ketika program baru dijalankan.

------------------------------------------------------------------------

## 12. Menu Utama

Program menggunakan menu sederhana berbasis CLI.

Menu yang tersedia:

``` text
================================
     SISTEM PENGELOLAAN SERVIS
================================
1. Tambah Data Servis
2. Tampilkan Data Servis
3. Ubah Data Servis
4. Hapus Data Servis
5. Cari Data Servis
6. Keluar
================================
```

Pengguna dapat memilih menu dengan memasukkan nomor pilihan.

Menu utama menggunakan perulangan `while (true)`, sehingga program akan terus
berjalan sampai pengguna memilih menu **6. Keluar**.

------------------------------------------------------------------------

## 13. Percabangan Menu

Pilihan menu diproses menggunakan `switch-case`.

Contohnya:

``` java
switch (pilihan) {
    case "1":
        controller.tambahServis();
        break;
    case "2":
        controller.tampilkanServis();
        break;
    case "3":
        controller.ubahServis();
        break;
    case "4":
        controller.hapusServis();
        break;
    case "5":
        controller.cariData();
        break;
    case "6":
        System.out.println("\nProgram selesai.");
        return;
    default:
        System.out.println("Menu hanya 1-6!");
}
```

Jika pengguna memilih angka 1 sampai 5, program akan menjalankan fitur
sesuai pilihan.

Jika pengguna memilih angka yang tidak tersedia, bagian `default` akan
dijalankan.

------------------------------------------------------------------------

## 14. Proses Tambah Data Servis

Proses tambah data dijalankan ketika pengguna memilih menu **1. Tambah
Data Servis**.

### Data Pelanggan

Pengguna memasukkan:

-   ID Pelanggan
-   Nama
-   Nomor Telepon
-   Alamat

### Data Perangkat

Pengguna terlebih dahulu memilih jenis perangkat:

``` text
1. Laptop
2. Komputer
```

Kemudian memasukkan:

-   ID Perangkat
-   Merk
-   Tipe
-   Kerusakan

Jika memilih **Laptop**, pengguna juga memasukkan:

-   Ukuran Layar (Inci)

Jika memilih **Komputer**, pengguna juga memasukkan:

-   Jenis Casing

### Data Servis

Selanjutnya pengguna memasukkan:

-   ID Servis
-   Tanggal
-   Status
-   Biaya

Status servis terdiri dari:

``` text
1. Menunggu
2. Diproses
3. Selesai
```

Setelah semua data dinyatakan valid, program membuat object `Pelanggan`,
`Perangkat`, dan `Servis`.

Object `Servis` kemudian dimasukkan ke dalam `ArrayList`.

------------------------------------------------------------------------

## 15. Proses Menampilkan Data

Menu **2. Tampilkan Data Servis** digunakan untuk menampilkan seluruh
data yang tersimpan.

Program melakukan perulangan terhadap `daftarServis`.

``` java
for (Servis servis : daftarServis) {

    servis.tampilkanInfo();

}
```

Informasi yang ditampilkan meliputi:

-   ID Pelanggan
-   Nama
-   Nomor Telepon
-   Alamat
-   Jenis Perangkat
-   ID Perangkat
-   Merk
-   Tipe
-   Kerusakan
-   ID Servis
-   Tanggal
-   Status
-   Biaya

Karena terdapat dummy data, data servis sudah langsung tampil ketika
fitur read dijalankan.

------------------------------------------------------------------------

## 16. Proses Mengubah Data

Menu **3. Ubah Data Servis** digunakan untuk mengubah data servis
berdasarkan ID Servis.

Pengguna memasukkan ID servis terlebih dahulu.

``` text
Masukkan ID Servis: S005
```

Jika data ditemukan, program akan menampilkan data tersebut.

Data yang dapat diubah adalah:

-   Tanggal
-   Status
-   Biaya

Status dapat dipilih kembali melalui pilihan:

``` text
1. Menunggu
2. Diproses
3. Selesai
```

Setter digunakan untuk menyimpan perubahan.

``` java
servis.setTanggal(tanggalBaru);
servis.setStatus(statusBaru);
servis.setBiaya(biayaBaru);
```

Jika ID servis tidak ditemukan, program akan menampilkan:

``` text
Data servis tidak ditemukan.
```

------------------------------------------------------------------------

## 17. Proses Menghapus Data

Menu **4. Hapus Data Servis** digunakan untuk menghapus data servis
berdasarkan ID servis.

Program terlebih dahulu mencari data berdasarkan ID.

Jika data ditemukan, data tersebut ditampilkan dan pengguna diminta
melakukan konfirmasi.

``` text
Yakin ingin menghapus? (y/n):
```

Jika pengguna memilih `y`, data akan dihapus:

``` java
daftarServis.remove(servis);
```

Jika pengguna memilih `n`, penghapusan dibatalkan.

Program juga melakukan validasi agar pengguna hanya memasukkan `y` atau
`n`.

------------------------------------------------------------------------

## 18. Proses Pencarian Data

Menu **5. Cari Data Servis** digunakan untuk mencari data berdasarkan ID
servis.

Pengguna memasukkan ID servis:

``` text
Masukkan ID Servis: S005
```

Program kemudian melakukan pencarian pada `daftarServis`.

Jika data ditemukan, informasi servis akan ditampilkan.

Jika tidak ditemukan:

``` text
Data servis tidak ditemukan.
```

Fitur ini membantu pengguna menemukan data tertentu tanpa harus melihat
seluruh data servis.

------------------------------------------------------------------------

## 19. Validasi Input

Program menerapkan validasi input untuk mengurangi kesalahan ketika
pengguna memasukkan data.

### Validasi Teks

Input teks tidak boleh kosong.

``` text
Input tidak boleh kosong!
```

Validasi ini digunakan pada data seperti:

-   ID Pelanggan
-   Nama
-   Alamat
-   ID Perangkat
-   Merk
-   Tipe
-   Kerusakan
-   ID Servis

### Validasi Nomor Telepon

Nomor telepon harus:

-   tidak kosong
-   hanya berisi angka
-   memiliki panjang 10--13 digit

Contoh:

``` text
No Telepon: fhuiah
Nomor telepon hanya boleh berisi angka!
```

Jika nomor terlalu pendek:

``` text
No Telepon: 0493204
Nomor telepon harus 10-13 digit!
```

### Validasi Jenis Perangkat

Jenis perangkat hanya dapat dipilih:

``` text
1. Laptop
2. Komputer
```

Jika pengguna memasukkan pilihan lain:

``` text
Pilih jenis perangkat: 3
Pilihan hanya 1 atau 2!
```

### Validasi Status

Status hanya dapat dipilih:

``` text
1. Menunggu
2. Diproses
3. Selesai
```

### Validasi Tanggal

Format tanggal yang digunakan adalah:

``` text
DD-MM-YYYY
```

Contoh format yang benar:

``` text
22-04-2026
```

Program menolak format lain seperti:

``` text
04/06/2026
```

Program juga memeriksa bulan agar berada pada rentang `01-12`.

Contoh:

``` text
20-13-2026
Bulan harus 01-12!
```

### Validasi Biaya

Biaya harus berupa angka dan memiliki nilai minimal Rp50000.

Jika biaya kurang dari Rp50000, program menampilkan:

``` text
Biaya minimal Rp50000!
```

Contoh ketika memasukkan huruf:

``` text
Biaya: Rpabcde
Biaya harus berupa angka!
```

### Validasi ID Servis

ID Servis tidak boleh sama dengan ID servis yang sudah tersimpan.

Jika ID sudah digunakan:

``` text
ID Servis sudah digunakan!
```

------------------------------------------------------------------------

## 20. Perulangan Program

Program menggunakan beberapa jenis perulangan.

### `while`

Digunakan pada menu utama agar program terus berjalan sampai pengguna
memilih menu 6.

``` java
while (true) {
    // menampilkan menu
    // menerima pilihan
    // memproses pilihan menu
}
```

### `for`

Digunakan untuk membaca data yang terdapat dalam `ArrayList`.

``` java
for (Servis servis : daftarServis) {
    servis.tampilkanInfo();
}
```

### `while`

Digunakan pada proses validasi input.

``` java
while (true) {
    // meminta input
    // memeriksa input
}
```

Jika input salah, program akan meminta pengguna memasukkan data kembali.

------------------------------------------------------------------------

## 21. Percabangan `if-else`

Selain `switch-case`, program juga menggunakan `if-else` untuk
menentukan kondisi tertentu.

Contohnya pada pemilihan jenis perangkat:

``` java
if (pilihanJenis == 1) {

    perangkat = new Laptop(
        idPerangkat,
        merk,
        tipe,
        kerusakan
    );

} else {

    perangkat = new Komputer(
        idPerangkat,
        merk,
        tipe,
        kerusakan
    );
}
```

`if-else` juga digunakan pada proses validasi, pencarian data, dan
pengecekan kondisi lainnya.

------------------------------------------------------------------------

# 22. Dokumentasi Output Program

Berikut merupakan dokumentasi hasil pengujian program terbaru.

## 22.1 Tambah Data Servis

Pada pengujian ini, pengguna memilih menu **1. Tambah Data Servis**.

Pengguna memasukkan data pelanggan, memilih jenis perangkat **Laptop**,
memasukkan data perangkat, kemudian memasukkan data servis.

Data berhasil ditambahkan dengan ID servis `S005`.

<img width="191" height="299" alt="image" src="https://github.com/user-attachments/assets/e7141bee-2126-445c-8573-3f4dbaec8f2e" />


Program menampilkan:

``` text
Data servis berhasil ditambahkan.
```
<img width="193" height="113" alt="Screenshot 2026-09-24 072941" src="https://github.com/user-attachments/assets/039f0cc9-1106-442f-9aee-6024cf2a294a" />

------------------------------------------------------------------------

## 22.2 Tampilkan Data Servis

Pengguna memilih menu **2. Tampilkan Data Servis**.

Program menampilkan dummy data yang sudah tersedia serta data `S005`
yang baru ditambahkan.

<img width="317" height="314" alt="image" src="https://github.com/user-attachments/assets/47b85e45-5eb5-4b8a-b023-6e185e767566" />
<img width="222" height="269" alt="image" src="https://github.com/user-attachments/assets/bbdecc62-7b9c-4ffc-aab1-6941db2ba5df" />
<img width="211" height="275" alt="image" src="https://github.com/user-attachments/assets/d96cc341-3d84-4807-9200-c69655da3646" />
<img width="242" height="270" alt="image" src="https://github.com/user-attachments/assets/a580c08d-6fce-4542-a975-f7882f0bee7d" />
<img width="190" height="273" alt="image" src="https://github.com/user-attachments/assets/a706e137-5ccb-4ee7-ad1b-98318ef13551" />


Data yang ditampilkan terdiri dari data pelanggan, perangkat, dan
servis.

------------------------------------------------------------------------

## 22.3 Ubah Data Servis

Pengguna memilih menu **3. Ubah Data Servis** dan memasukkan ID `S005`.

Data ditemukan kemudian pengguna mengubah:

<img width="185" height="345" alt="image" src="https://github.com/user-attachments/assets/e375a774-55d3-42a7-930b-0f677305c7f7" />

``` text
Tanggal : 22-04-2026 → 23-04-2026
Status  : Menunggu → Diproses
Biaya   : Rp200000 → Rp205000
```

Program menampilkan:

``` text
Data servis berhasil diubah.
```
<img width="215" height="155" alt="Screenshot 2026-09-24 073235" src="https://github.com/user-attachments/assets/04cc43e2-522a-4cec-a2b6-8113930cf348" />

------------------------------------------------------------------------

## 22.4 Cari Data Servis

Pengguna memilih menu **5. Cari Data Servis** dan memasukkan ID `S005`.

Program berhasil menemukan data dan menampilkan data terbaru setelah
proses perubahan.

<img width="186" height="347" alt="image" src="https://github.com/user-attachments/assets/07eb566c-092a-4062-8750-2cecb0e48679" />


------------------------------------------------------------------------

## 22.5 Hapus Data Servis

Pengguna memilih menu **4. Hapus Data Servis** dan memasukkan ID `S005`.

Program menampilkan data yang akan dihapus dan meminta konfirmasi:

``` text
Yakin ingin menghapus? (y/n):
```

<img width="186" height="368" alt="image" src="https://github.com/user-attachments/assets/5e0cd858-0050-45b8-8259-fe88ff42474c" />
<img width="183" height="28" alt="image" src="https://github.com/user-attachments/assets/ccbf7a0e-3a8b-4b7f-8a73-641a000114ac" />


Ketika pengguna memilih `n`, program membatalkan penghapusan.


<img width="189" height="368" alt="image" src="https://github.com/user-attachments/assets/2240e3dd-ef72-403b-a351-803efbb2526f" />
<img width="178" height="26" alt="image" src="https://github.com/user-attachments/assets/567df00e-4ae9-40d7-a278-4a3103ce7bb6" />


Setelah data dihapus dengan pilihan `y`, data `S005` tidak lagi
ditemukan ketika dilakukan pencarian.

<img width="161" height="68" alt="image" src="https://github.com/user-attachments/assets/652f1a41-dd65-4f29-a53e-ac0c79f94e38" />


------------------------------------------------------------------------

# 23. Pengujian Validasi Input

Program juga diuji menggunakan beberapa input yang tidak sesuai.

### 1. Validasi Nomor Telepon

Validasi nomor telepon digunakan untuk memastikan pengguna telah menginput angka untuk nomor telepon dan bukan menginput huruf ataupun simbol.
Selain itu, memastikan pengguna menginput nomor telepon sebanyak 10-13 digit dan tidak kurang dari 10 digit.

Ketika pengguna memasukkan huruf:

``` text
No Telepon: fhuiah
Nomor telepon hanya boleh berisi angka!
```

<img width="229" height="52" alt="Screenshot 2026-09-24 073552" src="https://github.com/user-attachments/assets/722e3fe4-98c2-471d-9b91-8badeeafa7e6" />


Ketika nomor kurang dari 10 digit:

``` text
No Telepon: 0493204
Nomor telepon harus 10-13 digit!
```

<img width="186" height="28" alt="Screenshot 2026-09-24 073607" src="https://github.com/user-attachments/assets/a300417f-1fa1-4ca6-9eee-adf3cfc493d9" />

------------------------------------------------------------------------

### 2. Validasi Jenis Perangkat

Validasi jenis perangkat digunakan untuk memastikan pengguna menginput pilihan yang tersedia di menu dan tidak menginput pilihan lain selain itu.

Ketika pengguna memasukkan pilihan `3`:

``` text
Pilih jenis perangkat: 3
Pilihan hanya 1 atau 2!
```

<img width="144" height="62" alt="Screenshot 2026-09-24 073640" src="https://github.com/user-attachments/assets/89cf593f-e6eb-4047-997d-847ea6bdd29b" />

------------------------------------------------------------------------

### 3. Validasi Tanggal

Validasi tanggal digunakan untuk memastikan pengguna menginput tanggal servis sesuai dengan format yang sudah ditentukan oleh program.
Selain itu, program memastikan pengguna untuk menginput bulan yang benar yaitu antara bulan 01-12 saja.

Program menggunakan format:

``` text
DD-MM-YYYY
```

Ketika pengguna memasukkan:

``` text
04/06/2026
```

program menampilkan:

``` text
Format tanggal harus DD-MM-YYYY!
```

<img width="184" height="26" alt="format " src="https://github.com/user-attachments/assets/b8bd2c87-1f71-4deb-b837-9ed8a95df164" />


Program juga memeriksa bulan.

Contohnya:

``` text
20-13-2026
Bulan harus 01-12!
```

<img width="184" height="26" alt="bulan" src="https://github.com/user-attachments/assets/c160ea79-f2c7-4ff8-a969-d012e4d2f324" />

------------------------------------------------------------------------

### 4. Validasi Biaya

Validasi biaya digunakan untuk memastikan biaya servis yang dimasukkan oleh pengguna berupa angka dan sesuai dengan ketentuan yang telah ditentukan. Jika pengguna memasukkan huruf, sistem akan menampilkan pesan bahwa biaya harus berupa angka.

Selain itu, biaya servis yang dimasukkan harus memiliki nilai minimal Rp50.000. Jika biaya yang dimasukkan kurang dari batas tersebut, sistem akan meminta pengguna memasukkan biaya kembali.

Ketika pengguna memasukkan huruf pada biaya:

``` text
Biaya: Rpabcde
Biaya harus berupa angka!
```

<img width="149" height="53" alt="Screenshot 2026-09-24 074104" src="https://github.com/user-attachments/assets/0dc400a2-8a8b-4d89-9de3-9ea7f5bd134a" />

Ketika pengguna memasukkan biaya servis yang kurang dari nominal Rp 50.000:

<img width="131" height="38" alt="image" src="https://github.com/user-attachments/assets/6595e88a-f159-4f1b-bda9-b71a3c2df7e5" />


------------------------------------------------------------------------

### 5. Validasi Input Kosong

Validasi input kosong digunakan untuk memastikan pengguna tidak sengaja mengosongkan pengisian data.

Program juga menolak input yang kosong.

Contohnya:

``` text
Tanggal (DD-MM-YYYY):
Tanggal tidak boleh kosong!
```


<img width="184" height="26" alt="kosong" src="https://github.com/user-attachments/assets/b8ad9abf-1157-409d-a7b5-f3d6de88445d" />


------------------------------------------------------------------------

# 24. Penerapan Konsep PBO

Dalam program ini, beberapa konsep dasar Pemrograman Berorientasi Objek
diterapkan secara langsung.

### 1. Class

Program memiliki beberapa class:

``` text
Pelanggan
Perangkat
Laptop
Komputer
Servis
ServisController
MenuView
ValidasiInput
ServisLaptop
```

Setiap class memiliki tugas masing-masing.

### 2. Interface

Program memiliki satu Interface:

```text
InformasiPerangkat
```

### 3. Object

Object dibuat menggunakan keyword `new`.

Contohnya:

``` java
Pelanggan pelanggan = new Pelanggan(...);
```

dan:

``` java
Perangkat perangkat = new Laptop(...);
```

### 4. Constructor

Constructor digunakan untuk memberikan nilai awal ketika object dibuat.

### 5. Encapsulation

Encapsulation diterapkan dengan membuat atribut menggunakan `private`
dan mengaksesnya menggunakan getter dan setter.

### 6. Access Modifier

Program menggunakan `private` dan `public` untuk mengatur hak akses
terhadap class, atribut, constructor, dan method.

### 7. Inheritance

Inheritance diterapkan dengan hubungan:

``` text
Perangkat
   ├── Laptop
   └── Komputer
```

### 8. Polymorphism

Polymorphism diterapkan melalui **method overriding** dan **method
overloading**.

Overriding diterapkan pada `tampilkanInfo()` di class `Laptop` dan
`Komputer`, sedangkan overloading diterapkan pada class `Servis` melalui
dua method `tampilkanInfo()` dengan parameter yang berbeda.

### 9. Abstraction

Abstraction diterapkan melalui abstract class `Perangkat` dan abstract
method `tampilkanInfo()`.

### 10. Interface

Interface `InformasiPerangkat` diterapkan sebagai nilai tambah. Interface
ini memiliki method `tampilkanInfo()` dan diimplementasikan oleh
abstract class `Perangkat`.

### 11. ArrayList

`ArrayList<Servis>` digunakan untuk menyimpan kumpulan data servis
selama program berjalan.

### 12. Validasi Input

Validasi digunakan untuk memastikan data yang dimasukkan pengguna sesuai
dengan kebutuhan program.

------------------------------------------------------------------------

# 25. Alur Program

Alur program secara sederhana adalah:

``` text
                    MULAI
                      │
                      ▼
                Tampilkan Menu
                      │
                      ▼
              Pilih Menu 1 - 6
                      │
       ┌──────────────┼──────────────┐
       │              │              │
       ▼              ▼              ▼
     Tambah         Tampil          Ubah
       │              │              │
       └──────────────┼──────────────┘
                      │
              ┌───────┴───────┐
              │               │
              ▼               ▼
            Hapus            Cari
              │               │
              └───────┬───────┘
                      │
                      ▼
                Kembali ke Menu
                      │
                      ▼
                 Pilih Menu 6
                      │
                      ▼
                   SELESAI
```

Program akan terus menampilkan menu sampai pengguna memilih pilihan **6.
Keluar**.

------------------------------------------------------------------------

# 26. Kesimpulan

Berdasarkan program yang telah dibuat, **Sistem Pengelolaan Servis
Laptop** dapat digunakan untuk membantu proses pencatatan dan
pengelolaan data pelanggan, perangkat, serta servis melalui terminal.

Program menyediakan fitur tambah, tampil, ubah, hapus, dan cari data
servis. Data disimpan menggunakan `ArrayList<Servis>` sehingga data
pelanggan dan perangkat yang berkaitan dapat disimpan dalam satu object
servis.

Dalam pengembangannya, program menerapkan konsep Pemrograman
Berorientasi Objek seperti class, object, constructor, encapsulation,
access modifier, getter dan setter.

Program juga menerapkan **inheritance** dengan `Perangkat` sebagai
superclass dan `Laptop` serta `Komputer` sebagai subclass.

Selain itu, program menerapkan **polymorphism melalui method overriding
dan overloading**. Overriding diterapkan pada `Laptop` dan `Komputer`
melalui method `tampilkanInfo()`, sedangkan overloading diterapkan pada
class `Servis` melalui dua method `tampilkanInfo()` dengan parameter yang
berbeda.

Program juga menerapkan **abstraction** melalui abstract class
`Perangkat` dan abstract method `tampilkanInfo()`.

Sebagai nilai tambah, program menerapkan interface
`InformasiPerangkat` yang digunakan oleh abstract class `Perangkat`.

Program juga menggunakan struktur **MVC** yang memisahkan bagian model,
controller, dan view agar program lebih terorganisir.

Untuk mengurangi kesalahan input, program dilengkapi dengan berbagai
validasi seperti validasi input kosong, nomor telepon, jenis perangkat,
status, tanggal, biaya, dan ID servis.

Program juga memiliki **dummy data awal sebanyak empat data** sehingga
data langsung dapat ditampilkan ketika fitur read dijalankan.

Dengan penerapan tersebut, program dapat menjalankan proses CRUD
sekaligus menerapkan konsep PBO dan struktur program yang lebih
terorganisir.
