package java.t4.backend;

public class user {
    private String name;
    private int age;
    private String email;
    private double weight;
    private double height;

    public user() {}

    public user(String name, int age, String email, double weight, double height) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.weight = weight;
        this.height = height;
    }

    // getter and setter

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
    	return this.age;
    }

    public void setAge(int age) {
    	this.age = age;
    }


    public String getEmail() {
    	return this.email;
    }
    public void setEmail(String email) {
    	this.email = email;
    }


    public double getWeight() {
    	return this.weight;
    }
    public void setWeight(double weight) {
    	this.weight = weight;
    }


    public double getHeight() {
    	return this.height;
    }
    public void setHeight(double height) {
    	this.height = height;
    }

    // CRUD Data Management methods
    public static void create() {}

    public static void read() {}

    public static void update() {}

    public static void delete() {}
}
