package Jobsheet2;

public class Piramid {

    int tinggi;
    int sisiAlas;
    int sisiTegak;

   // Konstruktor untuk menginisialisasi tinggi, sisi alas, dan sisi tegak dari piramid
   public Piramid(int newTinggi, int newSisiAlas, int newSisiTegak) {
    // Mengatur nilai tinggi sesuai dengan parameter newTinggi
    tinggi = newTinggi;
    // Mengatur nilai sisi alas sesuai dengan parameter newSisiAlas
    sisiAlas = newSisiAlas;
    // Mengatur nilai sisi tegak sesuai dengan parameter newSisiTegak
    sisiTegak = newSisiTegak;
    }

    // Metode untuk menghitung luas permukaan piramid
    public void hitungLuasPermukaan() {
        // Menghitung luas alas (persegi) dari piramid
        int luasAlas = sisiAlas * sisiAlas;
        // Menghitung luas satu segitiga tegak pada piramid
        int luasSegitiga = sisiAlas * sisiTegak / 2;
        // Menghitung luas permukaan total piramid (luas alas + 4 * luas segitiga)
        int luasPermukaan = luasAlas + 4 * luasSegitiga;
        // Menampilkan hasil luas permukaan piramid
        System.out.println("Luas Permukaan Piramid: " + luasPermukaan);
    }

    // Metode untuk menghitung volume piramid
    public void hitungVolume() {
        // Menghitung volume piramid menggunakan rumus (alas * tinggi) / 3
        double volume = (sisiAlas * sisiAlas * tinggi) / 3.0;
        // Menampilkan hasil volume piramid
        System.out.println("Volume Piramid: " + volume);
    }

    // Metode untuk menghitung keliling piramid
    public void hitungKeliling() {
        // Menghitung keliling piramid (4 * sisi alas + sisi tegak)
        int keliling = 4 * sisiAlas + sisiTegak;
        // Menampilkan hasil keliling piramid
        System.out.println("Keliling Piramid: " + keliling);
    }
}



