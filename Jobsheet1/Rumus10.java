package Jobsheet1;
import java.util.Scanner;
public class Rumus10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pilihan;
        do {
            System.out.println("=============================================");
            System.out.println("                    MENU:                   ");
            System.out.println("=============================================");
            System.out.println("a. Menghitung hasil perhitungan Kecepatan");
            System.out.println("b. Menghitung hasil perhitungan Jarak");
            System.out.println("c. Menghitung hasil perhitungan Waktu");
            System.out.println("d. Exit");
            System.out.println("=============================================");
            System.out.print("Masukkan pilihan anda:");
            pilihan = sc.nextLine();
            double jarak, waktu, kecepatan;

            switch (pilihan) {
                case "a":
                    System.out.print("Masukkan jarak tempuh (Km): ");
                    jarak = sc.nextDouble();
                    System.out.print("Masukkan lama waktu tempuh (Jam): ");
                    waktu = sc.nextDouble();
                    kecepatan = jarak / waktu;
                    System.out.println("Hasil dari perhitungan Kecepatan adalah: " + kecepatan + " Km/Jam");
                    break;
                case "b":
                    System.out.print("Masukkan kecepatan tempuh (Km/Jam): ");
                    kecepatan = sc.nextDouble();
                    System.out.print("Masukkan lama waktu tempuh (Jam): ");
                    waktu = sc.nextDouble();
                    jarak = kecepatan * waktu;
                    System.out.println("Hasil dari perhitungan Jarak adalah: " + jarak + " Km");
                    break;
                case "c":
                    System.out.print("Masukkan jarak tempuh (Km): ");
                    jarak = sc.nextDouble();
                    System.out.print("Masukkan kecepatan tempuh (Km/Jam): ");
                    kecepatan = sc.nextDouble();
                    waktu = jarak / kecepatan;
                    System.out.println("Hasil dari perhitungan Waktu adalah: " + waktu + " Jam");
                    break;
                case "d":
                    System.out.println("TERIMAKASIH TELAH MENGGUNAKAN PROGRAM INI");
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan tidak terdapat di dalam menu. Silakan coba lagi dengan menekan enter.");
            }
            sc.nextLine();
        } while (!pilihan.equals("d"));
    }
}
