import java.util.Scanner;
public class Bai_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    // Nhap ho ten sinh vien 
	    System.out.print("Nhập vào họ tên sinh viên: ");
	    String hoTen = scanner.nextLine();

	    // Nhap diem trung binh
	    System.out.print("Nhập điểm trung bình: ");
	    double diem_tb = scanner.nextDouble();

	    // Xuat thong tin sinh vien ra man hinh 
	    System.out.printf("Tên sinh viên: %s - Điểm trung bình: %2f", hoTen, diem_tb);
	    scanner.close();

	}

}
