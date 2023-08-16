package org.javaCore.regularExpressions.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
//        ^ retorna o começo da linha ---> ^\w retorna todos os caracteres no começo da linha

//        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; //com quantificadores!
//        String text = "12 0x 0X 0xFFABC 0x10G 0x1";
//        String regex = "[^\\W]+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // minha resolução
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // resolução aula
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@yahoomail.com.br, sakura@mail.com";

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
    }
}
