public class FungsiStatic_Hisyam {
    void Algoritma(String Algoritma) { 
        System.out.println("Saya sedang belajar " + Algoritma);
        System.out.println("mudahkan.....");
    }    

    static void Pemograman(String Pemograman) {
        System.out.println("Saya sedang belajar " + Pemograman);
    }

    public static void main(String[] args){
        Pemograman("Java");
        FungsiStatic_Hisyam saya = new FungsiStatic_Hisyam();
        saya.Algoritma("Praktikum Algoritma dan Pemograman");
    }
}
