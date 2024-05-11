package java.t4.backend;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient; // Add this import statement
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class sides_select {
    public static void select() {
        System.out.println("Selecting from the Sides table!");

        // connect to a MongoDB database
        MongoClient mongoClient = MongoClients.create("mongodb+srv://NhatMTran:ISYS2101s24a@healthypal.j81vjkh.mongodb.net/");
        MongoDatabase database = mongoClient.getDatabase("healthypal");

        // select from the Sides table
        MongoCollection<Document> collection = database.getCollection("Sides");
        FindIterable<Document> iterDoc = collection.find();
        
    }
}
