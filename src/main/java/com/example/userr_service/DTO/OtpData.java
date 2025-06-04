package com.example.userr_service.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OtpData {
    private Integer otp;
    private LocalDateTime expiryDate;
    private String email;

    public OtpData(Integer otp, String email) {
        this.email = email ;
        this.otp = otp;
        this.expiryDate = LocalDateTime.now().plusMinutes(5) ;
    }
}
