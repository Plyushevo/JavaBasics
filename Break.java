public class Break {
  public static void main(String[] args) 
    throws java.io.IOException {
    char choice;
    for(;;) {
      choice = (char) System.in.read();
      if (choice == 'q') break;
    }
    

  }
}
