import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;;

public class Test {
    public static void main(String[] args) throws IOException {

        try {
            BufferedReader fichier = new BufferedReader(new FileReader("D:\\"));
            String ligne;
            while ((ligne = fichier.readLine()) != null) {
                System.out.println(ligne);
            }
            fichier.close();
// FileReader fichier = new FileReader("D:\\");
// FileWriter fichier1 = new FileWriter("test.txt",true);
// fichier1.write(" bonjour");
// fichier1.close();
// while (fichier.ready()){
// System.out.println(fichier.read());
//
// fichier.close();
        } catch (IOException e) {
            System.out.println("un probleme survenue");
        }
    }

}
