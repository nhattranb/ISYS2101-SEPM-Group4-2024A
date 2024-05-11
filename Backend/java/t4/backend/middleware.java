package java.t4.backend;

public class middleware {
    // middleware of the application, to connect the Frontend and the Backend
    public static void main(String[] args) {
        // connect to the user input
        connect.connectUserInput();

        // select from the table
        exercise_select.select();
        meal_select.select();

        // display results
    }
}
