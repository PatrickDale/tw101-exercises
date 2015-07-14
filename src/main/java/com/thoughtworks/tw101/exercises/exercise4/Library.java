package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    private boolean Contains(String str, String subStr) {
        return str.toLowerCase().contains(subStr.toLowerCase());
    }

    public String printBooksContaining(String partialBookTitle) {
        for (String book : this.books) {
            if (this.Contains(book, partialBookTitle)) {
                this.printStream.println(book);
            }
        }
        return null;
    }
}
