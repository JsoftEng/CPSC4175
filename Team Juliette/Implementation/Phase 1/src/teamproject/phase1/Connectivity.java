package teamproject.phase1;

import java.sql.*;

/**
 * Created by John Johnson on 8/31/2017.
 */
public class Connectivity {

    private static Connection db = null;

    public static Connection dbConnect(){
        String dbPath  = "C:\\Users\\John Johnson\\Documents\\CSU\\Fall Semester [2017]\\CPSC 4175 - Software Engineering\\Team Project\\Implementation\\UserData.sqlite";
        try{
            Class.forName("org.sqlite.JDBC");
            db = DriverManager.getConnection("jdbc:sqlite:UserData.sqlite");
            return db;
        }catch(Exception e){
            System.out.println("Error connecting to database!");
            return null;
        }
    }
}
