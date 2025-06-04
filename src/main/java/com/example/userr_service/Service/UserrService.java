package com.example.userr_service.Service;

import com.example.userr_service.Model.Userr;
import com.example.userr_service.DTO.UserrDto;
import com.example.userr_service.Repo.UserrRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class UserrService {

    @Autowired
    private UserrRepo userrRepo;

    @Transactional
    public String create(UserrDto userrDto) {
        Userr userr = new Userr();
        userr.setUsername(userrDto.getUsername());
        userr.setPassword(userrDto.getPassword());
        userr.setCreatedDate(LocalDateTime.now());
        userr.setRole(userrDto.getRole());
        userr.setNotificationEnabled(userrDto.isNotificationEnabled());
        userr.setEmailVerified(userrDto.isEmailVerified());

        userrRepo.save(userr);
        return "success";
    }

    public List<Userr> findAll(){
        return userrRepo.findAll();
    }

    public Userr update( Userr userr,Long id){
        Userr user = userrRepo.findById(id).orElse(null);

        if(user!=null){
            user.setUsername(userr.getUsername());
            user.setPassword(userr.getPassword());
            user.setRole(userr.getRole());
            user.setEmailVerified(userr.isEmailVerified());
            user.setNotificationEnabled(userr.isNotificationEnabled());
            user.setUpdatedDate(LocalDateTime.now());

            return userrRepo.save(user);
        }
        return null ;
    }

    public void delete(Long id){
        userrRepo.findById(id).ifPresent(user -> userrRepo.delete(user));
    }

    public UserrDto findByUsername(String username){
        Userr user = userrRepo.findByUsername(username);
        UserrDto userrDto = new UserrDto();
        userrDto.setUsername(user.getUsername());
        userrDto.setPassword(user.getPassword());
        userrDto.setEmailVerified(user.isEmailVerified());
        userrDto.setNotificationEnabled(user.isNotificationEnabled());
        userrDto.setRole(user.getRole());
        userrDto.setUpdatedDate(LocalDateTime.now());

        return userrDto;
    }
}
