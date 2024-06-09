package Jobsheet8.Pasien;

public class Queue {
    public Pasien[] antrian; // Mendefinisikan array antrian untuk menyimpan objek Pasien
    public int max; // Variabel untuk menentukan maksimum panjang antrian
    public int size; // Variabel untuk menyimpan jumlah elemen saat ini dalam antrian
    public int front; // Indeks depan antrian
    public int rear; // Indeks belakang antrian

    // Konstruktor untuk inisialisasi antrian
    public Queue(int max) {
        this.max = max; // Menetapkan maksimum panjang antrian
        this.antrian = new Pasien[max]; // Membuat array antrian dengan panjang maksimum
        this.size = 0; // Menetapkan jumlah elemen awal dalam antrian
        this.front = this.rear = -1; // Mengatur front dan rear ke -1 untuk antrian kosong
    }

    // Method untuk memeriksa apakah antrian kosong
    public boolean isEmpty() {
        return (size == 0); // Mengembalikan true jika antrian kosong, false jika tidak
    }

    // Method untuk memeriksa apakah antrian penuh
    public boolean isFull() {
        return (size == max); // Mengembalikan true jika antrian penuh, false jika tidak
    }

    // Method untuk melihat elemen terdepan dalam antrian
    public void peek() {
        if (!isEmpty()) { // Memeriksa apakah antrian tidak kosong
            System.out.println("Antrian terdepan: "); // Menampilkan pesan
            System.out.println(antrian[front]); // Menampilkan data elemen terdepan
        } else {
            System.out.println("Antrian kosong"); // Menampilkan pesan jika antrian kosong
        }
    }

    // Method untuk mencetak seluruh antrian
    public void print() {
        if (isEmpty()) { // Memeriksa apakah antrian kosong
            System.out.println("Antrian kosong"); // Menampilkan pesan jika antrian kosong
        } else { //jika tidak kosong
            int i = front; // Inisialisasi variabel i dengan indeks terdepan

            while (i != rear) { // Looping dari depan hingga belakang (kecuali rear)
                System.out.println(antrian[i] + " "); // Mencetak data pada indeks i
                i = (i + 1) % max; // Menggeser i ke indeks berikutnya (dengan memperhatikan circular queue)
            }

            System.out.println(antrian[i] + " "); // Mencetak data pada indeks rear
            System.out.println("Jumlah antrian: " + size); // Menampilkan jumlah elemen dalam antrian
        }
    }

    // Method untuk menghapus seluruh elemen dalam antrian
    public void clear() {
        front = rear = -1; // Mengatur front dan rear kembali ke kondisi awal
        size = 0; // Mengatur jumlah elemen dalam antrian menjadi 0
    }

    // Method untuk menambahkan objek Pasien ke dalam antrian
    public void enqueue(Pasien dt) {
        if (isFull()) { // Memeriksa apakah antrian penuh
            System.out.println("Antrian sudah penuh"); // Menampilkan pesan jika antrian penuh
        } else {
            if (isEmpty()) { // Memeriksa apakah antrian kosong
                front = rear = 0; // Jika kosong, menetapkan front dan rear ke 0
            } else if (rear == max - 1) { // Jika rear mencapai batas maksimum
                rear = 0; // Kembali ke indeks awal (circular queue)
            } else {
                rear = rear + 1; // Geser rear ke indeks berikutnya
            }

            antrian[rear] = dt; // Menambahkan objek Pasien ke dalam antrian
            size++; // Meningkatkan jumlah elemen dalam antrian
        }
    }

    // Method untuk menghapus elemen terdepan dari antrian dan mengembalikan objek Pasien yang dihapus
    public Pasien dequeue() {
        Pasien temp = null; // Inisialisasi variabel untuk menyimpan objek Pasien yang dihapus

        if (isEmpty()) { // Memeriksa apakah antrian kosong
            System.out.println("Antrian masih kosong"); // Menampilkan pesan jika antrian kosong
        } else {
            temp = antrian[front]; // Menyimpan data elemen terdepan yang akan dihapus
            size--; // Mengurangi jumlah elemen dalam antrian

            if (isEmpty()) { // Memeriksa apakah setelah penghapusan antrian menjadi kosong
                front = rear = -1; // Mengatur front dan rear kembali ke kondisi awal
            } else if (front == max - 1) { // Jika front mencapai batas maksimum
                front = 0; // Kembali ke indeks awal (circular queue)
            } else {
                front++; // Geser front ke indeks berikutnya
            }
        }

        return temp; // Mengembalikan objek Pasien yang dihapus dari antrian
    }

    // Method untuk melihat elemen paling belakang dalam antrian
    public void peekRear() {
        if (!isEmpty()) { // Memeriksa apakah antrian tidak kosong
            System.out.println("Antrian paling belakang: "); // Menampilkan pesan
            System.out.println(antrian[rear]); // Menampilkan data elemen paling belakang
        } else {
            System.out.println("Antrian kosong"); // Menampilkan pesan jika antrian kosong
        }
    }

    // Method untuk mencari posisi (indeks) dari Pasien berdasarkan nama
    public void peekPosition(String nama) {
        boolean found = false; // Variabel untuk menandai apakah nama ditemukan dalam antrian
        for (int i = 0; i < size; i++) { // Looping melalui seluruh elemen dalam antrian
            int index = (front + i) % max; // Menghitung indeks sesuai circular queue
            if (antrian[index].nama.equalsIgnoreCase(nama)) { // Memeriksa kesesuaian nama dengan elemen antrian
                System.out.println("Posisi " + (i + 1) + " ," + antrian[index]); // Menampilkan posisi dan data Pasien
                found = true; // Menandai bahwa nama ditemukan dalam antrian
                break; // Keluar dari loop karena nama sudah ditemukan
            }
        }
        if (!found) { // Jika nama tidak ditemukan dalam antrian
            System.out.println("Pasien dengan nama " + nama + " tidak ditemukan dalam antrian."); // Menampilkan pesan
        }
    }

    // Method untuk menampilkan daftar pasien dalam antrian
    public void daftarPasien() {
        print(); // Memanggil method print untuk mencetak daftar pasien dalam antrian
    }
}
