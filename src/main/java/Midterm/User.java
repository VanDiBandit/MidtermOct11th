package Midterm;

public abstract class User implements IPrint{
    private String username;

    private String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(String username, String password){
        this.username = username;
        this.password = password;

    }

    @Override
    public void print() {
        System.out.println();
    }
}
