package Jobsheet10;
public class DoubleLinkedList {
    Node head;
    Node tail;

    // Method untuk memeriksa apakah linked list kosong
    public boolean isEmpty(){
        return (head == null); //mengembalikan nilai true jika nilai head adalah null
    }

    // Method untuk mencetak linked list 
    public void print(){
        if (!isEmpty()){ //memeriksa apakah linked list tidak kosong
            System.out.print("Isi linked list: ");
            Node currentNode = head; //mulai dari node head

            while (currentNode != null) { //memeriksa sampai node terakhir (null)
                System.out.print(currentNode.data + "\t"); //print data pada node
                currentNode = currentNode.next; //berpindah ke node berikutnya
            }

            System.out.println(" "); 
        } else { //jika linked list kosong
            System.out.println("Linked list kosong!"); //print warning
        }
    }

    // Method untuk menambahkan node di awal linked list
    public void addFirst(int input){
        Node newNode = new Node(input); //membuat node baru

        if (isEmpty()){ //memeriksa apakah node kosong
            head = newNode; //node baru menjadi head
            tail = newNode; //node baru menjadi tail
        } else { //jika node tidak kosong 
            newNode.next = head; //next node baru adalah head saat ini
            head.prev = newNode; //prev dari head saat ini adalah node baru
            head = newNode; //node baru menjadi kepala
        }
    }

    // Method untuk menambahkan node di akhir linked list
    public void addLast(int input){
        Node newNode = new Node(input); //membuat node baru

        if (isEmpty()){ //memeriksa apakah linked list kosong
            head = newNode; //node baru menjadi head
            tail = newNode; //node baru menjadi tail
        } else { //jika linked list tidak kosong
            tail.next = newNode; //next tail saat ini adalah node baru
            newNode.prev = tail; //prev node baru adalah tail saat ini
            tail = newNode; //node baru menjadi tail
        }
    }

    // Method untuk mengapus node pertama
    public void removeFirst(){
        if (isEmpty()) { //memeriksa apakah linked list kosong 
            System.out.println("Linked list kosong!"); //print warning
        } else if ( head == tail){  //jika hanya ada satu node
            head = null; //head menjadi null
            tail = null; //tail menjadi null
        } else { //jika lebih dari satu node
            head = head.next; //head pindah ke node berikutnya
            head.prev = null; //prev head baru menjadi null
        }
    }

    // Method untuk menghapus node terakhir
    public void removeLast(){
        if( isEmpty() ){ //memeriksa apakah linked list kosong 
            System.out.println("Linked list kosong!"); //print warning 
        } else if (head == tail){ //jika hanya ada satu node
            head = null; //head menajadi null
            tail = null; //tail menjadi null
        } else { //jika lebih dari satu node
            tail= tail.prev; //tail pindah ke node sebelumnya
            tail.next = null; //next tail baru menjadi null
        }
    }
    
    // Method untuk mendapatkan data pada indeks tertentu
    public int getData(int index){
        Node currentNode = head; //mulai dari node head
    
        for (int i = 0; i < index; i++){ //looping sampai indeks yang ditentukan
            if (currentNode == null) { //jika indek melebihi batas
                System.out.println("Index melebihi batas"); //mencetak pesan
                return -1; //mengembalikan nilai -1
            }
            currentNode = currentNode.next; //berpindah ke node berikutnya
        }
    
        if (currentNode == null) {  //memeriksa apakah node saat ini adalah null setelah loop
            System.out.println("Index melebihi batas");
            return -1; //mengembalikan nilai-1
        }
    
        return currentNode.data; //mengembalikan data dari node pada indeks yanng ditentukan
    }

     // Method untuk mendapatkan indeks darai node dengan data tertenut
     public int indexOf(int key){
        Node currentNode = head; //memulai dari node head
        int index = 0; //menginisialisasi indeks = 0

        while (currentNode != null && currentNode.data != key){ //looping sampai node sama dengan null dengan data sama dengan key atau sampai akhir linked list
            currentNode = currentNode.next; //berpindah ke node berikuutnya
            index++; //increment indeks
        }

        if (currentNode == null){ //memeriksa apakah node saat ini adalah null setelah loop
            return -1; //mengembalikan -1 jika data tidak ditemukan
        } else { //jika node saat ini tidak sama dengan null
            return index; //mengembalikan indeks
        }
    }
   
    // Method untuk mencetak linked list dari belakang
    public void reversePrint() {
        if (isEmpty()) { //memeriksa apakah linked list kosong
            System.out.println("Linked List Kosong!"); //print warning
        } else { //jika linked list tidak kosong
            Node currentNode = tail; //mulai dari node tail
            while (currentNode != null) { //looping sampai node terdepan (null)
                System.out.print(currentNode.data + " "); //mencetak data dari node saat ini
                currentNode = currentNode.prev; //berpindah ke node sebelumnya
            }
            System.out.println();
        }
    }

    // Method untuk menyisipkan node baru setelah node dengan data tertentu
    public void insertAfter(int key, int input) {
        Node newNode = new Node(input); //membuat node baru

        if (!isEmpty()){ //memeriksa apakah linked list tidak kosong 
            Node currentNode = head; //mulai dari node head

            //looping sampai menemukan daya yang sesuai
            do{
                if (currentNode.data == key){ //memeriksa apakah data node saat ini sama dengan key
                    if (currentNode == tail) { //memeriksa apakah node saat ini sama dengan tail
                        addLast(input); //menambahkan node baru diakhir
                    } else { //jika tidak 
                        newNode.next = currentNode.next; //mengatur next node baru ke next node saat ini
                        currentNode.next.prev = newNode; //mengatur prev node berikutnya ke new node
                        currentNode.next = newNode;  //mengatur next node saat ini ke node baru
                        newNode.prev = currentNode; //mengatur prev node baru ke node saaat ini
                    }

                    break;
                }
                currentNode = currentNode.next; //berpindah ke node berikutnya
            } while (currentNode != null); //looping sampai node terakhir (null)
        } else { //jika linked list tidak kosong
            System.out.println("Linked list kosong!~");
        }

    }
    
}
