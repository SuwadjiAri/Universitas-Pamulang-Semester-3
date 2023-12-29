import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReader_ArifFrimaAriSuwadji {
    public static void main(String[] args) throws Exception {
        String nama;

        //Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        //membuat object bufferreader
        BufferedReader br = new BufferedReader(isr);

        //mengisi variable nama dengan bufferreader
        System.out.println("Inputkan nama:");
        nama = br.readLine();

        //tampilkan output isi variable nama
        System.out.println("Nama kamu adalah " + nama);
    }
}
