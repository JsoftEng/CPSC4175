
import java.io.DataInputStream;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CR_Client implements Runnable {

    // The client socket
    private static Socket clientSocket = null;
    // The output stream
    private static PrintStream os = null;
    // The input stream
    private static DataInputStream is = null;

    private static BufferedReader inputLine = null;
    private static boolean closed = false;

    public static void main(String[] args) {
        displayTitleMenu();
        if (titleMenuChoice.equals("2")){

            if (!username.equals("Q") && !password.equals("Q")){
                System.out.println("Login Successful!");
                if(displayMainMenu().equals("1")) {
                    joinChatRoom();
                }
            }else{
                System.out.println("Invalid Username or Password.");
            }
        }
        /*
        else if(titleMenuChoice.equals("1")){
            if(userSignUp()){

            }
        }
        else if(titleMenuChoice.equals("1")){

        }
        */
    }

    /*
     * Create a thread to read from the server. (non-Javadoc)
     *
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
                if (responseLine.indexOf("*** Bye") != -1)
                    break;
            }
            closed = true;
        } catch (IOException e) {
            System.err.println("IOException:  " + e);
        }
    }

    public static void displayTitleMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\t\t\t\tTitle Menu");
        System.out.println("Please choose an option:");
        System.out.println("\t\t1. Create an Account");
        System.out.println("\t\t2. Login");
        System.out.println("\t\t3. Exit");
        do {
            if (scan.next().trim().equals("1")) {
                userSignUp();
            } else if (scan.next().trim().equals("2")) {
                if(userLogin()){
                    displayMainMenu();
                }
            } else if (scan.next().trim().equals("3")) {
                System.out.println("Goodbye!");
            } else {
                System.out.print("Invalid Input! Please choose a valid option: ");

            }
        }while(!scan.next().trim().equals("1")||!scan.next().trim().equals("2")||!scan.next().trim().equals("3"));
    }

    public static String displayMainMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\t\t\t\tMain Menu");
        System.out.println("Please choose an option:");
        System.out.println("\t\t1. Join Chat Room");
        System.out.println("\t\t2. View Private Messages");
        System.out.println("\t\t3. Update Status");
        System.out.println("\t\t4. Log Out");
        return scan.next().trim();
    }

    public static boolean userLogin() {
        // The database connection object
        Connection db = null;
        //SQL query object
        Statement stmt;
        //Record/Result set
        ResultSet rs = null;
        String Qt = "'";
        boolean result = false;

        String username, password;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Type 'Q' to quit");
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
                rs = stmt.executeQuery("SELECT * FROM [UserInfo] WHERE Username = " + Qt + username + Qt + " AND Password = " + Qt + password + Qt);
                result = rs.next();

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
        } while (!result && (!username.equals("Q") || !password.equals("Q")));

        return result;
    }

    public static void userSignUp(){
        String fName,lName,username,password,email;
        Scanner scan = new Scanner(System.in);
        User entity;
        do {
            System.out.print("\nPlease enter your first name: ");
            fName = scan.next().trim();
            System.out.print("\nPlease enter your last name: ");
            lName = scan.next().trim();
            System.out.print("\nPlease enter your desired username: ");
            username = scan.next().trim();
            System.out.print("\nPlease enter a password: ");
            password = scan.next().trim();
            System.out.print("\n Please enter a valid e-mail address: ");
            email = scan.next().trim();
        }while(!verifyNewAcc(entity));


    }

    public static boolean verifyNewAcc(User entity){
        boolean status = false;
        return status;
    }

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
                while (!closed) {
                    os.println(inputLine.readLine().trim());
                }
        /*
         * Close the output stream, close the input stream, close the socket.
         */
                os.close();
                is.close();
                clientSocket.close();
            } catch (IOException e) {
                System.err.println("IOException:  " + e);
            }
        }
    }
}