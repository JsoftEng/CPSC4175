/**
 * The UserTest is used to test certain functionality of the User class.
 *
 * @author John Johnson
 * @author Devon Moulter
 * @version 11/28/2017
 */
public class UserTest {
    static String userName, password;
    static User testUser;

    public static void main(String[] args) {
        userName = "testName";
        password = "testPassword";
        testUser = new User(userName,password);

        //Test getUsername
        if(userName == testUser.getUserName()){
            System.out.println("Valid Username Test");
        }else{
            System.out.println("Invalid Username Test");
        }

        //Test getPassword
        if (password == testUser.getPassword()){
            System.out.println("Valid Password Test");
        }else{
            System.out.println("Invalid Password Test");
        }

        //Test setUsername
        userName = "newUsername";

        testUser.setUserName(userName);

        if(userName == testUser.getUserName()){
            System.out.println("Valid Set Username Test");
        }else{
            System.out.println("Invalid Set Username Test");
        }

        //Test setPassword
        password = "newPassword";

        testUser.setPassword(password);

        if(userName == testUser.getPassword()){
            System.out.println("Valid Set Password Test");
        }else{
            System.out.println("Invalid Set Password Test");
        }
    }
}
