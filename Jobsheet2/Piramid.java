package Jobsheet2;

public class Piramid {

    int tinggi;
    int sisiAlas;
    int sisiTegak;

    // Constructor
    public Piramid(int newTinggi, int newSisiAlas, int newSisiTegak) {
        tinggi = newTinggi;
        sisiAlas = newSisiAlas;
        sisiTegak = newSisiTegak;
    }

    // Method untuk menghitung luas permukaan piramid
    public void hitungLuasPermukaan() {
        int luasAlas = sisiAlas * sisiAlas;
        int luasSegitiga = sisiAlas * sisiTegak / 2;
        int luasPermukaan = luasAlas + 4 * luasSegitiga;
        System.out.println("Luas Permukaan Piramid: " + luasPermukaan);
    }

    // Method untuk menghitung volume piramid
    public void hitungVolume() {
        double volume = ( sisiAlas * sisiAlas * tinggi ) / 3.0;
        System.out.println("Volume Piramid: " + volume);
    }

    // Method untuk menghitung keliling piramid
    public void hitungKeliling() {
        int keliling = 4 * sisiAlas + sisiTegak;
        System.out.println("Keliling Piramid: " + keliling);
    }
}



