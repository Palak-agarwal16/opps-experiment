package Lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonSerialization {
    public static void main(String[] args) {
        Person person = new Person("Riya", 22);

        // Serialize the object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            out.writeObject(person);
            System.out.println("Person object serialized to person.txt.");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        //Deserialize the object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.txt"))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Deserialized Person: Name = " + deserializedPerson.name + ", Age = " + deserializedPerson.age);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}

