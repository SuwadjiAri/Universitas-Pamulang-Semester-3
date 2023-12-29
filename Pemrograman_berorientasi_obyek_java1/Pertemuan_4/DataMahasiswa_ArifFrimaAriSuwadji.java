import java.util.Scanner;

public class DataMahasiswa_ArifFrimaAriSuwadji {
    public static void main(String[] args) {
        //deklarasi variable
        String nama, alamat;
        int usia;

        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        //tampilkan output ke user
        System.out.println("*** Pendataan Mahasiswa Universitas Pamulang ***");
        System.out.println("Nama Mahasiswa:");
        //Menggunakan Scanner dan menyimpan apa yang diketik di varibel nama
        nama = keyboard.nextLine();

        //Tampilkan output lagi
        System.out.println("Alamat:");
        //menggunakan Scanner lagi
        alamat = keyboard.nextLine();

        System.out.println("Usia:");
        usia = keyboard.nextInt();

        //Menampilkan apa yang sudah disimpan di variabel
        System.out.println("------------------");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Alamat: " +alamat);
        System.out.println("Usia: " + usia);
    }
}