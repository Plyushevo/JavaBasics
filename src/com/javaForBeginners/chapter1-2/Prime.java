public class Prime {
  public static void main(String[] args) {
    int i, j;
    boolean isPrime;
    for (i = 2; i < 100; i++) {
      isPrime = true;
      for (j = 2; j <= 95; j++) {
          if (i % j == 0) {
              isPrime = false;
              break;
          }
      }
      if (isPrime) {
          System.out.println(i + " - prime number");
      }
  }
  

  }
}

