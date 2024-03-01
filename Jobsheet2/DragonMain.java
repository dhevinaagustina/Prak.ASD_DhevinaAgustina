package Jobsheet2;

public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon(0, 0, 1);
        Dragon dragon2 = new Dragon(5, 5, 3);

        // Melakukan perubahan posisi untuk kedua objek 
        dragon1.move(2);
        dragon2.changeDirection(3);
        dragon2.move(1);
        dragon2.changeDirection(2);

        // Mencetak status kedua objek
        System.out.println("Status Dragon 1:");
        dragon1.printStatus();
        System.out.println("\nStatus Dragon 2:");
        dragon2.printStatus();
    }
    
}
