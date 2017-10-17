package com.lyhoangvinh.appbanhang.Presenter.KhuyenMai;

import com.lyhoangvinh.appbanhang.Model.KhuyenMai.ModelKhuyenMai;
import com.lyhoangvinh.appbanhang.Model.ObjectClass.KhuyenMai;
import com.lyhoangvinh.appbanhang.View.TrangChu.ViewKhuyenMai;

import java.util.List;

public class PresenterLogicKhuyenMai implements IPresenterKhuyenMai {

    ViewKhuyenMai viewKhuyenMai;
    ModelKhuyenMai modelKhuyenMai;

    public PresenterLogicKhuyenMai(ViewKhuyenMai viewKhuyenMai){
        this.viewKhuyenMai = viewKhuyenMai;
        modelKhuyenMai = new ModelKhuyenMai();
    }

    @Override
    public void LayDanhSachKhuyenMai() {
        List<KhuyenMai> khuyenMaiList = modelKhuyenMai.LayDanhSachSanPhamTheoMaLoai("LayDanhSachKhuyenMai","DANHSACHKHUYENMAI");
        if(khuyenMaiList.size() > 0){
            viewKhuyenMai.HienThiDanhSachKhuyenMai(khuyenMaiList);
        }
    }
}
