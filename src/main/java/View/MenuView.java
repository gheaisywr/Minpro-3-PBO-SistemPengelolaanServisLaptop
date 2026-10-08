package view;

import controller.ServisController;
import java.util.Scanner;

public class MenuView {
    private Scanner input;
    private ServisController controller;
    public MenuView(
            Scanner input,
            ServisController controller) {

        this.input = input;
        this.controller = controller;
    }
    public void tampilkanMenu() {
        while (true) {
            System.out.println();
            System.out.println("================================");
            System.out.println("   SISTEM PENGELOLAAN SERVIS");
            System.out.println("================================");
            System.out.println("1. Tambah Data Servis");
            System.out.println("2. Tampilkan Data Servis");
            System.out.println("3. Ubah Data Servis");
            System.out.println("4. Hapus Data Servis");
            System.out.println("5. Cari Data Servis");
            System.out.println("6. Keluar");
            System.out.println("================================");
            System.out.print("Pilih menu: ");

            String pilihan = input.nextLine().trim();

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
                    System.out.println(
                            "Menu hanya 1-6!"
                    );
            }
        }
    }
}