package Jobsheet9;

public class LinkedList {
    Node head;

    // Method untuk memeriksa apakah linked list kosong
    public boolean isEmpty(){
        return (head == null); //mengembalikan true jika head adalah null
    }

    // Method untuk mencetak semua elemen linked lisd
    public void print(){
        if (!isEmpty()){ //memeriksa apakah linked list tidak kosong
            System.out.print("Isi linked list: "); //print
            Node currentNode = head; //mulai dari node paling depan

            while (currentNode != null) { //looping sampai node saat ini null (node terakhir)
                System.out.print(currentNode.data + "\t"); //mencetak data node saat ini
                currentNode = currentNode.next; //berpindah ke node berikutnya
            }

            System.out.println(" "); //membuat baris baru
        } else { //jika linked list kosong
            System.out.println("Linked list kosong!"); //print jika linked list kosong
        }
    }

    // Method untuk menambahkan node baru di awal linked list
    public void addFirst(int input){
        Node newNode = new Node(input,null); //membuat node baru

        if (isEmpty()){ //memeriksa apakah linked list kosong
            head = newNode; //mengatur head ke node baru jika linked list kosong
        } else { //jika linked list tidak kosong
            newNode.next = head; //mengatur next node ke node head
            head = newNode; //mengatur node baru sebagai head
        }
    }

    // Method untuk menambahkan node diakhir linked list
    public void addLast(int input){
        Node newNode = new Node(input, null); //membuat node baru

        if (isEmpty()){ //memeriksa apakah linked list kosong
            head = newNode; //mengatur head ke node baru jika linked list kosong
        } else { //jika linked list tidak kosong
            Node currentNode = head; //memulai dari node head

            while (currentNode.next != null) { //looping sampai node terakhir (null)
                currentNode = currentNode.next; //berpindah ke node berikutnya
            }

            currentNode.next = newNode; //mengatur node terakhir ke node baru
        }
    }

    // Method untuk menyisipkan node setelah node dengan nilai tertentu 
    public void insertAfter(int key , int input){
        Node newNode = new Node (input,null); //membuat node baru

        if (!isEmpty()){ //memeriksa apakah linked list tidak kosong
            Node currentNode = head; //memulai dari head

            do {
                if (currentNode.data == key){ //memeriksa apakah data node saat ini sama dengan key
                    newNode.next = currentNode.next; //mengatur next node baru ke next node saat ini  
                    currentNode.next = newNode; //mengatur next node menjadi node baru
                    break; //keluar dari loop
                }

                currentNode = currentNode.next; //berpindah ke node berikutnya
            }while(currentNode != null); //lanjutkan loop sampai node saat ini adalah null (node terakhir)
        } else { //jika linked list kosong
            System.out.println("Linked list kosong!"); //print warning
        }
    }

    // Method untuk menyisipkan node pada indeks tertentu
    public void insertAt(int index, int key) {
        if (index == 0) { //memeriksa apakah indeks adalah 0
            addFirst(key); //menambahkan node diawal jika indeks adalah 0
        } else { //jika indeks tidak sama dengan 0
            Node newNode = new Node(key, null); //membuat node baru
            Node currentNode = head; //memulai dari head

            for (int i = 0; i < index - 1; i++) { //looping sampai indeks sebelum posisi yg ditentukan
                if (currentNode == null) { //memeriksa apakah node saat ini adalah null
                    System.out.println("Index melebihi batas"); //mencetak pesan jika indeks melebihi batas
                    return;
                }
                currentNode = currentNode.next; //berpindah ke node berikutnnya
            }
            if (currentNode == null) { //memeriksa apakah node saat ini adalah null setelah loop
                System.out.println("Index melebihi batas"); //mencetak pesan jika indeks melebihi batas
            } else { //jika node saat ini bukan null 
                newNode.next = currentNode.next; //mengatur next node baru ke next node saat ini
                currentNode.next = newNode; //mengatur next node saat ini ke node baru
            }
        }
    }

    // public int getData(int index){
    //     Node currentNode = head;

    //     for (int i = 0; i < index; i++){
    //         currentNode = currentNode.next;
    //     }

    //     return currentNode.data;
    // }

    // Method unutk mendapatkan data dari node pada indeks tertentu
    public int getData(int index){
        Node currentNode = head; //memulai dari head
    
        for (int i = 0; i < index; i++){ //looping sampai indeks yang ditentukan
            if (currentNode == null) { //memeriksa apakah node saat ini adalah null
                System.out.println("Index melebihi batas"); //mencetak pesan jika indeks melebihi batas
                return -1; //mengembalikan -1 jika indeks melebihi batas
            }
            currentNode = currentNode.next; //berpindah ke node barikutnya
        }
    
        if (currentNode == null) { //memeriksa apakah node saat ini adalah null setelah loop
            System.out.println("Index melebihi batas"); //mencetak pesan jika indeks melebihi batas
            return -1; //mengembalikan -1 jika indeks melebihi batas
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

    // Method untuk menghapus node pertama
    public void removeFirst(){
        if (!isEmpty()) { //memeriksa apakah linked list tidak kosong
            head = head.next; //mengatur head ke node berikutnya (setelah head)
        } else { //jika linked list kosong
            System.out.println("Linked list kosong!"); //print warning
        }
    }

    // Method untuk menghapus node terakhir
    public void removeLast(){
        if(isEmpty()){ //memeriksa apakah linked list kosong
            System.out.println("Linked list kosong!"); //print jika linked list kosong 
        } else if (head.next == null){ //memeriksa jika hanya ada satu node dalam linked list
            head = null; //mengatur head ke null jika hanya ada satu node
        } else { //jika ada lebih dari satu node
            Node currentNode = head; //memulai dari head

            while (currentNode.next != null) { //looping sampai node terakhir (null)
                if (currentNode.next.next == null){ //memeriksa apakah node berikutnya adalah node terakhrir
                    currentNode.next = null; //menghapus node terakhir dengan mengatur nest node saat ini menjadi null
                    break;
                }

                currentNode = currentNode.next; //berpindah ke node berikutnya
            }
        }
    }

    // Method untuk menghapus node dengan data tertentu
    public void remove(int key){
        if (isEmpty()) { //memeriksa apakah node kosong
            System.out.println("Linked list kosong!"); //print warning
        } else if (head.data == key){ //memeriksa apakah node pertama memiliki data yang dicari
            removeFirst(); //menghapus node pertama
        } else { //jika tidak
            Node currentNode = head; //memulai dari node head

            while (currentNode.next != null) { //looping sampai node terakhir (null)
                if (currentNode.next.data == key) { //memeriksa apakah next node saat ini memiliki data yang dicari
                    currentNode.next = currentNode.next.next; //menghapus node dengan data yang dicari dengan mengatur next node saat ini ke next node setelah node yang dihapus
                    break;
                }

                currentNode = currentNode.next; //berpindah ke node berikutnya
                
            }
        }
        
    }

    // Method untuk menyisipkan node sebelum node dengan data tertentu
    public void insertBefore(int key, int input) {
        Node newNode = new Node(input, null); //membuat node baru

        if (isEmpty()) { //memeriksa apakah linked list kosong
            System.out.println("Linked list kosong!"); //primt warning
        } else if (head.data == key) { //memriksa apakah node pertama memiliki data yang dicari
            addFirst(input); //menambahkan node baru diaawal
        } else { //jika tidak
            Node currentNode = head; //memulai dari node head

            while (currentNode.next != null && currentNode.next.data != key) { //looping sampai menemukan node dengan data yang dicari atau sampai akhir linked list
                currentNode = currentNode.next; //berpindah ke node berikutnnya
            }
            if (currentNode.next == null) { //memeriksa apakah node saat ini adalah null setelah loop
                System.out.println("Key tidak ditemukan"); //print jika key tidak ditemukan 
            } else { //jika node saat ini bukan null
                newNode.next = currentNode.next; //mengatur next node baru ke next node saat ini
                currentNode.next = newNode; //mengatur next noide saat ini ke node baru
            }
        }
    }

    // Method untuk menghapus node dengan indeks tertentu
    public void removeAt(int index) {
        if (isEmpty()) { //memeriksa apakah linked list kosong
            System.out.println("Linked list kosong!"); //print warning
        } else if (index == 0) { //memeriksa apakah indeks adalah 0
            removeFirst(); //hapus node pertama jika indeks = 0
        } else { //jika tidak
            Node currentNode = head; //memulai dari node head
            
            for (int i = 0; i < index - 1; i++) { //looping sampai indeks sebelum posisi yang ditentukan
                if (currentNode.next == null) { //memeriksa apakah next node saat ini adalah null
                    System.out.println("Index melebihi batas"); //mencetak pesan indeks melebihi batas
                    return;
                }
                currentNode = currentNode.next; //berpindah ke node berikutnya
            }
            if (currentNode.next == null) { //memeriksa apakah next node saat ini adalah null setelah looping
                System.out.println("Index melebihi batas"); //mencetak pesan
            } else { //jika tidak 
                currentNode.next = currentNode.next.next; //menghapus node dengan mengatur next node saat ini ke next node setelah node yang dihapus
            }
        }
    }


}
