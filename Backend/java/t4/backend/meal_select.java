import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;

public class meal_select {
    public static void select() {
        System.out.println("Hello, World!");

        // Connection string
        String url = "mongodb+srv://NhatMTran:ISYS2101s24a@healthypal.j81vjkh.mongodb.net/?retryWrites=true&w=majority&appName=HealthyPal";

        // Connect to the D.B.
        try (MongoClient mongoClient = MongoClients.create(url)) {
            // Connect to the database
            MongoDatabase database = mongoClient.getDatabase("healthypal");

            // Connect to the collection
            MongoCollection<Document> collection = database.getCollection("meal");

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