public class Book {
    String title;
    String author; 
    double price; 

    public Book(String title, String author, double price){
        this.title = title; 
        this.author = author; 
        this.price = price; 
    }

    public void setTitle(String title){
        this.title = title; 
    }

    public void setAuthor(String author){
        this.author = author; 
    }

    public void setPrice(double price){
        this.price = price; 
    }

    public String getTitle(){
        return this.title; 
    }

    public String getAuthor(){
        return this.author; 
    }

    public double getprice(){
        return this.price; 
    }

    public String toString(){
        return "Title: " + title + "; Author: " + author + "; Price: " + price; 
    }
}
