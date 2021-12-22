package com.example.quanlybanhanga.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Entity
@Table(name = "ChiTietHoaDon")
public class ChiTietHoaDon {
    @Id// đánh dấu trường sẽ là khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY)// giá trị sẽ tự sinh ra
    private Long id;

    @NotBlank
    private Integer soLuong;


    @ManyToOne
    @JoinColumn(name = "ma_HD")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "ma_SP")
    private SanPham sanPham;
}
