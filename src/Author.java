import java.util.Objects;

public class Author {

    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        name = name;
    }

    public java.lang.String getSurname() {
        return this.surname;
    }

    public void setSurname(java.lang.String surname) {
        surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Author{" +
                "name=" + name +
                ", surname=" + surname +
                '}';
    }
}