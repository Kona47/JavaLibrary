package main.java;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Library{

  //fields
  private ArrayList<Book> bookList;

  //constructors
  public Library() {
    // create an empty book list
    this.bookList = new ArrayList<Book>();
  }

  //method to return the book list
  public ArrayList<Book> getBooks(){
    return bookList;
  }

  //method to set the book list
  public void setBooks(ArrayList<Book> books){
    this.bookList = books;
  }

  /**
  *method to add books to list
  */
  public void addBook(Book book){
    //bookList.add(book);
    getBooks().add(book);
  }

  /*
   * Method to remove a book from library
  */
  public void removeBook(Book book){
    if(getBooks().contains(book)){
      getBooks().remove(book);
      JOptionPane.showMessageDialog(null, book.getTitle() + " is successfully checked out");
    }
    else
      JOptionPane.showMessageDialog(null, book.getTitle() + " is not available");
  }

  /*
  * Method to display all books in library
  */
  public void displayBooks(){
    StringBuilder allBooks = new StringBuilder("Available book(s):\n");

    for(Book book: getBooks()/*dont use bookList*/){
      if(book.getAvailability()){ //Check if book is available
        allBooks.append(book.getTitle()).append("\n"); //Append book to the string
      }
    }
    JOptionPane.showMessageDialog(null, allBooks); //display all available books
  }

}