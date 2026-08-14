/* Enunciat

Recordes l'exercici en el que el lloro anava demanant texts i només repetia els que començaven o acabaven en vocal?

Desenvoluparem un programa anomenat FitxerVocalIniciFi que farà servir una estructura molt similar, per mostrar totes les línies d'un fitxer de text anomenat frases.txt que comencin o acabin en vocal catalana.

Per descomptat, caldrà que facis servir la funció esVocal() que vas utilitzar per la versió de referència.

Per exemple, considera quan el fitxer frases.txt conté:

ànec
gat
lleó
gos

La sortida del programa serà:

ànec
lleó
*/
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FitxerVocalInici {
    public static void main(String[] args) throws IOException {
        String ruta = "frases.txt";

        BufferedReader lector = new BufferedReader(new FileReader(ruta));

        while (true) {
            String linia = lector.readLine();

            if (linia == null) { break; }
            
            char primerCaracter = linia.charAt(0);
            char ultimCaracter = linia.charAt(linia.length()-1);
            if (UtilString.esVocal(primerCaracter) || UtilString.esVocal(ultimCaracter)) {
                System.out.println(linia);
            }
        }
        lector.close();
    }
}