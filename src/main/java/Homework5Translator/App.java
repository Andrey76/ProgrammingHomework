package Homework5Translator;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by andr_ on 21.03.2017.
 */
public class App {
    public static void main(String[] args) throws IOException {
        String result;
        int i = 0;
        System.out.println("Select the type of dictionary(input _1_ for EN-RU or _2_ for RU-EN): ");
        File file = new File("C:\\Users\\andr_\\IdeaProjects\\ua.org.oa.a.andrew\\src\\main\\java\\Homework5Translator\\Dict");
        String[] str = file.list();
        for (String s : str)
            System.out.println(s);
        String s1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s1 = br.readLine();
       switch (s1){
           case "1":
            System.out.println("You have chosen the English-Russian dictionary");
            Translator translator = new Translator("EN-RU.txt");
            result = translator.TranslateWords("C:\\Users\\andr_\\IdeaProjects\\ua.org.oa.a.andrew\\src\\main\\java\\Homework5Translator\\Dict\\EN-RU.txt");
            System.out.println(result);
            break;
           case "2":
               System.out.println("You have chosen the Russian-English dictionary");
               Translator translator1 = new Translator("RU-EN.txt");
               result = translator1.TranslateWords("C:\\Users\\andr_\\IdeaProjects\\ua.org.oa.a.andrew\\src\\main\\java\\Homework5Translator\\Dict\\RU-EN.txt");
               System.out.println(result);
               break;
               default:
                   System.out.println("You have chosen a dictionary that is not in our library");
        }
    }
}
