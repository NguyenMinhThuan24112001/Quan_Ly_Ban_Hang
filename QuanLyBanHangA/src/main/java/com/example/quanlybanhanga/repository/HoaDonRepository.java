package com.example.quanlybanhanga.repository;

import com.example.quanlybanhanga.models.HoaDon;
import com.example.quanlybanhanga.models.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HoaDonRepository extends JpaRepository<HoaDon,Long> {
}
