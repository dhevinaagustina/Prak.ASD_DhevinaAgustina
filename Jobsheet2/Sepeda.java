package Jobsheet2;

public class Sepeda {
    float kecepatan;
    int gear;

    // Konstruktor tanpa parameter untuk menginisialisasi objek Sepeda dengan nilai default
    public Sepeda() {
        // Tidak melakukan inisialisasi eksplisit, sehingga kecepatan dan gear akan menggunakan nilai default (0.0 dan 0)
    }

    // Konstruktor dengan parameter untuk menginisialisasi objek Sepeda dengan nilai yang diberikan
    public Sepeda(float newKecepatan, int newGear) {
        // Mengatur nilai kecepatan sesuai dengan parameter newKecepatan
        kecepatan = newKecepatan;
        // Mengatur nilai gear sesuai dengan parameter newGear
        gear = newGear;
    }

    // Metode untuk menambah kecepatan sepeda
    public void tambahKecepatan(float increment) {
        // Memeriksa apakah kecepatan yang baru melebihi batas maksimum 20
        if (kecepatan + increment > 20) {
            // Jika melebihi, atur kecepatan menjadi 20
            kecepatan = 20;
        } else {
            // Jika tidak melebihi, tambahkan increment ke kecepatan saat ini
            kecepatan += increment;
        }
    }

    // Metode untuk mengurangi kecepatan sepeda
    public void kurangiKecepatan(float decrement) {
        // Memeriksa apakah kecepatan yang baru kurang dari batas minimum 0
        if (kecepatan - decrement < 0) {
            // Jika kurang, atur kecepatan menjadi 0
            kecepatan = 0;
        } else {
            // Jika tidak kurang, kurangi decrement dari kecepatan saat ini
            kecepatan -= decrement;
        }
    }

    // Metode untuk mencetak informasi tentang sepeda
    public void cetakInfo() {
        // Menampilkan kecepatan sepeda saat ini
        System.out.println("Kecepatan: " + kecepatan);
        // Menampilkan gear sepeda saat ini
        System.out.println("Gear: " + gear);
        // Menampilkan garis pemisah
        System.out.println("=======================");
    }
    

    
}
