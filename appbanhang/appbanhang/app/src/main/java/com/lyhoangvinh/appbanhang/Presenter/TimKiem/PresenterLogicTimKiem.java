package com.lyhoangvinh.appbanhang.Presenter.TimKiem;

import com.lyhoangvinh.appbanhang.Model.ObjectClass.SanPham;
import com.lyhoangvinh.appbanhang.Model.TimKiem.ModelTimKiem;
import com.lyhoangvinh.appbanhang.View.TimKiem.ViewTimKiem;

import java.util.List;


public class PresenterLogicTimKiem implements IPresenterTimKiem {

    ViewTimKiem viewTimKiem;
    ModelTimKiem modelTimKiem;

    public PresenterLogicTimKiem(ViewTimKiem viewTimKiem){
        this.viewTimKiem = viewTimKiem;
        modelTimKiem = new ModelTimKiem();
    }

    @Override
    public void TimKiemSanPhamTheoTenSP(String tensp, int limit) {
        List<SanPham> sanPhamList = modelTimKiem.TimKiemSanPhamTheoTen(tensp,"DANHSACHSANPHAM","TimKiemSanPhamTheoTenSP",limit);

        if(sanPhamList.size() > 0){
            viewTimKiem.TimKiemThanhCong(sanPhamList);

        }else{
            viewTimKiem.TimKiemThatBai();
        }
    }
}
