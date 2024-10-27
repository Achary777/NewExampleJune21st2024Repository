package com.sgtest.emp.testscripts.pojo;

//CASE1> Create POJO class and Based on the POJO class create the JSON Object.
//Part A
// Don't Run this class, Run LoginDemo class(Part B)
public class Login {

    private String userName;
    private String password;

    public Login(){

    }

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }


}
