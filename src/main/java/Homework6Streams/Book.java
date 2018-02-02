package Homework6Streams;

import java.io.*;


public class Book implements Serializable {
    private String title;
    private String author;
    private int year;
    private static final long serialVersionId = 1l;

    public Book(String autor, String title, int year) {
        this.author = autor;
        this.title = title;
        this.year = year;
    }

    public Book() {

    }

    public String readAndPutFile(String file, String charSet) {
        BufferedReader in = null;
        try {
            in = new BufferedReader((new InputStreamReader(new FileInputStream(file), charSet)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String line = "";
        try {
            while ((line = in.readLine()) != null) {
                String parts[] = line.split(";");
                Book myBook = new Book(parts[0], parts[1], Integer.parseInt(parts[2]));
                System.out.println(myBook.toString() + "\n");
            }

        } catch (IOException ee) {
            ee.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException ee) {
            ee.printStackTrace();
        }
        return line;
    }


    public void putBookIntoTheFile(Book myBook1, String charSet) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream((new FileOutputStream("C:\\Users\\andr_\\IdeaProjects\\ua.org.oa.a.andrew\\src\\main\\java\\Homework6Streams\\Files\\booksCase.txt")))) {
            oos.writeObject(myBook1);
        } catch (IOException e) {
            System.err.println(e);
        }
        try (ObjectInputStream ois = new ObjectInputStream((new FileInputStream("C:\\Users\\andr_\\IdeaProjects\\ua.org.oa.a.andrew\\src\\main\\java\\Homework6Streams\\Files\\booksCase.txt")))) {
            Book unknown = (Book) ois.readObject();
            System.out.println(unknown);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    @Override
    public String toString() {
        return "author= " + author + " title= " + title + " year= " + year;
    }
}
