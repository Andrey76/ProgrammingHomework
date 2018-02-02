package Homework2;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andr_ on 03.02.2017.
 */
public class StringUtils {
    //function, that turns the line around
    public static String AroundString(String s) {

        StringBuilder s1 = new StringBuilder();

        for (int i = s.length() - 1; i > -1; --i) {

            s1.append(s.charAt(i));

        }
        return s = s1.toString();
    }

    // function that determines is the line polindromom
    public static boolean Polyndrom(String s2) {

        s2 = s2.toLowerCase().trim().replace(" ", "");

        return s2.equals(StringUtils.AroundString(s2));
    }

    //function that checks the length of the string
    public static String Podmena(String s) {
        String k;
        if (s.length() > 10) {
            System.out.println(s.substring(0, 7));
        } else if (s.length() < 10) {
            for (int i = s.length(); i < 12; i++) {
                s += 'o';

            }
            System.out.println(s);
        }
        return s;
    }

    //a function that swaps the first and last word in a line
    public static void ChangeWordsPlaces(String s) {
        ArrayList<String> centence = new ArrayList();
        StringTokenizer st = new StringTokenizer(s, " ,:;");
        //записываем в колеекцию centence
        while (st.hasMoreTokens()) {
            s = st.nextToken();
            centence.add(s);
        }

        //меняем местами первое и последнее слова
        String firstWord = centence.get(0);
        int LastElementIndex = centence.size() - 1;
        String lastWord = centence.get(LastElementIndex);
        centence.set(0, lastWord);
        centence.set(LastElementIndex, firstWord);
        //выводим в консоль
        for (String i : centence) {
            System.out.print(i.concat(" "));
        }
        System.out.print('\n');
    }

    public static boolean Characters(String s) {
        Pattern pattern = Pattern.compile("[a-c]*");
        Matcher matcher = pattern.matcher(s);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
    public static boolean FormateDate(String s){
        Pattern pattern = Pattern.compile("^\\d{2}\\.\\d{2}\\.\\d{4}$");
        boolean date = false;
        Matcher matcher = pattern.matcher(s);
        if(matcher.find()) {
            date = true;
        }
        return date;
    }
    public static String FormatPhoneNumber(String s){
        Pattern pattern = Pattern.compile("\\+[0-9]{1}\\([0-9]{3}\\)[0-9]{3}-[0-9]{2}-[0-9]{2}");
        Matcher mat = pattern.matcher(s);
        String phone = new String();
        StringBuilder count = new StringBuilder();
        int i=0;
        while(mat.find()){
            count.append(mat.group() + "; ");
        }
        phone = count.toString();

        return phone;
    }
}






