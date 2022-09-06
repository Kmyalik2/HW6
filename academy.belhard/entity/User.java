package entity;

public class User extends Person {
    private String email;
    private String password;

    public User (String firstName, String lastName, String email, String password) {
        super (firstName, lastName);
        this.email = email;
        this.password = password;
    }

    public String getFullInfo () {
        return  String.valueOf("Name: " + super.getFullName() + "\n" + "Email: " + email);
    }

    public boolean isPasswordCorrect (String enteredPassword) {
        return enteredPassword.equals(this.password);
    }
}
