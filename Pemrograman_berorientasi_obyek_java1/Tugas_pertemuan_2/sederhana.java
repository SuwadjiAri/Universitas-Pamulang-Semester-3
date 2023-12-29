public class sederhana {
    public static void main (String[] args){
        int a = 5;
        int b = 10;
        int c = a + b;

        int d = b - a;
        int e = a * b;
        int f = b / a;

        float g = (float) a / b;
        double h = (double) a/ b;

        System.out.println("Pertambahan : "+ c);
        System.out.println("Pengurangan : " + d);
        System.out.println("Perkalian : " + e);
        System.out.println("Pembagian: " + f);

        System.out.println("Pembagian float : " + g);
        System.err.println("Pembagian double : " + h);
    }

    
}