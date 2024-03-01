package Jobsheet2;

public class Dragon {
    int x, y, direction;
   
    public Dragon (int newX,int newY,int initialDirection){
        x = newX;
        y = newY;
        direction = initialDirection;
    }

    public void changeDirection(int newDirection){
        if (newDirection >= 1 && newDirection <= 4){
            direction = newDirection;
        } else {
            System.out.println("Arah baru tidak valid");
        }
    }

    public void move(int steps){
        switch (direction) {
            case 1: // atas
                y += steps;
                break;
            case 2: // kanan
                x += steps;
                break;
            case 3: // bawah
                y -= steps;
                break;
            case 4: // kiri
                x -= steps;
                break;
            default:
                System.out.println("Arah tidak valid.");
        }
    }

    public void printStatus(){
        System.out.println("Posisi: (" + x + ", " + y + ")");
        switch (direction) {
            case 1:
                System.out.println("Arah: atas");
                break;
            case 2:
                System.out.println("Arah: kanan");
                break;
            case 3:
                System.out.println("Arah: bawah");
                break;
            case 4:
                System.out.println("Arah: kiri");
                break;
            default:
                System.out.println("Arah tidak valid.");
        }
    }
}
