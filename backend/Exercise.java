public class Exercise {
    private int ID;
    private String name;

    public Exercise(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Exercise{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
