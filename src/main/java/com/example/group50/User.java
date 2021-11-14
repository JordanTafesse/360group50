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
    private int access;
    private String pharmacy;
    private Integer age;

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

    public int getAccess() {
        return access;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public Integer getAge() {
        return age;
    }


    //JORDAN ADDED
    //access; 0 == patient, 1 == nurse, 2 == doctor
    //0 and "n/a" mean not available
    public User(int id, String firstName, String lastName, String username, String password, String birth, String address, int access, String pharmacy, Integer age){
        //need to change access level, they have access to different information, (etc all addresses for nurses are null)

        //used for all accounts
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.birth = birth;
        this.address = address;

        //pre-determined
        this.access = access;

        //only for the patients
        this.pharmacy = pharmacy;
        this.age = age;
    }
}
