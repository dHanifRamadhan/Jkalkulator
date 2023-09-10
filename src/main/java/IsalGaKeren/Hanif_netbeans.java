
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package IsalGaKeren;


import java.util.Scanner;
/**
 *
 * @author lab4
 */
public class Hanif_netbeans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlahSiswa;
        
        do {
            System.out.print("Masukkan jumlah siswa: ");
            jumlahSiswa = input.nextInt();
            
            String[] nisnArray = new String[jumlahSiswa];
            String[] namaArray = new String[jumlahSiswa];
            Double[] utsArray = new Double[jumlahSiswa];
            Double[] uasArray = new Double[jumlahSiswa];
            Double[] rataArray = new Double[jumlahSiswa];
            Double[] tugasArray = new Double[jumlahSiswa];
            String[] gradeArray = new String[jumlahSiswa];
            
            System.out.println("\nData Siswa SMK Informatika Utama - Siswa "+jumlahSiswa);
            for (int i=0;i<jumlahSiswa;i++) {
                System.out.println("\nInput Data Siswa SMK Informatika Utama - Siswa Ke "+(i+1));
                
                System.out.print("Nisn: ");
                nisnArray[i] = input.next();
                System.out.print("Nama: ");
                namaArray[i] = input.next();
                
                // Validasi input nilai Tugas
                do {
                    System.out.print("Nilai Tugas: ");
                    tugasArray[i] = input.nextDouble();
                    if (tugasArray[i] < 0 || tugasArray[i] > 100) {
                        System.out.println("Nilai Tugas harus berada di antara 0 dan 100 ");
                    }
                } while (tugasArray[i] < 0 || tugasArray[i] > 100);
                
                // Validasi input nilai UTS
                do {
                    System.out.print("Nilai UTS: ");
                    utsArray[i] = input.nextDouble();
                    if (utsArray[i] < 0 || utsArray[i] > 100) {
                        System.out.println("Nilai UTS harus berada di antara 0 dan 100.");
                    }
                } while (utsArray[i] < 0 || utsArray[i] > 100);
                
                // Validasi input nilai UAS
                do {
                    System.out.print("Nilai UAS: ");
                    uasArray[i] = input.nextDouble();
                    if (uasArray[i] < 0 || uasArray[i] > 100) {
                        System.out.println("Nilai UAS harus berada di antara 0 dan 100.");
                    }
                } while (uasArray[i] < 0 || uasArray[i] > 100);
                
                rataArray[i] = ((tugasArray[i] * 30)/100) + ((utsArray[i]  * 30)/100) + ((uasArray[i] * 40)/100);
                
                if (rataArray[i] < 50) {
                    gradeArray[i] = "E";
                } else if (rataArray[i] < 60) {
                    gradeArray[i] = "D";
                } else if (rataArray[i] < 70) {
                    gradeArray[i] = "C";
                } else if (rataArray[i] < 80) {
                    gradeArray[i] = "B";
                } else {
                    gradeArray[i] = "A";
                }
                
                System.out.print("\n");
            }
            
            System.out.print("Apakah Anda ingin mengulang input? (ya/tidak): ");
            String lagi = input.next();
            
            if (!lagi.equalsIgnoreCase("ya")) {
                System.out.println("====================================================");
                System.out.println("nisn\tnama\ttugas\tuts\tuas\trata\tgrade");
                System.out.println("====================================================");
                for (int i = 0; i < jumlahSiswa; i++) {
                    System.out.println(nisnArray[i] + "\t" + namaArray[i] + "\t" + tugasArray[i] + "\t" + utsArray[i] + "\t" + uasArray[i] + "\t" + rataArray[i] + "\t" + gradeArray[i]);
                }
                System.out.println("====================================================");
                break;
            }
        } while (true);
        input.close();
    }
}
