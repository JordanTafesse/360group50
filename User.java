package com.example.group50;

//package CSVreadwrite;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String birth;
    private String address;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthday() {
        return birth;
    }

    public String getAddress() {
        return address;
    }


    //JORDAN ADDED
    public User(int id, String firstName, String lastName, String username, String password, String birth, String address){
        //need to change access level, they have access to different information, (etc all addresses for nurses are null)
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.birth = birth;
        this.address = address;
    }
}
