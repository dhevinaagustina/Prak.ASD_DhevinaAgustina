package Jobsheet2;

public class Snake {
    int x , y;
     
    public Snake(int newX, int newY){
        x = newX;
        y = newY;
    }
    
    public void moveLeft(){
        x--;
    }
    
    public void moveRight(){
        x++;
    }

    public void moveUp(){
        y++;
    }

    public void moveDown(){
        y--;
    }

    public void printPosition(){
        System.out.println("Snake position: (" + x + ", " + y + ")");
    }
}
