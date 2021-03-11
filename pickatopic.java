// This is an early Java implementation of an idea for a Study Tool. In the finished application, there will be a well defined connection  
// between Topics and Subtopics. It doesn't make sense to make NodeJS or ReactJS a Subtopic of Java, since they are both related to Javascript,
// which is itself  a Topic. This relation will be implemented in a SQL database using foreign keys. The front end will most likely be JavaFX.
// Other planned features are adding / editing /deleting Topics/Subtopics, as well as a simple Date based implementation of spaced repetition for 
// improved comprehension and retention. The application will remember what you studied last, and pick something else before you forget it.

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class pickatopic {

    public static void main(String[] args) {

        List<String> topics = new ArrayList<>();
        List<String> subTopics = new ArrayList<>();

        subTopics.add("Spring Boot");
        subTopics.add("ReactJS");
        topics.add("JavaScript");
        topics.add("Git");
        subTopics.add("Maven");
        subTopics.add("Junit 5");
        topics.add("Python");
        topics.add("C#");
        topics.add("Java");
        subTopics.add("JDBC");
        subTopics.add("Hibernate");
        subTopics.add("JavaFX");
        topics.add("SQL");
        topics.add("Docker");
        subTopics.add("NodeJS");
        topics.add("HTML/CSS");
        
        Random rand = new Random();

        System.out.println("\nTodays topic is    : " + topics.get(rand.nextInt(topics.size())));
        System.out.println("Todays subtopic is : " + subTopics.get(rand.nextInt(subTopics.size())));

    }
}
