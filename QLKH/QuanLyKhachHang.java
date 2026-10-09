package QLKH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class QuanLyKhachHang implements IQuanLyKhachHang<KhachHang> {
	List<KhachHang> ls = new ArrayList<>();
	public QuanLyKhachHang() {
		ls = new ArrayList<KhachHang>(2);
	}
	@Override
	public boolean themKH(KhachHang kh) {
		if (ls.contains(kh)) {
			return false;
		} else {
			return ls.add(kh);
		}
		
	}

	@Override
	public boolean capNhat(String ma, double gia) {
		for (KhachHang kh : ls) {
			if (kh.getMaKhachHang().equalsIgnoreCase(ma)) {
				kh.setDonGia(gia);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean xoaMa(String ma) {
	for (KhachHang kh : ls) {
		if (kh.getMaKhachHang().equalsIgnoreCase(ma)) {
			ls.remove(kh);
			return true;
		}
	}
		return false;
	}

	@Override
	public void sapXep() {
		Collections.sort(ls, new Comparator<KhachHang>() {

			@Override
			public int compare(KhachHang o1, KhachHang o2) {
				String x = new String(o1.getMaKhachHang());
				String y = new String(o2.getMaKhachHang());
				return x.compareToIgnoreCase(y);
			}
		});
	}
	@Override
	public List<KhachHang> timKiemTheoTen(String ten) {
		
		return null;
	}
	@Override
	public List<KhachHang> timKiemTheoMa(String ma) {
		
		return null;
	}
	@Override
	public List<KhachHang> sapXepTheoLuong() {
		
		return null;
	}
	@Override
	public List<KhachHang> sapXepTheoTen() {
		
		return null;
	}
	@Override
	public Map<String, Double> thongKeLuongTheoLoai() {
		
		return null;
	}
	@Override
	public Map<String, List<KhachHang>> groupByLoai() {
		
		return null;
	}
	@Override
	public Map<String, List<KhachHang>> groupByPhongBan() {
		
		return null;
	}

}
