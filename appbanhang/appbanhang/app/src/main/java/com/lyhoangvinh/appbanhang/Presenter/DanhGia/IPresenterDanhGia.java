package com.lyhoangvinh.appbanhang.Presenter.DanhGia;

import android.widget.ProgressBar;

import com.lyhoangvinh.appbanhang.Model.ObjectClass.DanhGia;


public interface IPresenterDanhGia {
    void ThemDanhGia(DanhGia danhGia);
    void LayDanhSachDanhGiaCuaSanPham(int masp, int limit, ProgressBar progressBar);
}
