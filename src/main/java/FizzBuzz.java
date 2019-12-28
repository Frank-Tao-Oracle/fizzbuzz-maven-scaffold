public class FizzBuzz {
    public static String of(int num) {
        if (num <= 0){
            return null;
        } else if (num % 3 ==0 && num % 5 == 0){
            return "FizzBuzz";
        } else if (num % 3 == 0 && num % 5 != 0){
            return "Fizz";
        } else if (num % 3 != 0 && num % 5 == 0){
            return "Buzz";
        } else {
            return num + "";
        }
    }
}
