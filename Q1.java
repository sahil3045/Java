import java.util.Scanner;
public class Q1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int N = sc.nextInt();
int[] arr = new int[N];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < N; i++) {
arr[i] = sc.nextInt();
}
int maxSum = arr[0];
int currentSum = arr[0];
for (int i = 1; i < N; i++) {
currentSum = Math.max(arr[i], currentSum + arr[i]);
maxSum = Math.max(maxSum, currentSum);
}
System.out.println("Maximum contiguous subarray sum is: " + maxSum);
sc.close();
}
}