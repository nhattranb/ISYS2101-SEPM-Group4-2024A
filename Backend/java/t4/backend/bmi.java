package java.t4.backend;

public class bmi {
    // to calculate the BMI
    public static double calculate(double weight, double height) {
        return weight / (height * height);
    }

    // select goals
    public static String selectGoals(double bmi) {
        if (bmi < 18.5) {
            return "Gain weight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Maintain weight";
        } else {
            return "Lose weight";
        }
    }
}
