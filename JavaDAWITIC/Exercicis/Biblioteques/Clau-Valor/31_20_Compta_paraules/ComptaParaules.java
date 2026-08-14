/* Enunciat

Desenvolupa un lloro que vagi demanant frases per entrada estàndard fins rebre la cadena en blanc o només formada per espais.

Per cada paraula dins la frase, indicarà el nombre de cops que la paraula ha aparegut fins el moment.

Per exemple, considera la següent seqüència:

 Hola Lloro, com estàs?
 hola -> 1
 lloro -> 1
 com -> 1
 estas -> 1

 Si ets un lloro, ets un lloro molt maco
 si -> 1
 ets -> 1
 un -> 1
 lloro -> 2
 ets -> 2
 un -> 2
 lloro -> 3
 molt -> 1
 maco -> 1

 Un lloro molt maco, sí.
 un -> 3
 lloro -> 4
 molt -> 2
 maco -> 2
 si -> 2


 adéu

Et cal una pista?

Una manera fàcil de fer aquest programa és guardant les paraules normalitzades (accents catalans, majúscules, etc.) a un diccionari, associant-li com a valor el comptador del nombre de cops que ha anat apareixent.
*/

import java.util.Map;
import java.util.HashMap;

public class ComptaParaules {
    public static void main(String[] args) {
        Map <String, Integer> paraules = new HashMap<>();
        
        System.out.println("Ves introduint frases. Enter per finalitzar.");	
        while(true) {
            String frase = Entrada.readLine();
            if (frase.isBlank()) {
                break;
            }
            frase = frase.toLowerCase() + " ";
            String paraula = "";

            for (int i = 0; i < frase.length(); i++) {
                char c = frase.charAt(i);

                if (Character.isLetter(c)) {
                    paraula += c;
                } else if (!paraula.isBlank()) {
                    paraula = UtilString.filtraVocalsCatalaV2(paraula);
                    if (paraules.get(paraula) == null) {
                        paraules.put(paraula, 0);
                    }
                    int comptador = paraules.get(paraula);
                    paraules.put(paraula, comptador+1);
                    System.out.printf("%s -> %d%n", paraula, paraules.get(paraula));
                    paraula = "";
                }
            }
        }
        System.out.println("adéu");
    }
}