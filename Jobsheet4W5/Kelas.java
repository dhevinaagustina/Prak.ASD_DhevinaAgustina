package Jobsheet4W5;

public class Kelas {
    Mahasiswa[] daftarMahasiswa;
    int index;

    // Konstruktor untuk menginisialisasi objek Kelas dengan kapasitas tertentu
    public Kelas(int kuota) {
        // Inisialisasi array daftarMahasiswa dengan panjang sesuai kuota yang diberikan
        daftarMahasiswa = new Mahasiswa[kuota];
        
    }

    // Metode untuk menambahkan objek Mahasiswa ke dalam daftar
    public void add(Mahasiswa mahasiswa) {
        // Memeriksa apakah masih ada ruang dalam array daftarMahasiswa
        if (index < daftarMahasiswa.length) {
            // Jika masih ada, tambahkan objek Mahasiswa ke dalam array pada posisi index
            daftarMahasiswa[index] = mahasiswa;
            // Tingkatkan nilai index sebesar 1
            index++;
        } else {
            // Jika tidak ada ruang, tampilkan pesan bahwa kelas sudah penuh
            System.out.println("Kelas sudah penuh");
        }
    }

    // Metode untuk menampilkan informasi semua mahasiswa dalam daftar
    public void displayInfo() {
        // Iterasi melalui setiap objek Mahasiswa dalam array daftarMahasiswa
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            // Tampilkan informasi dari masing-masing objek Mahasiswa
            mahasiswa.displayInfo();
        }
    }

    // Metode untuk mengurutkan daftar mahasiswa berdasarkan IPK secara ascending menggunakan Bubble Sort
    public void bubbleSortByIPK() {
        // Dapatkan panjang dari array daftarMahasiswa
        int n = daftarMahasiswa.length;
        
        // Iterasi untuk setiap elemen dalam array kecuali elemen terakhir
        for (int i = 0; i < n - 1; i++) {
            // Iterasi untuk membandingkan dan menukar elemen jika perlu
            for (int j = 0; j < n - i - 1; j++) {
                // Bandingkan IPK dari mahasiswa saat ini dengan mahasiswa berikutnya
                if (daftarMahasiswa[j].ipk > daftarMahasiswa[j + 1].ipk) {
                    // Jika IPK saat ini lebih besar, tukar posisi dengan yang berikutnya
                    Mahasiswa temp = daftarMahasiswa[j];
                    daftarMahasiswa[j] = daftarMahasiswa[j + 1];
                    daftarMahasiswa[j + 1] = temp;
                }
            }
        }
    }

    // Metode untuk mengurutkan daftar mahasiswa berdasarkan umur secara ascending menggunakan Selection Sort
    public void selectionByUmur() {
        // Dapatkan panjang dari array daftarMahasiswa
        int n = daftarMahasiswa.length;
        
        // Iterasi untuk setiap elemen dalam array kecuali elemen terakhir
        for (int i = 0; i < n - 1; i++) {
            // Asumsikan elemen saat ini sebagai yang memiliki nilai minimum
            int minIndex = i;

            // Iterasi untuk menemukan elemen dengan nilai umur terkecil di antara elemen yang belum diurutkan
            for (int j = i + 1; j < n; j++) {
                // Bandingkan umur dari mahasiswa saat ini dengan mahasiswa pada posisi minIndex
                if (daftarMahasiswa[j].umur < daftarMahasiswa[minIndex].umur) {
                    // Jika umur saat ini lebih kecil, perbarui minIndex ke posisi saat ini
                    minIndex = j;
                }
            }
            // Tukar posisi elemen saat ini dengan elemen dengan nilai minimum yang ditemukan
            Mahasiswa temp = daftarMahasiswa[minIndex];
            daftarMahasiswa[minIndex] = daftarMahasiswa[i];
            daftarMahasiswa[i] = temp;
        }
    }

    // Metode untuk mengurutkan daftar mahasiswa berdasarkan IPK secara descending menggunakan Insertion Sort
    public void insertionSortByIPKDesc() {
        // Dapatkan panjang dari array daftarMahasiswa
        int n = daftarMahasiswa.length;

        // Iterasi mulai dari elemen kedua hingga akhir array
        for (int i = 1; i < n; i++) {
            // Simpan elemen saat ini sebagai kunci
            Mahasiswa key = daftarMahasiswa[i];
            // Inisialisasi variabel j untuk melacak posisi elemen yang sedang dibandingkan
            int j = i - 1;

            // Pindahkan elemen yang lebih kecil dari kunci ke posisi yang lebih tinggi
            while (j >= 0 && daftarMahasiswa[j].ipk < key.ipk) {
                // Geser elemen ke kanan
                daftarMahasiswa[j + 1] = daftarMahasiswa[j];
                // Kurangi nilai j untuk melanjutkan perbandingan ke elemen sebelumnya
                j = j - 1;
            }
            // Tempatkan kunci di posisi yang sesuai dalam array yang sudah diurutkan
            daftarMahasiswa[j + 1] = key;
        }
    }
}
