package com.example.group50;

//package CSVreadwrite;


import java.io.BufferedReader;
import java.nio.file.Files;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderWriter {

    private List<User> list;

    public static void main(String[] args) {
        String filePath = "/Users/jordan/Desktop/project50/user.csv";

        System.out.println("starting write user.csv file: " + filePath);
        writeCsv(filePath);

        System.out.println("starting read user.csv file");
        //CAN COMMENT BACK IN ONCE WE FIGURE OUT READCSV ERROR
        List<User> users = new ArrayList<User>();
        users = readCsv(filePath);
    }
//===JORDAN ADDED
    /*
private static List<User> readUsersFromCSV(String fileName) {
    List<User> users = new ArrayList<>();
    Path pathToFile = Paths.get(fileName);

    try (BufferedReader br = Files.newBufferedReader(pathToFile,
            StandardCharsets.US_ASCII)) {
        String line = br.readLine();

// loop until all lines are read
        while (line != null) {
            String[] attributes = line.split(",");
            User user = createUser(attributes);

            users.add(user);

            line = br.readLine();
        }
    }
 catch (IOException ioe) {
        ioe.printStackTrace();
    }
    return users;
}

    private static User createUser(String[] metadata) {
        int id = Integer.parseInt(metadata[0]);
        String firstname = metadata[1];
        String lastname = metadata[2];
        return new User(id, firstname, lastname);
    }

 */
    public static void writeCsv(String filePath) {
        List<User> users = new ArrayList<User>();

        //create demo Users
        User user = new User(1,"John","Doe", "JDoe", "Doe1", "10/13/99", "123 Inglewood", 0, "CVS", 22);
        //user.setId(1);
        //user.setFirstName("John");
      //  user.setLastName("Doe");
        users.add(user);

        user = new User(2,"Lauren","Daniel", "LDaniel" , "Doe23", "01/04/84" , "234 Apple lane" , 2, "n/a", 0);
        //user.setId(2);
        //user.setFirstName("Jack");
        //user.setLastName("Doe");
        users.add(user);

        user = new User(3,"Martha","Zeller" , "MZeller","JDoe", "08/23/02" , "545 Grove st" , 1, "n/a", 0);
        //user.setId(3);
        //user.setFirstName("Jimmy");
        //user.setLastName("Doe");
        users.add(user);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);

            fileWriter.append("Id, First Name, Last Name, UserName, Password, Birthday, Address, Access, Pharmacy, Age\n");
            for(User u: users) {
                fileWriter.append(String.valueOf(u.getId()));
                fileWriter.append(",");
                fileWriter.append(u.getFirstName());
                fileWriter.append(",");
                fileWriter.append(u.getLastName());
                fileWriter.append(",");
                fileWriter.append(u.getUsername());
                fileWriter.append(",");
                fileWriter.append(u.getPassword());
                fileWriter.append(",");
                fileWriter.append(u.getBirthday());
                fileWriter.append(",");
                fileWriter.append(u.getAddress());
                fileWriter.append(",");
                fileWriter.append(String.valueOf(u.getAccess()));
                fileWriter.append(",");
                fileWriter.append(u.getPharmacy());
                fileWriter.append(",");
                fileWriter.append(String.valueOf(u.getAge()));
                fileWriter.append("\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public CSVReaderWriter(){
        list = new ArrayList<User>();
    }

    public static void addtoCsv(String filePath, String usern, String pass, String fname, String lname, String birth, String address , int access, String pharmacy, Integer age) {

        List<User> users = new ArrayList<User>();

        //add user to list
        //RANDOM NUMBER FOR ID, NEED TO FIGURE OUT A WAY TO ENSURE NO DUPLICATES**
        int random = (int)Math.floor(Math.random()*(999-1+1)+1);
        User user = new User(random,fname,lname, usern, pass, birth, address, access, pharmacy, age);
        users.add(user);

        FileWriter fileWriter = null;
        try {
            //append adds to the file instead of destroying it
            fileWriter = new FileWriter(filePath, true);

            //fileWriter.append("Id, First Name, Last Name, UserName, Password\n");
            for(User u: users) {
                fileWriter.append(String.valueOf(u.getId()));
                fileWriter.append(",");
                fileWriter.append(u.getFirstName());
                fileWriter.append(",");
                fileWriter.append(u.getLastName());
                fileWriter.append(",");
                fileWriter.append(u.getUsername());
                fileWriter.append(",");
                fileWriter.append(u.getPassword());
                fileWriter.append(",");
                fileWriter.append(u.getBirthday());
                fileWriter.append(",");
                fileWriter.append(u.getAddress());
                fileWriter.append(",");
                fileWriter.append(String.valueOf(u.getAccess()));
                fileWriter.append(",");
                fileWriter.append(u.getPharmacy());
                fileWriter.append(",");
                fileWriter.append(String.valueOf(u.getAge()));
                fileWriter.append("\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //we might not need a return type since we are just updating the list
        //return (users);
    }
    public static List<User>readCsv(String filePath) {
        BufferedReader reader = null;
        List<User> users = new ArrayList<User>();
        try {

            String line = "";
            reader = new BufferedReader(new FileReader(filePath));
            reader.readLine();

            while((line = reader.readLine()) != null) {
                String[] fields = line.split(",");

                if(fields.length > 0) {
                    User user = new User(Integer.parseInt(fields[0]),fields[1],fields[2],fields[3],fields[4], fields[5], fields[6], Integer.parseInt(fields[7]), fields[8],  Integer.parseInt(fields[9]));
                    //user.setId(Integer.parseInt(fields[0]));
                    //user.setFirstName(fields[1]);
                    //user.setLastName(fields[2]);
                    users.add(user);
                }
            }

            for(User u: users) {
                System.out.printf("[userId=%d, firstName=%s, lastName=%s]\n", u.getId(), u.getFirstName(), u.getLastName(), u.getUsername(), u.getPassword());
            }

            for(User u: users){
                System.out.printf("%s Password= %s\n", u.getId(), u.getPassword());
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return(users);
    }
}