package teamjuliette.phase2;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity {

    private static Connection db = null;

    public static Connection dbConnect(){
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
