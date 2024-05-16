import java.util.*;

class User {
    private String name;
    private String userId;
    private String pin;

    public User(String name, String userId, String pin) {
        this.name = name;
        this.userId = userId;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public boolean validatePin(String inputPin) {
        return pin.equals(inputPin);
    }
}