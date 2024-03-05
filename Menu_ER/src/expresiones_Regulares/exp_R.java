package expresiones_Regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exp_R {

    public Boolean validacion = false;
    public String Salida = "";

    public String validarTextoConRegex(String texto, String regex) {
        // Compila la expresión regular en un patrón
        Pattern pattern = Pattern.compile(regex);
        // Crea un buscador (matcher) que buscará coincidencias en el texto
        Matcher matcher = pattern.matcher(texto);
        // Resetear validacion a false para cada nueva ejecución
        validacion = false;
        // Busca todas las coincidencias y actualiza validación
        if (matcher.find()) {
            validacion = true;
        }
        // Actualiza Salida basado en validacion
        Salida = validacion ? "Pertenece" : "No pertenece";
        return Salida;
    }

    public String expresion_Regular1(String texto) {
        // Expresión regular para encontrar palabras de exactamente tres letras
        String regex = "\\b[a-zA-Z]{3}\\b";
        return validarTextoConRegex(texto, regex);
    }

    public String expresion_Regular2(String texto) {
        // Expresión regular para encontrar números enteros positivos de hasta tres dígitos
        String regex = "\\b\\d{1,3}\\b";
        return validarTextoConRegex(texto, regex);
    }

    public String expresion_Regular3(String texto) {
        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}\\b";
        return validarTextoConRegex(texto, regex);
    }

    public String expresion_Regular4(String texto) {
        String regex = "\\+52\\d{10,11}";
        return validarTextoConRegex(texto, regex);
    }

    public String expresion_Regular5(String texto) {
        String regex = "\\b[a-z]{3}\\b";
        return validarTextoConRegex(texto, regex);
    }

    public String expresion_Regular6(String texto) {
        String regex = "\\b[aeiouAEIOU][a-zA-Z]*[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]\\b";
        return validarTextoConRegex(texto, regex);
    }

    public String expresion_Regular7(String texto) {
        String regex = "-?\\d+(\\.\\d{1,2})?";
        return validarTextoConRegex(texto, regex);
    }

    public String expresion_Regular8(String texto) {
        String regex = "\\b(https?://)[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}\\b";
        return validarTextoConRegex(texto, regex);
    }

    public String expresion_Regular9(String texto) {
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)\\d{2}\\b";
        return validarTextoConRegex(texto, regex);
    }

    public String expresion_Regular10(String texto) {
        String regex = "\\b^[a-zA-Z0-9]+$\\b";
        return validarTextoConRegex(texto, regex);
    }

    public String expresion_Regular11(String texto) {
        String regex = "\\b[A-Z][a-z]+\\b";
        return validarTextoConRegex(texto, regex);
    }

    public String expresion_Regular12(String texto) {
        String regex = "\\b[a-zA-Z0-9]{5}\\b";
        return validarTextoConRegex(texto, regex);
    }

    public String expresion_Regular13(String texto) {
        String regex = "\\b[a-zA-Z]{4}ing\\b";
        return validarTextoConRegex(texto, regex);
    }

    public String expresion_Regular14(String texto) {
        String regex = "\\b([0-9A-Fa-f]{2}:){5}[0-9A-Fa-f]{2}\\b";
        return validarTextoConRegex(texto, regex);
    }
    
}
