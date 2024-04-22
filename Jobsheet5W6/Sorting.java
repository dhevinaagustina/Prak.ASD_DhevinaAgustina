package Jobsheet5W6;

// import java.util.Arrays;

// import Jobsheet3.Mahasiswa;

public class Sorting {

    public static int sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Mengembalikan index di mana data ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika data tidak ditemukan
    }

    public static int binarySearchAsc (int[] arr, int key){
        int start = 0, end = arr.length -1;

        while (start <= end) {
            int mid = start + (end - start) /  2;

            if (arr[mid] == key){
                return mid;
            }

            if (arr[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            } 
        }
        return -1;
    }

    public static int binarySearchDesc(int[] arr, int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid =  start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                end = mid - 1; // Memperbarui end untuk mencari di sebelah kiri
            } else {
                start = mid + 1; // Memperbarui start untuk mencari di sebelah kanan
            }
        }
        return -1;
    }

    public static int binarySearch(int [] arr, int target){
        boolean isAscending = arr[0] < arr[arr.length - 1];
        
        if (isAscending) {
            return binarySearchAscending(arr, target);
        } else {
            return binarySearchDescending(arr, target);
        }
    }

    // Method untuk pencarian biner jika array terurut secara ascending
    private static int binarySearchAscending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // Jika elemen tidak ditemukan
    }

    // Method untuk pencarian biner jika array terurut secara descending
    private static int binarySearchDescending(int[] arr, int target) {
        int start = 0;
        int right = arr.length - 1;

        while (start <= right) {
            int mid = start + (right - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                start = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Jika elemen tidak ditemukan
    }


    private String[] daftarNamaMahasiswa;
    private int[] daftarUmurMahasiswa;
    private double[] daftarIPKMahasiswa;

    public Sorting(String[] daftarNamaMahasiswa, int[] daftarUmurMahasiswa, double[] daftarIPKMahasiswa) {
        this.daftarNamaMahasiswa = daftarNamaMahasiswa;
        this.daftarUmurMahasiswa = daftarUmurMahasiswa;
        this.daftarIPKMahasiswa = daftarIPKMahasiswa;
    }

    // Method untuk pencarian nama mahasiswa berdasarkan keyword
    public String[] sequentialSearchByNama(String keyword) {
        int count = 0;

        // Hitung berapa banyak nama yang cocok dengan keyword
        for (String nama : daftarNamaMahasiswa) {
            if (nama.toLowerCase().contains(keyword.toLowerCase())) {
                count++;
            }
        }

        // Buat array hasil dengan ukuran sesuai dengan jumlah nama yang cocok
        String[] hasilPencarian = new String[count];
        int index = 0;

        // Isi array hasil dengan nama-nama yang cocok dengan keyword
        for (String nama : daftarNamaMahasiswa) {
            if (nama.toLowerCase().contains(keyword.toLowerCase())) {
                hasilPencarian[index++] = nama;
            }
        }
        return hasilPencarian;
    }

    // Method untuk menampilkan informasi mahasiswa pada indeks tertentu
    public void displayInfo(int index) {
        if (index >= 0 && index < daftarNamaMahasiswa.length) {
            System.out.println("Informasi Mahasiswa:");
            System.out.println("Nama: " + daftarNamaMahasiswa[index]);
            System.out.println("Umur: " + daftarUmurMahasiswa[index]);
            System.out.println("IPK: " + daftarIPKMahasiswa[index]);
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public int binarySearchByUmur(int targetUmur) {
        int start = 0;
        int end = daftarUmurMahasiswa.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Jika umur ditemukan di tengah
            if (daftarUmurMahasiswa[mid] == targetUmur)
                return mid;

            // Jika umur lebih besar, cari di setengah kiri array
            if (daftarUmurMahasiswa[mid] < targetUmur)
                start = mid + 1;
            // Jika umur lebih kecil, cari di setengah kanan array
            else
                end = mid - 1;
        }

        // Jika umur tidak ditemukan dalam array
        return -1;
    }

   

    public static void main(String[] args) {
        int[] daftarNilai = { 10, 5, 20, 15, 5, 45 };
        int index = sequentialSearch(daftarNilai, 5);
        if (index != -1 ){
            System.out.println("Data ditemukan pada index ke-" + index);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    
        int [] sortedNilaiAsc = {5, 5, 10, 20, 30, 40, 50};
        int indexAsc = binarySearchAsc(sortedNilaiAsc, 5);
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


