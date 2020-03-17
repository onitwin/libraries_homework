import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book>collection;

    public Borrower(){
        this.collection=new ArrayList<Book>();
    }
    public int checkCollectionLength(){
        return this.collection.size();
    }
    public void addBook(Book book){
        this.collection.add(book);
    }
    public void borrowBook(Book book,Library library){
        if(library.checkBookAvailable(book)==true){
            this.addBook(book);
            library.removeBook(book);
        }
    }




}
