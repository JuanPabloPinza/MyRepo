/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.practice.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class MongoCRUD {

    private static final String uri = "mongodb+srv://pinza:153@pinzadatabase.yy2byr4.mongodb.net/?retryWrites=true&w=majority";
    private static final Scanner scan = new Scanner(System.in);
    private static final String collection = "Computer";
    
        public static void addToMongo(Document product, String collection) {

        try ( MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("exam");
            try
            {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> productCollection = database.getCollection( collection);

                productCollection.insertOne(product);
                
                System.out.println("New Product has been added: " + product.get("name"));

            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

}
