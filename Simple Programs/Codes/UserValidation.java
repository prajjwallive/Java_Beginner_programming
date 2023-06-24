class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class user {
    private String name;
    private int age;

    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Validator() throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be above 18");

        }
        System.out.println("Age is valid!");
    }

}

public class UserValidation {
    public static void main(String[] args) {
        user User = new user("Ram", 19);
        try{
            User.Validator();
        }
        catch(InvalidAgeException e){
            System.out.println("Exception Caught: "+e.getMessage());
        }
    }
}
