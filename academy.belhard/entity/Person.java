package entity;
public abstract class Person {
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName () {
        StringBuilder sb = new StringBuilder();
        return String.valueOf(sb.append(this.firstName).append(" ").append(this.lastName));
    }
}
