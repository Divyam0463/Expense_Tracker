package com.example.userr_service.Controller;

import com.example.userr_service.Model.Userr;
import com.example.userr_service.DTO.UserrDto;
import com.example.userr_service.Repo.UserrRepo;
import com.example.userr_service.Service.UserrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserrService userrService;
    @Autowired
    private UserrRepo userrRepo;

    @GetMapping("/list-all-users")
    public List<Userr> getUsers(){
        return userrService.findAll();
    }

    @PostMapping("/register")
    public String addUser(@RequestBody UserrDto userrDto) {
        return userrService.create(userrDto);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        Userr userr = userrRepo.findById(id).orElse(null);
        assert userr != null;
        userrService.delete(userr.getId());
        return "User Deleted Successfully";
    }

    @GetMapping("/{username}")
    public UserrDto findUsingUsername(@PathVariable String username) throws Exception {
        return userrService.findByUsername(username) ;
    }
}
