import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book rowling;
    private Book pratchett;
    private Book dick;
    private Book king;

    @Before
    public void before(){
        borrower=new Borrower();
        library=new Library(4);
        rowling=new Book("Harry Potter and the Chamber of Secrets","JK Rowling","Fantasy" );
        pratchett=new Book("Witches","Terry Pratchett", "Fantasy");
        dick=new Book("Do Androids Dream of Electric Sheep","Philip K Dick","Sci-fi");
        king=new Book("IT","Stephen King","Horror");
        library.addBook(rowling);
        library.addBook(pratchett);
    }
    @Test
    public void takeBook(){
        assertEquals(1,borrower.checkCollectionLength());
    }
    @Test
    public void checkForBook(){
        borrower.borrowBook(pratchett,library);
        assertEquals(1,borrower.checkCollectionLength());
    }


}
