package src.com.javaForBeginners.chapter5array;

public class TwoDimencialArray {
  public static void main(String[] args) {
    
    int[][] table = new int[3][4];
    for (int i = 0; i < table.length; i++) {
      for (int j = 0; j < 4; j++) {
        table[i][j] = (i*4) + j + 1;
        System.out.print(table[i][j] + " ");
      }
      System.out.println();
    }
  }
}
