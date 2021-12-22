package com.example.quanlybanhanga.reponse;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class HoaDonThanhTien {
    private Long maHD;

    private String tenKH;

    private LocalDateTime ngayLapHD;

    private Long maSP;

    private Integer soLuong;

    private Double thanhTien;
}
