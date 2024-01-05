// package Chapter 3;

public class KbIn {
  public static void main (String[] args)
    throws java.io.IOException {
      char ch;
      System.out.println("Press key and Enter: ");
      ch = (char) System.in.read();
      System.out.println("Pressed key is: " + ch);
    }
}
