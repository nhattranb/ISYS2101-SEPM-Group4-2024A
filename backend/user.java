public class user {
    private String name;
    private String email;
    private String password;
    private String username;
    private int age;
    private int phone;

    // constructor
    public user(String name, String email, String password, String username, int age, int phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.username = username;
        this.age = age;
        this.phone = phone;
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
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public int getPhone() {
        return this.phone;
    }
    
    public void setPhone(int phone) {
        this.phone = phone;
    }

    // toString
    public String toString() {
        return "Name: " + this.name +
        "\nEmail: " + this.email +
        "\nPassword: " + this.password +
        "\nUsername: " + this.username +
        "\nAge: " + this.age +
        "\nPhone: " + this.phone;
    }
}
