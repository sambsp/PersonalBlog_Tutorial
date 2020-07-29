package Database;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class DatabaseMan {
    private static DatabaseMan instance;

    private MongoClient client;
    private MongoDatabase database;

    public static DatabaseMan Instance() {
        if (instance == null) {
            instance = new DatabaseMan();
        }
        return instance;
    }

    public void Init() {
        client = new MongoClient("127.0.0.1", 27017);
        database = client.getDatabase("PersonalBlog");
    }

    public MongoCollection<Document> GetCollection(String name) {
        return database.getCollection(name);
    }
}
