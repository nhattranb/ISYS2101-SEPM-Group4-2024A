package com.example.isys2101.group4.backend;

public class Calculator {
    private int ID;
    private String name;
    private float weight;
    private float height;

    // constructor
    public Calculator(int ID, String name, float weight, float height) {
        this.ID = ID;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    // getters and setters
    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
	    this.ID = ID;
    }

    public String getName() {
    	return this.name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }

    public float getWeight() {
    	return this.weight;
    }
    
    public void setWeight(float weight) {
    	this.weight = weight;
    }

    public float getHeight() {
    	return this.height;
    }
    
    public void setHeight(float height) {
    	this.height = height;
    }

    // functions
    public void CalBMI() {
        float BMI = this.weight / (this.height * this.height);
        System.out.println("Your BMI is: " + BMI);
        System.out.println("BMI calculated successfully!");
    }

    public void CalNutrient() {
        System.out.println("Nutrient calculated successfully!");
    }

    public void CalCalories() {
        System.out.println("Calories calculated successfully!");
    }

    public void CalProtein() {
        System.out.println("Protein calculated successfully!");
    }
}