public class User {
    private String userName, password, firstName, lastName, email;

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public void setUserName(String value){
        this.userName = value;
    }

    public void setPassword(String value){
        this.password = value;
    }
}
