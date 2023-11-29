package taskguide;

public class Task1110 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming","John Smith",2021,39.99);
        // Book book2 = new Book();
        // Book book3 = new Book();
        
        System.out.println(book1);
    }
    
}

class Book{
    String title;
    String author;
    int yearPublished;
    double price;
    public Book(){

    }
    public Book(String title,String author,int yearPublished,double price){
        this.title= title;
        this.author= author;
        this.yearPublished= yearPublished;
        this.price= price;

        
    }
    public String toString(){
            return "Book:\n"+
            "title: "+title+"\n"+
            "author: "+author+"\n"+
            "yearPublished: "+yearPublished+"\n"+
            "price: $"+price+"\n";
        }
}