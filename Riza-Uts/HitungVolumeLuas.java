import java.util.Scanner;

public class HitungVolumeLuas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilih bentuk: ");
        System.out.println("1. Bola");
        System.out.println("2. Kubus");
        System.out.println("3. Segitiga");
        int pilihan = input.nextInt();
        
        if (pilihan == 1) {
            // Menghitung volume bola
            System.out.print("Masukkan jari-jari bola: ");
            double jariJari = input.nextDouble();
            double volumeBola = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
            System.out.println("Volume bola adalah: " + volumeBola);
        } else if (pilihan == 2) {
            // Menghitung volume kubus
            System.out.print("Masukkan panjang sisi kubus: ");
            double sisiKubus = input.nextDouble();
            double volumeKubus = Math.pow(sisiKubus, 3);
            System.out.println("Volume kubus adalah: " + volumeKubus);
        } else if (pilihan == 3) {
            // Menghitung luas segitiga
            System.out.print("Masukkan alas segitiga: ");
            double alas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = input.nextDouble();
            double luasSegitiga = 0.5 * alas * tinggi;
            System.out.println("Luas segitiga adalah: " + luasSegitiga);
        } else {
            System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
        }
        
        input.close();
    }
}