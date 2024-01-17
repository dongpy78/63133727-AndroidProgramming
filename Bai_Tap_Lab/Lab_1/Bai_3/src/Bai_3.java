/*Viết chương trình nhập từ bàn phím cạnh của một khối lập phương. Tính và xuất
thể tích của khối chữ nhật*/

import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Nhập vào cạnh của lập phương: ");
	    double canh = scanner.nextDouble();
	    double the_tich = Math.pow(canh, 3);
	    System.out.printf("Thể tích của hình lập phương là: %.2f", the_tich);
	    scanner.close();
	}

}
