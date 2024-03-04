package Jobsheet3;
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Mahasiswa[] arrayMahasiswa = new Mahasiswa[3];
        //jumlah elemen = 3 dan bertipe data Mahasiswa
        
        double jumlahIPK = 0;
        //inisialisasi ipk 

        //inputan
        for(int i = 0; i < 3 ; i++){
            arrayMahasiswa[i] = new Mahasiswa(); //instansiasi
            System.out.println("Mahasiswa ke- " + (i+1));
            System.out.print("Masukkan nama: ");
            arrayMahasiswa[i].nama = input.next();
            System.out.print("Masukkan NIM: ");
            arrayMahasiswa[i].nim = input.nextInt();
            System.out.print("Masukkan Jenis Kelamin: ");
            arrayMahasiswa[i].jenisKelamin = input.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            arrayMahasiswa[i].ipk = input.nextDouble();
            jumlahIPK += arrayMahasiswa[i].ipk;
        }
        System.out.println();

        //output
        int i = 0;
        for (Mahasiswa mahasiswa : arrayMahasiswa) {
            mahasiswa.informasiDataMahasiswa(i);
        i++;
        }
        double ratarataIPK = jumlahIPK / 3;
        System.out.printf("Rata-rata IPK: %.2f%n " , ratarataIPK);
        
    }
    
    
}
