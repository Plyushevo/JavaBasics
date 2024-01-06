package src.com.javaForBeginners.chapter5array;

public class SummTable {
  public static void main(String[] args) {
    
  int start = 147;
  int end = 250;
  int k = end - start;
  int[][] table = new int[k][k];
  int i, j;
  for (i = 0; i < k; ++i) {
    for (j = 0; j < k; ++j) {


      table[i][j] = table[0][j] + table[i][0];
            table[0][j] = j+start;
      table[i][0] = i+start;
      if (table[i][j] < 10) {
        System.out.print("  "+table[i][j] + " ");
      } else if (table[i][j] >= 10 && table[i][j] < 100) {
        System.out.print(" "+ table[i][j] + " ");
      } else
      System.out.print(table[i][j] + " ");
    }
    System.out.println();
  }
}
}