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
@Table(name = "NhanVien")
public class NhanVien {
    @Id// đánh dấu trường sẽ là khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY)// giá trị sẽ tự sinh ra
    private Long maNV;

    @NotBlank
    private String hoNV;

    @NotBlank
    private String tenNV;

    @NotBlank
    private String diaChi;

    private boolean gioiTinh;

    @Column(nullable = false, updatable = false)
    @CreatedDate
    private LocalDateTime ngaySinh;

    @NotBlank
    private String soDt;

    public NhanVien() {

    }
}
