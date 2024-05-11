package java.t4.backend;

public class account {
    private int id;
    private String username;
    private String password;

    public account() {}

    public account(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
    	return this.username;
    }
    public void setUsername(String username) {
    	this.username = username;
    }


    public String getPassword() {
    	return this.password;
    }
    public void setPassword(String password) {
    	this.password = password;
    }

    public String toString() {
        return "Account [id=" + id + ", username=" + username + ", password=" + password + "]";
    }

    // CRUD Data management methods
    public static void create() {}

    public static void read() {}

    public static void update() {}

    public static void delete() {}
}
