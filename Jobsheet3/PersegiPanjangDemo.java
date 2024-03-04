package Jobsheet3;
import java.util.Scanner;
public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjangLength;
        int panjang, lebar;

        System.out.print("Masukkan panjang array: ");
        panjangLength = input.nextInt();

        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[panjangLength];
        //jumlah elemen tergantung pada inputan user dan bertipe data PersegiPanjang

        //inputan
        for (int i = 0; i < panjangLength; i++){
            System.out.println("Persegi panjang ke-" + (i +1));
            System.out.print("Masukkan panjang: ");
            panjang = input.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = input.nextInt();
            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang,lebar);
            
        }

        //output
        for (int i = 0; i < panjangLength; i++){
           arrayOfPersegiPanjang[i].cetakInfo(i);
          
        }

        // arrayOfPersegiPanjang[0] = new PersegiPanjang();
        // arrayOfPersegiPanjang[0].panjang = 110;
        // arrayOfPersegiPanjang[0].lebar = 30;

        // arrayOfPersegiPanjang[1] = new PersegiPanjang();
        // arrayOfPersegiPanjang[1].panjang = 88;
        // arrayOfPersegiPanjang[1].lebar = 40;

        // arrayOfPersegiPanjang[2] = new PersegiPanjang(); 
        // arrayOfPersegiPanjang[2].panjang = 100;
        // arrayOfPersegiPanjang[2].lebar = 20;

        // System.out.println("Persegi panjang ke-1, panjang: " + arrayOfPersegiPanjang[0].panjang + ", lebar:  " + arrayOfPersegiPanjang[0].lebar);
        // System.out.println("Persegi panjang ke-2, panjang: " + arrayOfPersegiPanjang[1].panjang + ", lebar:  " + arrayOfPersegiPanjang[1].lebar);
        // System.out.println("Persegi panjang ke-3, panjang: " + arrayOfPersegiPanjang[2].panjang + ", lebar:  " + arrayOfPersegiPanjang[2].lebar);
    }
}
