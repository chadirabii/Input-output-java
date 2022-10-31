import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Copie {

    public static void main(String[] args) {
        try {
            copierFichier("source.txt", "copie.txt");
            lecture();
        } catch (IOException e) {
            e.printStackTrace();
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

    public static void copierFichier(String source, String destination) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            byte buffer[] = new byte[1024];
            int taille = 0;
            fis = new FileInputStream(source);
            fos = new FileOutputStream(destination, true);
            while ((taille = fis.read(buffer)) != -1) {
                System.out.println("\t\t\t\t\t\t------------- La liste copiee -------------");
                fos.write(buffer, 0, taille);

            }
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException a) {

                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException a) {

                }
            }
        }
    }
}
