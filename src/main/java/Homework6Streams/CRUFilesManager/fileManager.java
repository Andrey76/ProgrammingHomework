package Homework6Streams.CRUFilesManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by andr_ on 07.04.2017.
 */
public class fileManager {
    String s1;
    String s2;
    File f1 = new File(s1 + "\\f1");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void workWithFile() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            File f1 = new File(s1 + "\\f1");
            System.out.println("Choose the destinaton of files directory");
            s1 = br.readLine();
            System.out.println("Input the command: \n case 1 - Create file \n case 2 - Delete file \n " +
                    "case 3 - Rename file \n case 4 - Show files in directory \n case 5 - Exit");
            s2 = br.readLine();
            switch (s2) {
                case "1":
                    CreateFile();
                    break;
                case "2":
                    if (f1.exists()) {
                        f1.delete();
                        System.out.println("File " + f1.getName() + " are deleted");
                    } else {
                        System.out.println("There is now such file in this directory");
                    }
                    break;
                case "3":
                    if (f1.exists()) {
                        String fileName;
                        System.out.println("Input the new file name");
                        fileName = br.readLine();
                        File f4 = new File(s1 + "\\" + fileName);
                        f1.renameTo(f4);
                        break;
                    }
                case "4":
                    File f5 = new File(s1);
                    if (f5.isDirectory()) {
                        String[] files = f5.list();
                        for (String s : files) {
                            System.out.println(s.trim());
                        }
                    }
                case "5":
                    return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        workWithFile();
    }
    public void CreateFile() throws IOException {
        String filename;
        System.out.println("Choose the fileName");
        filename = br.readLine();
        File f2 = new File(s1 + "\\" + filename);
        f1.createNewFile();
        f1.renameTo(f2);
        System.out.println("File" + " " + f1.getName() + " is successfully created");
    }
}

