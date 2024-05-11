package java.t4.backend;

public class sides {
    private int id;
    private String name;
    private int calories;
    private String image;

    public sides() {}

    public sides(int id, String name, int calories, String image) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.image = image;
    }

    // getter and setter
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
    	return this.name;
    }
    public void setName(String name) {
    	this.name = name;
    }


    public int getCalories() {
    	return this.calories;
    }
    public void setCalories(int calories) {
    	this.calories = calories;
    }


    public String getImage() {
    	return this.image;
    }
    public void setPicture(String image) {
    	this.image = image;
    }
    
    public String toString() {
        return "Meal [id=" + id + ", name=" + name + ", calories=" + calories + ", image=" + image + "]";
    }

    // CRUD data management
    public static void create() {}

    public static void read() {}

    public static void update() {}

    public static void delete() {}

    public static user retrieve() {
        return null;
    }
}
