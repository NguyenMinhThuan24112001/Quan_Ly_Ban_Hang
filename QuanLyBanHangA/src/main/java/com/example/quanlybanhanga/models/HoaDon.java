package com.example.quanlybanhanga.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "HoaDon")
public class HoaDon {
    @Id// đánh dấu trường sẽ là khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY)// giá trị sẽ tự sinh ra
    private Long maHD;

    @Column(nullable = false, updatable = false)
    @CreatedDate
    private LocalDateTime ngayLapHD;

    @Column(nullable = false, updatable = false)
    @CreatedDate
    private LocalDateTime ngayNhanHang;

    @NotBlank
    private Long maKH;

    @NotBlank
    private Long maNV;

    public HoaDon() {

    }
}
