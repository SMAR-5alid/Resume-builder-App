package com.company;
import java.util.Scanner;
import java.io.IOException;

public class Main {

        public static void main(String arg[]) throws IOException {
            Scanner in = new Scanner(System.in);
            Login login=new Login();
            Register register=new Register();
            User new_user=new User();
            do {
                System.out.println("Welcome to Resume builder!");
                System.out.println("Do you want to \n1. Login \n2. Register");
                int answer= in.nextInt();
                int user;
                boolean log=false;
                if(answer==1) {
                    int reset = 0;
                    do {
                        if ((user = login.Login()) != -1) {
                            log = true;
                            break;
                        }
                        reset++;
                    } while (reset <= 2);

                    if (!log && reset >= 2) {
                        System.out.println("1. Reset Password. \n2. Exit.");
                        int ch = in.nextInt();
                        if (ch == 1)  login.reset_user();
                         else  break;
                    }

                }
                else { register.register(); }

            }while (true);

        }
    }

