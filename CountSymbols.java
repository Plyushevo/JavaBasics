public class CountSymbols {
  public static void main(String[] args) 
   throws java.io.IOException {
    char userInput;
    int spaceCounter = 0;
    System.out.println("Enter a symbol (press . to end): ");
    do {
      userInput = (char) System.in.read();
      if (userInput == ' ') spaceCounter++;
    } while (userInput != '.');
    System.out.println("Spaces count is: "+ spaceCounter);
   }
}
