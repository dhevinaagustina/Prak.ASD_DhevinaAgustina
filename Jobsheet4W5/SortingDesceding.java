package Jobsheet4W5;

public class SortingDesceding {

        // Metode bubbleSort untuk mengurutkan array angka menggunakan algoritma Bubble Sort dalam urutan menurun
        public static int[] bubbleSort(int[] numbers) {
            // Mendapatkan panjang array numbers
            int n = numbers.length;
    
            // Loop untuk setiap elemen dalam array
            for (int i = 0; i < n - 1; i++) {
                // Loop untuk setiap elemen hingga elemen yang belum diurutkan
                for (int j = 0; j < n - i - 1; j++) {
                    // Bandingkan elemen saat ini dengan elemen berikutnya
                    if (numbers[j] < numbers[j + 1]) {
                        // Jika elemen saat ini lebih kecil, tukar dengan elemen berikutnya
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }
            // Mengembalikan array yang telah diurutkan
            return numbers;
        }
    
        // Metode selectionSort untuk mengurutkan array angka menggunakan algoritma Selection Sort dalam urutan menurun
        public static int[] selectionSort(int[] numbers) {
            // Mendapatkan panjang array numbers
            int n = numbers.length;
    
            // Loop untuk setiap elemen dalam array
            for (int i = 0; i < n - 1; i++) {
                // Inisialisasi minIndex ke posisi elemen saat ini
                int minIndex = i;
    
                // Loop untuk menemukan elemen dengan nilai terbesar di antara elemen yang belum diurutkan
                for (int j = i + 1; j < n; j++) {
                    // Bandingkan elemen saat ini dengan elemen di minIndex
                    if (numbers[j] > numbers[minIndex]) {
                        // Jika elemen saat ini lebih besar, perbarui minIndex ke posisi saat ini
                        minIndex = j;
                    }
                }
    
                // Tukar elemen di posisi minIndex dengan elemen di posisi i
                int temp = numbers[minIndex];
                numbers[minIndex] = numbers[i];
                numbers[i] = temp;
            }
            // Mengembalikan array yang telah diurutkan
            return numbers;
        }
    
        // Metode insertionSort untuk mengurutkan array angka menggunakan algoritma Insertion Sort dalam urutan menurun
        public static int[] insertionSort(int[] numbers) {
            // Mendapatkan panjang array numbers
            int n = numbers.length;
    
            // Loop untuk setiap elemen dalam array mulai dari elemen kedua
            for (int i = 1; i < n; i++) {
                // Simpan elemen saat ini sebagai kunci
                int key = numbers[i];
                // Inisialisasi j ke indeks sebelum i
                int j = i - 1;
    
                // Pindahkan elemen array yang lebih kecil dari kunci ke satu posisi ke depan dari posisi saat ini
                while (j >= 0 && numbers[j] < key) {
                    numbers[j + 1] = numbers[j];
                    j = j - 1;
                }
    
                // Letakkan kunci di posisi yang benar dalam subarray yang telah diurutkan
                numbers[j + 1] = key;
            }
            // Mengembalikan array yang telah diurutkan
            return numbers;
        }
    
        // Metode untuk mencetak elemen array
        public static void printArray(int[] numbers) {
            // Loop untuk setiap elemen dalam array
            for (int i = 0; i < numbers.length; i++) {
                // Cetak elemen array
                System.out.print(numbers[i] + " ");
            }
            // Cetak baris baru untuk memisahkan array yang berbeda
            System.out.println("\n");
        }
    
        // Metode main untuk mengeksekusi program
        public static void main(String[] args) {
            // Deklarasi dan inisialisasi array my1stNumbers
            int my1stNumbers[] = {8, 6, 10, 2, 4};
            // Urutkan my1stNumbers menggunakan metode bubbleSort dalam urutan menurun
            my1stNumbers = bubbleSort(my1stNumbers);
            // Cetak array yang telah diurutkan
            printArray(my1stNumbers);
    
            // Deklarasi dan inisialisasi array my2ndNumbers
            int my2ndNumbers[] = {7, 9, 3, 11, 1};
            // Urutkan my2ndNumbers menggunakan metode selectionSort dalam urutan menurun
            my2ndNumbers = selectionSort(my2ndNumbers);
            // Cetak array yang telah diurutkan
            printArray(my2ndNumbers);
    
            // Deklarasi dan inisialisasi array my3rdNumbers
            int my3rdNumbers[] = {4, 1, 12, 6, 5};
            // Urutkan my3rdNumbers menggunakan metode insertionSort dalam urutan menurun
            my3rdNumbers = insertionSort(my3rdNumbers);
            // Cetak array yang telah diurutkan
            printArray(my3rdNumbers);
        }

}
