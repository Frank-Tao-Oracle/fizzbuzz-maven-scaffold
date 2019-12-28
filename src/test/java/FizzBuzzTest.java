import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
    private int num;
    private String shouldBe;

    public FizzBuzzTest(int num, String shouldBe) {
        this.num = num;
        this.shouldBe = shouldBe;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "1"},
                {3, "Fizz"},
                {5, "Buzz"},
                {15, "FizzBuzz"},
                {-1, null}
        });
    }



    @Test
    public void test(){
        assertEquals(shouldBe, FizzBuzz.of(num));
    }
}