package com.lyhoangvinh.appbanhang.Presenter.DangKy;

import com.lyhoangvinh.appbanhang.Model.DangNhap_DangKy.ModelDangKy;
import com.lyhoangvinh.appbanhang.Model.ObjectClass.NhanVien;
import com.lyhoangvinh.appbanhang.View.DangNhap_DangKy.ViewDangKy;


public class PresenterLogicDangKy implements IPresenterDangKy {
    ViewDangKy viewDangKy;
    ModelDangKy modelDangKy;

    public PresenterLogicDangKy(ViewDangKy viewDangKy){
        this.viewDangKy = viewDangKy;
        modelDangKy = new ModelDangKy();
    }

    @Override
    public void ThucHienDangKy(NhanVien nhanvien) {
        boolean kiemtra = modelDangKy.DangKyThanhVien(nhanvien);
        if(kiemtra){
            viewDangKy.DangKyThangCong();
        }else{
            viewDangKy.DangKyThatBai();
        }
    }
}
