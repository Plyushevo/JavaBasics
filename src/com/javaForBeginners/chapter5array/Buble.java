package src.com.javaForBeginners.chapter5array;

public class Buble {
  public static void main(String[] args) {
    int[] nums = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
    int t;
    System.out.print("Исходный массив: ");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(" " + nums[i]);
    }
    System.out.println();

    for (int a = 1; a < nums.length; a++) {
      for (int b = nums.length - 1; b >= a; b--) {
        if (nums[b-1] > nums[b]) {
          t = nums[b-1];
          nums[b-1] = nums[b];
          nums[b] = t; 
        }
      }
    }
    System.out.print("Сортированный массив:");
    for (int i = 0; i < nums.length; i++) {
        System.out.print(" " + nums[i]);
    }
    System.out.println();
  }
}
