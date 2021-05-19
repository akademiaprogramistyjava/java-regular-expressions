import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("już");
        Matcher matcher = pattern.matcher("Pójdźmy o krok dalej. Ten przykład jest już zakręcony więc trzymaj się mocno ;). Co jeśli chcemy sprawdzić numer mieszkania. Załóżmy, że numer mieszkania to kilka cyfr oddzielonych ukośnikiem od kolejnej grupy cyfr. Przykładowy numer pasujący do tego opisu może wyglądać tak 123\\5");

//        System.out.println(matcher.find());
//        System.out.println(matcher.matches());


        System.out.println("------------- ? ---------------");
        // ? - znak przed '?' może być 0 lub 1 raz
        pattern = Pattern.compile("85-?234");
        Matcher matcher1 = pattern.matcher("85-234");
        System.out.println(matcher1.matches());
        Matcher matcher2 = pattern.matcher("85234");
        System.out.println(matcher2.matches());
        Matcher matcher3 = pattern.matcher("234");
        System.out.println(matcher3.matches());


        System.out.println("------------- * ---------------");
        // * - znak przed gwiazką może być 0 lub więcej razy
        pattern = Pattern.compile("85-*234");
        matcher1 = pattern.matcher("85-------------------234");
        System.out.println(matcher1.matches());
        matcher2 = pattern.matcher("85234");
        System.out.println(matcher2.matches());
        matcher3 = pattern.matcher("234");
        System.out.println(matcher3.matches());

        System.out.println("------------- + ---------------");
        // + - znak przed gwiazką może być 1 lub więcej razy
        pattern = Pattern.compile("85-+234");
        matcher1 = pattern.matcher("85-------------------234");
        System.out.println(matcher1.matches());
        matcher2 = pattern.matcher("85234");
        System.out.println(matcher2.matches());
        matcher3 = pattern.matcher("234");
        System.out.println(matcher3.matches());


        System.out.println("------------- {x,y} ---------------");
        // + - znak przed gwiazką może być 1 lub więcej razy
        pattern = Pattern.compile("85-{1,6}234");
        matcher1 = pattern.matcher("85------234");
        System.out.println(matcher1.matches());
        matcher2 = pattern.matcher("85234");
        System.out.println(matcher2.matches());
        matcher3 = pattern.matcher("234");
        System.out.println(matcher3.matches());


        System.out.println("------------- . ---------------");
        // . - dowolny jeden znak
        pattern = Pattern.compile("..-{1,6}234");
        matcher1 = pattern.matcher("zz------234");
        System.out.println(matcher1.matches());
        matcher2 = pattern.matcher("85-234");
        System.out.println(matcher2.matches());
        matcher3 = pattern.matcher("234");
        System.out.println(matcher3.matches());

        System.out.println("------------- .* ---------------");
        pattern = Pattern.compile("M.*");
        matcher1 = pattern.matcher("Marcin");
        System.out.println(matcher1.matches());
        matcher2 = pattern.matcher("Mariannnnnnnnnnnnn ksaldfjka lsdflasdf l");
        System.out.println(matcher2.matches());
        matcher3 = pattern.matcher("Józef");
        System.out.println(matcher3.matches());


        System.out.println("------------- \\. ---------------");
        pattern = Pattern.compile("M\\.*");
        matcher1 = pattern.matcher("Marcin");
        System.out.println(matcher1.matches());
        matcher2 = pattern.matcher("M..............");
        System.out.println(matcher2.matches());
        matcher3 = pattern.matcher("M");
        System.out.println(matcher3.matches());

        System.out.println("------------- [] ---------------");
        pattern = Pattern.compile("[WMK]\\.*");
        matcher1 = pattern.matcher("Marcin");
        System.out.println(matcher1.matches());
        matcher2 = pattern.matcher("K..............");
        System.out.println(matcher2.matches());
        matcher3 = pattern.matcher("M");
        System.out.println(matcher3.matches());

        System.out.println("------------- [] ---------------");
        pattern = Pattern.compile("[A-Z0-9]\\.*");
        matcher1 = pattern.matcher("Marcin");
        System.out.println(matcher1.matches());
        matcher2 = pattern.matcher("K..............");
        System.out.println(matcher2.matches());
        matcher3 = pattern.matcher("5");
        System.out.println(matcher3.matches());

        System.out.println("------------- email ---------------");
        pattern = Pattern.compile("[a-z]*\\.[a-z]*@gmail\\.com");
        matcher1 = pattern.matcher("jurek@gmail.com");
        System.out.println(matcher1.matches());
        matcher2 = pattern.matcher("a.b@gmail.com");
        System.out.println(matcher2.matches());
        matcher3 = pattern.matcher("zygmunt.nowak@gmail.com");
        System.out.println(matcher3.matches());


        System.out.println("------------- ^ ---------------");
        pattern = Pattern.compile("[^,]{7,20}");
        matcher1 = pattern.matcher("jda kjflasdf");
        System.out.println(matcher1.matches());
        matcher2 = pattern.matcher("klasdf,lk23j");
        System.out.println(matcher2.matches());
        matcher3 = pattern.matcher("zygmunt.nowak@gmail.com");
        System.out.println(matcher3.matches());

        System.out.println("------------- dowód ---------------");
        pattern = Pattern.compile("[A-Z]{3}\\d{6}");
        matcher1 = pattern.matcher("ABC123123");
        System.out.println(matcher1.matches());
        matcher2 = pattern.matcher("LSK234");
        System.out.println(matcher2.matches());
        matcher3 = pattern.matcher("zygmunt.nowak@gmail.com");
        System.out.println(matcher3.matches());


        System.out.println("---------------- zadanie --------------");
        String newString = "abc#d##c".replaceAll("[a-z]#","");
        System.out.println(newString);


        LocalDateTime dataICzas = LocalDateTime.now();
        System.out.println(dataICzas);

        LocalDate dataUrodzenia = LocalDate.of(2001, 01, 19);
        System.out.println(dataUrodzenia);


        dataICzas = LocalDateTime.of(2021, 05, 19, 8, 0);
        String data = dataICzas.format(DateTimeFormatter.ofPattern("EEEE, HH:mm"));
        System.out.println(data);

        for (int i = 0; i < 105; i+=7) {
            dataICzas.plusYears(1).plusNanos(11);
        }


        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(1980, 02,11);

        Period.between(d2, d1);




    }
}
