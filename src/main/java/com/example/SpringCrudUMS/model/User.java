package com.example.SpringCrudUMS.model;

public class User {
    int UserId;
    String Name;
    String UserName;
    String  Address;
    int PhoneNumber;

    public User(int UserId, String Name, String UserName, String Address, int PhoneNumber) {
        this.UserId = UserId;
        this.Name = Name;
        this.UserName = UserName;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", Name='" + Name + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                '}';
    }
}
