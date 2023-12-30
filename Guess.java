public class Guess {
  public static void main (String[] args)
    throws java.io.IOException {
      char ch, answer = 'K';
      System.out.println("Letter between A-Z. ");
      System.out.println("Try to guess it");
      ch = (char) System.in.read();
      if(ch == answer) System.err.println("You win!");
    }
}
