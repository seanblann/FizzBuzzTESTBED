class FizzBuzzTester {

  public static void main(String[] args) {

    int counter, fizz = 3, buzz = 5;

    counter = 1;
    for (counter = 1; counter <= 50; counter++) {

      if (counter % fizz + counter%buzz == 0) {
        System.out.println("fizzbuzz");
      } else if (counter%fizz == 0) {
        System.out.println("fizz");
      } else if (counter % buzz == 0) {
        System.out.println("buzz");
      } else {
        System.out.println(counter);
      }

    }
  }
}

