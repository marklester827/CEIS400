/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author markl
 */
public class Login {
    String username;
    String password;
    
    // Default constructor
    public Login(){
        username = "N/A";
        password = "N/A";
    }
    
    // Parameterized constructor

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    
    // Getters and Setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    // toString() method

    @Override
    public String toString() {
        return "Login{" + "username=" + username + ", password=" + password + '}';
    }       
}
