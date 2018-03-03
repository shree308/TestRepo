package com.learning.bank.app.main;

import com.learning.bank.app.service.UserRegisterService;

public class RegisterApp {

    UserRegisterService userRegisterService = null;

    public RegisterApp() {
        userRegisterService = new UserRegisterService();
    }

    public static void main(String[] args) {
        System.out.println("Registering users");
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        RegisterApp app = new RegisterApp();
//userName - arg[0], userId - arg[1], address - arg[2]
    if (app.userRegisterService.registerUser(args[0],args[1],args[2]))
    {
        System.out.println("Congratulations !!! " + args[0] + " successfully registered!!");
    }
    else {
        System.out.println("Sorry could not register user : " + args[0]);
    }


    }
}
