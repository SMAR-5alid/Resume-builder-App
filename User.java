package com.company;
import java.util.ArrayList;
public class User {
    private Integer id;
    private String name;
    private String User_name;
    private String email;
    private String address;
    private String Phone_number;
    private double age;
    private String Password;
    private static Integer currentID = 0;

    public User() {}
    public User(User user) {
        setId(++currentID);
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public void setUser_name(String user_name) {
        User_name = user_name;
    }
    public void setAge(double age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {this.email = email;}
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
    }


    public String getPassword() {
        return Password;
    }
    public String getUser_name() {
        return User_name;
    }
    public double getAge() {
        return age;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone_number() {
        return Phone_number;
    }

    public static ArrayList<User> usersDB = new ArrayList<>();
    static String file="src/com/company/Users/Student.txt";

}
