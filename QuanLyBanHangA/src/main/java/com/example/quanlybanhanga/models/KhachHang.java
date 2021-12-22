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
@Table(name = "KhachHang")
public class KhachHang {
    @Id// đánh dấu trường sẽ là khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY)// giá trị sẽ tự sinh ra
    private Long maKH;

    @NotBlank
    private String hoTenKH;


    @NotBlank
    private String diaChi;


    @NotBlank
    private String soDt;

    public KhachHang() {

    }
}
