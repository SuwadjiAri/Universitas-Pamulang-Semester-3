import java.util.Scanner;

public class Volume_Bola_Riza {
    public static void main(String[] args){
        Scanner input = new
Scanner(System.in);
        double r;
        double phi = 3.14;
 
        System.out.print("=== Program Menghitung Volume Bola ===\n");
        System.out.println("Masukkan Jari-jari (r) : ");
        r = input.nextDouble();
        System.out.println("Volume Bola : " + (4 * phi * r * r * r)/3);
        System.out.print("\n---------- Volume_Bola_Riza ----------");
    
    }
}
