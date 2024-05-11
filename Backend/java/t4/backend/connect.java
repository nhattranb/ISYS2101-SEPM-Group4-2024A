package java.t4.backend;

import java.util.*;
import static spark.Spark.*;

public class connect {
    // connect to the user input
    public static void connectUserInput() {
        // connect to the user input
        String userName = "user";
        String password = "password";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        userName = scanner.nextLine();
        System.out.println("Enter password: ");
        password = scanner.nextLine();
        scanner.close();
        
        // check correct credentials
        if (userName.equals("user") && password.equals("password")) {
            System.out.println("Correct credentials");
        } else {
            System.out.println("Incorrect credentials");
        }

        // Spark API
        get("/hello", (req, res) -> "Welcome");

        // Working with Spark
    }
}
