import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookSpec {
    @BeforeEach
    public void befor(){

        System.out.println("setting befor");
        Books books = new Books();
    }

    @Test
    public void booksEmptyOrNot(){
        Books books = new Books();
        List<String> list = books.getBooks();
        assertFalse(list.isEmpty(),()->"Book should be empty");

    }
    @AfterEach
    public void after(){
        System.out.println("after");
    }

}
