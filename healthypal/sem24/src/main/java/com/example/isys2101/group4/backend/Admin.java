package com.example.isys2101.group4.backend;

public class Admin {
    private int id;
    private int adminName;

    // constructor
    public Admin(int id, int adminName) {
        this.id = id;
        this.adminName = adminName;
    }
    
    // getters and setters
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getAdminName() {
        return this.adminName;
    }
    
    public void setAdminName(int adminName) {
        this.adminName = adminName;
    }

    public String ViewAdminInfo() {
        return "Admin ID: " + this.id + "\nAdmin Name: " + this.adminName;
    }

    // functions
    public void viewFood() {}

    public void AddExercise() {
        System.out.println("Exercise added successfully!");
    }
}
