package Homework2;

/**
 * Created by andr_ on 03.02.2017.
 */
public class AppStrExp {
    public static void main(String[] args) {
        String s = "Hello world!";
        System.out.println(s + " = " + Homework2.StringUtils.AroundString(s));
        String s2 = "А роза упала на лапу Азора";
        System.out.println(Homework2.StringUtils.Polyndrom(s2));
        String s3 = "функция";
        Homework2.StringUtils.Podmena(s3);
        String s4 = "А роза упала на лапу Азора";
        Homework2.StringUtils.ChangeWordsPlaces(s4);
        String s5 = "А роза упала на лапу Азора. Как перевести кодировку в utf 8. ";
//        StringUtils.ChangeWordsPlaces2(s5);
        Homework2.StringUtils.Characters(s5);
        String s6 = "10.09.2009";
        System.out.println(Homework2.StringUtils.FormateDate(s6));
    }
}
