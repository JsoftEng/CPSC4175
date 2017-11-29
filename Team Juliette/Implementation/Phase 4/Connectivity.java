import java.sql.*;

/**
 * The unary method of establishing a connection to the database
 *
 * @author John Johnson
 * @author Devon Moulter
 * @version 11/28/2017
 */
public class Connectivity {

    private static Connection db = null;

    /**
     * Establishes connection to existing UserData SQLite database
     *
     * @return Connection
     */
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
