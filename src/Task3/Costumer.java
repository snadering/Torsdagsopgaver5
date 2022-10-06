package Task3;

public class Costumer {

    private String firstName;
   private String lastName;
   private String username;
   private static int id = 1;
    private int userID;
    public Costumer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.userID = id;
        id++;
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
                "ID: " + userID + "\n";
    }
}
