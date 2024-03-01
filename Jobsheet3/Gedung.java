package Jobsheet3;

public class Gedung {
    String nama;
    int kapasitas, harga;

    public void tampilInformasiGedung(int i){
        System.out.print("\nData gedung ke-: " + i + "\nNama gedung: " + 
        nama + "\nKapasitas: " + kapasitas + "\nHarga: " + harga);
    }
}
