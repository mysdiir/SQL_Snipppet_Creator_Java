package Model;

public class User {

    private int userId;
    private String name;
    private String lastName;
    private String dateOfBirth;

    public User(int userId, String name, String lastName,
                String dateOfBirth) {
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public User cloneUser() {
        return new User(userId, name, lastName, dateOfBirth);

    }
}
