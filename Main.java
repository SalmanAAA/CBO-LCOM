public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem system = new LibraryManagementSystem();
        User user = new User("Salman", "241524060");
        system.registerUser(user);

        Book book1 = new Book("Titanic", "James Dean", "12983109381");
        Book book2 = new Book("Alien Isolation", "John Smith", "4318401943");

        system.getLibrary().addBook(book1);
        system.getLibrary().addBook(book2);

        system.borrowBook(user, "Titanic");
        system.borrowBook(user, "Alien Isolation");
        system.returnBook(user, "Titanic");

        system.displayAllBooks();
        system.displayBorrowedBooks();
        system.displayAllUsers();
    }
}
