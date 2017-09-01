package teamproject.phase1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.*;

public class Main extends Application{

    Scene loginPage, signUpForm;
    Connection db = null;
    Button loginButton, signUpButton;
    Text loginScreenTitle,signUpFormTitle, messageText;
    Label userNameLBL, passwordLBL, signUpFormUNLBL, signUpFormPWLBL, signUpFormEmailLBL;
    TextField userNameTextField, signUpFormUNTF, signUpFormEmailTF;
    PasswordField passwordTextField,signUpFormPWTF;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Software Engineering Messaging System");

        //Layout 1 - Login Page
        GridPane gpLayout  = new GridPane();
        gpLayout.setAlignment(Pos.CENTER);
        gpLayout.setHgap(10);
        gpLayout.setVgap(10);
        gpLayout.setPadding(new Insets(25,25,25,25));

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

        //gpLayout.setGridLinesVisible(true);

        loginButton = new Button();
        loginButton.setText("Login");
        loginButton.setOnAction(e -> verifyUser(userNameTextField.getText(),passwordTextField.getText()));
        HBox hbLoginButton = new HBox();
        hbLoginButton.setAlignment(Pos.BOTTOM_RIGHT);
        hbLoginButton.getChildren().add(loginButton);
        gpLayout.add(hbLoginButton,1,4);

        signUpButton = new Button();
        signUpButton.setText("Sign Up");
        signUpButton.setOnAction(e -> primaryStage.setScene(signUpForm));
        HBox hbSignUpButton = new HBox();
        hbSignUpButton.setAlignment(Pos.BOTTOM_RIGHT);
        hbSignUpButton.getChildren().add(signUpButton);
        gpLayout.add(hbSignUpButton, 1, 5);

        messageText = new Text();
        messageText.setFont(Font.font("Arial", FontWeight.NORMAL, 12));
        gpLayout.add(messageText,1,6);

        //Layout 2 - Sign Up Form
        GridPane gpLayout2 = new GridPane();
        gpLayout2.setHgap(10);
        gpLayout2.setVgap(10);
        gpLayout2.setPadding(new Insets(25,25,25,25));

        signUpFormTitle = new Text();
        signUpFormTitle.setFont(Font.font("Arial", FontWeight.NORMAL,20));

        primaryStage.setScene(new Scene(gpLayout,380, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


    /*
     * Member: verifyUser
     * Parameters: <String userName, String password>
     * Return Type: <void>
     *     Purpose: Takes username and password entered by user and verifies authenticity against
     *     SQLite database.
     */
    public void verifyUser(String userName, String password){
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
            }else{
                messageText.setText("Login successful!");
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
    }

    public void addNewUser(String firstName, String lastName, String userName, String password){

    }
}
