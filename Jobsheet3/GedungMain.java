package Jobsheet3;
import java.util.Scanner;
public class GedungMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Gedung[] arrayGedung = new Gedung[3];

        for (int i = 0 ; i < 3 ; i++){
            arrayGedung[i] = new Gedung();
            System.out.print("Masukkan nama gedung: ");
            arrayGedung[i].nama = input.next();
            System.out.print("Masukkan kapasitas gedung: ");
            arrayGedung[i].kapasitas = input.nextInt();
            System.out.print("Masukkan harga gedung: ");
            arrayGedung[i].harga = input.nextInt();
            input.nextLine();
        }
        System.out.println();
        for (int i = 1 ; i < 3 ; i++){
           arrayGedung[i].tampilInformasiGedung(i);
        }
    }
}
