package Jobsheet3;
import java.util.Scanner;
public class PelangganMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pelanggan[] arrayPelanggan = new Pelanggan[4];
        // jumlah elemen = 4 dan bertipe data Pelanggan
        Pelanggan pelanggan1 = new Pelanggan();
        //inputan
        for (int i = 0 ; i < 4 ; i++){
            arrayPelanggan[i] = new Pelanggan(); //instansiasi
            System.out.print("Masukkan nama anda: ");
            arrayPelanggan[i].nama = input.next();
            System.out.print("Masukkan alamat Email: ");
            arrayPelanggan[i].alamatEmail = input.next();
            System.out.print("Masukkan acara: ");
            arrayPelanggan[i].acara = input.next();
            System.out.print("Masukkan No Telpon: ");
            arrayPelanggan[i].noTelpon = input.next();
            System.out.print("Masukkan jumlah tamu: ");
            arrayPelanggan[i].jumlahTamu = input.nextInt();
            input.nextLine();
        }
        System.out.println();

        //output
        for (int i = 0 ; i < 4 ; i++){
           arrayPelanggan[i].tampilPesanan(i);
        }
        
    }

    
}
