package com.example.quanlybanhanga.controllers;

import com.example.quanlybanhanga.models.ChiTietHoaDon;
import com.example.quanlybanhanga.models.HoaDon;
import com.example.quanlybanhanga.models.KhachHang;
import com.example.quanlybanhanga.models.SanPham;
import com.example.quanlybanhanga.reponse.HoaDonThanhTien;
import com.example.quanlybanhanga.service.ChiTietHoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HoaDon")
public class ChiTietHoaDonControllers {
    @Autowired
    ChiTietHoaDonService chiTietHoaDonService;

    @GetMapping("/ThanhTien")
    public HoaDonThanhTien getThanhTien(@RequestParam(name = "maHD", required = false) Long maHD, HoaDon hoaDon, KhachHang khachHang, SanPham sanPham, ChiTietHoaDon chiTietHoaDon){
        return chiTietHoaDonService.findHoaDon(maHD, hoaDon, khachHang, sanPham, chiTietHoaDon);
    }
}
