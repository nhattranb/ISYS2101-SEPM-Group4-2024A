import java.util.Scanner;

public class User {
    private String name;
    private String email;
    private String password;
    private int userWeight;
    private int userHeight;
    private int targetCalories;
    
    // constructor
    public User(String name, String email, String password, int userWeight, int userHeight, int targetCalories) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userWeight = userWeight;
        this.userHeight = userHeight;
        this.targetCalories = targetCalories;
    }

    // getters and setters
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getUserWeight() {
        return this.userWeight;
    }
    
    public void setUserWeight(int userWeight) {
        this.userWeight = userWeight;
    }
    
    public int getUserHeight() {
        return this.userHeight;
    }
        
    public void setUserHeight(int userHeight) {
        this.userHeight = userHeight;
    }
    
    public int getTargetCalories() {
        return this.targetCalories;
    }
    
    public void setTargetCalories(int targetCalories) {
        this.targetCalories = targetCalories;
    }

    // toString
    public String viewUserInfo() {
        return "Name: " + this.name
        + "\nEmail: " + this.email +
        "\nPassword: " + this.password +
        "\nWeight: " + this.userWeight +
        "\nHeight: " + this.userHeight +
        "\nTarget Calories: " + this.targetCalories;
    }

    // functions
    public void Choose() {
        System.out.println("Choose an option: ");
        System.out.println("1. Add a meal");
        System.out.println("2. Add a workout");
        System.out.println("3. View your profile");
        System.out.println("4. View your meals");
        System.out.println("5. View your workouts");
        System.out.println("6. View your progress");
        System.out.println("7. Exit");
    }

    public void AddGoal() {
        System.out.println("Enter your target calories: ");
        Scanner scanner = new Scanner(System.in);
        int targetCalories = scanner.nextInt();
        this.setTargetCalories(targetCalories);
    }

    public void AddNewRep() {
        System.out.println("Enter the name of the workout: ");
        Scanner scanner = new Scanner(System.in);
        String workoutName = scanner.nextLine();
        System.out.println("Enter the number of reps: ");
        int reps = scanner.nextInt();
        System.out.println("Enter the number of sets: ");
        int sets = scanner.nextInt();
        System.out.println("Enter the weight: ");
        int weight = scanner.nextInt();
        System.out.println("Enter the date: ");
        String date = scanner.nextLine();
        System.out.println("Enter the time: ");
        String time = scanner.nextLine();
        System.out.println("Enter the duration: ");
        int duration = scanner.nextInt();
    }

    public void CreateRoutine() {
        System.out.println("Enter the name of the routine: ");
        Scanner scanner = new Scanner(System.in);
        String routineName = scanner.nextLine();
        System.out.println("Enter the weight: ");
        int weight = scanner.nextInt();
        System.out.println("Enter the date: ");
        String date = scanner.nextLine();
        System.out.println("Enter the time: ");
        String time = scanner.nextLine();
        System.out.println("Enter the duration: ");
        int duration = scanner.nextInt();
    }

    public void SelectExercise() {
        System.out.println("Select an exercise: ");
        System.out.println("1. Bench Press");
        System.out.println("2. Squat");
        System.out.println("3. Deadlift");
        System.out.println("4. Overhead Press");
        System.out.println("5. Barbell Row");
    }
}
