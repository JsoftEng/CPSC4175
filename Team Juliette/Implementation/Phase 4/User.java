public class User {
    private String userName, password, firstName, lastName, email;

    public User(String firstName, String lastName, String email, String userName, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
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
}
