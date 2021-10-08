package main.java;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExercise1 {
    public static void main(String[] args) {

String sourceText1 = "I have never seen a thin person drinking Diet Coke.";
String sourceText2 = "We're gonna build a wall!";
String sourceText3 = "Happy Thanksgiving to all--even the haters and losers!";

System.out.println(removeVowels1(sourceText1));
System.out.println(removeVowels2(sourceText2));
System.out.println(removeVowels3(sourceText3));

    }

    public static String removeVowels1(String sourceText1) {

        String str = sourceText1.toLowerCase();
        String replace = "";
        Pattern pt = Pattern.compile("[aeiou]");
        Matcher mt = pt.matcher(str);

        str = mt.replaceAll(replace);
        return str;

    }

    public static String removeVowels2(String sourceText2) {


        String str = sourceText2.toLowerCase();
        String replace = "";
        Pattern pt = Pattern.compile("[aeiou]");
        Matcher mt = pt.matcher(str);

        str = mt.replaceAll(replace);
        return str;

    }

    public static String removeVowels3(String sourceText3) {

        String str = sourceText3.toLowerCase();
        String strnew = str.replaceAll("[aeiouAEIOU]","");
        Pattern pt = Pattern.compile("[aeiou]");
        Matcher mt = pt.matcher(str);

        return strnew;

    }
    }

