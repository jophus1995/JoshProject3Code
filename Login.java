/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3gui;

import java.util.ArrayList;

/**
 *
 * @author KinkyKat
 */
public class Login implements Interface {

    public String fName;
    public String lName;
    public String email;
    public String username;
    public String password;
    public String userType;
    ArrayList<Login> accounts = new ArrayList<>();

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
        // this.person = person;
    }

    public Login(String fName, String lName, String email, String username, String password,String userType) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }
    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String u) {
        username = u;
    }

    public void setPassword(String p) {
        password = p;
    }

    public String getEmail() {
        return email;
    }
public void setEmail(String e){
    email = e;
}
public String getUserType(){
    return userType;
}
public void setUserType(String s){
    userType = s;
}
    public String toStringLogin() {
        String s = fName + "," + lName + "," + email + "," + username + "," + password + "," + userType;
        return s;
    }

    public void resetPassword(String username) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().equals(username)) {
                accounts.get(i).setPassword("password");
            }
        }
    }


    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
