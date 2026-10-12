public class Author {
    private String authorFirstName;
    private String authorLastName;

    public Author(String firstName, String lastName) {
        this.authorFirstName = firstName;
        this.authorLastName = lastName;
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public String getAuthorLastName() {
        return this.authorLastName;
    }
}
