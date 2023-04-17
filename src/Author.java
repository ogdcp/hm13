import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;
    public Author(String nameAuthor,String surnameAuthor ){
        this.nameAuthor=nameAuthor;
        this.surnameAuthor=surnameAuthor;
    }
    public String getNameAuthor(){
        return this.nameAuthor;
    }
    public String getSurnameAuthor(){
        return this.surnameAuthor;
    }


    public String toString() {
        return nameAuthor+ " " + surnameAuthor;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(surnameAuthor, author.surnameAuthor);
    }


    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }

}
