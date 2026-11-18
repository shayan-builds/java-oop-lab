
class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}

class PasswordValidator {

    String username;

    PasswordValidator(String username) {
        this.username = username;
    }

    void validatePassword(String password)
            throws InvalidPasswordException {

        if (password.length() < 6) {
            throw new InvalidPasswordException(
                "Password must be at least 6 characters long."
            );
        }

        if (password.equals(username)) {
            throw new InvalidPasswordException(
                "Password cannot be the same as username."
            );
        }

        System.out.println("Password is valid.");
    }
}

public class PasswordDemo {
    public static void main(String args[]) {

        PasswordValidator user = new PasswordValidator("Rahul");

        // Valid password
        try {
            user.validatePassword("Rahul123");
        }
        catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        // Invalid: password is shorter than 6 characters
        try {
            user.validatePassword("abc");
        }
        catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        // Invalid: password is same as username
        try {
            user.validatePassword("Rahul");
        }
        catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
