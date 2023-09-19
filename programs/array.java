import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        // Arrays in java
        System.out.println("enter length of the array :");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number :");
            arr[i]=scan.nextInt();
        }
        System.out.println("================");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
       }
}
}
