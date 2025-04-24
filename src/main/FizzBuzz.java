package main;

public class FizzBuzz {
    public static String getResult(int number) {
        if (number == 0) {
            return "FizzBuzz"; // 0 est divisible à la fois par 3 et par 5
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }
}
