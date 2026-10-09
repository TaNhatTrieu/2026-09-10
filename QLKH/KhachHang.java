package QLKH;

import java.time.LocalDate;

abstract class KhachHang {
	protected String maKhachHang;
	protected String hoTen;
	protected LocalDate ngayLapHoaDon;
	protected double soKW, donGia;
	public abstract double thanhTien();
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public LocalDate getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}
	public void setNgayLapHoaDon(LocalDate ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	public double getSoKW() {
		return soKW;
	}
	public void setSoKW(double soKW) {
		this.soKW = soKW;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public KhachHang(String ma, String ten, LocalDate ngay, double soKW, double donGia) {
		this.maKhachHang = ma;
		this.hoTen = ten;
		this.ngayLapHoaDon = ngay;
		this.soKW = soKW;
		this.donGia = donGia;
	}
	public KhachHang() {
	}

	@Override
	public String toString() {
		return String.format("%s | %s | Ngay: %s | TT: %,.0.f", maKhachHang, hoTen, ngayLapHoaDon, thanhTien());
	}
	
}
