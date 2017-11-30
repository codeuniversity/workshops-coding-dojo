package berlin.code.workshops.coding.dojo;

public class FizzBuzz {

    public String print(int number) {
        String result;

        if (number % 5 == 0 && number % 3 == 0) {
            result = "FizzBuzz";
        }
        else if (number % 3 == 0) {
            result = "Fizz";
        }
        else if (number % 5 == 0) {
            result = "Buzz";
        }
        else {
            result = Integer.toString(number);
        }

        return result;
    }
}
