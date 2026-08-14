/* 
 *Aquest programa és la meva biblioteca de String: Conte les següents utilitats:
 * Una funció per verificar si un caràcter es vocal i retorna un valor boolean (esVocal).
 * 
 * Una funció que filtra un text i retorna un String amb només les lletres del text (nomesLletres).
 *
 * Una funció que separa un text de només lletres i retorna un String amb les lletres separat per comes (lletresSeparades).
 */

 public class UtilString {
    public static boolean esVocal(char caracter) {
        String vocals = "aàeèéiíïoóòuúü";
        
        for (int i = 0; i < vocals.length(); i++) {
            char v = vocals.charAt(i);
            if (Character.toLowerCase(caracter) == v) {
                return true;                   
            }
        }     
        return false;
    }
    
    public static String nomesLletres(String text) {
        String nouText = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                nouText += c;
            }
        }
        return nouText;
    }
    
    public static String lletresSeparades(String text) {
        String nouText = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (i < text.length()-1) {
                nouText += c + ", ";
            } else {
                nouText += c;
            }
        }
        return nouText;
    }
}