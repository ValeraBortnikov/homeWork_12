public class Book {
    private String bookName;
    private int publicationYear;
    private Author author;

    public Book(String name, int yearValue, Author author) {
        this.bookName = name;
        this.author = author;
        this.publicationYear = yearValue;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int newYear) {
        this.publicationYear = newYear;
    }

}
