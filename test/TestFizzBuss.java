import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFizzBuss {

  @Test
  public void testFizz() {
    String expected = "Fizz";
    String actual = FizzBuzz.fizzBuzz(9);

    assertEquals(expected, actual, "Numbers divisible by 3 should return Fizz");
  }

  @Test
  public void testBuzz() {
    String expected = "Buzz";
    String actual = FizzBuzz.fizzBuzz(10);

    assertEquals(expected, actual, "Numbers divisible by 5 should return Buzz");
  }

  @Test
  public void testFizzBuzz() {
    String expected = "FizzBuzz";
    String actual = FizzBuzz.fizzBuzz(15);

    assertEquals(expected, actual, "Numbers divisible by both 3 and 5 should return FizzBuzz");
  }

  @Test
  public void testNoFizzOrBuzz() {
    String expected = "7";
    String actual = FizzBuzz.fizzBuzz(7);

    assertEquals(expected, actual, "Numbers not divisible by 3 or 5 should return the number as a String");
  }

}
