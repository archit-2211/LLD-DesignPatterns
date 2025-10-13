package GangsOfFour.CreationalDesignPatterns.Builder.FluentBuilder;

public class Main {
    public static void main(String[] args) {
        try {
            User user = new User.UserBuilder("Archit", "archit@gmail.com", "9876543210")
                    .setAddress("Delhi")
                    .setAadharNumber("123412341234")
                    .setPanNumber("ABCDE1234F")
                    .build();
            System.out.println(user);
        } catch (RuntimeException e) {
            System.out.println("User creation failed: " + e.getMessage());
        }

    }

}
