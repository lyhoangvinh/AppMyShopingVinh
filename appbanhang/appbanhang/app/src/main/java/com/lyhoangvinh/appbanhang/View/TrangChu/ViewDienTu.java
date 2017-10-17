package com.lyhoangvinh.appbanhang.View.TrangChu;

import com.lyhoangvinh.appbanhang.Model.ObjectClass.DienTu;
import com.lyhoangvinh.appbanhang.Model.ObjectClass.SanPham;
import com.lyhoangvinh.appbanhang.Model.ObjectClass.ThuongHieu;

import java.util.List;


public interface ViewDienTu {
    void HienThiDanhSach (List<DienTu> dienTus);
    void HienThiLogoThuongHieu(List<ThuongHieu> thuongHieus);
    void LoiLayDuLieu();
    void HienThiSanPhamMoiVe(List<SanPham> sanPhams);
}
