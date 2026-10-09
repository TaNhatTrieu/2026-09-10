package QLKH;

import java.util.List;
import java.util.Map;

public interface IQuanLyKhachHang<T>{
	boolean themKH(KhachHang kh);
	boolean capNhat(String ma, double gia);
	boolean xoaMa(String ma);
	void sapXep();
	List<T> timKiemTheoTen(String ten);
	List<T> timKiemTheoMa(String ma);
	List<T> sapXepTheoLuong();
	List<T> sapXepTheoTen();
	Map<String, Double> thongKeLuongTheoLoai();
	Map<String, List<T>> groupByLoai();
	Map<String, List<T>> groupByPhongBan();
}