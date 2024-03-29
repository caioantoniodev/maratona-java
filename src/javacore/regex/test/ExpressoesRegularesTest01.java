package javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Pattern & Matcher
public class ExpressoesRegularesTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abaaba";
        texto = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex:  " + regex);
        System.out.println("posicoes encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
