/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class kelipatan {
    public static void main(String[] args) {
        int angka = 1;

        do {
            angka = angka * 2;
            if (angka <= 100) {
                System.out.print(angka + " ");
            }
        } while (angka <= 100);
        System.out.print("\n");
    }
}