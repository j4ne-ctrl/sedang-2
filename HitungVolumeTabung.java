package LtihanUKL;

import java.util.Scanner;

public class HitungVolumeTabung {
    // fungsi dengan parameter
    static double hitungVolume(double jariJari, double tinggi) {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ============= PROGRAM HITUNG VOLUME TABUNG ============= ");
        
        System.out.print("Masukkan jari-jari tabung (cm) : ");
        double jariJari = input.nextDouble();
        
        System.out.print("Masukkan tinggi tabung (cm) : ");
        double tinggi = input.nextDouble();

        double volume = hitungVolume(jariJari, tinggi); //memanggil fungsi dengan parameter
        
        System.out.println("____________________________________");
        System.out.println(" ");
        System.out.printf("Volume tabung adalah : " + volume + " cm^3");


        
    }
}
