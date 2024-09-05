import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Additionspec {
    @BeforeEach
    public void testBefor(){
        System.out.println("before");
    }

    @Test
    public void testAddition(){
        int result =AdditionDemo.Addition(3,4);
        assertEquals(7,result);
    }
    @Test
    public void testsub(){
        int result1 = AdditionDemo.substraction(4,2);
        assertEquals(2,result1);
    }
    @Test
    public void testMulty(){
        int r3=AdditionDemo.Multiplication(4,5);
        assertEquals(20,r3,"success");
    }

    @AfterEach
    public void testAfter(){
        System.out.println("after");
    }

}
