package in.vamsoft.jdk8;

import java.util.Arrays;
import java.util.List;


class Books
{
  int bookId;
  String name;
  String author;
  double price;
  public int getBookId() {
    return bookId;
  }
  public void setBookId(int bookId) {
    this.bookId = bookId;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public Books(int bookId, String name, String author, double price) {
    super();
    this.bookId = bookId;
    this.name = name;
    this.author = author;
    this.price = price;
  }
  @Override
  public String toString() {
    return "Books [bookId=" + bookId + ", name=" + name + ", author=" + author + ", price=" + price + "]";
  }
  
}

public class LabdaStart {
  public static void main(String[] args) {
    
  

  Books b1=new Books(1, "Origin", "Dan Brown", 10000.00);
  Books b2=new Books(2, "Two States", "Chetan Bhagat", 20000.00);
  Books b3=new Books(3, "Daddy", "Chetan Bhagat", 30000.00);
  Books b4=new Books(4, "Ponniyin Selvan", "Kalki", 40000.00);
  
  List<Books> books=Arrays.asList(b1,b2,b3,b4);
  
  books.stream().filter(b -> b.getPrice() > 300).forEach(b -> System.out.println(b));
  
 /* Collections.sort(books,(Books ob1,Books ob2) -> {
    return ob1.getAuthor().compareTo(ob2.getAuthor()); });
  System.out.println(books);*/
  
  books.stream().map(b ->(b.getName()).toUpperCase()).forEach(t -> System.out.println(t));
}
}