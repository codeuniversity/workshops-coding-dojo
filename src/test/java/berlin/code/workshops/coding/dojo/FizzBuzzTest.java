package berlin.code.workshops.coding.dojo;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void itReturnsOneWhenOneIsGiven() {
        String result = fizzBuzz.print(1);
        assertThat(result, equalTo("1"));
    }

    @Test
    public void itReturnsTwoWhenTwoIsGiven() {
        String result = fizzBuzz.print(2);

        assertThat(result, equalTo("2"));
    }

    @Test
    public void itReturnsFizzWhenThreeIsGiven() {
        String result = fizzBuzz.print(3);
        assertThat(result, equalTo("Fizz"));
    }

    @Test
    public void itReturnsBuzzWhenFiveIsGiven() {
        String result = fizzBuzz.print(5);
        assertThat(result, equalTo("Buzz"));
    }
    @Test
    public void itReturnsFizzBuzzWhenTheNumberIsDivisibleByThreeAndFive() {
        String result = fizzBuzz.print(15);
        assertThat(result, equalTo("FizzBuzz"));
    }

    private String[] expectedResults = new String[] {
        "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"
    };

    @Test
    public void loopThatCountsTillHundred() {
        String result;
        String expectedValue;

        for (int count = 0; count < 15; ++count) {
            result = fizzBuzz.print(count + 1);
            expectedValue = expectedResults[count];
            assertThat(result, equalTo(expectedValue));
        }
    }
}
