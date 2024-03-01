package Jobsheet2;

public class Sepeda {
    float kecepatan;
    int gear;

    public Sepeda (){
        
    }
    public Sepeda (float newKecepatan, int newGear){
        kecepatan = newKecepatan;
        gear = newGear; 
    }

    public void tambahKecepatan(float increment){
        if(kecepatan + increment > 20){
            kecepatan = 20;
        } else {
            kecepatan += increment;
        }

    }

    public void kurangiKecepatan(float decrement){
        if(kecepatan - decrement < 0){
            kecepatan = 0;
        } else {
            kecepatan -= decrement;
        }
    }

    public void cetakInfo(){
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("=======================");
    }
    

    
}
