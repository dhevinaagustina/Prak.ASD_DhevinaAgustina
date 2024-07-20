package Jobsheet5W6;

// import java.util.Arrays;

// import Jobsheet3.Mahasiswa;

public class Sorting {

    // Metode untuk pencarian linear (sequential search) dalam array integer
    public static int sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) { // Iterasi melalui setiap elemen dalam array
            if (arr[i] == key) { // Jika elemen saat ini sama dengan key yang dicari
                return i; // Mengembalikan index di mana data ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika data tidak ditemukan
    }

    // Metode untuk pencarian biner dalam array yang diurutkan secara ascending (menaik)
    public static int binarySearchAsc(int[] arr, int key) {
        int start = 0, end = arr.length - 1; // Menginisialisasi variabel start dan end

        while (start <= end) { // Melakukan iterasi selama start lebih kecil atau sama dengan end
            int mid = start + (end - start) / 2; // Menghitung nilai tengah (mid) untuk mencari di tengah array

            if (arr[mid] == key) { // Jika elemen di tengah sama dengan key yang dicari
                return mid; // Mengembalikan index di mana data ditemukan
            }

            if (arr[mid] < key) { // Jika elemen di tengah lebih kecil dari key yang dicari
                start = mid + 1; // Memperbarui start untuk mencari di bagian kanan array
            } else { // Jika elemen di tengah lebih besar dari key yang dicari
                end = mid - 1; // Memperbarui end untuk mencari di bagian kiri array
            }
        }
        return -1; // Mengembalikan -1 jika data tidak ditemukan
    }

    // Metode untuk pencarian biner dalam array yang diurutkan secara descending (menurun)
    public static int binarySearchDesc(int[] arr, int key) {
        int start = 0, end = arr.length - 1; // Menginisialisasi variabel start dan end

        while (start <= end) { // Melakukan iterasi selama start lebih kecil atau sama dengan end
            int mid = start + (end - start) / 2; // Menghitung nilai tengah (mid) untuk mencari di tengah array

            if (arr[mid] == key) { // Jika elemen di tengah sama dengan key yang dicari
                return mid; // Mengembalikan index di mana data ditemukan
            }

            if (arr[mid] < key) { // Jika elemen di tengah lebih kecil dari key yang dicari
                end = mid - 1; // Memperbarui end untuk mencari di bagian kiri array
            } else { // Jika elemen di tengah lebih besar dari key yang dicari
                start = mid + 1; // Memperbarui start untuk mencari di bagian kanan array
            }
        }
        return -1; // Mengembalikan -1 jika data tidak ditemukan
    }

    // Metode untuk menentukan jenis pencarian biner (ascending atau descending) berdasarkan urutan array
    public static int binarySearch(int[] arr, int target) {
        boolean isAscending = arr[0] < arr[arr.length - 1]; // Mengecek apakah array diurutkan secara ascending

        if (isAscending) { // Jika array diurutkan secara ascending
            return binarySearchAscending(arr, target); // Gunakan metode pencarian biner ascending
        } else { // Jika array diurutkan secara descending
            return binarySearchDescending(arr, target); // Gunakan metode pencarian biner descending
        }
    }

    // Metode untuk pencarian biner dalam array yang diurutkan secara ascending
    private static int binarySearchAscending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) { // Melakukan iterasi selama start lebih kecil atau sama dengan end
            int mid = start + (end - start) / 2; // Menghitung nilai tengah (mid)

            if (arr[mid] == target) { // Jika elemen di tengah sama dengan target yang dicari
                return mid; // Mengembalikan index di mana data ditemukan
            } else if (arr[mid] < target) { // Jika elemen di tengah lebih kecil dari target
                start = mid + 1; // Pindah ke bagian kanan array
            } else { // Jika elemen di tengah lebih besar dari target
                end = mid - 1; // Pindah ke bagian kiri array
            }
        }
        return -1; // Mengembalikan -1 jika target tidak ditemukan
    }

    // Metode untuk pencarian biner dalam array yang diurutkan secara descending
    private static int binarySearchDescending(int[] arr, int target) {
        int start = 0;
        int right = arr.length - 1;

        while (start <= right) { // Melakukan iterasi selama start lebih kecil atau sama dengan end
            int mid = start + (right - start) / 2; // Menghitung nilai tengah (mid)

            if (arr[mid] == target) { // Jika elemen di tengah sama dengan target yang dicari
                return mid; // Mengembalikan index di mana data ditemukan
            } else if (arr[mid] > target) { // Jika elemen di tengah lebih besar dari target
                start = mid + 1; // Pindah ke bagian kanan array
            } else { // Jika elemen di tengah lebih kecil dari target
                right = mid - 1; // Pindah ke bagian kiri array
            }
        }
        return -1; // Mengembalikan -1 jika target tidak ditemukan
    }

    // Deklarasi atribut untuk menyimpan informasi mahasiswa
    private String[] daftarNamaMahasiswa; // Array untuk menyimpan nama mahasiswa
    private int[] daftarUmurMahasiswa; // Array untuk menyimpan umur mahasiswa
    private double[] daftarIPKMahasiswa; // Array untuk menyimpan IPK mahasiswa

    // Konstruktor untuk inisialisasi atribut mahasiswa
    public Sorting(String[] daftarNamaMahasiswa, int[] daftarUmurMahasiswa, double[] daftarIPKMahasiswa) {
        this.daftarNamaMahasiswa = daftarNamaMahasiswa; // Menginisialisasi nama mahasiswa
        this.daftarUmurMahasiswa = daftarUmurMahasiswa; // Menginisialisasi umur mahasiswa
        this.daftarIPKMahasiswa = daftarIPKMahasiswa; // Menginisialisasi IPK mahasiswa
    }

    // Metode untuk pencarian nama mahasiswa berdasarkan keyword menggunakan pencarian linear
    public String[] sequentialSearchByNama(String keyword) {
        int count = 0; // Variabel untuk menghitung jumlah nama yang cocok

        // Menghitung berapa banyak nama yang cocok dengan keyword
        for (String nama : daftarNamaMahasiswa) { // Iterasi melalui setiap nama mahasiswa
            if (nama.toLowerCase().contains(keyword.toLowerCase())) { // Jika nama mengandung keyword (case insensitive)
                count++; // Tambah hitungan jika nama cocok
            }
        }

        // Membuat array hasil dengan ukuran sesuai dengan jumlah nama yang cocok
        String[] hasilPencarian = new String[count]; // Array untuk menyimpan hasil pencarian
        int index = 0; // Indeks untuk menyimpan posisi dalam array hasil

        // Mengisi array hasil dengan nama-nama yang cocok dengan keyword
        for (String nama : daftarNamaMahasiswa) { // Iterasi melalui setiap nama mahasiswa
            if (nama.toLowerCase().contains(keyword.toLowerCase())) { // Jika nama mengandung keyword (case insensitive)
                hasilPencarian[index++] = nama; // Tambah nama ke array hasil dan increment indeks
            }
        }
        return hasilPencarian; // Mengembalikan array hasil pencarian
    }

    // Metode untuk menampilkan informasi mahasiswa pada indeks tertentu
    public void displayInfo(int index) {
        if (index >= 0 && index < daftarNamaMahasiswa.length) { // Mengecek apakah indeks valid
            System.out.println("Informasi Mahasiswa:"); // Menampilkan header informasi
            System.out.println("Nama: " + daftarNamaMahasiswa[index]); // Menampilkan nama mahasiswa
            System.out.println("Umur: " + daftarUmurMahasiswa[index]); // Menampilkan umur mahasiswa
            System.out.println("IPK: " + daftarIPKMahasiswa[index]); // Menampilkan IPK mahasiswa
        } else { // Jika indeks tidak valid
            System.out.println("Index tidak valid."); // Menampilkan pesan kesalahan
        }
    }

    // Metode untuk pencarian umur mahasiswa menggunakan pencarian biner
    public int binarySearchByUmur(int targetUmur) {
        int start = 0;
        int end = daftarUmurMahasiswa.length - 1;

        while (start <= end) { // Melakukan iterasi selama start lebih kecil atau sama dengan end
            int mid = start + (end - start) / 2; // Menghitung nilai tengah (mid)

            if (daftarUmurMahasiswa[mid] == targetUmur) // Jika umur ditemukan di tengah
                return mid; // Mengembalikan index di mana umur ditemukan

            // Jika umur lebih besar, cari di setengah kiri array
            if (daftarUmurMahasiswa[mid] < targetUmur) // Jika umur di tengah lebih kecil dari target
            start = mid + 1; // Memperbarui start untuk mencari di bagian kanan array
            else // Jika umur di tengah lebih besar dari target
            end = mid - 1; // Memperbarui end untuk mencari di bagian kiri array
        }

        // Jika umur tidak ditemukan dalam array
        return -1; // Mengembalikan -1 jika targetUmur tidak ditemukan
    }

   

    public static void main(String[] args) {
        int[] daftarNilai = { 10, 5, 20, 15, 5, 45 };
        int index = sequentialSearch(daftarNilai, 5);
        if (index != -1 ){
            System.out.println("Data ditemukan pada index ke-" + index);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    
        int [] sortedNilaiAsc = {5, 8, 10, 11, 13, 16,18, 21, 20, 34,33,45};
        int indexAsc = binarySearchAsc(sortedNilaiAsc, 21);
        if (indexAsc != -1){
            System.out.println("Data ditemukan pada index ke-" + indexAsc);
        }else{
            System.out.println("Data tidak ditemukan");
        }
        
        int [] sortedNilaiDesc = {50, 40, 30, 20, 10, 5, 5};
        int indexDesc = binarySearchDesc(sortedNilaiDesc, 5);
        if (indexDesc != -1){
            System.out.println("Data ditemukan pada index ke-" + indexDesc);
        }else{
            System.out.println("Data tidak ditemukan");
        }

        //asc desc
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15}; 
        int target = 7;
        int hasil = binarySearch(arr, target);
        if (hasil != -1) {
            System.out.println("Elemen " + target + " ditemukan di indeks ke-" + hasil);
        } else {
            System.out.println("Elemen " + target + " tidak ditemukan");
        }

        String[] daftarNamaMahasiswa = {"Dhevina", "Dhevani", "Agustina", "Widodo", "Agustinus"};
        int[] daftarUmurMahasiswa = {19, 20, 21, 22, 23};
        double[] daftarIPKMahasiswa = {3.5, 3.2, 3.8, 3.6, 3.9};

        Sorting sorting = new Sorting(daftarNamaMahasiswa, daftarUmurMahasiswa, daftarIPKMahasiswa);

        // Melakukan pencarian nama mahasiswa berdasarkan keyword
        String[] hasilPencarian = sorting.sequentialSearchByNama("tin");

        System.out.println("Hasil Pencarian:");
        if (hasilPencarian.length > 0) {
            for (String nama : hasilPencarian) {
                System.out.println(nama);
            }
        } else {
            System.out.println("Nama mahasiswa tidak ditemukan.");
        }

        int umurDicari = 20;
        int indeks = sorting.binarySearchByUmur(umurDicari);

        if (indeks != -1) {
            sorting.displayInfo(indeks);
        } else {
            System.out.println("Mahasiswa dengan umur " + umurDicari + " tidak ditemukan.");

        // Menampilkan informasi mahasiswa pada indeks tertentu
        sorting.displayInfo(2);
    }
 }
}


