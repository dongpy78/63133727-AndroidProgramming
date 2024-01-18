import java.util.Scanner;

public class Bai_4 {
  public static String xd_hoc_luc(double diem) {
    if(diem < 5) return "Yếu!";
    else if(diem < 6.5) return "Trung bình!";
    else if(diem < 7.5) return "Khá";
    else if(diem < 9) return "Giỏi";
    else return "Xuất sắc";
  }

  public static void sx_theo_diem(String[] hoTen, double[] diem, String[] hocLuc) {
    for(int i = 0; i < diem.length-1; i++) {
      for(int j = i+1; j < diem.length; j++) {
        if(diem[i] > diem[j]) {
          String tam_ho_ten = hoTen[i];
          hoTen[i] = hoTen[j];
          hoTen[j] = tam_ho_ten;

          double tam_diem = diem[i];
          diem[i] = diem[j];
          diem[j] = tam_diem;

          String tam_hoc_luc = hocLuc[i];
          hocLuc[i] = hocLuc[j];
          hocLuc[j] = tam_hoc_luc;
        }
      }
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào số lượng sinh viên: ");
    int n = scanner.nextInt();

    // Tạo mảng họ tên, điểm và học lực
    String[] hoTen = new String[n];
    double[] diem = new double[n];
    String[] hocLuc = new String[n];

    // Nhập thông tin sinh viên
    scanner.nextLine();
    for(int i = 0; i < n; i++) {
      System.out.print("Nhập vào thông tin sinh viên thứ " + (i+1) + ": " );
      hoTen[i] = scanner.nextLine();
      System.out.print("Nhập vào điểm của sinh viên thứ " + (i+1) + ": ");
      diem[i] = scanner.nextDouble();
      // học lực 
      hocLuc[i] = xd_hoc_luc(diem[i]);
      scanner.nextLine();
    }

    sx_theo_diem(hoTen, diem, hocLuc);
    // Sắp xếp theo điểm
    System.out.print("Danh sách sinh viên sau khi sắp xếp là: ");
    for(int i = 0; i < n; i++) {
      System.out.println("Sinh viên thứ " + (i+1) + ":");
      System.out.println("Họ tên: " + hoTen[i]);
      System.out.println("Điểm: " + diem[i]);
      System.out.println("Học lực: " + hocLuc[i]);
    }
    scanner.close();
  }
}
