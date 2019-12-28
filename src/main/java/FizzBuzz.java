public class FizzBuzz {
    public static String of(int num) {
        String result = null;
        if (num <= 0) {
            result = null;
        } else if (num % 3 == 0 && num % 5 == 0) {
            result = "FizzBuzz";
        } else if (num % 3 == 0 && num % 5 != 0) {
            result = "Fizz";
        } else if (num % 3 != 0 && num % 5 == 0) {
            result = "Buzz";
        } else {
            result = num + "";
        }
        return result;
    }

    // 3,5,7
    public static String ofThree(int num) {
        String result = null;
        if (num <= 0) {
            result = "Invalid input";
        } else if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0) {
            result = "FizzBuzzWhizz";
        } else if (num % 3 == 0 && num % 5 == 0 && num % 7 != 0) {
            result = "FizzBuzz";
        } else if (num % 3 != 0 && num % 5 == 0) {
            result = "Buzz";
        } else {
            result = num + "";
        }
        return result;
    }
}
