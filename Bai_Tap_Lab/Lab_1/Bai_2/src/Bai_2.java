/*Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật. Tính và xuất chu vi,
diện tích và cạnh nhỏ của hình chữ nhật.*/

import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào chiều dài của hình chữ nhật: ");
		double chieu_dai = scanner.nextDouble();
		System.out.print("Nhập vào chiều rộng của hình chữ nhật: ");
		double chieu_rong = scanner.nextDouble();
		System.out.printf("Chu vi của hình chữ nhật là: %.2f", (chieu_dai+chieu_rong)*2);

		// cạnh nhỏ nhất của hình chữ nhật là: 
		double min = chieu_dai < chieu_rong ? chieu_dai : chieu_rong;
		System.out.printf("\nCạnh nhỏ của hình chữ nhật là: %.0f", min);
	    scanner.close();

	}

}
