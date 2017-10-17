package com.lyhoangvinh.appbanhang.Presenter.GioHang;

import android.content.Context;

import com.lyhoangvinh.appbanhang.Model.GioHang.ModelGioHang;
import com.lyhoangvinh.appbanhang.Model.ObjectClass.SanPham;
import com.lyhoangvinh.appbanhang.View.GioHang.ViewGioHang;

import java.util.List;


public class PresenterLogicGioHang implements IPresenterGioHang {

    ModelGioHang modelGioHang;
    ViewGioHang viewGioHang;

    public PresenterLogicGioHang(ViewGioHang viewGioHang){
        modelGioHang = new ModelGioHang();
        this.viewGioHang = viewGioHang;
    }

    @Override
    public void LayDanhSachSanPhamTrongGioHang(Context context) {
        modelGioHang.MoKetNoiSQL(context);
        List<SanPham> sanPhamList = modelGioHang.LayDanhSachSanPhamTrongGioHang();
        if(sanPhamList.size() > 0){
            viewGioHang.HienThiDanhSachSanPhamTrongGioHang(sanPhamList);
        }
    }
}
