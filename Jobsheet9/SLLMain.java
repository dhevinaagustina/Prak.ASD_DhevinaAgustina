package Jobsheet9;

public class SLLMain {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.print();
        myLinkedList.addFirst(800);
        myLinkedList.print();
        myLinkedList.addFirst(700);
        myLinkedList.print();
        myLinkedList.addLast(500);
        myLinkedList.print();
        myLinkedList.insertAfter(700, 300);
        myLinkedList.print();

        System.out.println();

        System.out.println("Data pada index ke-1: " + myLinkedList.getData(1));
        System.out.println("Data 300 berada pada index ke:  " + myLinkedList.indexOf(300));

        myLinkedList.remove(300);
        myLinkedList.print();
        myLinkedList.removeFirst();
        myLinkedList.print();
        myLinkedList.removeLast();
        myLinkedList.print();
        

        //TUGAS
        System.out.println();

        // Menambahkan beberapa node ke linked list
        myLinkedList.addLast(10);
        myLinkedList.addLast(20);
        myLinkedList.addLast(30);
        myLinkedList.addLast(40);

        System.out.println("Linked list sebelum penambahan:");
        myLinkedList.print(); // Menampilkan linked list sebelum penambahan

        // Menambahkan node sebelum nilai data 30
        myLinkedList.insertBefore(30, 25);

        // Menambahkan node pada indeks 2 dengan nilai data 35
        myLinkedList.insertAt(2, 35);

        System.out.println("\nLinked list setelah penambahan:");
        myLinkedList.print(); // Menampilkan linked list setelah penambahan

        // Menghapus node pada indeks 1
        myLinkedList.removeAt(1);

        System.out.println("\nLinked list setelah penghapusan:");
        myLinkedList.print(); // Menampilkan linked list setelah penghapusan
    }
}
