/* Aquest programa és la meva biblioteca de taules: Conte con les següents funció:
*
* Una funció que rep un array bidimensional, un char d'inici i un altre char final, el char fi es substitueix per el char d'inici en les posicions en les que es troba en la taula i retorna un nou array bidimensional amb els caràcters substituits. (substitueix)
*/

public class UtilTaula {
    public static char[][] substitueix(char[][] taula, char inici, char fi) {
        int files = taula.length;
        int cols = taula[0].length;

        char[][] resultat = new char[files][cols];

        for (int fila = 0; fila < files; fila++) {
            for (int col = 0; col < cols; col++) {
                if (taula[fila][col] == inici) {
                    resultat[fila][col] = fi;
                } else {
                    resultat[fila][col] = taula[fila][col];
                }
            }
        }

        return resultat;
    }
}