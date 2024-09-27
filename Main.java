package main.java;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    Library CS349 = new Library();
    CS349 = enterBooks();
    CS349.displayBooks();

    removeBooks(CS349);
    CS349.displayBooks();

  }

      /**
       * Method enterBooks to accept books
       */
  private static Library enterBooks(){
    //Create instance of new Library class
    Library myLibrary = new Library();
    String yesNo;
      int count = 1;

      do {
        //Accept book details
        String title = JOptionPane.showInputDialog("Enter title for book "+ count);
        String author = JOptionPane.showInputDialog("Enter author(s) for book "+ count);

        //Create an object Book
        Book myBook = new Book();
        myBook.setId(count);
        myBook.setTitle(title);
        myBook.setAuthor(author);

        //Add library book
        myLibrary.addBook(myBook);

        yesNo = JOptionPane.showInputDialog("Enter another book?" + 
                                            "(Enter Y if so, or any other key to Exit): ");
        count++;
        }
      while(yesNo.toLowerCase().equals("y"));
    return myLibrary;
  }

      /**
       * a method to remove books
       */
  private static void removeBooks(Library myLibrary){

    String yesNo;
    do {
      String bookID = JOptionPane.showInputDialog("Enter book ID you wish to remove: ");

      Book bookToRemove = null;
      for (Book book: myLibrary.getBooks()){ //Loop through all books
        if(book.getId() == Integer.parseInt(bookID)){ //Check for matching IDs
          bookToRemove = book; //Set bookToRemove to the book selected
          break;
        }
      }
        //if-else to catch if the book to remove does not exist
      if(bookToRemove != null){
        myLibrary.removeBook(bookToRemove); //remove the book from library
      }
      else{
        JOptionPane.showMessageDialog(null, "The book was not found");
      }
      yesNo = JOptionPane.showInputDialog("Do you wish to remove another book?\n(Enter y for yes or any other key to quit): ");
      }
      while(yesNo.toLowerCase().equals("y"));
    }
}