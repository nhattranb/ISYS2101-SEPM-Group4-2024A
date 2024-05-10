package database.src.Backend.java.t4.backend;

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
