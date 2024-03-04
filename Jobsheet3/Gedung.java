package Jobsheet3;

public class Gedung {
    //atribut
    String nama;
    int kapasitas, harga;

    //method
    public void tampilInformasi(int i){
        System.out.print("\nData gedung ke-: " + i + "\nNama gedung: " + 
        nama + "\nKapasitas: " + kapasitas + "\nHarga: " + harga);
    }
}
