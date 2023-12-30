public class Break2 {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.println("Счётчик циклаЖ " + i);
      System.out.print("  счётчик внутреннего цикла: ");
      int t = 0;
      while (t < 100) {
        if (t == 10) {
          break;
        }
        System.out.println(t + " ");
        t++;
      }
    }
  }
}
