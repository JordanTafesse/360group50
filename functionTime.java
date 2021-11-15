package com.example.group50;
import java.util.Arrays;
import java.util.Scanner;
public class functionTime {
    private String DoctorName;
    private String PatientName;
    private String SubjectTitle;
    private String Message;
    public static void main(String[] args){

        //string to be used for other
        String DoctorName;
        String PatientName = "John John";   //temp change
        String SubjectTitle;
        String Message;
        String str;     //temp string for user input


        String[] doctors = {"Stevie Long","Jimmy Stompers","David Ortega","Stacy Yack"};    //temp will be replaced by database


        Scanner in = new Scanner(System.in);

        System.out.println("Doctor Name: ");
        str = in.nextLine();
        DoctorName = str;
        //Check if Doctor Name is in database before sending message
        System.out.println("Subject Title: ");
        str = in.nextLine();
        SubjectTitle = str;
        System.out.println("Message: ");
        str = in.nextLine();
        Message = str;

        System.out.println("Send? (y/n)");
        str = in.nextLine();
        if(str.equals("y")){
            boolean contains = Arrays.stream(doctors).anyMatch(DoctorName::equals);
            if(contains == true){
                ContactDoctor contact = new ContactDoctor(PatientName);
                contact.SendMessage(DoctorName,PatientName,SubjectTitle,Message);
                System.out.println("MessageSent!");

            }
            else if(contains == false){
                System.out.println("The doctor does not belong to our office.");
            }
        }
        else{
            System.out.println("exit");
        }
    }
}
