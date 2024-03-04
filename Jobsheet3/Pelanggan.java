package Jobsheet3;

public class Pelanggan {
    //atribut
    String nama, alamatEmail, acara, noTelpon;
    int jumlahTamu;

    //method
    public void tampilPesanan(int i){
        System.out.println("Data Pelanggan ke-: " + (i + 1));
        System.out.print("Nama: " + nama + "\nAlamat Email: " + 
        alamatEmail + "\nAcara: " + acara + "\nNo Telpon: " + noTelpon + "\nJumlah tamu: " + jumlahTamu);
    }
}

