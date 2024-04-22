package UTS;
import java.util.Scanner;
public class MainWahana {
    public static void main(String[] args) {
        Ticketing ticketing = new Ticketing();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=====================");
            System.out.println("|       Menu:       |");
            System.out.println("---------------------");
            System.out.println("|   1. Input Data   |");
            System.out.println("|   2. Cari Data    |");
            System.out.println("|   3. Lihat Data   |");
            System.out.println("|   4. Laporan      |");
            System.out.println("|   5. Keluar       |");
            System.out.println("=====================");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    ticketing.inputData();
                    break;
                case 2:
                    ticketing.cariData();
                    break;
                case 3:
                    ticketing.lihatData();
                    break;
                case 4:
                    ticketing.laporan();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            if (pilihan != 5) {
                System.out.print("Apakah Anda ingin keluar dari menu? (Y/N): ");
                String keluar = scanner.nextLine();
                if (keluar.equalsIgnoreCase("Y")) {
                    pilihan = 5; // Mengatur pilihan ke 5 untuk keluar dari loop
                }
            }
        } while (pilihan != 5);
    }
}
