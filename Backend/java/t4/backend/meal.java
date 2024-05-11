package java.t4.backend;

public class meal {
    private int id;
    private String name;
    private int calories;
    private String picture;

    public meal() {}

    public meal(int id, String name, int calories, String picture) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.picture = picture;
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


    public String getPicture() {
    	return this.picture;
    }
    public void setPicture(String picture) {
    	this.picture = picture;
    }
    
    public String toString() {
        return "Meal [id=" + id + ", name=" + name + ", calories=" + calories + ", picture=" + picture + "]";
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
