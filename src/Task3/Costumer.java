package Task3;

public class Costumer {

    private String firstName;
   private String lastName;
   private String username;
    int id;

    public Costumer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Costumer: \n" +
                "First name: " + firstName + "\n" +
                "Last name: " + lastName + "\n" +
                "Username: " + username + "\n" +
                "ID: " + id + "\n";
    }
}
