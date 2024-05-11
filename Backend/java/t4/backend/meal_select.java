import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;

public class meal_select {
    public static void select() {
        System.out.println("Hello, World!");

        // connect to a MongoDB database
        MongoClient mongoClient = MongoClients.create("mongodb+srv://NhatMTran:ISYS2101s24a@healthypal.j81vjkh.mongodb.net/");
        MongoDatabase database = mongoClient.getDatabase("healthypal");

        // select from the Meal table
        MongoCollection<Document> collection = database.getCollection("Meal");
        FindIterable<Document> iterDoc = collection.find();
    }
}