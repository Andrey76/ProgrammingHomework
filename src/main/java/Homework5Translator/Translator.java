package Homework5Translator;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Translator {
    private String fileName;
    private Map<String, String> map = new HashMap<String, String>();

    public Translator(String fileName) {
        this.fileName = fileName;
    }



    public String TranslateWords(String file)  {
        BufferedReader in = null;
        try {
            in = new BufferedReader((new FileReader(file)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = "";
        try {
            while ((line = in.readLine()) != null) {
                String parts[] = line.split(";-;");
                map.put(parts[0], parts[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(map.toString());
        return line;
    }



//        a = Input.getChar("Enter m for Morse to English or e for English to Morse.");
//        if (a == 'm')
//            translateMorse();
//        else if (a == 'e')
//            translateEnglish();
//        else
//            System.out.println("Your input is not valid.");
}

