package Jobsheet1;
import java.util.Scanner;
public class SIAKAD10 {
    public static void main(String[] args) {
        String[] mk = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"};
        Scanner scanner = new Scanner(System.in);
        int[] nilaiAngka = new int[mk.length];
        String[] nilaiHuruf = {"A","B+","B","C+","C","D","E"};
        double[] bobotNilaiSetara = {4.0, 3.5, 3.0, 2.5, 2.0, 1.0, 0.0 };

        System.out.println("=============================");
        System.out.println("Program Mengitung IP Semester");
        System.out.println("=============================");
        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan nilai Angka untuk " + mk[i] + ": ");
            nilaiAngka[i] = scanner.nextInt();
        }

        System.out.println("=============================");
        System.out.println("Hasil Konversi Nilai:");
        System.out.println("=============================");
        System.out.println("MK\tNilai Angka\tNilai Huruf\tBobot Nilai");
        

        // String[] nilaiHuruf = {"D", "C-", "C", "C+", "B-", "B", "B+", "A-", "A", "A+"};
        // double[] bobotNilai = {2.0, 2.5, 3.0, 3.5, 4.0};
        // double totalBobot = 0;
        // double totalNilai = 0;

        // System.out.println("Mata Kuliah\tNilai Angka\tNilai Huruf\tBobot Nilai");
        // for (int i = 0; i < mk.length; i++) {
        //     double bobot = 0;
        //     for (int j = 0; j < bobotNilai.length; j++) {
        //         if (nilaiAngka[i] >= j * 10 + 80 && nilaiAngka[i] < (j + 1) * 10 + 80) {
        //             bobot = bobotNilai[j];
        //             break;
        //         }
        //     }
        //     System.out.printf("%s\t\t%d\t\t%s\t\t%.2f\n", mk[i], nilaiAngka[i],
        //             nilaiHuruf[(int) bobot - 2], bobot);
        //     totalBobot += bobot;
        //     totalNilai += nilaiAngka[i] * bobot;
        // }

        // System.out.printf("\nIP: %.2f", totalNilai / totalBobot);
    }
}

        
        
    