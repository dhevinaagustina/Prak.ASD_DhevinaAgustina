package Jobsheet1;
import  java.util.Scanner;
public class PlatMobil10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] KODE = {'A','B','D','E','F','G','H','L','N','T'};
        char[][] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        char ulangi;
        do {
            System.out.print("Masukkan kode plat Mobil: ");
            String kodePlat = sc.nextLine().toUpperCase();
            int i = 0;
            while (i < KODE.length) {
                if (kodePlat.charAt(0) == KODE[i]) {
                    break;
                }
            i++;
            }
            if (i < KODE.length) {
                System.out.print("Kota dengan plat " + kodePlat + " adalah: ");
                for (int j = 0; j < kota[i].length; j++) {
                    System.out.print(kota[i][j]);
                }
                System.out.println();
            } else {
                System.out.println("Kode plat tidak valid!");
            }
            
            System.out.print("Apakah Anda ingin menginputkan kode plat lagi? (y/t): ");
            ulangi = sc.nextLine().charAt(0);
            if (ulangi == 't'){
                break;
            }
        } while (ulangi == 'y' || ulangi == 'Y');
    
       
}
}
