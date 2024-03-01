package Jobsheet3;
import java.util.Scanner;
public class PelangganMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pelanggan[] arrayPelanggan = new Pelanggan[4];

        for (int i = 1 ; i < 3 ; i++){
            arrayPelanggan[i] = new Pelanggan();
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
        for (int i = 1 ; i < 3 ; i++){
           arrayPelanggan[i].tampilPesanan(i);
        }
        
    }

    
}
