package com.lyhoangvinh.appbanhang.View.ChiTietSanPham;

import com.lyhoangvinh.appbanhang.Model.ObjectClass.DanhGia;
import com.lyhoangvinh.appbanhang.Model.ObjectClass.SanPham;

import java.util.List;


public interface ViewChiTietSanPham {
    void HienChiTietSanPham(SanPham sanPham);
    void HienSliderSanPham(String[] linkhinhsanpham);
    void HienThiDanhGia(List<DanhGia> danhGiaList);
    void ThemGioHangThanhCong();
    void ThemGiohangThatBai();
}
