package entity;
public class Person {
    protected String firstName;
    protected String lastName;
    protected String fullName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName () {
        StringBuilder sb = new StringBuilder();
        return fullName = String.valueOf(sb.append(this.firstName).append(" ").append(this.lastName));
    }
}
