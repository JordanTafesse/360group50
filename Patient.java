package com.example.group50;

public class Patient {
    private String FirstName;
    private String LastName;
    private String Address;
    //Private VisitHistory Visit;
    private String Allergies[];
    private String Healthissues[];
    private String PreviousMeds[];
    //private Vitals PatientVitals;
    private boolean hasInsurance;
    private String Pharmacy;


    Patient(String FirstName,String LastName, String Address, String Pharmacy){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Pharmacy = Pharmacy;
    }
    //SET FUNCTIONS----------------
    public void SetFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public void SetLastName(String LastName){
        this.LastName = LastName;
    }



    //GET FUNCTIONS----------------
    public String GetFirstName(){
        return FirstName;
    }

    public String GetLastName(){
        return LastName;
    }
}
