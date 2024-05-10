package database.src.Backend.java.t4.backend;

public class exercise_select {
    public static void select() {
        System.out.println("Selecting from the Meal table!");

        // Use the healthypal database
        MongoClient mongoClient = MongoClients.create("mongodb+srv://NhatMTran:ISYS2101s24a@healthypal.j81vjkh.mongodb.net/");
        MongoDatabase database = mongoClient.getDatabase("healthypal");

        // Select from the Exercise table
        MongoCollection<Document> collection = database.getCollection("Exercise");
        FindIterable<Document> iterDoc = collection.find();
    }

    public static void main(String[] args) {
        select();
    }
}
