package main.java;
public class Book{
  //Fields
  private int id;
  private String title;
  private String author;
  private boolean available;
//Constructors
  public Book(){
    super();
    this.available = true;
  }

  public Book(int id, String title, String author){
    super();
    this.id = id;
    this.title = title;
    this.author = author;
    this.available = true;
  }
//setters
  public void setId(int a){id = a;}
  public void setTitle(String b){title = b;}
  public void setAuthor(String c){author = c;}
  public void setAvailability(boolean d){available = d;}
//getters
  public int getId(){return id;}
  public String getTitle(){return title;}
  public String getAuthor(){return author;}
  public boolean getAvailability(){return available;}


}