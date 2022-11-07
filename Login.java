package com.company;

import java.io.IOException;
import java.util.Scanner;
import static com.company.User.usersDB;

public class Login extends Register {

    static String[]  curr_user;
    static User user =new User();
    static Scanner in = new Scanner(System.in);



    public int Login() throws IOException{
        System.out.println("Welcome to Login form");

            if(login_user()) {
                return 0;
            } else return -1;

    }

    public boolean login_user(){
        boolean login_find = false;
        System.out.println("Enter user Name:");
        user.setUser_name(in.next());
        System.out.println("Enter Password:");
        user.setPassword(in.next());

        for (int i = 0; i<usersDB.size(); i++) {
            User checkdata=usersDB.get(i);
            if (checkdata.getUser_name().equals(user.getUser_name()) && checkdata.getPassword().equals(user.getPassword())) {
                login_find = true;
                curr_user=checkdata.toString().split(", ");
                break;
            }
        }

        if (login_find) {
            System.out.println("Welcome, "+user.getUser_name());
            return login_find;

        }
        else {
            System.out.println("Incorrect username or password,please try again");
        }
        return login_find;
    }

    public static boolean reset_user() throws IOException {
        System.out.println("Enter your ID:");
        user.setId(in.nextInt());
        System.out.println("Enter your Email:");
        user.setEmail(in.next());
        System.out.println("Enter your user Name:");
        user.setUser_name(in.next());

        boolean found =false;
        for (int i = 0; i < usersDB.size(); i++) {
            User user = usersDB.get(i);

            if (user.getUser_name().equals(user.getUser_name()) && user.getId().equals(user.getId())&& user.getEmail().equals(user.getEmail())) {

                System.out.println("Enter new password");
                String newpassword=in.next();
                System.out.println("Confirm password");
                String newpasswordcon=in.next();
                if(newpassword.equals(newpasswordcon)) {
                    usersDB.get(i).setPassword(newpassword);
                    System.out.println("Password updated successfully");
                    found=true;
                    return found;
                }
                break;
            }

        }
        if(found==false){
            System.out.println("Invalid Data .\n" +
                    "please Contact with admin to modify your data");
        }
        return found;
    }

}
