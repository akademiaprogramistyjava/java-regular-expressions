package pl.szymonleyk.sample;

import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Examples {


    public static void main(String[] args) {
        // postcode
        System.out.println("----------- postcode \"\\\\d{2}-\\\\d{3}\" -------------");
        Pattern postcode = Pattern.compile("\\d{2}-\\d{3}");

        Matcher matcher = postcode.matcher("12-331");
        System.out.println("12-331 : "+matcher.matches());

        matcher = postcode.matcher("aa-331");
        System.out.println("aa-331 : "+matcher.matches());

        matcher = postcode.matcher("51331");
        System.out.println("51331 : "+matcher.matches());

        matcher = postcode.matcher("51-3616");
        System.out.println("51-3616 : "+matcher.matches());

        // email
        System.out.println("----------- email \"[\\\\w.]+@[\\\\w.]+\"-------------");
        Pattern email = Pattern.compile("[\\w.]+@[\\w.]+");

        matcher = email.matcher("j@j");
        System.out.println("j@j : "+matcher.matches());

        matcher = email.matcher("andrzej.nowak@j");
        System.out.println("andrzej.nowak@j : "+matcher.matches());

        matcher = email.matcher("andrzej-nowak@j");
        System.out.println("andrzej-nowak@j : "+matcher.matches());

        // password
        System.out.println("----------- password \"[[a-z]{3}[0-9]+[A-Z]+]{8}\"-------------");
        Pattern password = Pattern.compile("[[a-z]{3}[0-9]+[A-Z]+]{8}");

        matcher = password.matcher("aaaa123Z");
        System.out.println("aaaa123Z : "+matcher.matches());

        matcher = password.matcher("123aaaaZ");
        System.out.println("123aaaaZ : "+matcher.matches());

        matcher = password.matcher("aaaaZ");
        System.out.println("123aaaaZ : "+matcher.matches());
    }


}
