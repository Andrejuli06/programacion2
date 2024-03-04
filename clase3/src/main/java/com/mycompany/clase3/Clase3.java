package com.mycompany.clase3;

import books.Book;

public class Clase3 {

    public static void main(String[] args) {
    Book book1= new Book("Harry Potter","fantasia", 5, 25);
    Book book2= new Book("el hombre del viento", "aventura", 7, 28);
    Book book3=new Book("boulevard", "romance", 8,26);
    //presto el libro
    book1.LendBook();
        System.out.println( book1.isAvailable());
        System.out.println( book2.isAvailable());
    }
}