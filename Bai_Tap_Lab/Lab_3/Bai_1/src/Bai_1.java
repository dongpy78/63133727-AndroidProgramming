/* Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải là số
nguyên tố hay không (số nguyên tố là số chỉ chia hết cho 1 và chính nó).
 */
import java.util.Scanner;

public class Bai_1 {
  public static boolean kt_nt(int n) {
    for(int i = 2; i <= Math.sqrt(n); i++) 
      if(n % i == 0) return false;
    return n > 1;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào một số nguyên: ");
    int n = scanner.nextInt();
    if(kt_nt(n)) System.out.printf("%d là số nguyên tố", n);
    else System.out.printf("%d không phải là số nguyên tố", n);
    scanner.close();
  }
}
