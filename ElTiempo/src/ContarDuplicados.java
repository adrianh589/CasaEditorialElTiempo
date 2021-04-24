import java.util.ArrayList;

public class ContarDuplicados {

    /**
     * Ejercicio 1
     * Funcion que permite ver que letras estan duplicadas y el numero de duplicados encontrados
     * @param text Recibe la palabra para poder encontrar el numero de caracteres duplicados que tiene esta letra
     */
    public static int duplicados(String text){
        text = text.toLowerCase();

        ArrayList<Character> letrasDuplicadas = new ArrayList<Character>();
        int duplicados = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < text.length(); j++) {
                if(i != j && // Evitar comparar la misma posicion
                        !letrasDuplicadas.contains(text.charAt(i)) &&// Si la letra en posicion i NO esta duplicada
                        !letrasDuplicadas.contains(text.charAt(j)) &&// Si la letra en posicion j NO esta duplicada
                        text.charAt(i) == text.charAt(j)){// Si la letra actual es igual a la que se esta mirando, entonces significa que debemos sumar
                    letrasDuplicadas.add(text.charAt(i));// Anadir la letra encontrada
                    duplicados++;
                }
            }

        }
        System.out.println(letrasDuplicadas);
        return duplicados;
    }



}
