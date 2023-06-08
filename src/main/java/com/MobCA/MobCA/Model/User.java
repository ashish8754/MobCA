package com.MobCA.MobCA.Model;


import javax.persistence.*;

@Entity
@Table(name = "\"user_info\"")
public class User {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence")
    private int userId;

    @Id
    private String userName;

    private String password;

    private String email;

    public Integer getUserId() {
        return userId;
    }

    public void setPlayerId(Integer playerId) {
        this.userId = playerId;
    }

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
        return "Player{" +
                "playerId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public User(Integer playerId, String userName, String password, String email) {
        this.userId= playerId;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public User() {
    }
}
