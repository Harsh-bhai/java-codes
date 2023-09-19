// Nested arrays in java
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no. of rows :");
      int n=sc.nextInt();
      System.out.println("Enter no. of cols :");
      int m=sc.nextInt();
      int arr[][]=new int[n][m];
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
        System.out.printf("enter [%d][%d] element :",i,j);
        arr[i][j]=sc.nextInt();
        }
      }System.out.println("============================");
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
        System.out.printf("%d ",arr[i][j]);
    }
    System.out.println();
      }
    }
}
