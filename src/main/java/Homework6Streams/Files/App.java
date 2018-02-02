package Homework6Streams.Files;

import Homework6Streams.Book;

import java.io.IOException;

/**
 * Created by andr_ on 21.03.2017.
 */
public class App {
    public static void main(String[] args) throws IOException {
        Book myBook = new Book();
        myBook.readAndPutFile("C:\\Users\\andr_\\IdeaProjects\\ua.org.oa.a.andrew\\src\\main\\java\\Homework6Streams\\Files\\booksBase.txt", "UTF-8");
        Book myBook1 = new Book("L.N.Tolstoi", "War and piece", 1960);
        myBook.putBookIntoTheFile(myBook1, "UTF-8");


    }
}

