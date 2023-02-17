package com.example.SpringCrudUMS.service;

import com.example.SpringCrudUMS.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UmsService {
    private static List<User> users = new ArrayList<>();
    static {

        User u1 = new User(1,"Abhishek Tandon","Tandon245","Jaipur",97822058);
        User u2 = new User(2,"Tamanna","Tam17","Bhopal",8438594);
        User u3 = new User(3,"Shubham","Shubh25","Lucknow",9434324);
        User u4 = new User(4,"Tiwari","ss123","Inodre",80037022);
        User u5 = new User(5,"Lavisha","Lavi31","Jhunjhunu",90038022);
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
    }

    public List<User> findAll() {
        return users;
    }
    public static void addUser(User user){

        users.add(user);
    }
    public static void deleteUser(int id){
        for(User user:users){
            if(user.getUserId()==id){
                users.remove(user);
            }
        }

    }
    public static void  updateUser(int id, User newUser){
        User user =findByUserId(id);
        user.setUserId(newUser.getUserId());
        user.setUserName(newUser.getName());
        user.setAddress(newUser.getAddress());
        user.setPhoneNumber(newUser.getPhoneNumber());
        user.setUserName(newUser.getUserName());
    }
    public static User findByUserId(int id){
        for(User user:users){
            if(user.getUserId()==id){
                return user;
            }

        }
        return null;
    }
}
