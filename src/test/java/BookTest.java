import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book rowling;
    private Book pratchett;
    private Book dick;
    private Book king;

    @Before
    public void before(){
        rowling=new Book("Harry Potter and the Chamber of Secrets","JK Rowling","Fantasy" );
        pratchett=new Book("Witches","Terry Pratchett", "Fantasy");
        dick=new Book("Do Androids Dream of Electric Sheep","Philip K Dick","Sci-fi");
        king=new Book("IT","Stephen King","Horror");
    }
    @Test
    public void canGetTitle(){
        assertEquals("IT",king.getTitle());
    }
    @Test
    public void canGetAuthor(){
        assertEquals("Terry Pratchett",pratchett.getAuthor());
    }
    @Test
    public void canGetGenre(){
        assertEquals("Sci-fi",dick.getGenre());
    }


}


