package main;

public class UserProvider {

    private static User user;

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        UserProvider.user = user;
    }
}
