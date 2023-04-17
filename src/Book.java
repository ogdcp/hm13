import java.util.Objects;

public class Book {
    private String titleBook;
    private int publicationYear;
    private Author Author;
    public Book(String titleBook, int publicationYear, Author Author){
        this.titleBook = titleBook;
        this.publicationYear= publicationYear;
        this.Author= Author;
    }
    public String getTitleBook(){
        return this.titleBook;

    }
    public int getPublicationYear(){
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear= publicationYear;
    }

    public Author getAuthor() {
        return Author;
    }


    public String toString() {
        return   "Название книги='" + titleBook  + ", год выпуска=" + publicationYear + ", автор=" + Author + '}';
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(titleBook, book.titleBook) && Objects.equals(Author, book.Author);
    }


    public int hashCode() {
        return Objects.hash(titleBook, publicationYear, Author);
    }
}
