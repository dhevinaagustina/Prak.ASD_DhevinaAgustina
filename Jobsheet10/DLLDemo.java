package Jobsheet10;

public class DLLDemo {
    public static void main(String[] args) {
        DoubleLinkedList myDLL = new DoubleLinkedList();
        myDLL.print();
        myDLL.addFirst(800);
        myDLL.print();
        myDLL.addFirst(700);
        myDLL.print();
        myDLL.addLast(500);
        myDLL.print();
        myDLL.removeFirst();
        myDLL.print();
        myDLL.removeLast();

        myDLL.print();
        System.out.println();
        System.out.println("Data dari indeks ke- 0: " + myDLL.getData(0));
        System.out.println("Data 800 berada pada indeks ke:  " + myDLL.indexOf(800));
        System.out.println("Menampilakn linked list dari belakang (reverse): ");
        myDLL.reversePrint();

        System.out.println();
        myDLL.addFirst(900);
        myDLL.print();
        myDLL.addLast(400);
        myDLL.print();
        myDLL.addLast(300);
        myDLL.print();
        System.out.println("Menampilan linked list setelah melakukan method insert after: ");
        myDLL.insertAfter(800, 700);
        myDLL.print();
    }
}
