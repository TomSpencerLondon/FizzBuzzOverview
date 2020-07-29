package com.codurance;

public class FizzBuzz {

  public String convert(int input) {
    if (input < 1){
      return "0";
    }

    if (isDivisibleBy(input, 15)){
      return "FizzBuzz";
    }else if (isDivisibleBy(input, 5)){
      return "Buzz";
    }else if (isDivisibleBy(input, 3)) {
      return "Fizz";
    }

    return String.valueOf(input);
  }

  private boolean isDivisibleBy(int input, int i) {
    return input % i == 0;
  }
}
