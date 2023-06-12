public class Main {

    public static void printBook(Book book) {
        Author author = book.getAuthor();
        System.out.println("Имя книги - " + book.getName() + ". Автор книги - " + author.getName() + " "
                + author.getSurname() + ". Год издательства книги - " + book.getYear() + ".");
    }

    public static void main(String[] args) {

        Author author0 = new Author("Biba", "Boba");
        Book book0 = new Book("1984", author0, 1974);
        printBook(book0);

        Author author1 = new Author("Райан", "Гослинг");
        Book book1 = new Book("Драйв", author1, 2000);
        printBook(book1);
    }
}