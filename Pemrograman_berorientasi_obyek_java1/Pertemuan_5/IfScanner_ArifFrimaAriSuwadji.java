import java.util.Scanner;

public class IfScanner_ArifFrimaAriSuwadji {
    public static void main(String[] args) {
        float a, b;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input a");
        a = keyboard.nextInt();

        System.out.println("Input b");
        b = keyboard.nextInt();

        if (a > b) {
            float c = (float) a * b;
            System.out.println("hasil perkalian a x b = "+ c);
        } else {
            float d = (float) a / b;
            System.out.println("hasil pembagian a : b = "+ d);
        }
    }
}
