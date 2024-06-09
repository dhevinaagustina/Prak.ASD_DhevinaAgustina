package Jobsheet8;

public class Queue {
    public int [] data; //array untuk menyimpan elemen array
    public int max; //kapasitas maksimum queue
    public int size; //ukuran queue (jumlah elemen)
    public int front; //indeks elemen paling depan dari queue
    public int rear; //indeks elemen paling belakang dari queue

    public Queue(int max) {
        this.max = max;
        this.data = new int[max];
        this.size = 0;
        this.front = this.rear = -1; //mengatur front dan rear ke -1 (queue kosong)
    }

    // Method untuk memeriksa apakah queue kosong
    public boolean isEmpty() {
        return (size == 0); //mengembalikan nilai true jika nilai size adalah 0
    }

    // Method untuk memeriksa apakah queue penuh
    public boolean isFull() {
        return (size == max); //mengembalikan true jika nilai size sama dengan nilai max (penuh) 
    }

    // Method untuk melihat elemen paling depan queue tanpa mengeluarkannya
    public void peek() {
        if (!isEmpty()) { //memeriksa pakah queue tidak kosong
            System.out.println("Elemen terdepan: " + data[front]); //mencetak elemen paling depan
        } else { //jika queue kosong
            System.out.println("Queue kosong"); //print jika queue kosong
        }
    }

    // Method untuk mencetak semua elemen dalam queue
    public void print() {
        if (isEmpty()) { //memeriksa apakah queue kosong
            System.out.println("Queue kosong"); //print jika queue kosong
        } else { //jika queue tidak kosong
            int i = front; //mulai dari elemen paling depan

            while (i != rear) { //looping sampai elemen paling belakang
                System.out.println(data[i] + " "); //mencetak elemen saat ini
                i = (i + 1) % max; //menggeser elemen berikutnya sampai elemen paling belakang
            }

            System.out.println(data[i] + " "); //mencetak elemen mulai front
            System.out.println("Jumlah elemen: " + size); //mencetak jumlah elemen queue
        }
    }

    // Method untuk mengosongkan queue
    public void clear() {
        front = rear = -1; //mengatur front dan rear ke -1 (queue kosong)
        size = 0; //menngatur ukuran (size) queue menjadi 0
    }

    // Method untuk menambhakan elemen ke dalam queue (ke posisi paling belakang)
    public void enqueue(int dt) {
        if (isFull()){ //memeriksa apakah queue penuh
            System.out.println("Queue sudah penuh"); //print jika queue penuh
        } else { //jika queue tidak penuh
            if (isEmpty()) { // memriksa apakah queue kosong (kondisi queue kosong)
                front = rear = 0; //mengatur front dan rear menjadi 0 (kosong)
            } else if (rear == max - 1) { //jika rear berada pada indeks terakhir array
                rear = 0;
            } else { //jika rear tidak berada pada indeks terakhir array
                rear = rear + 1; //menambahkan rear ke indeks berikutnya
            }

            data[rear] = dt; //menambahkan elemen baru di posisi rear
            size++; // increment size queue
        }
    }

    // Method untuk mengeluarkan elemen dari queue (dari posisi paling depan)
    public int dequeue() {
        int temp = 0; //variable temporary untuk menyimpang elemen yang dihapus

        if (isEmpty()) { //memeriksa apakah queue kosong
            System.out.println("Queue masih kosong"); //print jika queue kosong
        } else { //jika queue tidak kosong
            temp = data[front]; //menyimpan elemen terdepan dalam variable temporary
            size--; //decrement size queue

            if (isEmpty()) { //memeriksa apakah queue kosong
                front = rear = -1; //mengatutur front damn rear ke -1 (queue kosong)
            } else if (front == max -1) { //jika front berada pada indeks terakhir array
                front = 0; //mengatur front ke awal array
            } else { // jika front tidak berada pada indeks terakhir array
                front++; //incremen front (ke indeks berikutnya)
            }
        }

        return temp; //mengembalikan elemen yang dihapus
    }

    
}
