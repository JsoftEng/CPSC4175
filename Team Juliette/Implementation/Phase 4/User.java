public class User {
    private String userName, password, firstName, lastName, email, status;

    public User(String firstName, String lastName, String email, String userName, String password, String status){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.status = status;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public String getStatus(){
        return status;
    }

    public void setFirstName(String value){
        this.firstName = value;
    }

    public void setLastName(String value){
        this.lastName = value;
    }

    public void setEmail(String value){
        this.email = value;
    }

    public void setUserName(String value){
        this.userName = value;
    }

    public void setPassword(String value){
        this.password = value;
    }

    public void setStatus(String value){
        this.status = value;
    }
}
