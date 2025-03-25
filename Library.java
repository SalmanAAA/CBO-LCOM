import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;
    private List<Book> borrowedBooks;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !borrowedBooks.contains(book)) {
                return book;
            }
        }
        return null;
    }

    public User findUserById(String userId) {
        for (User user : users) {
            if (user.getUserId().equalsIgnoreCase(userId)) {
                return user;
            }
        }
        return null;
    }

    public boolean borrowBook(User user, String bookTitle) {
        Book book = findBookByTitle(bookTitle);
        if (book != null) {
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }

    public boolean returnBook(User user, String bookTitle) {
        for (Book book : borrowedBooks) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                borrowedBooks.remove(book);
                return true;
            }
        }
        return false;
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public List<User> getAllUsers() {
        return users;
    }
}