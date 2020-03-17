import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;
    private int capacity;

    public Library(int capacity){
        this.library=new ArrayList<Book>();
        this.capacity=capacity;
    }
    public int collectionLength(){
        return this.library.size();
    }
    public void addBook(Book book){
        if(this.capacity >this.library.size()) {
            this.library.add(book);
        }
    }
    public boolean checkBookAvailable(Book book){
        return this.library.contains(book);
    }
    public Book getBookAtIndex(int index){
        return this.library.get(index);
    }
    public void removeBook(Book book){
        Book indexedBook=null;
        for (int i=0; i < this.library.size();i++){
            indexedBook=library.getBookAtIndex(i);
            if (indexedBook == book){
                this.library.remove(i);
            }
        }
    }

}
