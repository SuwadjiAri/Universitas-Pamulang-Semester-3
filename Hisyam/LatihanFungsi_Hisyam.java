public class LatihanFungsi_Hisyam {
    static void fungsi1(){
        System.out.println("Menampilkan luas trapesium");
        float a, b, t, luas;
        a = 10; b=2; t=5;
        luas = (a + b) * (float) 0.5 * t;
        System.out.println("Luas adalah: " + luas);
    }

    public static void main(String[] args){
        fungsi1();
        fungsi2();
    }

    static void fungsi2() {
        System.out.println("Menampilkan angka 100 - 80");
        for (int i = 100; i >= 80; i--) {
            System.out.println("Angka " + i);
            fungsi3(i);
        }
    }

    static void fungsi3(int angka) {
        // System.out.println("Menampilkan Bilangan Ganjil / Genap");
        if (angka % 2 == 0){
            System.out.println(angka + " Bilangan Genap");
        }else {
            System.out.println(angka + " Bilangan Ganjil");
        }
    }
}
