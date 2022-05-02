package org.launchcode.javawebdevtechjobsauthentication.models.dto;

public class UserRegistrationDTO  extends LoginFormsDTO{

    //verify password
    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public  void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

}
