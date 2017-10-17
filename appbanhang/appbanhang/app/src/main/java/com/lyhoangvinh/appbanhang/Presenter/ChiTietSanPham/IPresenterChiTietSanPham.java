package com.lyhoangvinh.appbanhang.Presenter.ChiTietSanPham;

import android.content.Context;

import com.lyhoangvinh.appbanhang.Model.ObjectClass.SanPham;


public interface IPresenterChiTietSanPham {
    void LayChiTietSanPham(int masp);
    void LayDanhSachDanhGiaTheoCuaSanPham(int masp, int limit);
    void ThemGioHang(SanPham sanPham, Context context);
}
