import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SinhVien {
  public String hoTen;
  public String email;
  public String sodienThoai;
  public String cmnd;

  public boolean kt_email(String email) {
    String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
  }

  public boolean kt_sdt(String sodienThoai) {
    String regex = "^\\d{10}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(sodienThoai);
    return matcher.matches();
  }

  public boolean kt_cmnd(String cmnd) {
    String regex = "^\\d{9}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(cmnd);
    return matcher.matches();
  }

  void nhap() {
    Scanner scanner = new Scanner(System.in);

    // Nhập họ tên
    System.out.print("Nhập vào họ tên: ");
    hoTen = scanner.nextLine();

    // Nhập email và kiểm tra định dạng
    while (true) {
        System.out.print("Nhập email: ");
        email = scanner.nextLine();
        if (kt_email(email)) {
            break;
        }
    }

    // Nhập số điện thoại và kiểm tra định dạng
    while (true) {
        System.out.print("Nhập vào số điện thoại: ");
        sodienThoai = scanner.nextLine();
        if (kt_sdt(sodienThoai)) {
            break;
        }
    }

    // Nhập CMND và kiểm tra định dạng
    while (true) {
        System.out.print("Nhập vào số chứng minh nhân dân: ");
        cmnd = scanner.nextLine();
        if (kt_cmnd(cmnd)) {
            break;
        }
    }
}

  public void xuat() {
    System.out.print(" | " + "Họ tên: " + hoTen + " | " + "Email: " + email + " | " + "Số điện thoại: " + sodienThoai + " | " + "CMND: " + cmnd + "|");
  }

}
