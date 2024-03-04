package Jobsheet3;
import java.util.Scanner;
public class GedungMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Gedung[] arrayGedung = new Gedung[3];
        //jumlah elemen = 3 dan bertipe data Gedung

        //inputan
        for (int i = 1 ; i < 4 ; i++){
            arrayGedung[i] = new Gedung(); //instansiasi
            System.out.print("Masukkan nama gedung: ");
            arrayGedung[i].nama = input.next();
            System.out.print("Masukkan kapasitas gedung: ");
            arrayGedung[i].kapasitas = input.nextInt();
            System.out.print("Masukkan harga gedung: ");
            arrayGedung[i].harga = input.nextInt();
            input.nextLine();
        }
        System.out.println();

        //output
        for (int i = 1 ; i < 4 ; i++){
           arrayGedung[i].tampilInformasi(i);
        }
        //foreach
        int i = 1;
        for (Gedung gedung : arrayGedung){
            gedung.tampilInformasi(i);
        i++;
        }
    }
}
