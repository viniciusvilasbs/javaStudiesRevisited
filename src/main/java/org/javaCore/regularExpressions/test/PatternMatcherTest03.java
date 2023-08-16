package org.javaCore.regularExpressions.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {

//        Exemplos de metacaracteres (esses são os principais):
//        \d = Todos os dígitos
//        \D = Tudo o que não for dígito
//        \s = Espaços em branco
//        \S = Todos os caracteres, excluindo os brancos
//        \w = a-z, A-Z, dígitos e _
//        \W = Tudo o que não estiver incluso em \w
//        [] usado para especificar um RANGE de caracteres
//        Exemplos de QUANTIFICADORES:
//        ? zero ou uma
//        * zero ou mais
//        + uma ou mais
//        {n,m} de n até m
//        () agrupamento
//        | ou ---> exemplo: o(v|c)o ---> busca "ovo" ou "oco"
//        $ fim da linha
//        . caractere coringa ---> 1.3 retornará 123 ou 133 ou 1a3 ou 1@3... ou seja, retorna qualquer caractere
//                                                                            entre 1 e 3 (os delimitados)

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; //com quantificadores!
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";
        int hexaNumber = 0x1254f83;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Texto:  " + text);
        System.out.println("índice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        System.out.println();
        System.out.println("Done!");
        System.out.println("*******************************************");
        System.out.println(hexaNumber);
        /*
        String regex2 = "aba";
        String text2 = "abababa";

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(text2);

        System.out.println("Texto:  " + text2);
        System.out.println("índice: 0123456789");
        System.out.println("Regex: " + regex2);
        System.out.println("Posições encontradas: ");
        while (matcher2.find()) {
            System.out.print(matcher2.start() + " " + matcher2.group() +"\n");
        }
        System.out.println();
        System.out.println("Done!");
     */
    }
}
