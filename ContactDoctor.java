package com.example.group50;


public class ContactDoctor {
    private String DoctorName;
    static String PatientName;
    private String SubjectTitle;
    private String Message;

    //Function stores the message, and sends it to the doctor
    ContactDoctor(String PatientName){
        this.PatientName = PatientName;
    }
    public void SendMessage(String DoctorName, String PatientName, String SubjectTitle, String Message){
        this.DoctorName = DoctorName;
        this.PatientName = PatientName;
        this.SubjectTitle = SubjectTitle;
        this.Message = Message;

        //add functionality to send to a specific doctor
    }
}
