package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Komputer;
import model.Laptop;
import model.Pelanggan;
import model.Perangkat;
import model.Servis;

public class ServisController {
    private ArrayList<Servis> daftarServis = new ArrayList<>();
    private Scanner input;
    private ValidasiInput validasi;
    
    public ServisController(Scanner input) {
        this.input = input;
        this.validasi = new ValidasiInput(input);

        // DUMMY DATA 1
        Pelanggan pelanggan1 = new Pelanggan(
                "P001",
                "James Chao",
                "081234567801",
                "Jl. P. Antasari Samarinda"
        );
        Perangkat perangkat1 = new Laptop(
                "L001",
                "ASUS",
                "VivoBook 14",
                "Keyboard beberapa tombol tidak berfungsi",
                "14"
        );
        Servis servis1 = new Servis(
                "S001",
                "09-09-2026",
                "Diproses",
                250000,
                pelanggan1,
                perangkat1
        );
        daftarServis.add(servis1);

        // DUMMY DATA 2
        Pelanggan pelanggan2 = new Pelanggan(
                "P002",
                "Alya Putri",
                "081234567802",
                "Jl. S. Parman Samarinda"
        );
        Perangkat perangkat2 = new Komputer(
                "K001",
                "Lenovo",
                "ThinkCentre",
                "Komputer tidak menyala",
                "Mini Tower"
        );
        Servis servis2 = new Servis(
                "S002",
                "10-09-2026",
                "Menunggu",
                300000,
                pelanggan2,
                perangkat2
        );
        daftarServis.add(servis2);

        // DUMMY DATA 3
        Pelanggan pelanggan3 = new Pelanggan(
                "P003",
                "Rizky Maulana",
                "081234567803",
                "Jl. Juanda Samarinda"
        );
        Perangkat perangkat3 = new Laptop(
                "L002",
                "Acer",
                "Aspire 5",
                "Layar laptop bergaris",
                "15.6"
        );
        Servis servis3 = new Servis(
                "S003",
                "11-09-2026",
                "Selesai",
                450000,
                pelanggan3,
                perangkat3
        );
        daftarServis.add(servis3);

        // DUMMY DATA 4
        Pelanggan pelanggan4 = new Pelanggan(
                "P004",
                "Nadia Safitri",
                "081234567804",
                "Jl. Gatot Subroto Samarinda"
        );
        Perangkat perangkat4 = new Komputer(
                "K002",
                "HP",
                "ProDesk 400",
                "Hard disk bermasalah",
                "Micro Tower"
        );
        Servis servis4 = new Servis(
                "S004",
                "12-09-2026",
                "Diproses",
                500000,
                pelanggan4,
                perangkat4
        );
        daftarServis.add(servis4);
    }
    // CREATE
    public void tambahServis() {
        System.out.println("\n=== TAMBAH DATA SERVIS ===");
        System.out.println("\n--- DATA PELANGGAN ---");
        
        String idPelanggan = validasi.inputTeks("ID Pelanggan: ");
        String nama = validasi.inputTeks("Nama: ");
        String noTelepon = validasi.inputNomorTelepon("No Telepon: ");
        String alamat = validasi.inputTeks("Alamat: ");

        System.out.println("\n--- DATA PERANGKAT ---");

        int pilihanJenis = pilihJenisPerangkat();

        String idPerangkat = validasi.inputTeks("ID Perangkat: ");
        String merk = validasi.inputTeks("Merk: ");
        String tipe = validasi.inputTeks("Tipe: ");
        String kerusakan = validasi.inputTeks("Kerusakan: ");

        Perangkat perangkat;
        if (pilihanJenis == 1) {
            String ukuranLayar = validasi.inputTeks("Ukuran Layar (Inci): ");

            perangkat = new Laptop(
                    idPerangkat,
                    merk,
                    tipe,
                    kerusakan,
                    ukuranLayar
            );
        } else {
            String jenisCasing = validasi.inputTeks("Jenis Casing: ");

            perangkat = new Komputer(
                    idPerangkat,
                    merk,
                    tipe,
                    kerusakan,
                    jenisCasing
            );
        }
        System.out.println("\n--- DATA SERVIS ---");

        String idServis = validasi.inputTeks("ID Servis: ");

        if (cariServis(idServis) != null) {
            System.out.println("ID Servis sudah digunakan!");
            return;
        }

        String tanggal = validasi.inputTanggal("Tanggal (DD-MM-YYYY): ");
        String status =
                pilihStatus();

        int biaya = validasi.inputBiaya("Biaya: Rp");

        Pelanggan pelanggan = new Pelanggan(
                idPelanggan,
                nama,
                noTelepon,
                alamat
        );
        Servis servis = new Servis(
                idServis,
                tanggal,
                status,
                biaya,
                pelanggan,
                perangkat
        );
        daftarServis.add(servis);
        System.out.println("\nData servis berhasil ditambahkan.");
    }

    // READ
    public void tampilkanServis() {
        System.out.println("\n=== DAFTAR DATA SERVIS ===");
        if (daftarServis.isEmpty()) {
            System.out.println("Belum ada data servis.");
            return;
        }
        for (Servis servis : daftarServis) {
            servis.tampilkanInfo();
            System.out.println();
        }
    }

    // UPDATE
    public void ubahServis() {
        System.out.println("\n=== UBAH DATA SERVIS ===");
        String id = validasi.inputTeks("Masukkan ID Servis: ");
        Servis servis = cariServis(id);

        if (servis == null) {
            System.out.println("Data servis tidak ditemukan.");
            return;
        }
        System.out.println("\nData ditemukan:");
        servis.tampilkanInfo();
        System.out.println("\n--- Ubah Data Servis ---");

        String tanggalBaru = validasi.inputTanggal("Tanggal baru (DD-MM-YYYY): ");
        String statusBaru =
                pilihStatus();

        int biayaBaru = validasi.inputBiaya("Biaya baru: Rp");

        servis.setTanggal(tanggalBaru);
        servis.setStatus(statusBaru);
        servis.setBiaya(biayaBaru);
        System.out.println("\nData servis berhasil diubah.");
    }

    // DELETE
    public void hapusServis() {
        System.out.println("\n=== HAPUS DATA SERVIS ===");
        String id = validasi.inputTeks("Masukkan ID Servis: ");
        Servis servis = cariServis(id);

        if (servis == null) {
            System.out.println("Data servis tidak ditemukan.");
            return;
        }
        System.out.println("\nData yang akan dihapus:");
        servis.tampilkanInfo();
        System.out.print("\nYakin ingin menghapus? (y/n): ");

        String pilihan = input.nextLine().trim();
        while (!pilihan.equalsIgnoreCase("y")
                && !pilihan.equalsIgnoreCase("n")) {
            System.out.println("Masukkan hanya y atau n!");
            System.out.print("Yakin ingin menghapus? (y/n): ");
            pilihan = input.nextLine().trim();
        }
        if (pilihan.equalsIgnoreCase("y")) {
            daftarServis.remove(servis);
            System.out.println("Data servis berhasil dihapus.");
        } else {
            System.out.println("Penghapusan dibatalkan.");
        }
    }

    // SEARCH
    public void cariData() {
        System.out.println("\n=== CARI DATA SERVIS ===");
        String id = validasi.inputTeks("Masukkan ID Servis: ");
        Servis servis = cariServis(id);

        if (servis == null) {
            System.out.println("Data servis tidak ditemukan.");
        } else {
            System.out.println("\nData ditemukan:");
            servis.tampilkanInfo();
        }
    }
    // CARI SERVIS

    private Servis cariServis(String id) {
        for (Servis servis : daftarServis) {
            if (servis.getIdServis()
                    .equalsIgnoreCase(id)) {
                return servis;
            }
        }
        return null;
    }

    // PILIH JENIS PERANGKAT
    private int pilihJenisPerangkat() {
        System.out.println("1. Laptop");
        System.out.println("2. Komputer");

        while (true) {
            int pilihan = validasi.inputAngka("Pilih jenis perangkat: ");
            
            if (pilihan == 1 || pilihan == 2) {
                return pilihan;
            } else {
                System.out.println(
                        "Pilihan hanya 1 atau 2!"
                );
            }
        }
    }

    // PILIH STATUS
    private String pilihStatus() {
        System.out.println("\nPilih Status Proses: ");
        System.out.println("1. Menunggu");
        System.out.println("2. Diproses");
        System.out.println("3. Selesai");

        while (true) {
            int pilihan =
                    validasi.inputAngka("Pilih status: ");

            if (pilihan == 1) {
                return "Menunggu";
            } else if (pilihan == 2) {
                return "Diproses";
            } else if (pilihan == 3) {
                return "Selesai";
            } else {
                System.out.println("Pilihan hanya 1, 2, atau 3!");
            }
        }
    }
}