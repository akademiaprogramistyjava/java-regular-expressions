package pl.szymonleyk.sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SymbolGroups {

    public static void main(String[] args) {
        Pattern pattern;
        Matcher matcher;
        // . - dowolny znak
        System.out.println("---------- . -----------");
        pattern = Pattern.compile("......");

        matcher = pattern.matcher("12-123");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("126123");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("1z-1^3");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("234adf0");
        System.out.println(matcher.matches());

        System.out.println("---------- .{6} -----------");
        pattern = Pattern.compile(".{6}");

        matcher = pattern.matcher("12-123");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("126123");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("1z-1^3");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("234adf0");
        System.out.println(matcher.matches());

        System.out.println("---------- [abcz]{6} -----------");
        pattern = Pattern.compile("[abcz]{6}");

        matcher = pattern.matcher("12-123");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("aczbzz");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("aaaaaa");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("234adf0");
        System.out.println(matcher.matches());

        System.out.println("---------- [a-zA-Z0-9]{6}aa -----------");
        pattern = Pattern.compile("[a-zA-Z0-9]{6}aa");

        matcher = pattern.matcher("12-123");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("aczbzzaa");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("aaaA9aaa");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("aaaA9a01");
        System.out.println(matcher.matches());

        // ^ negacja
        System.out.println("---------- [^a-zA-Z]{6} -----------");
        pattern = Pattern.compile("[^a-zA-Z]{6}");

        matcher = pattern.matcher("12-123");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("aczbzzaa");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("99a999");
        System.out.println(matcher.matches());

        matcher = pattern.matcher("aaaA9a01");
        System.out.println(matcher.matches());
    }
}
