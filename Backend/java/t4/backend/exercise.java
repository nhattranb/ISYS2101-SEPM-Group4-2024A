package java.t4.backend;

public class exercise {
    private int id;
    private String name;
    private int time;
    private String type;
    private int calories;
    private String picture;
    private String video;

    public exercise() {}

    public exercise(int id, String name, int time, String type, int calories, String picture, String video) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.type = type;
        this.calories = calories;
        this.picture = picture;
        this.video = video;
    }

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


    public int getTime() {
    	return this.time;
    }
    public void setTime(int time) {
    	this.time = time;
    }


    public String getType() {
    	return this.type;
    }
    public void setType(String type) {
    	this.type = type;
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


    public String getVideo() {
    	return this.video;
    }
    public void setVideo(String video) {
    	this.video = video;
    }

    public String toString() {
        return "Exercise [id=" + id + ", name=" + name + ", time=" + time + ", type=" + type + ", calories=" + calories + ", picture=" + picture + ", video=" + video + "]";
    }

    // CRUD Data Management
    public static void create() {}

    public static void read() {}

    public static void update() {}

    public static void delete() {}

}
