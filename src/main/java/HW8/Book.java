package HW8;

import java.util.Date;

public class Book {
    private final Author author;
    private final Date issueDate;
    private final String genre;
    private final Long isbn;

    public Book(Author author, Date issueDate, String genre, Long isbn) {
        this.author = author;
        this.issueDate = issueDate;
        this.genre = genre;
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public String getGenre() {
        return genre;
    }

    public Long getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        if (issueDate != null ? !issueDate.equals(book.issueDate) : book.issueDate != null) return false;
        if (genre != null ? !genre.equals(book.genre) : book.genre != null) return false;
        return isbn != null ? isbn.equals(book.isbn) : book.isbn == null;
    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + (issueDate != null ? issueDate.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", issueDate=" + issueDate +
                ", genre='" + genre + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
