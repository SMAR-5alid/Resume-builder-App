package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register {
    static User user =new User();
    static Scanner in = new Scanner(System.in);

    public static void register() {
        System.out.println("Registration form");
        user_registraion();
    }

    public static void user_registraion() {

        User n_user=new User(user);
        System.out.println("Please fill out all the following fields");
        System.out.println("Enter your  Name:");
        n_user.setName(in.nextLine());
        System.out.println("Enter your email:");
        n_user.setEmail(in.next());
        while (!validate_email(n_user.getEmail()))
        {
            System.out.println("Invalid Email .");
            System.out.println("Enter your email:");
            n_user.setEmail(in.next());
        }
        System.out.println("Enter your Phone number:");
        n_user.setPhone_number(in.next());
        while(!isValidMobileNo(n_user.getPhone_number()))
        {
            System.out.println("Invalid Phone number .");
            System.out.println("Enter your Phone number:");
            n_user.setPhone_number(in.next());
        }
        System.out.println("Enter your Age:");
        n_user.setAge(in.nextDouble());
        System.out.println("Enter your address:");
        n_user.setAddress(in.next());
        System.out.println("Enter your username:");
        n_user.setUser_name(in.next());
        System.out.println("Enter your Password:");
        n_user.setPassword(in.next());

        System.out.println("new user added successfully, thank you for choosing Resume Builder\n");
        System.out.println(" ID : "+n_user.getId()+"           Name : "+n_user.getName());
        System.out.println(" Phone number : "+n_user.getPhone_number());
        System.out.println(" Email : "+ n_user.getEmail());
        System.out.println(" Address : "+ n_user.getAddress());
        User.usersDB.add(n_user);
    }

    public static boolean validate_email(String email) {
        Pattern Epattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher res = Epattern.matcher(email);
        return res.find();
    }
    public static boolean isValidMobileNo(String str) {
        Pattern ptrn = Pattern.compile("\\d{3}\\d{8}");
        Matcher match = ptrn.matcher(str);
        return (match.find() && match.group().equals(str));
    }

}
