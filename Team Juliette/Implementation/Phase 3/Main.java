package teamproject.phase3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.*;

public class Main extends Application{

    Scene loginPage, signUpForm, chatPage;
    Connection db = null;
    Button loginButton, signUpButton, cancelButton,submitButton;
    Text loginScreenTitle,signUpFormTitle,chatPageTitle, messageText, signUpFormMessageText;
    Label userNameLBL, passwordLBL, signUpFormUNLBL, signUpFormPWLBL, signUpFormEmailLBL, signUpFormFNameLBL, signUpFormLNameLBL, signUpFormVerifyPWLBL,signUpFormVerifyEmailLBL;
    TextField userNameTextField, signUpFormUNTF, signUpFormEmailTF,signUpFormFNameTF,signUpFormLNameTF,signUpFormVerifyEmailTF;
    TextArea chatWindow;
    PasswordField passwordTextField,signUpFormPWTF,signUpFormVerifyPWTF;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Software Engineering Messaging System");

        //Set layout of login page
        initLoginPage(primaryStage);

        //Set layout of sign up page
        initSignUpPage(primaryStage);

        //Set layout of chat page
        initChatPage(primaryStage);

        primaryStage.setScene(loginPage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void initLoginPage(Stage window){
        GridPane gpLayout  = new GridPane();
        gpLayout.setAlignment(Pos.CENTER);
        gpLayout.setHgap(10);
        gpLayout.setVgap(10);
        gpLayout.setPadding(new Insets(25,25,25,25));
        //gpLayout.setGridLinesVisible(true);
        loginPage = new Scene(gpLayout,380, 275);

        loginScreenTitle = new Text("Welcome");
        loginScreenTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        gpLayout.add(loginScreenTitle,1,0,2,1);

        userNameLBL = new Label("Username: ");
        gpLayout.add(userNameLBL,0,1);
        userNameTextField = new TextField();
        gpLayout.add(userNameTextField,1,1);

        passwordLBL = new Label("Password: ");
        gpLayout.add(passwordLBL, 0, 2);
        passwordTextField = new PasswordField();
        gpLayout.add(passwordTextField,1,2);

        loginButton = new Button();
        loginButton.setText("Login");
        loginButton.setOnAction(e -> {
            if(verifyUser(userNameTextField.getText(),passwordTextField.getText())){
                window.setScene(chatPage);
            }

        });
        HBox hbLoginButton = new HBox();
        hbLoginButton.setAlignment(Pos.BOTTOM_RIGHT);
        hbLoginButton.getChildren().add(loginButton);
        gpLayout.add(hbLoginButton,1,4);

        signUpButton = new Button();
        signUpButton.setText("Sign Up");
        signUpButton.setOnAction(e -> window.setScene(signUpForm));
        HBox hbSignUpButton = new HBox();
        hbSignUpButton.setAlignment(Pos.BOTTOM_RIGHT);
        hbSignUpButton.getChildren().add(signUpButton);
        gpLayout.add(hbSignUpButton, 1, 5);

        messageText = new Text();
        messageText.setFont(Font.font("Arial", FontWeight.NORMAL, 12));
        gpLayout.add(messageText,1,6);
    }

    public void initSignUpPage(Stage window){
        GridPane gpLayout2 = new GridPane();
        gpLayout2.setAlignment(Pos.CENTER);
        gpLayout2.setHgap(10);
        gpLayout2.setVgap(10);
        gpLayout2.setPadding(new Insets(25,25,25,25));
        //gpLayout2.setGridLinesVisible(true);
        signUpForm = new Scene(gpLayout2,380, 275);

        signUpFormTitle = new Text("Create an Account");
        signUpFormTitle.setFont(Font.font("Arial", FontWeight.NORMAL,20));
        gpLayout2.add(signUpFormTitle,1,0,2,1);

        signUpFormMessageText = new Text();
        signUpFormMessageText.setFont(Font.font("Arial",FontWeight.NORMAL,12));
        gpLayout2.add(signUpFormMessageText,1,7);

        signUpFormFNameLBL = new Label("First Name: ");
        gpLayout2.add(signUpFormFNameLBL,1,1);
        signUpFormFNameTF = new TextField();
        gpLayout2.add(signUpFormFNameTF,2,1);

        signUpFormLNameLBL = new Label("Last Name: ");
        gpLayout2.add(signUpFormLNameLBL,1,2);
        signUpFormLNameTF = new TextField();
        gpLayout2.add(signUpFormLNameTF,2,2);

        signUpFormUNLBL = new Label("Username: ");
        gpLayout2.add(signUpFormUNLBL,1,3);
        signUpFormUNTF = new TextField();
        gpLayout2.add(signUpFormUNTF,2,3);

        signUpFormPWLBL = new Label("Password: ");
        gpLayout2.add(signUpFormPWLBL,1,4);
        signUpFormPWTF = new PasswordField();
        gpLayout2.add(signUpFormPWTF,2,4);

        signUpFormVerifyPWLBL = new Label("Password: ");
        gpLayout2.add(signUpFormVerifyPWLBL,1,4);
        signUpFormVerifyPWTF = new PasswordField();
        gpLayout2.add(signUpFormVerifyPWTF,2,4);

        signUpFormEmailLBL = new Label("Email Address: ");
        gpLayout2.add(signUpFormEmailLBL,1,5);
        signUpFormEmailTF = new TextField();
        gpLayout2.add(signUpFormEmailTF,2,5);

        submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            if(!signUpFormFNameTF.getText().isEmpty()
                    && !signUpFormLNameTF.getText().isEmpty()
                    && !signUpFormUNTF.getText().isEmpty()
                    && !signUpFormPWTF.getText().isEmpty()
                    && !signUpFormEmailTF.getText().isEmpty()) {
                messageText.setText("Account Created!");
                window.setScene(loginPage);
            }else{
                signUpFormMessageText.setText("Please fill out entire form!");
            }
        });
        HBox hbSubmitButton = new HBox();
        hbSubmitButton.setAlignment(Pos.CENTER);
        hbSubmitButton.getChildren().add(submitButton);
        gpLayout2.add(hbSubmitButton,1,6);

        cancelButton = new Button("Cancel");
        cancelButton.setOnAction(e -> window.setScene(loginPage));
        HBox hbCancelButton = new HBox();
        hbCancelButton.setAlignment(Pos.BOTTOM_RIGHT);
        hbCancelButton.getChildren().add(cancelButton);
        gpLayout2.add(hbCancelButton,3,7);
    }

    public void initChatPage(Stage window){
        GridPane gpLayout3 = new GridPane();
        gpLayout3.setAlignment(Pos.CENTER);
        gpLayout3.setHgap(10);
        gpLayout3.setVgap(10);
        gpLayout3.setPadding(new Insets(25,25,25,25));

        gpLayout3.setGridLinesVisible(true);
        chatPage = new Scene(gpLayout3,380, 275);

        chatWindow = new TextArea();
        //chatWindow.
        //gpLayout3.add(chatWindow,0,1);

        //chatPageTitle = new Text("Chat");
        //chatPageTitle.setFont(Font.font("Arial", FontWeight.NORMAL,20));
        //gpLayout3.add(chatPageTitle,0,0,2,1);
    }

    /*
     * Member: verifyUser
     * Parameters: <String userName, String password>
     * Return Type: <void>
     *     Purpose: Takes username and password entered by user and verifies authenticity against
     *     SQLite database.
     */
    public boolean verifyUser(String userName, String password){
        Statement stmt;
        String Qt = "'";
        ResultSet rs;
        int count;

        try {

            //Create SQLite database connection
            db = Connectivity.dbConnect();
            stmt = db.createStatement();
            stmt.setQueryTimeout(30);

            //Create resultset based on user credentials
            rs = stmt.executeQuery("SELECT * FROM UserInfo WHERE Username = " + Qt + userName + Qt + " AND Password = " + Qt + password + Qt);
            count = 0;
            while(rs.next()){
                count = count + 1;
            }

            if (count == 0){
                messageText.setText("Invalid Username or Password.");
                return false;
            }else{
                messageText.setText("Login successful!");
                return true;
            }

        }catch(SQLException se){
            messageText.setText(se.getMessage());
        }finally {
            try{
                if (db != null){
                    db.close();
                }
            }catch(SQLException se){
                messageText.setText(se.getMessage());
            }
        }

        messageText.setText("Cannot connect to database!");
        return false;
    }

    public void addNewUser(String firstName, String lastName, String userName, String password){
        Statement stmt;
        String Qt = "'";

        try {
            //Create SQLite database connection
            db = Connectivity.dbConnect();
            stmt = db.createStatement();

            //Insert user credentials into database
            stmt.executeQuery("INSERT INTO UserInfo () VALUES (" + Qt + firstName + Qt + ", " + Qt + lastName + Qt + ", " + Qt + userName + Qt + ", " + Qt + password + Qt );
        }catch(SQLException sqlE){
            messageText.setText(sqlE.getMessage());
        }finally {
            try{
                if (db != null){
                    db.close();
                }
            }catch(SQLException se){
                messageText.setText(se.getMessage());
            }
        }
    }
}
