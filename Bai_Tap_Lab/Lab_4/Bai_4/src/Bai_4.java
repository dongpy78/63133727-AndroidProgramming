
public class Bai_4 {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham("Banh Kem", 50000, 100);
	    SanPham sp2 = new SanPham("Banh My" , 10000);
	    sp1.SetTenSP("Ao So Mi");
	    sp2.SetTenSP("Giay Nike");
	    sp1.xuat();
	    sp2.xuat();

	}

}
