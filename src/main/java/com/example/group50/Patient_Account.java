package com.example.group50;

public class Patient_Account extends Account{

    //Could be a constructor that uses Account Variables
    Patient_Account(String FirstName, String LastName, String Email, String Username, String DateOfBirth, String Password, int Permission) {
        super(FirstName, LastName, Email, Username, DateOfBirth, Password, Permission);
    }
    //Account(String FirstName,String LastName, String Address, String Pharmacy);
}
