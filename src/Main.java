//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author authorSteve = new Author("Стив", "Макконнелл");
        Book bookCodeComplete = new Book("Совершенный код", 1993, authorSteve);
        System.out.println("Название книги: \"" + bookCodeComplete.getBookName()
                + "\" Автор книги: " + authorSteve.getAuthorLastName()
                + " " + authorSteve.getAuthorLastName()
                + " Год издания книги: " + bookCodeComplete.getPublicationYear() + " г.");

        Author authorRobert = new Author("Роберт", "Мартин");
        Book bookCleanCode = new Book("Чистый код", 2008, authorRobert);
        System.out.println("Название книги: \"" + bookCleanCode.getBookName()
                + " Автор книги: " + authorRobert.getAuthorLastName()
                + " " + authorRobert.getAuthorLastName()
                + " Год издания книги: " + bookCleanCode.getPublicationYear() + " г.");

        Author authorDonald = new Author("Дональд", "Кнут");
        Book bookArtOfComputerProgramming = new Book("Искусство программирования", 1978, authorDonald);
        System.out.println("Название книги: \"" + bookArtOfComputerProgramming.getBookName()
                + "\" Автор книги: " + authorDonald.getAuthorLastName()
                + " " + authorDonald.getAuthorLastName()
                + " Год издания книги: " + bookArtOfComputerProgramming.getPublicationYear() + " г.");

        bookArtOfComputerProgramming.setPublicationYear(1968);
        System.out.println("Название книги: \"" + bookArtOfComputerProgramming.getBookName()
                + "\" Автор книги: " + authorDonald.getAuthorLastName()
                + " " + authorDonald.getAuthorLastName()
                + " Год издания книги: " + bookArtOfComputerProgramming.getPublicationYear() + " г.");
    }
}