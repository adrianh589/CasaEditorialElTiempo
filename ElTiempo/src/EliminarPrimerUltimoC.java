import java.util.Arrays;

public class EliminarPrimerUltimoC {

    public static void eliminarPrimerUltimoCaracter(String cadena){
        String[] cadenaModificada = cadena.split("");
        cadenaModificada[0] = "";
        cadenaModificada[cadenaModificada.length-1] = "";
        System.out.println( Arrays.toString(cadenaModificada).replaceAll("\\[|\\]|,|\\s", "") );
    }

}
