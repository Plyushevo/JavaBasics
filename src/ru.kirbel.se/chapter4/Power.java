public class Power {
  public static void main(String[] args) {
    int i, e, result;
      for (i = 0; i< 10; i++) {
        e = i;
        result = 1;
        while (e > 0) {
          result *= 2;
          e--;
        }
        System.out.println(result);
      }
  }
}
