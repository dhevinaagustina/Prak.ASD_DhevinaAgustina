package JobsheetStack;

public class StackDemo {
    public static void main(String[] args) {
        Stack myStack = new Stack(10); //instansiasi objek dengan size 10

        myStack.push("Basis Data"); //menambahkan elemen Basis data ke stack
        myStack.push("Algoritma dan Struktur Data"); //menambahkan elemen algoritma dan struktur data ke stack
        myStack.push("Matematika"); //menambahkan elemen matematika ke stack

        System.out.println(myStack.pop()); //mengeluarkan elemen top of stack dan mencetaknya
        System.out.println(myStack.pop()); //mengeluarkan elemen top of stack berikutnya dan mencetaknya
        System.out.println(myStack.pop()); //mengeluarkan elemen top of stack berikutnya dan mencetaknya
        System.out.println(myStack.pop()); //mengeluarkan elemen dari stack yang sudah kosong , dan mencetak pesan warning
    }
}
