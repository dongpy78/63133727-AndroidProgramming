/*
Viết chương trình nhập mảng số nguyên từ bàn phím.
✓ Sắp xếp và xuất mảng vừa nhập ra màn hình.
✓ Xuất phần tử có giá trị nhỏ nhất ra màn hình
✓ Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3
 */

import java.util.Arrays;
import java.util.Scanner;

public class Bai_3 {
  public static void tim_min(int[] a) {
    int min = a[0];
    for(int i = 1; i < a.length; i++) 
      min = Math.min(min, a[i]);
    System.out.printf("\nPhần tử nhỏ nhất trong mảng là: " + min);
  }

  public static void trung_binh_cong(int[] a) {
    int sum = 0, count = 0;
    for(int i : a) {
      if(i % 3 == 0) {
        sum += i; count++;
      }   
    }
    System.out.printf("\nTrung bình cộng chia hết cho 3 là: " + (double)sum/count);          
  }

   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào số phần tử mảng: ");
    int n = scanner.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) a[i] = scanner.nextInt();

    Arrays.sort(a);
    System.out.print("Mảng sau khi sắp xếp: ");
    for(int i : a) System.out.printf("%d" + " ", i);
    tim_min(a);
    trung_binh_cong(a);
    scanner.close();
  }
}
