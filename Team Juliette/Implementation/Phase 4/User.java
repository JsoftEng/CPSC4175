/**
 * Contains information relevant to an existing or new user
 *
 * @author John Johnson
 * @author Devon Moulter
 * @version 11/28/2017
 */
public class User {
    private String userName, password, firstName, lastName, email, status;

    /**
     * Constructs user object with specified parameters
     * @param firstName First name of user
     * @param lastName Last name of user
     * @param email Email address of user
     * @param userName Username of user
     * @param password Password for account of user
     * @param status Status message for user
     */
    public User(String firstName, String lastName, String email, String userName, String password, String status){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.status = status;
    }

    /**
     * Gets first name of user
     * @return First name of user
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * Gets last name of user
     * @return Last name of user
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Gets email of user
     * @return Email of user
     */
    public String getEmail(){
        return email;
    }

    /**
     * Gets username of user
     * @return Username of user
     */
    public String getUserName(){
        return userName;
    }

    /**
     * Gets password of user
     * @return Password of user
     */
    public String getPassword(){
        return password;
    }

    /**
     * Gets status of user
     * @return Status message of user
     */
    public String getStatus(){
        return status;
    }

    /**
     * Sets first name of user
     * @param value Desired first name
     */
    public void setFirstName(String value){
        this.firstName = value;
    }

    /**
     * Sets last name of user
     * @param value Desired last name
     */
    public void setLastName(String value){
        this.lastName = value;
    }

    /**
     * Sets email of user
     * @param value Desired email
     */
    public void setEmail(String value){
        this.email = value;
    }

    /**
     * Sets username of user
     * @param value Desired username
     */
    public void setUserName(String value){
        this.userName = value;
    }

    /**
     * Sets password of user
     * @param value Desired password
     */
    public void setPassword(String value){
        this.password = value;
    }

    /**
     * Sets status of user
     * @param value Desired status
     */
    public void setStatus(String value){
        this.status = value;
    }
}
