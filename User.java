public class User {
    private String name;
    private String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getUserInfo() {
        return "User: " + name + " (ID: " + userId + ")";
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }
}
