/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author markl
 */
public class Register {
    String name;
    String stAddress;
    String city;
    String state;
    int zip;
    String username;
    String password;
    
    // Default constructor
    public Register(){
        name = "N/A";
        stAddress = "N/A";
        city = "N/A";
        state = "N/A";
        zip = 0;
        username = "N/A";
        password = "N/A";
    }

    // Parameterized constructor
    public Register(String name, String stAddress, String city, String state, int zip, String username, String password) {
        this.name = name;
        this.stAddress = stAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.username = username;
        this.password = password;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStAddress() {
        return stAddress;
    }

    public void setStAddress(String stAddress) {
        this.stAddress = stAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

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
        return "Register{" + "name=" + name + ", stAddress=" + stAddress + ", city=" + city + ", state=" + state + ", zip=" + zip + ", username=" + username + ", password=" + password + '}';
    }
}
