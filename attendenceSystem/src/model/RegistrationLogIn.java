/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author BRACU\16121132
 */
public class RegistrationLogIn {

    private String userId;
    private String password;
    private String name;
    private String contact;

    public RegistrationLogIn(String userId, String password, String name, String contact) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.contact = contact;
    }

    public RegistrationLogIn() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
}
