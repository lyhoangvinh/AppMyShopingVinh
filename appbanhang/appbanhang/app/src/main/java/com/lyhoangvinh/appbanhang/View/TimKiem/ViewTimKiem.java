package com.lyhoangvinh.appbanhang.View.TimKiem;

import com.lyhoangvinh.appbanhang.Model.ObjectClass.SanPham;

import java.util.List;


public interface ViewTimKiem {
    void TimKiemThanhCong(List<SanPham> sanPhamList);
    void TimKiemThatBai();
}
