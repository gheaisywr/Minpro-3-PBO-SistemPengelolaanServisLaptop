    // ==============================
    // Nama : Ghea Aisyah Windraswari
    // NIM  : 2509115022
    // ==============================

package com.mycompany.servislaptop;

import controller.ServisController;
import java.util.Scanner;
import view.MenuView;

public class ServisLaptop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ServisController controller = new ServisController(input);
        MenuView menu = new MenuView(input, controller);
        
        menu.tampilkanMenu();
        input.close();
    }
}