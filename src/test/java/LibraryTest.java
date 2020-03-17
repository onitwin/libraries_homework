import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book rowling;
    private Book pratchett;
    private Book dick;
    private Book king;

    @Before
    public void before(){
            library=new Library(4);
            rowling=new Book("Harry Potter and the Chamber of Secrets","JK Rowling","Fantasy" );
            pratchett=new Book("Witches","Terry Pratchett", "Fantasy");
            dick=new Book("Do Androids Dream of Electric Sheep","Philip K Dick","Sci-fi");
            king=new Book("IT","Stephen King","Horror");

    }
    @Test
    public void checkLength(){
        assertEquals(0,library.collectionLength());
    }
    @Test
    public void canAddBook(){
        library.addBook(rowling);
        assertEquals(1,library.collectionLength());
    }
    @Test
    public void capacityReached(){
        library.addBook(rowling);//book1
        library.addBook(rowling);//book2
        library.addBook(rowling);//book3
        library.addBook(rowling);//book4
        library.addBook(rowling);//book5
        assertEquals(4,library.collectionLength());
    }
    @Test
    public void checkBookPresent(){
        library.addBook(rowling);
        assertEquals(true,library.checkBookAvailable(rowling));
    }
    @Test
    public void checkBookIndex(){
        library.addBook(rowling);//book1
        library.addBook(pratchett);//book2
        library.addBook(king);//book3
        library.addBook(dick);//book4
        assertEquals(dick,library.getBookAtIndex(3));
    }


}
