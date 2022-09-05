package entity;

public class User extends Person {
    private String email;
    private String password;

    private String fullInfo;


    public User (String firstName, String lastName, String email, String password) {
        super (firstName, lastName);
        this.email = email;
        this.password = password;
    }

    public String getFullInfo () {
        this.fullName = super.getFullName();
        StringBuilder sb = new StringBuilder();
        return  fullInfo = String.valueOf("Name: " + fullName + "\n" + "Email: " + email);
    }

    public boolean isPasswordCorrect (String enteredPassword) {
        return enteredPassword.equals(this.password);
    }
}
