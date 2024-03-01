package Jobsheet2;

public class SnakeMain {
    public static void main(String[] args) {
        
        Snake snake1 = new Snake(0,0);
        Snake snake2 = new Snake(7,7);

        //posisi ular
        snake1.printPosition();
        snake2.printPosition();

        // Move snake1
        snake1.moveRight();
        snake1.moveUp();

        // Move snake2
        snake2.moveLeft();
        snake2.moveDown();

        // Posisi ular after move
        System.out.println("\nAfter moving:");
        snake1.printPosition();
        snake2.printPosition();
    }
}
