public class LibraryManagementSystem {
    private Library library;

    public LibraryManagementSystem() {
        this.library = new Library();
    }

    public Library getLibrary() {
        return library;
    }

    public void registerUser(User user) {
        library.registerUser(user);
    }

    public void borrowBook(User user, String bookTitle) {
        if (library.borrowBook(user, bookTitle)) {
            System.out.println(user.getName() + " berhasil meminjam " + bookTitle);
        } else {
            System.out.println("Buku tidak tersedia.");
        }
    }

    public void returnBook(User user, String bookTitle) {
        if (library.returnBook(user, bookTitle)) {
            System.out.println(user.getName() + " berhasil mengembalikan " + bookTitle);
        } else {
            System.out.println("Buku tidak ditemukan dalam daftar pinjaman.");
        }
    }

    public void displayAllBooks() {
        System.out.println("\nAll Books:");
        library.getAllBooks().forEach(book -> System.out.println(book.getBookInfo()));
    }

    public void displayBorrowedBooks() {
        System.out.println("\nBorrowed Books:");
        library.getBorrowedBooks().forEach(book -> System.out.println(book.getBookInfo()));
    }

    public void displayAllUsers() {
        System.out.println("\nAll Users:");
        library.getAllUsers().forEach(user -> System.out.println(user.getUserInfo()));
    }
}
