package com.example.userr_service.Repo;

import com.example.userr_service.Model.Userr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserrRepo extends JpaRepository<Userr, Long> {
    public Userr findByUsername(String email);
}
