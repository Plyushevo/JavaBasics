public class AsciiRegister {
  public static void main(String[] args) 
    throws java.io.IOException {
      System.out.println("Enter a symbol in different registers (for exit press .): ");
      char userInput;
      int regCount = 0;
      do {
        userInput= (char) System.in.read();
        if (userInput >= 'a' & userInput <= 'z') {
          userInput -= 32;
          regCount++;
          System.out.println("oposide symbol is: "+ userInput);
        } else if (userInput > 'A' & userInput < 'Z') {
          userInput += 32;
          regCount++;
          System.out.println("oposide symbol is: "+ userInput);
        } else if (userInput == ' '){
          System.out.println("you entered: space");
        } else {
          System.out.println("you entered: " + userInput);
        }

      } while (userInput != '.');
      System.out.println("number of cahnges is: "+ regCount);
    } 
}
