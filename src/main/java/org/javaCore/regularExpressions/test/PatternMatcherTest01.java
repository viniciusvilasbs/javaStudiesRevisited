package org.javaCore.regularExpressions.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        String regex2 = "aba";
        String text = "abaaba";
        String text2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Texto:  " + text);
        System.out.println("índice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }

        System.out.println();
        System.out.println("Done!");
        System.out.println("*******************************************");

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(text2);

        System.out.println("Texto:  " + text2);
        System.out.println("índice: 0123456789");
        System.out.println("Regex: " + regex2);
        System.out.println("Posições encontradas: ");
        while (matcher2.find()) {
            System.out.print(matcher2.start() + " ");
        }

        System.out.println();
        System.out.println("Done!");
    }
}
