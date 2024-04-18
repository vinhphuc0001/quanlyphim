package N20DCVT038_OOP_TH3_02;

public class main {

	public static void main(String[] args) {
		 HangSanXuat hangSanXuat3 = new HangSanXuat("Hãng phim MAi", "Việt Nam");
	        HangSanXuat hangSanXuat4 = new HangSanXuat("Quỷ cẩu", "Việt Nam");

	        NgayKhoiChieu ngayKhoiChieu1 = new NgayKhoiChieu(15, 3, 2024);
	        NgayKhoiChieu ngayKhoiChieu2 = new NgayKhoiChieu(20, 5, 2024);

	        BoFilm boFilm3 = new BoFilm("Phim MAi", 2024, hangSanXuat3, 100000, ngayKhoiChieu1);
	        BoFilm boFilm4 = new BoFilm("Phim Quỷ cẩu", 2024, hangSanXuat4, 50000, ngayKhoiChieu2);

	        System.out.println("Tên hãng sản xuất của " + boFilm3.layTenHangSanXuat() + " là: " + (hangSanXuat3.getQuocGia().equals("Việt Nam") ? hangSanXuat3.getTenHang() : hangSanXuat3.getQuocGia()));
	        System.out.println("Tên hãng sản xuất của " + boFilm4.layTenHangSanXuat() + " là: " + (hangSanXuat4.getQuocGia().equals("Việt Nam") ? hangSanXuat4.getTenHang() : hangSanXuat4.getQuocGia()));

	        double phanTramGiam = 10.0; // Giả sử giảm giá 10%
	        System.out.println("Giá vé của " + boFilm3.layTenHangSanXuat() + " sau khi giảm giá " + phanTramGiam + "% là: " + boFilm3.tinhGiaVeSauKhiGiam(phanTramGiam) + "VND");
	        System.out.println("Giá vé của " + boFilm4.layTenHangSanXuat() + " sau khi giảm giá " + phanTramGiam + "% là: " + boFilm4.tinhGiaVeSauKhiGiam(phanTramGiam) + "VND");

	        if (boFilm3.kiemTraGiaVeRoiReHon(boFilm4)) {
	            System.out.println("Giá vé của " + boFilm3.layTenHangSanXuat() + " rẻ hơn giá vé của " + boFilm4.layTenHangSanXuat());
	        } else {
	            System.out.println("Giá vé của " + boFilm4.layTenHangSanXuat() + " rẻ hơn giá vé của " + boFilm3.layTenHangSanXuat());
	        }
	}

}
