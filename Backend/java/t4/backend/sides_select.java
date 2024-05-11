package java.t4.backend;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient; // Add this import statement
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class sides_select {
    public static void select() {
        System.out.println("Selecting from the Sides table!");

        // Connection string
        String url = "mongodb+srv://NhatMTran:ISYS2101s24a@healthypal.j81vjkh.mongodb.net/?retryWrites=true&w=majority&appName=HealthyPal";

        // Connect to the D.B.
        try (MongoClient mongoClient = MongoClients.create(url)) {
            // Connect to the database
            MongoDatabase database = mongoClient.getDatabase("healthypal");

            // Connect to the collection
            MongoCollection<Document> collection = database.getCollection("sides");

            // Select from the collection
            FindIterable<Document> iterDoc = collection.find();
            if (doc != null) {
                System.out.println("add here");
            } else {
                System.out.println("No matching documents found.");
            }
        }
    }
}
