package com.example.group50;

public class Account {
    private String FirstName;
    private String LastName;
    private String Email;
    private String Username;
    private String DateOfBirth;
    private String Password;
    private int Permission;

//
    //CONSTRUCTOR
    Account(String FirstName, String LastName, String Email, String Username, String DateOfBirth, String Password, int Permission){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Username = Username;
        this.DateOfBirth = DateOfBirth;
        this.Password = Password;
        this.Permission = Permission;
    }
    public void SetName(String FirstName, String LastName){
        this.FirstName = this.LastName;
    }

    //Changes the old password to the new password
    public void SetPassword(String NewPassword){
        this.Password = NewPassword;
    }

    //returns positive if accepted, negative if either username or password not found in the database
    public boolean Login(String Username, String Password) {
        if ((this.Username == Username) && (this.Password == Password)) {
            //System.out.println("Welcome in");
            return true;
        }
        else if ((this.Username != Username) || (this.Password != Password)){
            //System.out.println("Username and/or Password);
            return false;
        }
        return false;
    }

    //GET FUNCTIONS
    public String GetFirstName(){
        return FirstName;
    }

    public String GetLastName(){
        return LastName;
    }

    //0==patient
    //1==nurse
    //2==doctor
    public void setPermission(int permission){
        this.Permission = permission;
    }

}
