package com.lyhoangvinh.appbanhang.View.ThanhToan;

import com.lyhoangvinh.appbanhang.Model.ObjectClass.SanPham;

import java.util.List;


public interface ViewThanhToan {
    void DatHangThanhCong();
    void DatHangThatBai();
    void LayDanhSachSanPhamTrongGioHang(List<SanPham> sanPhamList);
}
