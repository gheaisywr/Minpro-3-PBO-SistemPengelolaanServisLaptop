package controller;

import java.util.Scanner;

public class ValidasiInput {
    private Scanner input;
    public ValidasiInput(Scanner input) {
        this.input = input;
    }
    public String inputTeks(String pesan) {
        while (true) {
            System.out.print(pesan);
            String hasil = input.nextLine().trim();
            if (!hasil.isEmpty()) {
                return hasil;
            }
            System.out.println("Input tidak boleh kosong!");
        }
    }
    public int inputAngka(String pesan) {
        while (true) {
            try {
                System.out.print(pesan);
                int angka = Integer.parseInt(input.nextLine().trim());
                if (angka > 0) {
                    return angka;
                }
                System.out.println("Input harus lebih dari 0!");
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        }
    }
    public String inputNomorTelepon(String pesan) {
        while (true) {
            System.out.print(pesan);
            String nomor = input.nextLine().trim();
            if (nomor.isEmpty()) {
                System.out.println("Nomor telepon tidak boleh kosong!");
            } else if (!nomor.matches("\\d+")) {
                System.out.println(
                        "Nomor telepon hanya boleh berisi angka!"
                );
            } else if (nomor.length() < 10 || nomor.length() > 13) {
                System.out.println(
                        "Nomor telepon harus 10-13 digit!"
                );
            } else {
                return nomor;
            }
        }
    }
    public String inputTanggal(String pesan) {
        while (true) {
            System.out.print(pesan);
            String tanggal = input.nextLine().trim();
            if (tanggal.isEmpty()) {
                System.out.println("Tanggal tidak boleh kosong!");
            } else if (!tanggal.matches("\\d{2}-\\d{2}-\\d{4}")) {
                System.out.println(
                        "Format tanggal harus DD-MM-YYYY!"
                );
            } else {
                String[] bagian = tanggal.split("-");

                int hari = Integer.parseInt(bagian[0]);
                int bulan = Integer.parseInt(bagian[1]);
                int tahun = Integer.parseInt(bagian[2]);

                if (bulan < 1 || bulan > 12) {
                    System.out.println("Bulan harus 01-12!");
                } else if (hari < 1 || hari > 31) {
                    System.out.println("Tanggal harus 01-31!");
                } else if (tahun < 2000 || tahun > 2100) {
                    System.out.println("Tahun tidak valid!");
                } else {
                    return tanggal;
                }
            }
        }
    }
    public int inputBiaya(String pesan) {
        while (true) {
            try {
                System.out.print(pesan);
                int biaya = Integer.parseInt(input.nextLine().trim());
                if (biaya >= 50000) {
                    return biaya;
                }
                System.out.println(
                        "Biaya minimal Rp50000!"
                );
            } catch (NumberFormatException e) {
                System.out.println(
                        "Biaya harus berupa angka!"
                );
            }
        }
    }
}