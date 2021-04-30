public class FizzBuzz {

public static String fizzBuzz(int num) {

  String response = String.valueOf(num);

  if (num % 3 == 0 && num % 5 == 0) {
    response = "FizzBuzz";
  } else if (num % 3 == 0) {
    response = "Fizz";
  } else if (num % 5 == 0) {
    response = "Buzz";
  }

  return response;
}

}
