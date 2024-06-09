package Jobsheet4W5;

public class Hotel {
    String nama;
    int harga;
    int rating;

    // Konstruktor untuk menginisialisasi objek Hotel dengan nama, harga, dan rating
    public Hotel(String nama, int harga, int rating) {
        // Inisialisasi variabel nama dengan nilai parameter nama
        this.nama = nama;
        // Inisialisasi variabel harga dengan nilai parameter harga
        this.harga = harga;
        // Inisialisasi variabel rating dengan nilai parameter rating
        this.rating = rating;
    }

    // Metode untuk mengurutkan array Hotel berdasarkan harga menggunakan Bubble Sort
    public static void bubbleSortHarga(Hotel[] hotels) {
        // Deklarasi variabel untuk memeriksa apakah terjadi penukaran dalam iterasi
        boolean tukar;
        // Ulangi proses sorting selama ada penukaran
        do {
            // Inisialisasi ulang tukar ke false sebelum memulai iterasi
            tukar = false;
            // Iterasi melalui array hotels dari awal hingga elemen kedua terakhir
            for (int i = 0; i < hotels.length - 1; i++) {
                // Bandingkan harga hotel saat ini dengan harga hotel berikutnya
                if (hotels[i].harga > hotels[i + 1].harga) {
                    // Jika harga hotel saat ini lebih besar, tukar posisi dengan hotel berikutnya
                    Hotel temp = hotels[i];
                    hotels[i] = hotels[i + 1];
                    hotels[i + 1] = temp;
                    // Tandai bahwa terjadi penukaran
                    tukar = true;
                }
            }
        // Ulangi proses selama tukar adalah true
        } while (tukar);
    }

    // Metode untuk mengurutkan array Hotel berdasarkan rating menggunakan Selection Sort
    public static void selectionSortRating(Hotel[] hotels) {
        // Iterasi melalui array hotels dari awal hingga elemen kedua terakhir
        for (int i = 0; i < hotels.length - 1; i++) {
            // Asumsikan elemen saat ini sebagai elemen dengan nilai rating terbesar
            int minIndex = i;
            // Iterasi untuk menemukan elemen dengan nilai rating terbesar di antara elemen yang belum diurutkan
            for (int j = i + 1; j < hotels.length; j++) {
                // Bandingkan rating dari hotel saat ini dengan hotel pada posisi minIndex
                if (hotels[j].rating > hotels[minIndex].rating) {
                    // Jika rating hotel saat ini lebih besar, perbarui minIndex ke posisi saat ini
                    minIndex = j;
                }
            }
            // Jika elemen dengan nilai rating terbesar bukan elemen saat ini, tukar posisi
            if (minIndex != i) {
                Hotel temp = hotels[i];
                hotels[i] = hotels[minIndex];
                hotels[minIndex] = temp;
            }
        }
    }
}
