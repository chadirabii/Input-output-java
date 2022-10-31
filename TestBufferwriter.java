import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class TestBufferwriter {

    public static void main(String[] args) throws IOException {

        try {

            BufferedWriter fichier = new BufferedWriter(new FileWriter("Buffer.txt"));
            fichier.write("Bonjour");
            fichier.newLine();
            fichier.write("Chadi");
            fichier.newLine();
            fichier.write("Today is " + new Date());
            fichier.newLine();
            fichier.close();
            // lecture();
            printwriter();
        } catch (IOException e) {
            System.out.println("un probleme survenue");
        }
    }

    private static void lecture() throws IOException {
        BufferedReader fichier = new BufferedReader(new FileReader("D:\\"));
        String ligne;
        while ((ligne = fichier.readLine()) != null) {
            System.out.println(ligne);
        }
        fichier.close();
    }

    private static void printwriter() throws IOException {

        try {
            PrintWriter fichier = new PrintWriter(new FileWriter("D:\\"));

            fichier.println("test BufferWriter");

            fichier.close();
        } catch (IOException e) {
            System.out.println("un probleme survenue");
        }

    }
}