package Jobsheet3;

public class PersegiPanjang {
    //variabel atau atribut
    public int panjang;
    public int lebar;

    public PersegiPanjang(int p,int l){ // constructor
        panjang = p;
        lebar = l;
    }
    
    // method atau fungsi
    public void cetakInfo(int i){
        System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: " + panjang + " , lebar persegi panjang: " + lebar + ", luas persegi panjang: " + hitungLuas() + 
        ", keliling persegi panjang: " + hitungKeliling());
    }

    public int hitungLuas(){
        int luasPersegiPanjang = panjang * lebar;
        return luasPersegiPanjang;
    }

    public int hitungKeliling(){
        int kelilingPersegiPanjang = 2 * (panjang + lebar);
        return kelilingPersegiPanjang;
    }
}
