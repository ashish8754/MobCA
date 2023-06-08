package com.MobCA.MobCA.Model;


import javax.persistence.*;

@Entity
@Table(name = "\"user_info\"")
public class User {

    @Id
    private String userName;

    private String password;

    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public User() {
    }

    public User(int userId, String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
}
