package Jobsheet8.Pasien;

import java.util.Scanner;

public class KlinikDemo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Masukkan kapasitas Antrian: ");
        int kapasitas = sc.nextInt();
        int menu;

        Queue myQueue = new Queue(kapasitas);

        do{
            System.out.println("-----------------------------------------");
            System.out.println("               DAFTAR MENU");
            System.out.println("-----------------------------------------");
            System.out.println("\nMasukkan pilihan yang diinginkan");
            System.out.println("1. Tambah Data Pasien");
            System.out.println("2. Hapus data Pasien");
            System.out.println("3. Lihat Antrian Pasien paling depan");
            System.out.println("4. Lihat Antrian Pasian paling belakang");
            System.out.println("5. Lihat Posisi Pasien");
            System.out.println("6. Daftar Keseluhan Pasien");
            System.out.println("7. Hapus seluruh data pasien");
            System.out.println("8. Exit");
            System.out.println("----------------------------------------");

            menu = sc.nextInt();
            sc.nextLine();
            
            switch (menu) {
                case 1:
                    if (myQueue.isFull()){
                        System.out.println("Kapasitas sudah penuh");
                    }else {
                        System.out.print("Masukkan nama pasien: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan no ID pasien: ");
                        String noID = sc.nextLine();
                        System.out.print("Masukkan Jenis Kelamin (P/L): ");
                        char jenisKelamin = sc.nextLine().charAt(0);
    
                        Pasien newPasien = new Pasien(nama, noID, jenisKelamin);
                        myQueue.enqueue(newPasien);
                    }
                    break;
                case 2:
                    Pasien deletedData = myQueue.dequeue();
    
                    if (deletedData != null) {
                        System.out.println("Data yang dikeluarkan: ");
                        System.out.println(deletedData);
                    }
                    break;
                case 3:
                    myQueue.peek();
                    break;
                case 4:
                    myQueue.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan nama pasien yang ingin dicari posisinya: ");
                    String cariNama = sc.nextLine();
                    myQueue.peekPosition(cariNama);
                    break;
                case 6: 
                    myQueue.daftarPasien();
                    break;
                case 7: 
                    myQueue.clear();
                    System.out.println("Data telah dihapus secara keseluruhan");
                    break;
                case 8: 
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu yang anda masukkan tidak valid");
                    break;
            }
        } while (menu >= 1 && menu <= 7);

    }
}
