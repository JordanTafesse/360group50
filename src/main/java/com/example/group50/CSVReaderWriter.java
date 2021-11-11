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
        User user = new User(1,"John","Doe", "JDoe", "Doe1");
        //user.setId(1);
        //user.setFirstName("John");
      //  user.setLastName("Doe");
        users.add(user);

        user = new User(2,"Jack","Doe", "JDoe" , "Doe23");
        //user.setId(2);
        //user.setFirstName("Jack");
        //user.setLastName("Doe");
        users.add(user);

        user = new User(3,"Jimmy","Doe" , "JimmyD","JDoe");
        //user.setId(3);
        //user.setFirstName("Jimmy");
        //user.setLastName("Doe");
        users.add(user);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);

            fileWriter.append("Id, First Name, Last Name, UserName, Password\n");
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
                    User user = new User(Integer.parseInt(fields[0]),fields[1],fields[2],fields[3],fields[4]);
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