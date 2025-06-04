package com.example.userr_service.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserrDto {
    private String username;
    private String password;
    private String role;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    // Security
    private boolean isEmailVerified;
    private boolean notificationEnabled;
}
