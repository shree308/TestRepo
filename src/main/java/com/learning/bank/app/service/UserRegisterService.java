package com.learning.bank.app.service;

public class UserRegisterService {

public boolean registerUser (String userName, String userId, String address)
{
    return validateName(userName) &&
    validateUserId(userId) &&
    validateAddress(address);
}

    private boolean validateAddress(String address) {
    return "Pune".equals(address) ?  true : false;
    }

    private boolean validateUserId(String userId) {

    return "Mohit".equals(userId) ? true : false;
    }

    private boolean validateName(String userName) {
    return "gorhemoh".equals(userName) ? true : false;
    }


}
