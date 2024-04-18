package N20DCVT038_OOP_TH3_02;

public class BoFilm {
	private String tenFilm;
    private int namSanXuat;
    private HangSanXuat hangSanXuat;
    private double giaVe;
    private NgayKhoiChieu ngayKhoiChieu;

    public BoFilm(String tenFilm, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, NgayKhoiChieu ngayKhoiChieu) {
        this.tenFilm = tenFilm;
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayKhoiChieu = ngayKhoiChieu;
    }

    public boolean kiemTraGiaVeRoiReHon(BoFilm boFilm) {
        return this.giaVe < boFilm.giaVe;
    }

    public String layTenHangSanXuat() {
        return hangSanXuat.getTenHang();
    }

    public double tinhGiaVeSauKhiGiam(double phanTramGiam) {
        return giaVe - (giaVe * phanTramGiam / 100);
    }
}
