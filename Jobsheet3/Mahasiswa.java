package Jobsheet3;

public class Mahasiswa {
   String nama;
   int nim;
   char jenisKelamin;
   double ipk;

   public void informasiDataMahasiswa(int i){
    System.out.println("Data mahasiswa ke- " + (i+1) + "\nNama:  " + nama + 
    "\nNIM: " + nim + "\nJenis Kelamin: " + jenisKelamin + "\nNilaiIPK: " + ipk);
   }

   
}
