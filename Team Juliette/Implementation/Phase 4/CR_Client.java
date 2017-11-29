import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.Scanner;

/**
 * The CR_Client is used to present the user with a general interface fby which to communicate to other users
 * connected to the server.
 *
 * @author John Johnson
 * @author Devon Moulter
 * @version 11/28/2017
 */
public class CR_Client implements Runnable {

    // The client socket
    private static Socket clientSocket = null;
    // The output stream
    private static PrintStream os = null;
    // The input stream
    private static DataInputStream is = null;

    private static BufferedReader inputLine = null;
    private static boolean closed = false;
    private static boolean userExit = false;
    private static boolean userLogout = false;
    private static User currentUser = null;

    public static void main(String[] args) {
        do {
            displayTitleMenu();
        }while(!userExit);

        /*
         * Close the output stream, close the input stream, close the socket.
         */
        try {
            if (os != null) {
                os.close();
            }
            if (is != null) {
                is.close();
            }
            if (clientSocket != null) {
                clientSocket.close();
            }
        }catch (IOException e) {
            System.err.println("IOException:  " + e);
        }
    }

    /**
     * @see java.lang.Runnable#run()
     */
    public void run() {
    /*
     * Keep on reading from the socket till we receive "Bye" from the
     * server. Once we received that then we want to break.
     */
        String responseLine;
        try {
            while ((responseLine = is.readLine()) != null) {
                System.out.println(responseLine);
                if (responseLine.indexOf("*** Bye") != -1) {
                    closed = true;
                    System.out.println("Press <Enter> to continue.");
                    return;
                }
            }
        } catch (IOException e) {
            System.err.println("IOException:  " + e);
        }
    }

    /**
     * Display title menu choices
     */
    public static void displayTitleMenu(){
        Scanner scan = new Scanner(System.in);
        String userIn;
        System.out.println("\t\t\tTitle Menu");
        System.out.println("----------------------------------");
        do {
            System.out.println("Please choose an option:");
            System.out.println("\t\t1. Create an Account");
            System.out.println("\t\t2. Login");
            System.out.println("\t\t3. Exit");
            System.out.println("----------------------------------");
            userIn = scan.next().trim();
            if (userIn.equals("1")) {
                userSignUp();
            } else if (userIn.equals("2")) {
                if(userLogin()){
                    System.out.println("Login Successful!");
                    userLogout = false;
                    do {
                        displayMainMenu();
                    }while(!userLogout);
                }
            } else if (userIn.equals("3")) {
                System.out.println("Goodbye!");
                userExit = true;
            } else {
                System.out.print("Invalid Input! Please choose a valid option: ");
            }
        }while(!userIn.equals("1")&&!userIn.equals("2")&&!userIn.equals("3"));
    }

    /**
     * Display main menu choices
     */
    public static void displayMainMenu(){
        Scanner scan = new Scanner(System.in);
        String userIn;
        System.out.println("\t\t\tMain Menu");
        System.out.println("----------------------------------");
        do {
            System.out.println("Please choose an option:");
            System.out.println("\t\t1. Join Chat Room");
            System.out.println("\t\t2. View Private Messages");
            System.out.println("\t\t3. Edit Profile");
            System.out.println("\t\t4. Log Out");
            System.out.println("----------------------------------");
            userIn = scan.next().trim();
            if (userIn.equals("1")) {
                closed = false;
                joinChatRoom();
            } else if (userIn.equals("2")) {
                System.out.println("Functionality not implemented yet!");
            } else if (userIn.equals("3")) {
                editUserProfile();
            } else if (userIn.equals("4")) {
                System.out.println("Log out successful!");
                userLogout = true;
            }else {
                System.out.print("Invalid Input! Please choose a valid option: ");
            }
        }while(!userIn.equals("1")&&!userIn.equals("2")&&!userIn.equals("3")&&!userIn.equals("4"));
    }

    /**
     * Display and enable modification of editable criteria in user profile
     */
    public static void editUserProfile() {
        Connection db = null;
        Statement stmt;
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\n");
        String userIn;
        try {

            //Create SQLite database connection
            db = Connectivity.dbConnect();
            stmt = db.createStatement();
            stmt.setQueryTimeout(30);
            System.out.println("\t\t\tEdit User Profile");
            System.out.println("----------------------------------");
            do {
                System.out.println("Select the item that you wish to change.");
                System.out.println("\t\t[1] Username: " + currentUser.getUserName());
                System.out.println("\t\t-------------");
                System.out.println("\t\t[2] Password: " + currentUser.getPassword());
                System.out.println("\t\t-------------");
                System.out.println("\t\t[3] First Name: " + currentUser.getFirstName());
                System.out.println("\t\t-------------");
                System.out.println("\t\t[4] Last Name: " + currentUser.getLastName());
                System.out.println("\t\t-------------");
                System.out.println("\t\t[5] Email: " + currentUser.getEmail());
                System.out.println("\t\t-------------");
                System.out.println("\t\t[6] Status: " + currentUser.getStatus());
                System.out.println("----------------------------------");
                userIn = scan.next().trim();
                if (userIn.equals("1")) {
                    String username;
                    System.out.println("Please enter your new username: ");
                    username = scan.next().trim();
                    stmt.executeUpdate("UPDATE UserInfo SET Username = '" + username + "' WHERE Username = '" + currentUser.getUserName() + "'");
                    currentUser.setUserName(username);
                    System.out.println("Profile updated!");
                } else if (userIn.equals("2")) {
                    String password;
                    System.out.println("Please enter your new Password: ");
                    password = scan.next().trim();
                    stmt.executeUpdate("UPDATE UserInfo SET Password = '" + password + "' WHERE Username = '" + currentUser.getUserName() + "'");
                    currentUser.setPassword(password);
                    System.out.println("Profile updated!");
                } else if (userIn.equals("3")) {
                    String firstName;
                    System.out.println("Please enter your new First Name: ");
                    firstName = scan.next().trim();
                    stmt.executeUpdate("UPDATE UserInfo SET [First Name] = '" + firstName + "' WHERE Username = '" + currentUser.getUserName() + "'");
                    currentUser.setFirstName(firstName);
                    System.out.println("Profile updated!");
                } else if (userIn.equals("4")) {
                    String lastName;
                    System.out.println("Please enter your new Last Name: ");
                    lastName = scan.next().trim();
                    stmt.executeUpdate("UPDATE UserInfo SET [Last Name] = '" + lastName + "' WHERE Username = '" + currentUser.getUserName() + "'");
                    currentUser.setLastName(lastName);
                    System.out.println("Profile updated!");
                }else if (userIn.equals("5")) {
                    String email;
                    System.out.println("Please enter your new email: ");
                    email = scan.next().trim();
                    stmt.executeUpdate("UPDATE UserInfo SET Email = '" + email + "' WHERE Username = '" + currentUser.getUserName() + "'");
                    currentUser.setEmail(email);
                    System.out.println("Profile updated!");
                }else if (userIn.equals("6")) {
                    String status;
                    System.out.println("Please enter your new status: ");
                    status = scan.next().trim();
                    stmt.executeUpdate("UPDATE UserInfo SET Status = '" + status + "' WHERE Username = '" + currentUser.getUserName() + "'");
                    currentUser.setStatus(status);
                    System.out.println("Profile updated!");
                }else {
                    System.out.print("Invalid Input! Please choose a valid option: ");
                }
            }while(!userIn.equals("1")&&!userIn.equals("2")&&!userIn.equals("3")&&!userIn.equals("4")&&!userIn.equals("5")&&!userIn.equals("6"));

        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } finally {
            try {
                if (db != null) {
                    db.close();
                }
            } catch (SQLException se) {
                System.out.println(se.getMessage());
            }
        }
    }

    /**
     * Log user into system, verify entered credentials against database
     * @return boolean True if supplied user credentials match a valid entry in database, false otherwise.
     */
    public static boolean userLogin() {
        // The database connection object
        Connection db = null;
        //SQL query object
        Statement stmt;
        //Record/Result set
        ResultSet rs = null;
        boolean result = false;

        String username, password;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Please enter your Username: ");
            username = scan.next().trim();
            System.out.print("Please enter your Password: ");
            password = scan.next().trim();
            try {

                //Create SQLite database connection
                db = Connectivity.dbConnect();
                stmt = db.createStatement();
                stmt.setQueryTimeout(30);

                //Create resultset based on user credentials
                rs = stmt.executeQuery("SELECT * FROM [UserInfo] WHERE Username = '" + username + "' AND Password = '" + password + "'");
                result = rs.next();
                if (!result){
                    System.out.println("Invalid Username/Password!");
                }else{
                    currentUser = new User(
                            rs.getString("First Name"),
                            rs.getString("Last Name"),
                            rs.getString("Email"),
                            rs.getString("Username"),
                            rs.getString("Password"),
                            rs.getString("Status")
                    );
                }

            } catch (SQLException se) {
                System.out.println(se.getMessage());
            } finally {
                try {
                    if (db != null) {
                        db.close();
                        if (rs != null) {
                            rs.close();
                        }
                    }
                } catch (SQLException se) {
                    System.out.println(se.getMessage());
                }
            }
        } while (!result);

        return result;
    }

    /**
     * Create a new account, prompts user for qualifying criteria and enters information into database
     * Verifies input to ensure no duplication of existing user
     */
    public static void userSignUp(){
        String fName,lName,username,password,email,status;
        boolean exists;
        Scanner scan = new Scanner(System.in);
        User entity;
        do {
            System.out.print("Please enter your first name: ");
            fName = scan.next().trim();
            System.out.print("Please enter your last name: ");
            lName = scan.next().trim();
            System.out.print("Please enter your desired username: ");
            username = scan.next().trim();
            System.out.print("Please enter a password: ");
            password = scan.next().trim();
            System.out.print("Please enter a valid e-mail address: ");
            email = scan.next().trim();
            status = "I am a new user";

            entity = new User(fName,lName,email,username,password,status);
            exists = verifyNewAcc(entity);
        }while(exists);

        displayTitleMenu();

    }

    /**
     * Verifies user input to ensure no duplication of existing user occurs
     * @param entity temporary user object to verify existence in database.
     * @return boolean False if user already exists
     */
    public static boolean verifyNewAcc(User entity){
        // The database connection object
        Connection db = null;
        //SQL query object
        Statement stmt;
        //Record/Result set
        ResultSet rs = null;
        boolean status = false;
            try {
                //Create SQLite database connection
                db = Connectivity.dbConnect();
                stmt = db.createStatement();
                stmt.setQueryTimeout(30);

                //Create resultset based on user credentials
                rs = stmt.executeQuery("SELECT * FROM UserInfo WHERE Username = '" + entity.getUserName() + "'");
                status = rs.next();
                if(status){
                    System.out.println("An account with that username already exists!\n");
                }else{
                    stmt.executeUpdate("INSERT INTO UserInfo ([First Name],[Last Name],Username,Password,Email,Status) VALUES ('"
                             + entity.getFirstName() + "', '"
                             + entity.getLastName() + "', '"
                             + entity.getUserName() + "', '"
                             + entity.getPassword() + "', '"
                             + entity.getEmail() + "', '"
                             + entity.getStatus() + "')");
                    System.out.println("\nAccount created successfully!\n");
                }

            } catch (SQLException se) {
                System.out.println(se.getMessage());
            } finally {
                try {
                    if (db != null) {
                        db.close();
                        if (rs != null) {
                            rs.close();
                        }
                    }
                } catch (SQLException se) {
                    System.out.println(se.getMessage());
                }
            }
        return status;
    }

    /**
     * Creates thread object to establish connection to an existing server
     * Sends user input to server
     */
    public static void joinChatRoom(){
        // The default port.
        int portNumber = 6185;
        // The default host.
        String host = "localhost";

    /*
     * Open a socket on a given host and port. Open input and output streams.
     */
        try {
            clientSocket = new Socket(host, portNumber);
            inputLine = new BufferedReader(new InputStreamReader(System.in));
            os = new PrintStream(clientSocket.getOutputStream());
            is = new DataInputStream(clientSocket.getInputStream());
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + host);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to the host "
                    + host);
            System.err.println(e.getMessage());
        }

    /*
     * If everything has been initialized then we want to write some data to the
     * socket we have opened a connection to on the port portNumber.
     */
        if (clientSocket != null && os != null && is != null) {
            try {

        /* Create a thread to read from the server. */
                new Thread(new CR_Client()).start();
                os.println(currentUser.getUserName());
                while (!closed) {
                    os.println(inputLine.readLine().trim());
                }
            } catch (IOException e) {
                System.err.println("IOException:  " + e);
            }
        }
    }
}