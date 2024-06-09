package Jobsheet8;
import java.util.Scanner;
public class QueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas: ");
        int kapasitas = sc.nextInt();
        int menu;

        Queue myQueue = new Queue(kapasitas); //membuat objek queue dengan parameter kapasitas

        do{
            System.out.println("\nMasukkan operasi yang diinginkan");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            System.out.println("6. Exit");
            System.out.println("----------------------------------------");

            menu = sc.nextInt();
            
            switch (menu) {
                case 1:
                    if (myQueue.isFull()) { //memeriksa apakah queue penuh
                        System.out.println("Kapasitas penuh"); //print jika penuh
                    } else { //jika queue tidak penuh
                        System.out.print("Masukkan data baru:"); 
                        int newData = sc.nextInt();
                        myQueue.enqueue(newData); //menambahkan elemen baru ke queue
                    }
                    break;
                case 2:
                    int deletedData = myQueue.dequeue(); //mengeluarkan elemen dari queue
    
                    if (deletedData != 0) { //memeriksa apakah elemen berhasil dikeluarkan
                        System.out.println("Data yang dikeluarkan: " + deletedData); //mencetak elemen yang dikeluarkan
                    }
                    break;
                case 3:
                    myQueue.print(); //print seluruh elemen queue
                    break;
                case 4:
                    myQueue.peek(); //melihat elemen paling depan queue
                    break;
                case 5:
                    myQueue.clear(); //mengosongkan queue
                    break;
                default:
                    System.out.println("Menu yang anda masukkan tidak valid");
                    break;
            }
        } while (menu >= 1 && menu <= 5);

    }
}
