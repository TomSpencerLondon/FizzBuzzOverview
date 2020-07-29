package com.codurance;

public class FizzBuzz {

  public String convert(int input) {
    StringBuilder result = new StringBuilder();
    if (input < 1){
      return "0";
    }

    if (isDivisibleBy(input, 3)){
      result.append("Fizz");
    }

    if (isDivisibleBy(input, 5)){
      result.append("Buzz");
    }

    if (result.length() == 0){
      result.append(input);
    }
    return result.toString();
  }

  private boolean isDivisibleBy(int input, int i) {
    return input % i == 0;
  }
}
