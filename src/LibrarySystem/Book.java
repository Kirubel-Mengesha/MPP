package LibrarySystem;

import java.util.Objects;

public class Book extends LendingItem{
    private String isbn;
    private String title;
    private String authorFirstName;
    private String authorLastName;

    public Book(String isbn, String title, String authorFirstName, String authorLastName,int numCopiesInLib) {
        super(numCopiesInLib);
        this.isbn = isbn;
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title) && Objects.equals(authorFirstName, book.authorFirstName) && Objects.equals(authorLastName, book.authorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isbn, title, authorFirstName, authorLastName);
    }
}
