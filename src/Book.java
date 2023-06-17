public class Book {
    private String name;
    private Author author;
    private int year;


    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Имя книги - " + this.name + ". Автор книги - " + this.author + ". Год издательства книги - " + this.year + ".";
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return name.equals(book.getName()) && author.equals(book.getAuthor());
    }

    public int hashCode() {
        return java.util.Objects.hash(name, author, year);
    }
}
