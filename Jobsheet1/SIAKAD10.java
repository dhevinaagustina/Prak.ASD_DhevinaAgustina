package Jobsheet1;
import java.util.Scanner;
public class SIAKAD10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mk = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"};
        double[] nilaiAngka = new double[mk.length];
        String[] nilaiHuruf = new String[mk.length];
        double[] bobotNilaiSetara = new double[mk.length];
        int[] sks = new int[mk.length];
        sks[0] = 2; // SKS Pancasila
        sks[1] = 2; // SKS Konsep Teknologi Informasi
        sks[2] = 2; // SKS Critical Thinking dan Problem Solving
        sks[3] = 2; // SKS Matematika Dasar
        sks[4] = 2; // SKS Bahasa Inggris
        sks[5] = 2; // SKS Dasar Pemrograman
        sks[6] = 3; // SKS Praktikum Dasar Pemrograman
        sks[7] = 2; // SKS Keselamatan dan Kesehatan Kerja
        int totalSKS = 0;
        double totalBobotNilai = 0.00;

        System.out.println("=============================");
        System.out.println("Program Mengitung IP Semester");
        System.out.println("=============================");
        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = scanner.nextInt();
            if (nilaiAngka[i] <= 100 && nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilaiSetara[i] = 4.00;
            } else if (nilaiAngka[i] <= 80 && nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilaiSetara[i] = 3.50;
            } else if (nilaiAngka[i] <= 73 && nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilaiSetara[i] = 3.00;
            } else if (nilaiAngka[i] <= 65 && nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilaiSetara[i] = 2.50;
            } else if (nilaiAngka[i] <= 60 && nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilaiSetara[i] = 2.00;
            } else if (nilaiAngka[i] <= 50 && nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilaiSetara[i] = 1.00;
            } else if (nilaiAngka[i] <= 39) {
                nilaiHuruf[i] = "E";
                bobotNilaiSetara[i] = 0.00;
            }
            totalBobotNilai += bobotNilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        System.out.println("=============================");
        System.out.println("Hasil Konversi Nilai:");
        System.out.println("=============================");
        System.out.printf("%-40s%-15s%-15s%-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-40s%-15.2f%-15s%-15.2f\n", mk[i], nilaiAngka[i], nilaiHuruf[i], bobotNilaiSetara[i]);
        }

        double ip = totalBobotNilai / totalSKS;
        System.out.println("=============================");
        System.out.printf("IP Semester Anda: %.2f%n", ip);
        System.out.println("=============================");
        }
        
    }


        
        
    