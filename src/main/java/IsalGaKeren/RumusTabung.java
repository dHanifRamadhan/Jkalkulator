/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IsalGaKeren;
import java.util.Scanner;
/**
 *
 * @author lab4
 */
public class RumusTabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Double r, t, v;
        
        System.out.print("Berapa Jari - jari Lingkaran \n");
        System.out.print("Jawab : ");
        r = input.nextDouble();
        System.out.print("Berapa Tinggi Lingkaran \n");
        System.out.print("Jawab : ");
        t = input.nextDouble();

        r *= r;
        
        if (r % 7 == 0) {
            v = ((r/7)*22)*t;
        } else {
            v = 3.14 * r * t;
        }
        
        System.out.println("Rumus Tabungnya adalah " + v);
        input.close();
    }
}
