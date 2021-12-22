package com.example.quanlybanhanga.service;


import com.example.quanlybanhanga.models.ChiTietHoaDon;
import com.example.quanlybanhanga.models.HoaDon;
import com.example.quanlybanhanga.models.KhachHang;
import com.example.quanlybanhanga.models.SanPham;
import com.example.quanlybanhanga.reponse.HoaDonThanhTien;
import com.example.quanlybanhanga.repository.ChiTietHoaDonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChiTietHoaDonService {

    @Autowired
    ChiTietHoaDonRepository chiTietHoaDonRepository;

    public HoaDonThanhTien findHoaDon(Long maHD, HoaDon hoaDon, KhachHang khachHang, SanPham sanPham, ChiTietHoaDon chiTietHoaDon){
        HoaDonThanhTien hoaDonThanhTien=new HoaDonThanhTien();
        hoaDonThanhTien.setMaHD(maHD);
        hoaDonThanhTien.setTenKH(khachHang.getHoTenKH());
        hoaDonThanhTien.setNgayLapHD(hoaDon.getNgayLapHD());
        hoaDonThanhTien.setMaSP(sanPham.getMaSP());
        hoaDonThanhTien.setSoLuong(chiTietHoaDon.getSoLuong());
        hoaDonThanhTien.setThanhTien(chiTietHoaDonRepository.findAllByHoaDon(maHD).orElse(null));
        return hoaDonThanhTien;
    }

}
