package com.example.SpringCrudUMS.controller;

import com.example.SpringCrudUMS.model.User;
import com.example.SpringCrudUMS.service.UmsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/UMS_User")

public class UmsController {
    private final UmsService umsService;

    public UmsController(UmsService umsService) {
        this.umsService = umsService;
    }
    @GetMapping("find-all")
    public List<User> findAllUsers(){
        return umsService.findAll();
    }
    @PostMapping("add-user")
    public void adduser(@RequestBody User user){
        UmsService.addUser(user);
    }
    @DeleteMapping("Delete-User/id/{id}")
    public  void deleteuser(@PathVariable int id){
        UmsService.deleteUser(id);
    }
    @PutMapping("update-user/id/{id}")
    public void updateUser(@PathVariable int id,@RequestBody User user ){
        UmsService.updateUser(id,user);
    }

    @GetMapping("find-user/id/{id}")
    public User findByUserId(@PathVariable int id){
        return  UmsService.findByUserId(id);
    }
}
