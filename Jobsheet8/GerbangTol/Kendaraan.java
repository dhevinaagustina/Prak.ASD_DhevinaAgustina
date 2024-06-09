package Jobsheet8.GerbangTol;

public class Kendaraan {
    public String noPlat; // Nomor plat kendaraan
    public String noKartu; // Nomor kartu elektronik
    public double saldo; // Saldo kartu elektronik

    // Konstruktor untuk inisialisasi data kendaraan
    public Kendaraan(String noPlat, String noKartu, double saldo) {
        this.noPlat = noPlat; // Mengatur nomor plat kendaraan
        this.noKartu = noKartu; // Mengatur nomor kartu elektronik
        this.saldo = saldo; // Mengatur saldo kartu elektronik
    }

    public Kendaraan[] data; // Array untuk menyimpan objek kendaraan
    public int max; // Maksimum panjang antrian
    public int size; // Jumlah elemen dalam antrian
    public int front; // Indeks depan antrian
    public int rear; // Indeks belakang antrian

    // Konstruktor untuk inisialisasi antrian kendaraan
    public Kendaraan(int max) {
        this.max = max; // Mengatur maksimum panjang antrian
        this.data = new Kendaraan[max]; // Membuat array antrian dengan panjang maksimum
        this.size = 0; // Mengatur jumlah elemen awal dalam antrian
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
            System.out.println("Elemen terdepan: " + data[front]); // Menampilkan elemen terdepan
        } else {
            System.out.println("Queue kosong"); // Menampilkan pesan jika antrian kosong
        }
    }

    // Method untuk mencetak seluruh antrian kendaraan
    public void print() {
        if (isEmpty()) { // Memeriksa apakah antrian kosong
            System.out.println("Queue kosong"); // Menampilkan pesan jika antrian kosong
        } else {
            int i = front; // Inisialisasi variabel i dengan indeks depan

            while (i != rear) { // Looping dari depan hingga belakang (kecuali rear)
                System.out.println(data[i] + " "); // Mencetak data pada indeks i
                i = (i + 1) % max; // Menggeser i ke indeks berikutnya (dengan memperhatikan circular queue)
            }

            System.out.println(data[i] + " "); // Mencetak data pada indeks rear
            System.out.println("Jumlah elemen: " + size); // Menampilkan jumlah elemen dalam antrian
        }
    }

    // Method untuk menghapus seluruh elemen dalam antrian
    public void clear() {
        front = rear = -1; // Mengatur front dan rear kembali ke kondisi awal
        size = 0; // Mengatur jumlah elemen dalam antrian menjadi 0
    }
    
    // Method untuk menambahkan kendaraan ke dalam antrian
    public void enqueue(Kendaraan dt) {
        if (isFull()) { // Memeriksa apakah antrian penuh
            System.out.println("Queue sudah penuh"); // Menampilkan pesan jika antrian penuh
        } else {
            if (isEmpty()) { // Memeriksa apakah antrian kosong
                front = rear = 0; // Jika kosong, menetapkan front dan rear ke 0
            } else if (rear == max - 1) { // Jika rear mencapai batas maksimum
                rear = 0; // Kembali ke indeks awal (circular queue)
            } else {
                rear = rear + 1; // Geser rear ke indeks berikutnya
            }

            data[rear] = dt; // Menambahkan kendaraan ke dalam antrian pada posisi rear
            size++; // Meningkatkan jumlah elemen dalam antrian
        }
    }

    // Method untuk menghapus kendaraan dari depan antrian
    public Kendaraan dequeue() {
        Kendaraan temp = null; // Variabel sementara untuk menyimpan kendaraan yang akan dihapus

        if (isEmpty()) { // Memeriksa apakah antrian kosong
            System.out.println("Queue masih kosong"); // Menampilkan pesan jika antrian kosong
        } else {
            temp = data[front]; // Menyimpan data kendaraan yang akan dihapus (elemen terdepan)
            size--; // Mengurangi jumlah elemen dalam antrian

            if (isEmpty()) { // Memeriksa apakah setelah penghapusan antrian menjadi kosong
                front = rear = -1; // Mengatur front dan rear kembali ke kondisi awal
            } else if (front == max - 1) { // Jika front mencapai batas maksimum
                front = 0; // Kembali ke indeks awal (circular queue)
            } else {
                front++; // Geser front ke indeks berikutnya
            }
        }

        return temp; // Mengembalikan objek kendaraan yang dihapus dari antrian
    }

    // Method untuk melihat elemen paling belakang dalam antrian
    public void peekRear() {
        if (!isEmpty()) { // Memeriksa apakah antrian tidak kosong
            System.out.println("Antrian paling belakang: " + data[rear]); // Menampilkan elemen paling belakang
        } else {
            System.out.println("Antrian kosong"); // Menampilkan pesan jika antrian kosong
        }
    }

    // Method untuk memeriksa antrian paling belakang
    public void cekAntrian() {
        peekRear(); // Memanggil method peekRear untuk menampilkan antrian paling belakang
    }

    // Method untuk representasi String dari objek Kendaraan
    public String toString() {
        return "No plat: " + noPlat + ", No kartu: " + noKartu + ", Saldo: " + saldo; // Mengembalikan data kendaraan dalam format string
    }
}
