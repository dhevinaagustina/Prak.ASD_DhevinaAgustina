package Jobsheet8.GerbangTol;
import java.util.Scanner;
public class GerbangTolDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas Queue: ");
        int kapasitas = sc.nextInt();
        int menu;

        Kendaraan myQueue = new Kendaraan(kapasitas);

        do{
            System.out.println("----------------------------------------");
            System.out.println("                   Menu");
            System.out.println("----------------------------------------");
            System.out.println("\nMasukkan operasi yang diinginkan");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            System.out.println("6. Cek Antrian");
            System.out.println("7. Exit");
            System.out.println("----------------------------------------");

            menu = sc.nextInt();
            sc.nextLine();
            
            switch (menu) {
                case 1:
                    if (myQueue.isFull()) {
                        System.out.println("Kapasitas penuh");
                    } else {
                        System.out.print("Masukkan no plat: ");
                        String noPlat = sc.nextLine();
                        System.out.print("Masukkan no kartu: ");
                        String noKartu = sc.nextLine();
                        System.out.print("Masukkan saldo: ");
                        double saldo = sc.nextDouble();

                        Kendaraan newKendaraan = new Kendaraan(noPlat, noKartu,saldo);
                        myQueue.enqueue(newKendaraan);
                    }
                    break;
                case 2:
                    Kendaraan deletedData = myQueue.dequeue();
    
                    if (deletedData != null) {
                        System.out.println("Data yang dikeluarkan: ");
                        System.out.println(deletedData);
                    }
                    break;
                case 3:
                    myQueue.print();
                    break;
                case 4:
                    myQueue.peek();
                    break;
                case 5:
                    myQueue.clear();
                    break;
                case 6:
                    myQueue.cekAntrian();
                    break;
                case 7:
                    System.out.println("Anda keluar dari menu");
                    break;
                default:
                    System.out.println("Menu yang anda masukkan tidak valid");
                    break;
            }
        } while (menu >= 1 && menu <= 6);

    }
}

