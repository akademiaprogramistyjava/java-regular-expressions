package pl.szymonleyk.sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantityOperator {
    public static void main(String[] args) {
        Pattern pattern;
        Matcher matcher;

        // ? - 0 lub 1 znak poprzedzający
        System.out.println("------------ ? -------------");

        pattern = Pattern.compile("a?ccc");

        matcher = pattern.matcher("");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("cc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("ccc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("accc");
        System.out.println(matcher.matches());

        // + - 1 lub więcej znaków poprzedzających
        System.out.println("------------ + -------------");
        pattern = Pattern.compile("a+ccc");

        matcher = pattern.matcher("");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("cc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("ccc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("aaaaaaaaaaaaaaaccc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("accc");
        System.out.println(matcher.matches());

        // * - 0 lub więcej znaków poprzedzających
        System.out.println("------------ + -------------");
        pattern = Pattern.compile("a*ccc");

        matcher = pattern.matcher("");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("cc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("ccc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("aaaaaaaaaaaaaaaccc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("accc");
        System.out.println(matcher.matches());

        // {5} - dokładnie 5
        // {1,} - przynajmniej 1
        // {4,10} - od 4 do 10
        System.out.println("------------ {5} -------------");
        pattern = Pattern.compile("a{5}ccc");

        matcher = pattern.matcher("");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("cc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("ccc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("aaaaaaaaaaaaaaaccc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("accc");
        System.out.println(matcher.matches());


        System.out.println("------------ {2,15} -------------");
        pattern = Pattern.compile("a{2,15}ccc");

        matcher = pattern.matcher("");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("cc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("ccc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("aaaaaaaaaaaaaaaccc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("accc");
        System.out.println(matcher.matches());


        System.out.println("------------ {1,} -------------");
        pattern = Pattern.compile("a{1,}ccc");

        matcher = pattern.matcher("");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("cc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("ccc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("aaaaaaaaaaaaaaaccc");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("accc");
        System.out.println(matcher.matches());
    }
}
