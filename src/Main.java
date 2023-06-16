public class Main {

    public static void main(String[] args) {
        Author author0 = new Author("Biba", "Boba");
        Book book0 = new Book("1984", author0, 1974);
        System.out.println(book0);

        int hash1 = book0.hashCode();

        Author author1 = new Author("Райан", "Гослинг");
        Book book1 = new Book("Драйв", author1, 2000);
        System.out.println(book1);

        book0.setYear(1999);
        System.out.println(book0);

        int hash2 = book1.hashCode();

        if (hash1 == hash2) {
            System.out.println("Хэш одинаков");
        } else {
            System.out.println("Хэш не одинаков");
        }

        System.out.println(book0.equals(book1));


    }

}