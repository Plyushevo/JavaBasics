public class CountSymbols {
  public static void main(String[] args) 
   throws java.io.IOException {
    char userInput, ignore;
    int spaceCounter = 0;
    System.out.println("Enter a symbol (press . to end): ");
    do {
      userInput = (char) System.in.read();
      // do {
      //   ignore = (char) System.in.read();
      // } while (ignore != '\n');
      if (userInput == ' ') spaceCounter++;
    } while (userInput != '.');
    System.out.println("Spaces count is: "+ spaceCounter);
   }
}
