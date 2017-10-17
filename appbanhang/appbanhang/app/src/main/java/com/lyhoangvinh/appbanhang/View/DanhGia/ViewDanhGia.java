package com.lyhoangvinh.appbanhang.View.DanhGia;

import com.lyhoangvinh.appbanhang.Model.ObjectClass.DanhGia;

import java.util.List;


public interface ViewDanhGia {
    void DanhGiaThanhCong();
    void DanhGiaThatBai();
    void HienThiDanhSachDanhGiaTheoSanPham(List<DanhGia> danhGiaList);
}
