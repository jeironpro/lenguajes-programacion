/* 
 *Aquest programa és la meva biblioteca de String: Conte les següents utilitats:
 * Una funció per verificar si un caràcter es vocal i retorna un valor boolean (esVocal).
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
}