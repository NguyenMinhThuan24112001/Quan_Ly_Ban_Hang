package com.example.quanlybanhanga.repository;

import com.example.quanlybanhanga.models.ChiTietHoaDon;
import com.example.quanlybanhanga.models.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChiTietHoaDonRepository extends JpaRepository<ChiTietHoaDon,Long> {

    @Query("select sum(ChiTietHoaDon.soLuong* SanPham.donGia) from ChiTietHoaDon inner join SanPham sp on sp.maSP =ChiTietHoaDon.sanPham.maSP group by ChiTietHoaDon.hoaDon.maHD having ChiTietHoaDon.hoaDon.maHD=:maHD")
    Optional<Double> findAllByHoaDon(@Param("maHD") Long maHD);


}
