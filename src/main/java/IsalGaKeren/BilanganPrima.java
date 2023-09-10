/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IsalGaKeren;

/**
 *
 * @author lab4
 */
public class BilanganPrima {
    public static void main(String[] args) {
        int angka = 2; // Angka pertama yang akan dicek
        int banyakAngka = 10;

        while (0 < banyakAngka) {
            
            boolean prima = true;
            
            if (angka <= 1) { 
                prima = false;
            } else {
                for (int i = 2; i * i <= angka; i++ ) {
                    if (angka % i == 0) {
                        prima = false;
                        break;
                    }
                }
            }
            
            if (prima) {
                System.out.println(angka);
                banyakAngka--;
            }
            angka++;
        }
    }
}

