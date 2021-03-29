package guru.springframework.Spring5WebbApp.springframwork.model.model.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firsName;
    private String lasname;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books =  new HashSet<>();

    public Author() {
    }
    public Author(String firsName, String lasname) {
        this.firsName = firsName;
        this.lasname = lasname;
    }

    public Author(String firsName, String lasname, Set<Book> books) {
        this.firsName = firsName;
        this.lasname = lasname;
        this.books = books;
    }
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getFirsName() { return firsName; }

    public void setFirsName(String firsName) { this.firsName = firsName; }

    public String getLasname() { return lasname; }

    public void setLasname(String lasname) { this.lasname = lasname; }

    public Set<Book> getBooks() { return books; }

    public void setBooks(Set<Book> books) { this.books = books; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firsName='" + firsName + '\'' +
                ", lasname='" + lasname + '\'' +
                ", books=" + books +
                '}';
    }
}
