import java.util.Scanner;

class BelajarJava_Arif_Frima_Ari_S {
    public static void main (String args[]) {
        char nilai;
        Scanner input = new Scanner(System.in);

        System.out.println("Input Nilai Anda (A - E): ");
        nilai = input.next().charAt(0);

        switch  (nilai) {
            case 'A':
                System.out.println("Pertahankan!");
                break;
            case 'B':
                System.out.println("Harus lebih baik lagi");
                break;
            case 'C':
                System.out.println("Pebanyak Belajar");
                break;
            case 'D':
                System.out.println("Jangan keseringan main");
                break;
            case 'E':
                System.out.println("Kebanyakan Bolos...");
                break;
            default:
                System.out.println("Maaf, format nilai tidak sesuai");
        }
    }
}