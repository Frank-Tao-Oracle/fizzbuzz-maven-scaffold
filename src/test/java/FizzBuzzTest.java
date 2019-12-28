import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTest {


    @Test
    public void test(){
        //given
        int num = 3;
        //when
        String result = FizzBuzz.of(num);
        //then
        assertEquals(result, "Buzz");
    }
}