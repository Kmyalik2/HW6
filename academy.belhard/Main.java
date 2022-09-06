import entity.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Ksenia", "Myalik", "kmyalik@mail.ru", "12345qwerty");
        User u2 = new User("Ann", "Black", "ablack@mail.ru", "123456qwerty");

        Scanner scanner;
        scanner = new Scanner(System.in);
        // New User creation
        System.out.println("Please enter your Name");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your Last Name");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your email");
        String email = scanner.nextLine();
        System.out.println("Please enter your password");
        String password = scanner.nextLine();
        User newUser = new User(firstName, lastName, email, password);

        System.out.println("Please re-enter your password");
        String enteredPassword = scanner.nextLine();
        if (newUser.isPasswordCorrect(enteredPassword)){
            System.out.println("Entered password is correct" + "\n");
        }
        else   System.out.println("Error: entered password is incorrect"+ "\n");


        System.out.println("Full names:");
        System.out.println("User 1:" + u1.getFullName() + "\n");
        System.out.println("User 2:" + u2.getFullName() + "\n");
        System.out.println("Current User:" + newUser.getFullName() + "\n");

        System.out.println("Full info:");
        System.out.println("User 1:" + "\n" + u1.getFullInfo()+ "\n");
        System.out.println("User 2:" + "\n" + u2.getFullInfo()+ "\n");
        System.out.println("Current User :" + "\n" + newUser.getFullInfo()+ "\n");

    }
}