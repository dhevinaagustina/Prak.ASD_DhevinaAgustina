package Jobsheet3;

public class Pelanggan {
    String nama, alamatEmail, acara, noTelpon;
    int jumlahTamu;

    public void tampilPesanan(int i){
        System.out.println("Data Pelanggan ke-: " + i);
        System.out.print("Nama: " + nama + "\nAlamat Email: " + 
        alamatEmail + "\nAcara: " + acara + "\nNo Telpon: " + noTelpon + "\nJumlah tamu: " + jumlahTamu);
    }
}

