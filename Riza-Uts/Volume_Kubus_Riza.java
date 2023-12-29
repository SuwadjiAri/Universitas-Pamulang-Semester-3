import java.util.Scanner;

public class Volume_Kubus_Riza {
    public static void main(String[] args){
        Scanner input = new
Scanner(System.in);
 double sisi, hasil;
       
        System.out.print("Masukkan Sisi : ");
             sisi = input.nextDouble();
     
        hasil = sisi*sisi*sisi;
       
        System.out.println("Hasil Perhitungannya adalah : " + hasil);
    }
}